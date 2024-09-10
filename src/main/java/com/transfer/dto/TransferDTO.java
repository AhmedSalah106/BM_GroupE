package com.transfer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransferDTO {
    private String sourceAccountNumber;

    private String destinationAccountNumber;

    private double amount;




}
