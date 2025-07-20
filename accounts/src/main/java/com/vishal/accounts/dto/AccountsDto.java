package com.vishal.accounts.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {
    @Pattern(regexp="(^$|[0-9]{10})",message = "Account number must be 10 digits")
    @NotBlank
    private Long accountNumber;

    @NotBlank(message = "Account type cannot be empty")
    private String accountType;

    @NotBlank(message = "Branch address cannot be empty")
    private String branchAddress;
}
