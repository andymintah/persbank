package com.persbank.persbank.domain.repository;

import com.persbank.persbank.domain.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerModel,Integer> {
    List<CustomerModel> findByName(String lastName);

    CustomerModel findByCustomerNo(Integer customerNo);
}
