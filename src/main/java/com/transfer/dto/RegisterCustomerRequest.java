package com.transfer.dto;

import com.transfer.dto.enums.AccountCurrency;
import com.transfer.dto.enums.AccountType;
import com.transfer.entity.Account;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class RegisterCustomerRequest {

    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Size(min = 6)
    private String password;

    @NotBlank
    private Double balance;

    @NotBlank
    private AccountType accountType;

    @NotBlank
    private String accountName;

    @NotBlank
    private AccountCurrency currency;
}
