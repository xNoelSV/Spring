package com.noels.accounts.service;

import com.noels.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * Create account
     * @param customerDto - customer details
     */
    void createAccount(CustomerDto customerDto);

}
