package com.cydeo.entity;

import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity // my primary key is in Account class. we will extend it.
public class DebitAccount extends Account{

    private BigDecimal overDraftFee;


}
