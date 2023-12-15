package com.bouchtaouimarouane.accountservice.repository;

import com.bouchtaouimarouane.accountservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
