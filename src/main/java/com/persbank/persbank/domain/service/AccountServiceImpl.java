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
        AccountModel accountModel = accountRepository.findByAccountNo(accountNo);

        if (accountModel == null){
            log.error("Account not found for accountNo: {}", accountNo);
            return null;
        }
        return accountModel;
    }

    @Override
    public AccountModel getAccountByCustomerNo(Integer customerNo) {
        AccountModel accountModel = accountRepository.findByCustomerNo(customerNo);

        if (accountModel == null){
            log.error("Account not found for customerNo: {}", customerNo);
            return null;
        }
        return accountModel;
    }

    @Override
    public AccountModel createAccount(AccountModel accountModel) {
        AccountModel savedAccount = accountRepository.save(accountModel);
        return savedAccount;
    }

    @Override
    public AccountModel updateAccount(AccountModel accountModel) {
        return null;
    }
}
