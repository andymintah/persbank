package com.persbank.persbank.domain.service;


import com.persbank.persbank.domain.model.AccountModel;
import org.springframework.stereotype.Service;


public interface AccountService {
    AccountModel getAccountByAccountNo(Integer accountNo);

    AccountModel getAccountByCustomerNo(Integer customerNo);


    AccountModel createAccount(AccountModel accountModel);

    AccountModel updateAccount(AccountModel accountModel);
}
