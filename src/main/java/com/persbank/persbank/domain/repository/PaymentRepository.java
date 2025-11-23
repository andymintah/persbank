package com.persbank.persbank.domain.repository;

import com.persbank.persbank.domain.model.PaymentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CrudRepository<PaymentModel,Integer> {

}
