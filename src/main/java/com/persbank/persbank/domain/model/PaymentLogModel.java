package com.persbank.persbank.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Table(name="p_transaction_log")
@SQLRestriction("deleted=false")

public class PaymentLogModel {
    @Column(name="transaction_date")
    private String transactionDate;
    @Id
    @Column(name="transaction_ref_no")
    private String transactionRefNo;
    @Column(name="transaction_desc")
    private String transactionDesc;
    @Column(name="payment_type")
    private String paymentType;
    @Column(name="from_account")
    private int fromAccount;
    @Column(name="to_account")
    private int toAccount;
    @Column(name="amount")
    private double amount;
    @Column(name="status")
    private String status;







}
