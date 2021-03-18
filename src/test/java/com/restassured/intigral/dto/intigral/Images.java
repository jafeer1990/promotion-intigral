package com.restassured.intigral.dto.intigral;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true,fluent = true)
public class Images {

    @JsonProperty("id")
    public String id;

    @JsonProperty("url")
    public String url;

    @JsonProperty("width")
    public Integer width;

    @JsonProperty("height")
    public Integer height;
}
