package com.persbank.persbank.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Entity
@Table(name="p_account_details")
//@SQLRestriction("deleted=false")
public class AccountModel {
    @Id
    @Column(name = "account_number")
    private int accountNo;


    @Column(name = "customer_number")
    private int customerNo;

    @Column(name = "currency")
    private String accountCurrency;

    @Column(name="account_status")
    private String accountStatus;

    @Column(name="account_type")
    private String accountType;

    @Column(name="account_balance")
    private Long accountBalance;

    @Column(name = "date_created")
    private String dateCreated;


}
