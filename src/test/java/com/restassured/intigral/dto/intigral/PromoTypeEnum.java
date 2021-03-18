package com.restassured.intigral.dto.intigral;

import lombok.Getter;

public enum PromoTypeEnum {

    EPISODE("EPISODE"),
    MOVIE("MOVIE"),
    SERIES("SERIES"),
    VOD("VOD"),
    SEASON("SEASON");

    @Getter
    public final String value;

    PromoTypeEnum(final String value) { this.value =value; }
}
