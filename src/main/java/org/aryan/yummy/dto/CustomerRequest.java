package org.aryan.yummy.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;

public record CustomerRequest(
    @NotNull(message = "Customer should be present")
    @NotEmpty(message = "Customer should be present")
    @NotBlank(message = "Customer should be present")
    @JsonProperty("firstname")
    String firstName,

    @JsonProperty("lastname")
    String lastName,

    @NotNull(message="Customer email is required")
    @Email(message = "Email must be in correct format")
    @JsonProperty("email")
    String email,

    @NotNull(message = "Password should be present")
    @NotEmpty(message = "Password should be present")
    @NotBlank(message = "Password should be present")
    @Size(min = 6, max = 12)
    @JsonProperty("password")
    String password,

    @NotNull(message = "Address should be present")
    @NotEmpty(message = "Address should be present")
    //@NotBlank(message = "Address should be present")
    @JsonProperty("addresslineone")
    String addressLine1,

    @NotNull(message = "Address should be present")
    @NotEmpty(message = "Address should be present")
    //@NotBlank(message = "Address should be present")
    @JsonProperty("addresslinetwo")
    String addressLine2,

    @NotNull(message = "City should be present")
    @NotEmpty(message = "City should be present")
    @NotBlank(message = "City should be present")
    @JsonProperty("city")
    String city,

    @NotNull(message = "Pincode should be present")
    @NotEmpty(message = "Pincode should be present")
    @NotBlank(message = "Pincode should be present")
    @Size(min = 6, max = 6)
    @JsonProperty("pincode")
    String pincode
) {
}
