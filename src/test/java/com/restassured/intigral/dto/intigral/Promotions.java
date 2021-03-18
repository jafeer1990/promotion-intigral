package com.restassured.intigral.dto.intigral;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true,fluent = true)
public class Promotions {

    @JsonProperty("promotionId")
    public String promotionId;

    @JsonProperty("orderId")
    public Integer orderId;

    @JsonProperty("promoArea")
    public List<String> promoArea ;

    @JsonProperty("promoType")
    public PromoTypeEnum promoType;

    @JsonProperty("showPrice")
    public boolean showPrice;

    @JsonProperty("showText")
    public boolean showText;

    @JsonProperty("localizedTexts")
    public LocalizedTexts localizedTexts;

    @JsonProperty("properties")
    public List<Properties> properties;

    @JsonProperty("images")
    public List<Images> images;

}