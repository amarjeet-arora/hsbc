package com;

import exception.AccountTransactionException;
import exception.CustomException;

public interface AccountDao {
	public void deposit(int accNo, float amt) throws CustomException;
	public float withdraw(int accNo, float amt)throws CustomException;
	public float balanceEnquiry(int accNo)throws CustomException;

	public void createAccount(int accNo, float amt, String name)throws CustomException;
	public void  fundTransfer(int fromAccNo, int toAccNo, float amt) throws AccountTransactionException;
	
}
