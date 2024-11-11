package com.nt.upi;

import java.util.Random;

public class UPIPayment {
   public String doUPIPayment(String upiId,double amount) {
	   return "UPI payyment for the amount::"+amount+"is done";
	}
   
   public double checkBalance(String upiId) {
	   return new Random().nextInt(1200000);
   }
}
