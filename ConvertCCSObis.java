import java.util.*;
import java.io.*;



public class ConvertCCSObis{



	int c_id[];
	int maxTransactions;
	String customerName[];
	String customerIdPresented[];
	String moneyCurrency[];
	String exchangeIntoCurrency[];
	double money[];
	double moneyConverted[];
	int t;
	ConvertCCSObis(){
		maxTransactions = 50;
		c_id = new int[maxTransactions];
		customerName = new String[maxTransactions];
		customerIdPresented = new String[maxTransactions];
		moneyCurrency = new String[maxTransactions];
		exchangeIntoCurrency = new String[maxTransactions];
		money = new double[maxTransactions];
		moneyConverted = new double[maxTransactions];
		t = 0;

	}

	public boolean checkEmpty(){
    	if(t == 0){
    		return true;
    	}else{
    		return false;
    	}
    }

    public double procConvert(double moneyReceived, double rateEx){
    	double convertedVal = 0.0;
    	//if(currency.equalsIgnoreCase("Dollars")){
    		//if(exchangeCurrency.equalsIgnoreCase("Peso")){
    			convertedVal = moneyReceived * rateEx;
    			return convertedVal;

    }

    public void addTransact(int c_id, String customerName, String customerIdPresented, double money,String moneyCurrency, String exchangeIntoCurrency, double rate){

    	if(t < maxTransactions){

    		this.c_id[t] = c_id;
    		this.customerName[t] = customerName;
    		this.customerIdPresented[t] = customerIdPresented;
    		this.money[t] = money;
    		this.moneyCurrency[t] = moneyCurrency;
    		this.exchangeIntoCurrency[t] = exchangeIntoCurrency;
    		this.moneyConverted[t] = procConvert(money,rate);
    		t++;
    		

    	}else{

			System.out.println("\t\t== ERROR! MAXIMUM TRANSACTION REACHED! == \n");
			
		
    	}

    }

    public void viewTransactions(){

    	int i = 0;
		if(this.checkEmpty()){
			System.out.println("\n\t\t== TRANSACTION RECORD IS EMPTY! ==\n");
		}else{
		for(i = 0; i <= this.t-1; i++){
			System.out.printf("\t\t%d ===========================\n",i+1);
			
			System.out.println("Transaction ID: "+this.c_id[i]);
			System.out.println("Customer Name: "+this.customerName[i]);
			System.out.println("Customer ID Presented: "+this.customerIdPresented[i]);
			System.out.println("Amount to be converted: "+this.money[i]+" - "+this.moneyCurrency[i]);
			System.out.println("Exchanged Amount: "+this.exchangeIntoCurrency[i]+" - "+this.moneyConverted[i]);
			
			System.out.println("\t==============================");
		}
		}
    }



}