package com.persbank.persbank.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SQLRestriction;
import org.hibernate.annotations.Parameter;

@Entity
@Data
@Table(name="p_customer_details")
@SQLRestriction("deleted=false")
@AllArgsConstructor
@NoArgsConstructor
public class CustomerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    @GenericGenerator(
            name = "customer_seq",
            strategy = "com.persbank.persbank.domain.model.CustomerIdGenerator",
            parameters = {
                    @Parameter(name = "prefix", value = "PSEB"),
                    @Parameter(name = "numberFormat", value = "%05d")
            }
    )
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


    public CustomerModel(String customerFirstName, String customerLastName, String customerAddress, int customerPhoneNo, String customerEmail,
                         Boolean kycFlag, String idType, String idAttachment) {
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerAddress = customerAddress;
        this.customerPhoneNo = customerPhoneNo;
        this.customerEmail = customerEmail;
        this.kycFlag = kycFlag;
        this.idType = idType;
        this.idAttachment = idAttachment;
    }
}
