package com.nt.netbanking;

import java.util.Random;

public class NetBankingService {
      public String OpenAccount(String aadhar,double initialamount,String type) {
    	  return"account is opened"+new Random().nextLong(68888888888888888L);		
      }
      public String withdraw(long acno,double amount) {
    	  return amount+"is withdrawn from the account number"+acno;
      }
      
      public String deposit(long acno,double amount) {
    	  return amount+"is deposited into  the account number"+acno;
      }
}
