package com.verano.dani.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CreateProductRequest implements Serializable {
    @JsonProperty(value = "name")
    public String name;
    public Float price;
}
