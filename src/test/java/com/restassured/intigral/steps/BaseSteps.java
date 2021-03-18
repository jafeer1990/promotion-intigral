package com.restassured.intigral.steps;

import com.restassured.intigral.apicalls.ApiCalls;
import com.restassured.intigral.dto.intigral.ErrorDTO;
import com.restassured.intigral.dto.intigral.PopCornApiDTO;
import com.restassured.intigral.endpoints.EndPoints;
import com.restassured.intigral.utils.HeaderUtils;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseSteps<T extends BaseSteps<T>> {

    public Response             response;
    String                      endPoint;
    PopCornApiDTO               responseDTO;
    ErrorDTO                    errorResponse;

    @Autowired
    ApiCalls apiCalls;

    @Autowired
    EndPoints endPoints;

    @Autowired
    HeaderUtils headerUtils;
}
