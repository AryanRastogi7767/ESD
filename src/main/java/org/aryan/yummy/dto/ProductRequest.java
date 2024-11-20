package org.aryan.yummy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;

public record ProductRequest(

        @NotNull(message="name is required")
        @JsonProperty("name")
        String name,

        @NotNull(message="price is required")
        @JsonProperty("price")
        Double price
) {
}
