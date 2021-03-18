package com.restassured.intigral.endpoints;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@RequiredArgsConstructor
public class EndPoints {

    @Value("${getUserDataURI}")
    private String getUserDataURI;

    public String retrieveUserServicePath() {
        return getUserDataURI;
    }

}
