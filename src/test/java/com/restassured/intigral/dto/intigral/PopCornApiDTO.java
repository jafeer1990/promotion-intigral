package com.restassured.intigral.dto.intigral;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true,fluent = true)
public class PopCornApiDTO {

    @JsonProperty("promotions")
    public List<Promotions> promotions;

}