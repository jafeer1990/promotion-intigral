package com.restassured.intigral.apicalls;

import com.restassured.intigral.utils.RestUtils;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApiCalls {

    @Autowired
    RestUtils restUtils;

    public Response getUserData(String endPointUrl, Headers headers) {
        return restUtils.get(endPointUrl, headers);
    }

    public Response postUserData(String endPointUrl, String payload, Headers headers) {
        return restUtils.post(endPointUrl, payload, headers);
    }
}
