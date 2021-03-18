package com.restassured.intigral.dto.intigral;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Collections;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true,fluent = true)
public class LocalizedTexts {

    @JsonProperty("ar")
    public List<String> ar ;

    @JsonProperty("en")
    public List<String> en ;
}
