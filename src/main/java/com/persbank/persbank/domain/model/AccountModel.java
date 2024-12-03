package com.persbank.persbank.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.SQLRestriction;

@Data
@Entity
@Table(name="p_account_details")
@SQLRestriction("deleted=false")
public class AccountModel {
    private Integer accountNo;
    private Integer customerNo;
    private String accountCurrency;
    private String customerName;
}
