import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class SetRateCCSObis{
	int currency;
	int checkerIfEmpty;
	int dl;
	int ps;
	int bh;
	int rp;
	int rl;
	int wn;
	int yn;
	int yu;
	int pd;
	int eu;
	
	//double moneyX[];
	//dollar
	double dollarRate[];
	 //peso
	double pesoRate[];
	 //baht
	double bahtRate[];
	 //rupee
	double rupeeRate[];
	 //rial
	double rialRate[];
	 //won
	double wonRate[];
	 //yen
	double yenRate[];
	 //yuan
	double yuanRate[];
	 //pound
	double poundRate[];
	 //euro
	double euroRate[];

	//index sequence
	//dollar= [0]
	//peso= [1]
	//baht= [2]
	//rupee= [3]
	//rial= [4]
	//won= [5]
	//yen= [6]
	//yuan= [7]
	//pound= [8]
	//euro= [9]
	//lessthan one always

	SetRateCCSObis(){
		dl=0;
		ps=0;
		bh=0;
		rp=0;
		rl=0;
		wn=0;
		yn=0;
		yu=0;
		pd=0;
		eu=0;
		checkerIfEmpty = 0;
		currency = 9;
		//moneyX = new double[maxTransactions];
		dollarRate = new double[currency];
		pesoRate = new double[currency];
		bahtRate = new double[currency];
		rupeeRate = new double[currency];
		rialRate = new double[currency];
		wonRate = new double[currency];
		yenRate = new double[currency];
		yuanRate = new double[currency];
		poundRate = new double[currency];
		euroRate = new double[currency];
	}

	public boolean checkIfEmptyDollarRate(){
		if(dl == 0){
			return true;
		}else{
			return false;
		}
	}

	public void setExchangeRatesForDollar(double valueRecieved,int index){
		dollarRate[index] = valueRecieved;
		dl++;
	}


	public boolean checkIfEmptyPesoRate(){
		if(ps == 0){
			return true;
		}else{
			return false;
		}
	}

	public void setExchangeRatesForPeso(double valueRecieved,int index){
		pesoRate[index] = valueRecieved;
		ps++;
	}

	public boolean checkIfEmptyBahtRate(){
		if(bh == 0){
			return true;
		}else{
			return false;
		}
	}

	public void setExchangeRatesForBaht(double valueRecieved,int index){
		bahtRate[index] = valueRecieved;
		bh++;
	}

	public boolean checkIfEmptyRupeerRate(){
		if(rp == 0){
			return true;
		}else{
			return false;
		}
	}

	public void setExchangeRatesForRupee(double valueRecieved,int index){
		rupeeRate[index] = valueRecieved;
		rp++;
	}

	public boolean checkIfEmptyRialRate(){
		if(rl == 0){
			return true;
		}else{
			return false;
		}
	}

	public void setExchangeRatesForRial(double valueRecieved,int index){
		rialRate[index] = valueRecieved;
		rl++;
	}

	public boolean checkIfEmptyWonRate(){
		if(wn == 0){
			return true;
		}else{
			return false;
		}
	}

	public void setExchangeRatesForWon(double valueRecieved,int index){
		wonRate[index] = valueRecieved;
		wn++;
	}

	public boolean checkIfEmptyYenRate(){
		if(yn == 0){
			return true;
		}else{
			return false;
		}
	}

	public void setExchangeRatesForYen(double valueRecieved,int index){
		yenRate[index] = valueRecieved;
		yn++;
	}

	public boolean checkIfEmptyYuanRate(){
		if(yu == 0){
			return true;
		}else{
			return false;
		}
	}

	public void setExchangeRatesForYuan(double valueRecieved,int index){
		yuanRate[index] = valueRecieved;
		yu++;
	}

	public boolean checkIfEmptyPoundRate(){
		if(pd == 0){
			return true;
		}else{
			return false;
		}
	}

	public void setExchangeRatesForPound(double valueRecieved,int index){
		poundRate[index] = valueRecieved;
		pd++;
	}

	public boolean checkIfEmptyEuroRate(){
		if(eu == 0){
			return true;
		}else{
			return false;
		}
	}

	public void setExchangeRatesForEuro(double valueRecieved,int index){
		euroRate[index] = valueRecieved;
		eu++;
	}

	public void viewExchangeRatesForDollar(){
		
		if(this.checkIfEmptyDollarRate()){
			System.out.println("\n\t\t=== Dollar Exchange rates are empty, please set it first. ===\n");
		}else{
		
			System.out.printf("\t\t===== Dollar Exchange Rates =====\n");
			
			System.out.println("\tDollar to Peso: " + this.dollarRate[0]);
			System.out.println("\tDollar to Baht: " + this.dollarRate[1]);
			System.out.println("\tDollar to Rupee: " + this.dollarRate[2]);
			System.out.println("\tDollar to Rial: " + this.dollarRate[3]);
			System.out.println("\tDollar to Won: " + this.dollarRate[4]);
			System.out.println("\tDollar to Yen: " + this.dollarRate[5]);
			System.out.println("\tDollar to Yuan: " + this.dollarRate[6]);
			System.out.println("\tDollar to Pound: " + this.dollarRate[7]);
			System.out.println("\tDollar to Euro: " + this.dollarRate[8]);
			
			
			System.out.println("\t============================");
		
		}
	}

	public void viewExchangeRatesForPeso(){
		
		if(this.checkIfEmptyPesoRate()){
			System.out.println("\n\t\t=== Peso Exchange rates are empty, please set it first. ===\n");
		}else{
		
			System.out.printf("\t\t===== Peso Exchange Rates =====\n");
			
			System.out.println("\tPeso to Dollar: " + this.pesoRate[0]);
			System.out.println("\tPeso to Baht: " + this.pesoRate[1]);
			System.out.println("\tPeso to Rupee: " + this.pesoRate[2]);
			System.out.println("\tPeso to Rial: " + this.pesoRate[3]);
			System.out.println("\tPeso to Won: " + this.pesoRate[4]);
			System.out.println("\tPeso to Yen: " + this.pesoRate[5]);
			System.out.println("\tPeso to Yuan: " + this.pesoRate[6]);
			System.out.println("\tPeso to Pound: " + this.pesoRate[7]);
			System.out.println("\tPeso to Euro: " + this.pesoRate[8]);
			
			
			System.out.println("\t============================");
		
		}
	}

	public void viewExchangeRatesForBaht(){
		
		if(this.checkIfEmptyBahtRate()){
			System.out.println("\n\t\t=== Baht Exchange rates are empty, please set it first. ===\n");
		}else{
		
			System.out.printf("\t\t===== Baht Exchange Rates =====\n");
			
			System.out.println("\tBaht to Dollar: " + this.bahtRate[0]);
			System.out.println("\tBaht to Peso: " + this.bahtRate[1]);
			System.out.println("\tBaht to Rupee: " + this.bahtRate[2]);
			System.out.println("\tBaht to Rial: " + this.bahtRate[3]);
			System.out.println("\tBaht to Won: " + this.bahtRate[4]);
			System.out.println("\tBaht to Yen: " + this.bahtRate[5]);
			System.out.println("\tBaht to Yuan: " + this.bahtRate[6]);
			System.out.println("\tBaht to Pound: " + this.bahtRate[7]);
			System.out.println("\tBaht to Euro: " + this.bahtRate[8]);
			
			
			System.out.println("\t============================");
		
		}
	}

	public void viewExchangeRatesForRupee(){
		
		if(this.checkIfEmptyRupeerRate()){
			System.out.println("\n\t\t=== Rupee Exchange rates are empty, please set it first. ===\n");
		}else{
		
			System.out.printf("\t\t===== Rupee Exchange Rates =====\n");
			
			System.out.println("\tRupee to Dollar: " + this.rupeeRate[0]);
			System.out.println("\tRupee to Peso: " + this.rupeeRate[1]);
			System.out.println("\tRupee to Baht: " + this.rupeeRate[2]);
			System.out.println("\tRupee to Rial: " + this.rupeeRate[3]);
			System.out.println("\tRupee to Won: " + this.rupeeRate[4]);
			System.out.println("\tRupee to Yen: " + this.rupeeRate[5]);
			System.out.println("\tRupee to Yuan: " + this.rupeeRate[6]);
			System.out.println("\tRupee to Pound: " + this.rupeeRate[7]);
			System.out.println("\tRupee to Euro: " + this.rupeeRate[8]);
			
			
			System.out.println("\t============================");
		
		}
	}

	public void viewExchangeRatesForRial(){
		
		if(this.checkIfEmptyRialRate()){
			System.out.println("\n\t\t=== Rial Exchange rates are empty, please set it first. ===\n");
		}else{
		
			System.out.printf("\t\t===== Rial Exchange Rates =====\n");
			
			System.out.println("\tRial to Dollar: " + this.rialRate[0]);
			System.out.println("\tRial to Peso: " + this.rialRate[1]);
			System.out.println("\tRial to Baht: " + this.rialRate[2]);
			System.out.println("\tRial to Rupee: " + this.rialRate[3]);
			System.out.println("\tRial to Won: " + this.rialRate[4]);
			System.out.println("\tRial to Yen: " + this.rialRate[5]);
			System.out.println("\tRial to Yuan: " + this.rialRate[6]);
			System.out.println("\tRial to Pound: " + this.rialRate[7]);
			System.out.println("\tRial to Euro: " + this.rialRate[8]);
			
			
			System.out.println("\t============================");
		
		}
	}

	public void viewExchangeRatesForWon(){
		
		if(this.checkIfEmptyWonRate()){
			System.out.println("\n\t\t=== Won Exchange rates are empty, please set it first. ===\n");
		}else{
		
			System.out.printf("\t\t===== Won Exchange Rates =====\n");
			
			System.out.println("\tWon to Dollar: " + this.wonRate[0]);
			System.out.println("\tWon to Peso: " + this.wonRate[1]);
			System.out.println("\tWon to Baht: " + this.wonRate[2]);
			System.out.println("\tWon to Rupee: " + this.wonRate[3]);
			System.out.println("\tWon to Rial: " + this.wonRate[4]);
			System.out.println("\tWon to Yen: " + this.wonRate[5]);
			System.out.println("\tWon to Yuan: " + this.wonRate[6]);
			System.out.println("\tWon to Pound: " + this.wonRate[7]);
			System.out.println("\tWon to Euro: " + this.wonRate[8]);
			
			
			System.out.println("\t============================");
		
		}
	}

	public void viewExchangeRatesForYen(){
		
		if(this.checkIfEmptyYenRate()){
			System.out.println("\n\t\t=== Yen Exchange rates are empty, please set it first. ===\n");
		}else{
		
			System.out.printf("\t\t===== Yen Exchange Rates =====\n");
			
			System.out.println("\tYen to Dollar: " + this.yenRate[0]);
			System.out.println("\tYen to Peso: " + this.yenRate[1]);
			System.out.println("\tYen to Baht: " + this.yenRate[2]);
			System.out.println("\tYen to Rupee: " + this.yenRate[3]);
			System.out.println("\tYen to Rial: " + this.yenRate[4]);
			System.out.println("\tYen to Won: " + this.yenRate[5]);
			System.out.println("\tYen to Yuan: " + this.yenRate[6]);
			System.out.println("\tYen to Pound: " + this.yenRate[7]);
			System.out.println("\tYen to Euro: " + this.yenRate[8]);
			
			
			System.out.println("\t============================");
		
		}
	}

	public void viewExchangeRatesForYuan(){
		
		if(this.checkIfEmptyYuanRate()){
			System.out.println("\n\t\t=== Yuan Exchange rates are empty, please set it first. ===\n");
		}else{
		
			System.out.printf("\t\t===== Yuan Exchange Rates =====\n");
			
			System.out.println("\tYuan to Dollar: " + this.yuanRate[0]);
			System.out.println("\tYuan to Peso: " + this.yuanRate[1]);
			System.out.println("\tYuan to Baht: " + this.yuanRate[2]);
			System.out.println("\tYuan to Rupee: " + this.yuanRate[3]);
			System.out.println("\tYuan to Rial: " + this.yuanRate[4]);
			System.out.println("\tYuan to Won: " + this.yuanRate[5]);
			System.out.println("\tYuan to Yen: " + this.yuanRate[6]);
			System.out.println("\tYuan to Pound: " + this.yuanRate[7]);
			System.out.println("\tYuan to Euro: " + this.yuanRate[8]);
			
			
			System.out.println("\t============================");
		
		}
	}

	public void viewExchangeRatesForPound(){
		
		if(this.checkIfEmptyPoundRate()){
			System.out.println("\n\t\t=== Pound Exchange rates are empty, please set it first. ===\n");
		}else{
		
			System.out.printf("\t\t===== Pound Exchange Rates =====\n");
			
			System.out.println("\tPound to Dollar: " + this.poundRate[0]);
			System.out.println("\tPound to Peso: " + this.poundRate[1]);
			System.out.println("\tPound to Baht: " + this.poundRate[2]);
			System.out.println("\tPound to Rupee: " + this.poundRate[3]);
			System.out.println("\tPound to Rial: " + this.poundRate[4]);
			System.out.println("\tPound to Won: " + this.poundRate[5]);
			System.out.println("\tPound to Yen: " + this.poundRate[6]);
			System.out.println("\tPound to Yuan: " + this.poundRate[7]);
			System.out.println("\tPound to Euro: " + this.poundRate[8]);
			
			
			System.out.println("\t============================");
		
		}
	}

	public void viewExchangeRatesForEuro(){
		
		if(this.checkIfEmptyEuroRate()){
			System.out.println("\n\t\t=== Euro Exchange rates are empty, please set it first. ===\n");
		}else{
		
			System.out.printf("\t\t===== Euro Exchange Rates =====\n");
			
			System.out.println("\tEuro to Dollar: " + this.euroRate[0]);
			System.out.println("\tEuro to Peso: " + this.euroRate[1]);
			System.out.println("\tEuro to Baht: " + this.euroRate[2]);
			System.out.println("\tEuro to Rupee: " + this.euroRate[3]);
			System.out.println("\tEuro to Rial: " + this.euroRate[4]);
			System.out.println("\tEuro to Won: " + this.euroRate[5]);
			System.out.println("\tEuro to Yen: " + this.euroRate[6]);
			System.out.println("\tEuro to Yuan: " + this.euroRate[7]);
			System.out.println("\tEuro to Pound: " + this.euroRate[8]);
			
			
			System.out.println("\t============================");
		
		}
	}

	public double getExchangeRatesForDollar(int index){
		double rate;
		rate = dollarRate[index];
		return rate;
	}

	public double getExchangeRatesForPeso(int index){
		double rate;
		rate = pesoRate[index];
		return rate;
	}

	public double getExchangeRatesForBaht(int index){
		double rate;
		rate = bahtRate[index];
		return rate;
	}

	public double getExchangeRatesForRupee(int index){
		double rate;
		rate = rupeeRate[index];
		return rate;
	}

	public double getExchangeRatesForRial(int index){
		double rate;
		rate = rialRate[index];
		return rate;
	}

	public double getExchangeRatesForWon(int index){
		double rate;
		rate = wonRate[index];
		return rate;
	}

	public double getExchangeRatesForYen(int index){
		double rate;
		rate = yenRate[index];
		return rate;
	}

	public double getExchangeRatesForYuan(int index){
		double rate;
		rate = yuanRate[index];
		return rate;
	}

	public double getExchangeRatesForPound(int index){
		double rate;
		rate = poundRate[index];
		return rate;
	}

	public double getExchangeRatesForEuro(int index){
		double rate;
		rate = euroRate[index];
		return rate;
	}



}