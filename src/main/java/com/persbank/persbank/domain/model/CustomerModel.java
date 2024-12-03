package com.persbank.persbank.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Data
@Table(name="p_customer_details")
@SQLRestriction("deleted=false")
public class CustomerModel {
    private Integer customerNo;
    private String customerFirstName;
    private String customerLastName;
    private String customerAddress;
    private String customerPhoneNo;
    private String customerEmail;
    private boolean kycFlag;




}
