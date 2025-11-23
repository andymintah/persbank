package com.persbank.persbank.domain.repository;

import com.persbank.persbank.domain.model.AccountModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<AccountModel,Integer> {

    AccountModel findByAccountNo(Integer accountNo);

    AccountModel findByCustomerNo(Integer customerNo);
}
