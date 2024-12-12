package com.persbank.persbank.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.SQLRestriction;

@Data
@Entity
@Table(name="p_account_details")
@SQLRestriction("deleted=false")
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

    @Column(name = "date_created")
    private String dateCreated;


}
