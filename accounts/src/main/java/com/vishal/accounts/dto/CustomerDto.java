package com.vishal.accounts.dto;

import com.vishal.validation.TrimmedNotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

    @TrimmedNotBlank(message = "The length of the customer name should be between 3 and 30 characters")
    private String name;

    @NotBlank(message = "Email address cannot be empty")
    @Email(message = "Please enter a valid email address")
    private String email;

    @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    private String mobileNumber;
    private AccountsDto accountsDto;
}
