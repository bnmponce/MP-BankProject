package org.example.controller;

import org.example.controller.operators.DepositOperator;
import org.example.controller.operators.WithdrawOperator;
import org.example.controller.providers.AccountsByOwnerProvider;
import org.example.model.persistence.DataSaverInMemory;
import org.example.controller.providers.BalanceByAccountProvider;
import org.example.controller.providers.TransactionByAccountProvider;

public class ControllerManager {

    public BankAccountController getAccountController() {
        return new BankAccountController(new WithdrawOperator(new DataSaverInMemory()), new DepositOperator(new DataSaverInMemory()), new BalanceByAccountProvider( new DataSaverInMemory()), new TransactionByAccountProvider(new DataSaverInMemory()));
    }

    public OwnerController getOwnerController() {
        return new OwnerController(new AccountsByOwnerProvider(new DataSaverInMemory()));
    }
}