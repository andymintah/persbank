package com.persbank.persbank.domain.service;

public interface CustomerService {


    public void createCustomer(String firstName,
                               String lastName,
                               String address,
                               int phoneNo,
                               String email,
                               Boolean kycFlag,
                               String idType,
                               String idAttachment);
}
