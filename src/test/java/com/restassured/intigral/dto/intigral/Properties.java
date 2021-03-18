package com.restassured.intigral.dto.intigral;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true,fluent = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties {

    @JsonProperty("year")
    public String year;

    @JsonProperty("programType")
    public String programType;

    @JsonProperty("programAvailabilityId")
    public String programAvailabilityId;

    @JsonProperty("seriesId")
    public String seriesId;

    @JsonProperty("seasonNumber")
    public Integer seasonNumber;

    @JsonProperty("seriesPaId")
    public String seriesPaId;

    @JsonProperty("duration")
    public String duration;

    @JsonProperty("episodeNumber")
    public Integer episodeNumber;

    @JsonProperty("seriesGuid")
    public String seriesGuid;
}
