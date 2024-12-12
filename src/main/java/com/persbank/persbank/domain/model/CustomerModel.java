package com.persbank.persbank.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Data
@Table(name="p_customer_details")
@SQLRestriction("deleted=false")
@AllArgsConstructor
@NoArgsConstructor
public class CustomerModel {

    @Id
    @Column(name="customerNo")
    private int customerNo;

    @Column(name="customer_firstname")
    private String customerFirstName;

    @Column(name="customer_lastname")
    private String customerLastName;

    @Column(name="address")
    private String customerAddress;

    @Column(name="phone_number")
    private int customerPhoneNo;

    @Column(name="email")
    private String customerEmail;

    @Column(name="kyc_completed")
    private boolean kycFlag;


    @Column(name = "id_type")
    private String idType;

    @Column(name = "idAttachment")
    private String idAttachment;






}
