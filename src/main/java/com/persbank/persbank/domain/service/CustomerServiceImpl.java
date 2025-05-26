package com.persbank.persbank.domain.service;

import com.persbank.persbank.domain.model.CustomerModel;
import com.persbank.persbank.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void createCustomer(String firstName,
                               String lastName,
                               String address,
                               int phoneNo,
                               String email,
                               Boolean kycFlag,
                               String idType,
                               String idAttachment
    ){



        customerRepository.save(new
                CustomerModel(firstName, lastName, address, phoneNo, email, kycFlag,idType, idAttachment));
    }


}
