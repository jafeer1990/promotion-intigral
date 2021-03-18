package com.restassured.intigral.steps;

import com.restassured.intigral.dto.intigral.ErrorDTO;
import com.restassured.intigral.dto.intigral.PopCornApiDTO;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.*;

@Component
@Slf4j
public class GetUsersSteps extends BaseSteps<GetUsersSteps> {

    @Step
    public GetUsersSteps givenIHaveRetrieveUsersEndpoint() {
        endPoint = endPoints.retrieveUserServicePath();
        return this;
    }

    @Step
    public GetUsersSteps whenIRetrieveUserDetails(String id) {
        response = apiCalls.getUserData(endPoint+id,headerUtils.getHeaders());
        return this;
    }

    @Step
    public GetUsersSteps verifyResponseStatusCode() {
        log.info("*********** Response ****************** : " +response.getBody().asString());
        assertNotNull(response);
        assertEquals(HttpStatus.SC_OK,response.getStatusCode(),"Verify response status code");
        return this;
    }

    @Step
    public GetUsersSteps thenIVerifyError(int httpStatus) {
        log.info("*********** Response ****************** : " +response.getBody().asString());
        assertEquals(httpStatus,response.getStatusCode(),"Verify error status code");
        errorResponse = response.getBody().as(ErrorDTO.class);
        assertAll(
                ()-> assertEquals("invalid api key", errorResponse.error.message,"verify key"),
                ()-> assertEquals("8001", errorResponse.error.code,"verify code"),
                ()-> assertNotNull(errorResponse.error.requestId,"verify request id")
        );
        return this;
    }

    @Step
    public GetUsersSteps thenIVerifyResponseSuccessfully() {
        verifyResponseStatusCode();
        responseDTO = response.getBody().as(PopCornApiDTO.class);
        assertNotNull(responseDTO.promotions.stream().findFirst().get().localizedTexts,"Verify data is not null");
        assertNotNull(responseDTO.promotions.stream().findFirst().get().promoArea,"Verify data is not null");
        responseDTO
                   .promotions
                   .stream()
                   .forEach(Promotions ->
                           assertAll(
                                   ()-> {
                                               assertNotNull(Promotions.promotionId,"verify promotionId");
                                               assertNotNull(Promotions.localizedTexts,"verify Localised Texts");
                                               assertNotNull(Promotions.localizedTexts.ar,"verify Localised Texts has ar");
                                               assertNotNull(Promotions.localizedTexts.en,"verify Localised Texts has en");
                                               assertNotNull(Promotions.promoArea,"verify promoArea");
                                               assertNotNull(Promotions.orderId,"verify orderId");
                                               assertNotNull(Promotions.promoType,"verify promoType");//DTO defined as enum
                                               assertNotNull(Promotions.showPrice,"verify showPrice true or false");
                                               assertNotNull(Promotions.showText,"verify showText true or false");
                                   }
                           )
                   );

        return this;
    }

}
