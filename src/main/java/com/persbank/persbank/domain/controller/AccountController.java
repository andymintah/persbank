package com.persbank.persbank.domain.controller;

import com.persbank.persbank.domain.model.AccountModel;
import com.persbank.persbank.domain.service.AccountService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/v1/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    @Operation(summary = "Get account by account number")
    @GetMapping("/{accountNo}")
    ResponseEntity<AccountModel> getAccountByAccountNo(Integer accountNo) {
        AccountModel accountModel = accountService.getAccountByAccountNo(accountNo);
        if (accountModel != null) {
            return ResponseEntity.ok(accountModel);
        }
        return ResponseEntity.notFound().build();
    }

    @Operation(summary = "Get list of accounts by customer number")
    @GetMapping("/{customerNo}")
    ResponseEntity<List<AccountModel>> getAccountsByCustomerNo(Integer customerNo) {
        List<AccountModel> accountModel = new ArrayList<>();
               accountModel.add(accountService.getAccountByCustomerNo(customerNo));
        if (accountModel != null) {
            return ResponseEntity.ok(accountModel);
        }
        return ResponseEntity.notFound().build();
    }
}
