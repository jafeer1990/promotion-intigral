package com.restassured.intigral.tests.retrievepromotions;

import com.restassured.intigral.tests.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@Epic("Retrieve Promotion Details")
@Feature("Retrieve Promotion")
@DisplayName("Retrieve Promotion Details - tests to verify promotion details response")
public class RetrievePromotionTest extends BaseTest {
    //status,ENUM for promoType ,existence of objects ,keys  and datatype validation all covered
    @ParameterizedTest(name = "#{index} - {0}")
    @MethodSource("dataProvider")
    @DisplayName("User should get promotion details for valid apikey")
    void shouldRetrieveUserDetailsForIdSuccessfully(final String description, final String id) {
        getUsersSteps
                .givenIHaveRetrieveUsersEndpoint()
                .whenIRetrieveUserDetails(id)
                .thenIVerifyResponseSuccessfully();
    }

    private static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("should get valid promotion details for valid id", "GDMSTGExy0sVDlZMzNDdUyZ"));
    }

    //status,keys value assertions  and datatype validation all covered for different behaviours
    @ParameterizedTest
    @MethodSource("invalidIdsProvider")
    @DisplayName("should get error for invalid apikey")
    void shouldGetErrorForInvalidIds(final String id) {
        getUsersSteps
                .givenIHaveRetrieveUsersEndpoint()
                .whenIRetrieveUserDetails(id)
                .thenIVerifyError(HttpStatus.SC_FORBIDDEN);
    }

    private static Stream<Arguments> invalidIdsProvider() {
        return Stream.of(
                Arguments.of("should get 403 error for invalid key", "GDMSTGExy0DlZMzdUyZ"),
                Arguments.of("should get 403 error for blank key", "       "),
                Arguments.of("should get 403 error for empty key ", ""));
    }
}
