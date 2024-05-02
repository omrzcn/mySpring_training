package com.cydeo.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "payment_details")
@NoArgsConstructor
@Data
public class PaymentDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal merchantPayoutAmount;

    private BigDecimal commissionAmount;


    @Column(columnDefinition = "DATE")
    private LocalDate payoutDate;

    public PaymentDetails(BigDecimal commissionAmount, BigDecimal merchantPayoutAmount, LocalDate payoutDate) {
        this.commissionAmount = commissionAmount;
        this.merchantPayoutAmount = merchantPayoutAmount;
        this.payoutDate = payoutDate;
    }
}
