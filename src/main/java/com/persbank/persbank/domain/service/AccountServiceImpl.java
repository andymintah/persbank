package com.persbank.persbank.domain.service;

import com.persbank.persbank.domain.model.AccountModel;
import com.persbank.persbank.domain.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AccountServiceImpl implements AccountService{
    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    public AccountModel getAccountByAccountNo(Integer accountNo) {
        return null;
    }

    @Override
    public AccountModel getAccountByCustomerNo(Integer customerNo) {
        return null;
    }

    @Override
    public AccountModel createAccount(AccountModel accountModel) {
        return null;
    }

    @Override
    public AccountModel updateAccount(AccountModel accountModel) {
        return null;
    }
}
