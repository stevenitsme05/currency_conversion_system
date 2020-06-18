import java.util.*;
import java.io.*;
import java.util.concurrent.ThreadLocalRandom; 


//E:\Project\Kath\Currency Conversion System
public class MainCCSObis{
	static SetRateCCSObis sr = new SetRateCCSObis(); 
	static ConvertCCSObis cv = new ConvertCCSObis(); 
	
	//static DecimalFormat f = new DecimalFormat("##.##");
//Check for Sign in System
	public static boolean checkCredentials(String username, String password){
		String username1 = "welcome";
		String password1 = "12345";
		if(username.equalsIgnoreCase(username1) && password.equalsIgnoreCase(password1)){
			return true;
		}else{
			return false;
		}
	}
//System Sign in UI
	public static void signin(){
		Scanner input = new Scanner(System.in);
		String username;
		String password;
		boolean logincheck;


		System.out.println("\n\t\tSign In");
		do{
			System.out.print("\n\t\tUser name: \t");
			username = input.nextLine();
			System.out.print("\n\t\tPassword: \t");
			password = input.nextLine();
			logincheck = checkCredentials(username,password);
			if(!logincheck){
				
				System.out.println("\t\tSign in failed! Please try again.");
			}
		}while(!logincheck);
	}
//Function checker for Admin Sign in
	public static boolean checkCredentialsAdmin(String username, String password){
		String admin = "admin";
		String pass = "12345";
		if(username.equalsIgnoreCase(admin) && password.equalsIgnoreCase(pass)){
			return true;
		}else{
			return false;
		}
	}
//Sign in UI for Admin
	public static void signinAdmin(){
		Scanner input2 = new Scanner(System.in);
		String admin;
		String pass;
		boolean logincheck;


		System.out.println("\n\t\tSign In - Administrator");
		do{
			System.out.print("\n\t\tUser name: \t");
			admin = input2.nextLine();
			System.out.print("\n\t\tPassword: \t");
			pass = input2.nextLine();
			logincheck = checkCredentialsAdmin(admin,pass);
			if(!logincheck){
				
				System.out.println("\t\tSign in failed! Please try again.");
			}
		}while(!logincheck);
	}

	//view exchange rates
	public static void viewExchangeRates(){
		if(sr.checkIfEmptyDollarRate() && sr.checkIfEmptyPesoRate() && sr.checkIfEmptyBahtRate() && sr.checkIfEmptyRupeerRate() && sr.checkIfEmptyRialRate() && sr.checkIfEmptyWonRate() && sr.checkIfEmptyYenRate() && sr.checkIfEmptyYuanRate() && sr.checkIfEmptyPoundRate() && sr.checkIfEmptyEuroRate()){
				System.out.println("\n\n\t\t== All Rates are empty, please set it first. ==\n");

			}else{
				System.out.println("\t\t========================\n");
				System.out.println("\t\t1. US Dollar Exchange rates.\n");
				sr.viewExchangeRatesForDollar();			
				System.out.println("\t\t========================\n");	
				System.out.println("\t\t2. Philippine Peso Exchange rates.\n");
				sr.viewExchangeRatesForPeso();
				System.out.println("\t\t========================\n");
				System.out.println("\t\t3. Baht Exchange rates.\n");
				sr.viewExchangeRatesForBaht();
				System.out.println("\t\t========================\n");
				System.out.println("\t\t4. Indian Rupee Exchange rates.\n");
				sr.viewExchangeRatesForRupee();
				System.out.println("\t\t========================\n");
				System.out.println("\t\t5. Qatar Rial Exchange rates.\n");
				sr.viewExchangeRatesForRial();
				System.out.println("\t\t========================\n");
				System.out.println("\t\t6. Korean Won Exchange rates.\n");
				sr.viewExchangeRatesForWon();
				System.out.println("\t\t========================\n");
				System.out.println("\t\t7. Yen Exchange rates.\n");
				sr.viewExchangeRatesForYen();
				System.out.println("\t\t========================\n");
				System.out.println("\t\t8. Yuan Exchange rates.\n");
				sr.viewExchangeRatesForYuan();
				System.out.println("\t\t========================\n");
				System.out.println("\t\t9. Egypt Pound Exchange rates.\n");
				sr.viewExchangeRatesForPound();
				System.out.println("\t\t========================\n");
				System.out.println("\t\t10. Euro Exchange rates.\n");
				sr.viewExchangeRatesForEuro();
				System.out.println("\t\t========================\n");

			}
	}
	//Set Exchange rate menu
	public static void setExchangeRate(){
		Scanner input3 = new Scanner(System.in);
		int choiceCur;
		boolean blIsDouble = true;
		

		double rate = 0.0;
		String strRate;
		
		System.out.println("\n\n\t=====SET EXCHANGE RATES=====");
		System.out.println("\n\t------------------------------------");
		System.out.println("\tPress 1: US Dollar");
		System.out.println("\tPress 2: PH Peso");
		System.out.println("\tPress 3: TH Baht");
		System.out.println("\tPress 4: IND Rupee");
		System.out.println("\tPress 5: QT Rial");
		System.out.println("\tPress 6: KR Won");
		System.out.println("\tPress 7: JP Yen");
		System.out.println("\tPress 8: CHN Yuan");
		System.out.println("\tPress 9: EGP Pound");
		System.out.println("\tPress 10: Euro");
		System.out.println("\tPress 11: Go Back to Admin Menu");
		System.out.println("\t--------------------------------------");	
		System.out.print("\n\t=>\t");

		try{
			choiceCur = input3.nextInt();
		}catch(Exception e){
			System.out.println("\t\t== Please enter digit only. ==\n");
			choiceCur = 0; 
		}

		System.out.print("\n\n");

		if(choiceCur == 1){ //dollar /////////////////////////////////////////////
			
			
			do{
				
				System.out.print("\n\tEnter Rate for Dollar to Peso: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForDollar(rate,0);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Dollar to Baht: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForDollar(rate,1);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Dollar to Rupee: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForDollar(rate,2);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Dollar to Rial: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForDollar(rate,3);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Dollar to Won: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForDollar(rate,4);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Dollar to Yen: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForDollar(rate,5);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Dollar to Yuan: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForDollar(rate,6);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Dollar to Pound: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForDollar(rate,7);
			}while(!blIsDouble);		

			do{
				
				System.out.print("\n\tEnter Rate for Dollar to Euro: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForDollar(rate,8);
			}while(!blIsDouble);	

			System.out.println("\n\t[VIEWING THE ECHANGE RATES....]\n"); 
			try
        	{
            	Thread.sleep(1000);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}

			sr.viewExchangeRatesForDollar();

			try
        	{
            	Thread.sleep(1500);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}
        	System.out.println("\n\t[DOLLAR RATE HAS BEEN SET SUCCESSFULY !!....]\n\n"); 
        	setExchangeRate();

		}else if(choiceCur == 2){ // peso /////////////////////////////////////////////

			do{
				
				System.out.print("\n\tEnter Rate for Peso to Dollar: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForPeso(rate,0);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Peso to Baht: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForPeso(rate,1);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Peso to Rupee: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForPeso(rate,2);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Peso to Rial: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForPeso(rate,3);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Peso to Won: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForPeso(rate,4);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Peso to Yen: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForPeso(rate,5);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Peso to Yuan: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForPeso(rate,6);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Peso to Pound: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForPeso(rate,7);
			}while(!blIsDouble);		

			do{
				
				System.out.print("\n\tEnter Rate for Peso to Euro: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForPeso(rate,8);
			}while(!blIsDouble);	

			System.out.println("\n\t[VIEWING THE ECHANGE RATES....]\n"); 
			try
        	{
            	Thread.sleep(1000);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}

			sr.viewExchangeRatesForPeso();

			try
        	{
            	Thread.sleep(1500);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}
        	System.out.println("\n\t[PESO RATE HAS BEEN SET SUCCESSFULY !!....]\n\n"); 
        	setExchangeRate();

		}else if(choiceCur == 3){ // baht /////////////////////////////////////////////

			do{
				
				System.out.print("\n\tEnter Rate for Baht to Dollar: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForBaht(rate,0);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Baht to Peso: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForBaht(rate,1);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Baht to Rupee: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForBaht(rate,2);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Baht to Rial: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForBaht(rate,3);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Baht to Won: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForBaht(rate,4);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Baht to Yen: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForBaht(rate,5);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Baht to Yuan: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForBaht(rate,6);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Baht to Pound: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForBaht(rate,7);
			}while(!blIsDouble);		

			do{
				
				System.out.print("\n\tEnter Rate for Baht to Euro: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForBaht(rate,8);
			}while(!blIsDouble);	

			System.out.println("\n\t[VIEWING THE ECHANGE RATES....]\n"); 
			try
        	{
            	Thread.sleep(1000);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}

			sr.viewExchangeRatesForBaht();

			try
        	{
            	Thread.sleep(1500);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}
        	System.out.println("\n\t[BAHT RATE HAS BEEN SET SUCCESSFULY !!....]\n\n"); 
        	setExchangeRate();

		}else if(choiceCur == 4){ // Rupee //////////////////////////////////////////

			do{
				
				System.out.print("\n\tEnter Rate for Rupee to Dollar: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForRupee(rate,0);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Rupee to Peso: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForRupee(rate,1);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Rupee to Baht: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForRupee(rate,2);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Rupee to Rial: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForRupee(rate,3);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Rupee to Won: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForRupee(rate,4);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Rupee to Yen: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForRupee(rate,5);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Rupee to Yuan: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForRupee(rate,6);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Rupee to Pound: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForRupee(rate,7);
			}while(!blIsDouble);		

			do{
				
				System.out.print("\n\tEnter Rate for Rupee to Euro: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForRupee(rate,8);
			}while(!blIsDouble);	

			System.out.println("\n\t[VIEWING THE ECHANGE RATES....]\n"); 
			try
        	{
            	Thread.sleep(1000);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}

			sr.viewExchangeRatesForRupee();

			try
        	{
            	Thread.sleep(1500);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}
        	System.out.println("\n\t[RUPEE RATE HAS BEEN SET SUCCESSFULY !!....]\n\n"); 
        	setExchangeRate();


		}else if(choiceCur == 5){ // Rial ////////////////////////////////////////////

			do{
				
				System.out.print("\n\tEnter Rate for Rial to Dollar: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForRial(rate,0);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Rial to Peso: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForRial(rate,1);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Rial to Baht: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForRial(rate,2);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Rial to Rupee: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForRial(rate,3);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Rial to Won: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForRial(rate,4);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Rial to Yen: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForRial(rate,5);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Rial to Yuan: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForRial(rate,6);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Rial to Pound: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForRial(rate,7);
			}while(!blIsDouble);		

			do{
				
				System.out.print("\n\tEnter Rate for Rial to Euro: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForRial(rate,8);
			}while(!blIsDouble);	

			System.out.println("\n\t[VIEWING THE ECHANGE RATES....]\n"); 
			try
        	{
            	Thread.sleep(1000);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}

			sr.viewExchangeRatesForRial();

			try
        	{
            	Thread.sleep(1500);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}
        	System.out.println("\n\t[RIAL RATE HAS BEEN SET SUCCESSFULY !!....]\n\n"); 
        	setExchangeRate();


		}else if(choiceCur == 6){ // Won /////////////////////////////////////////////

			do{
				
				System.out.print("\n\tEnter Rate for Won to Dollar: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForWon(rate,0);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Won to Peso: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForWon(rate,1);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Won to Baht: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForWon(rate,2);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Won to Rupee: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForWon(rate,3);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Won to Rial: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForWon(rate,4);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Won to Yen: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForWon(rate,5);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Won to Yuan: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForWon(rate,6);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Won to Pound: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForWon(rate,7);
			}while(!blIsDouble);		

			do{
				
				System.out.print("\n\tEnter Rate for Won to Euro: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForWon(rate,8);
			}while(!blIsDouble);	

			System.out.println("\n\t[VIEWING THE ECHANGE RATES....]\n"); 
			try
        	{
            	Thread.sleep(1000);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}

			sr.viewExchangeRatesForWon();

			try
        	{
            	Thread.sleep(1500);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}
        	System.out.println("\n\t[WON RATE HAS BEEN SET SUCCESSFULY !!....]\n\n"); 
        	setExchangeRate();

		}else if(choiceCur == 7){ // Yen ///////////////////////////////////////////

			do{
				
				System.out.print("\n\tEnter Rate for Yen to Dollar: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForYen(rate,0);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Yen to Peso: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForYen(rate,1);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Yen to Baht: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForYen(rate,2);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Yen to Rupee: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForYen(rate,3);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Yen to Rial: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForYen(rate,4);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Yen to Won: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForYen(rate,5);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Yen to Yuan: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForYen(rate,6);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Yen to Pound: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForYen(rate,7);
			}while(!blIsDouble);		

			do{
				
				System.out.print("\n\tEnter Rate for Yen to Euro: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForYen(rate,8);
			}while(!blIsDouble);	

			System.out.println("\n\t[VIEWING THE ECHANGE RATES....]\n"); 
			try
        	{
            	Thread.sleep(1000);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}

			sr.viewExchangeRatesForYen();

			try
        	{
            	Thread.sleep(1500);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}
        	System.out.println("\n\t[YEN RATE HAS BEEN SET SUCCESSFULY !!....]\n\n"); 
        	setExchangeRate();


		}else if(choiceCur == 8){ // Yuan //////////////////////////////////////////

			do{
				
				System.out.print("\n\tEnter Rate for Yuan to Dollar: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForYuan(rate,0);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Yuan to Peso: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForYuan(rate,1);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Yuan to Baht: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForYuan(rate,2);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Yuan to Rupee: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForYuan(rate,3);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Yuan to Rial: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForYuan(rate,4);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Yuan to Won: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForYuan(rate,5);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Yuan to Yen: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForYuan(rate,6);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Yuan to Pound: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForYuan(rate,7);
			}while(!blIsDouble);		

			do{
				
				System.out.print("\n\tEnter Rate for Yuan to Euro: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForYuan(rate,8);
			}while(!blIsDouble);	

			System.out.println("\n\t[VIEWING THE ECHANGE RATES....]\n"); 
			try
        	{
            	Thread.sleep(1000);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}

			sr.viewExchangeRatesForYuan();

			try
        	{
            	Thread.sleep(1500);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}
        	System.out.println("\n\t[YUAN RATE HAS BEEN SET SUCCESSFULY !!....]\n\n"); 
        	setExchangeRate();

		}else if(choiceCur == 9){ // Pound /////////////////////////////////////////

			do{
				
				System.out.print("\n\tEnter Rate for Pound to Dollar: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForPound(rate,0);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Pound to Peso: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForPound(rate,1);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Pound to Baht: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForPound(rate,2);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Pound to Rupee: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForPound(rate,3);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Pound to Rial: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForPound(rate,4);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Pound to Won: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForPound(rate,5);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Pound to Yen: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForPound(rate,6);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Pound to Yuan: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForPound(rate,7);
			}while(!blIsDouble);		

			do{
				
				System.out.print("\n\tEnter Rate for Pound to Euro: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForPound(rate,8);
			}while(!blIsDouble);	

			System.out.println("\n\t[VIEWING THE ECHANGE RATES....]\n"); 
			try
        	{
            	Thread.sleep(1000);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}

			sr.viewExchangeRatesForPound();

			try
        	{
            	Thread.sleep(1500);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}
        	System.out.println("\n\t[POUND RATE HAS BEEN SET SUCCESSFULY !!....]\n\n"); 
        	setExchangeRate();

		}else if(choiceCur == 10){ // Euro ////////////////////////////////////////

			do{
				
				System.out.print("\n\tEnter Rate for Euro to Dollar: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForEuro(rate,0);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Euro to Peso: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForEuro(rate,1);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Euro to Baht: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForEuro(rate,2);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Euro to Rupee: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForEuro(rate,3);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Euro to Rial: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForEuro(rate,4);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Euro to Won: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForEuro(rate,5);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Euro to Yen: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForEuro(rate,6);
			}while(!blIsDouble);

			do{
				
				System.out.print("\n\tEnter Rate for Euro to Yuan: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForEuro(rate,7);
			}while(!blIsDouble);		

			do{
				
				System.out.print("\n\tEnter Rate for Euro to Pound: \t");
				
				try{
					strRate = input3.next();
					rate = Double.parseDouble(strRate);
					blIsDouble = true;
					
				}catch(Exception e){
					System.out.print("\n\tError:Please enter valid money value! \t");
					blIsDouble = false;
				}
				sr.setExchangeRatesForEuro(rate,8);
			}while(!blIsDouble);	

			System.out.println("\n\t[VIEWING THE ECHANGE RATES....]\n"); 
			try
        	{
            	Thread.sleep(1000);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}

			sr.viewExchangeRatesForEuro();

			try
        	{
            	Thread.sleep(1500);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}
        	System.out.println("\n\t[EURO RATE HAS BEEN SET SUCCESSFULY !!....]\n\n"); 
        	setExchangeRate();
		}else if(choiceCur == 11){
			menuAdmin();
		}else{
			System.out.println("\n\t[ERROR....]\n"); 
			setExchangeRate();
		}
		
	}

	public static void convertTransact(){

		if(sr.checkIfEmptyDollarRate() && sr.checkIfEmptyPesoRate() && sr.checkIfEmptyBahtRate() && sr.checkIfEmptyRupeerRate() && sr.checkIfEmptyRialRate() && sr.checkIfEmptyWonRate() && sr.checkIfEmptyYenRate() && sr.checkIfEmptyYuanRate() && sr.checkIfEmptyPoundRate() && sr.checkIfEmptyEuroRate()){
				System.out.println("\n\n\t\t== All Rates are empty, please set it first. ==\n");

			}else{

		Scanner scr = new Scanner(System.in);
		Scanner scr1 = new Scanner(System.in);
		Scanner scr2 = new Scanner(System.in);
		Scanner scr3 = new Scanner(System.in);
		Scanner scr4 = new Scanner(System.in);
		boolean go = true;
		boolean go2 = true;
		boolean check = true;
		boolean goods = true;
		String name = "[a-zA-Z\\.\\s\\,]+";
		int c = 0;
		int c2 = 0;
		String strPick = "";
		String strPick2 = "";
		double rateNow = 0.0;
		String currency = "";
		String exchangecurrency = "";
		String cname = "";
		String strmoney = "";	
		double moneyRec = 0.0;


		System.out.println("\n\n\n\t\t=====PROCESS MONEY EXCHANGE=====\n");
		int cid = ThreadLocalRandom.current().nextInt(); 
		
		
		//
		do {

            System.out.print("\n\t\tCustomer Name:\t");
            try{
            	 cname = scr.nextLine();
            	check = cname.matches(name);
            	if (!check || cname.isEmpty()){
            		System.out.println("\t\tError! Customer Name can only contain [,][.][space][letters] \n");
        		}         	
            }catch(Exception e){
            	System.out.println("An exception occurred: "+e);
            	check = false;
            }            
            
        } while (!check);
		//
		System.out.print("\n\t\tID Presented:\t");
		String c_idpresent = scr.nextLine();	
		System.out.print("\n\t\tID Number/Reference Code:\t");
		String c_idpresentnum = scr.nextLine();	
		String c_idpresentFinal = c_idpresent.concat("-").concat(c_idpresentnum);
		
		
		
		
		//
		do{
				
				System.out.print("\n\n\t\tCurrency of the Money that you want to exchange?\n\n(Press 1 - US Dollars, Press 2 - Philippine Peso, Press 3 - Thailand Baht, Press 4 - Indian Rupee, Press 5 - Qatar Rial, Press 6 - Korean Won, Press 7 - Japanese Yen, Press 8 - Chinese Yuan, Press 9 - Egyptian Pound, Press 10 - Euro)\n\t\t=>\t");
				
				try{
					strPick = scr3.next();
					c = Integer.parseInt(strPick);
					go = true;
					
					if(c <= 0 || c > 10){
						System.out.print("\n\n\tError:Please enter valid number from the choices! ");
						go = false;
					}
				}catch(Exception e){
					System.out.print("\n\n\tError:Please enter valid number from the choices! \t");
					go = false;
				}
				
			}while(!go);

		//
		
		
		if(c == 1){ //dollars
			if(sr.checkIfEmptyDollarRate()){
			System.out.println("\n\n\t\t== Ops! Empty rate. Cannot proceed further. Please try again. ==\n");
			menu();
			 }else{
			 	currency = "USD";
			 	do{
					System.out.print("\n\t\tConvert/Exchange it into currency ...\n\n\t\t(Press 1 - Dollars to Peso, Press 2 - Dollars to Baht, Press 3 - Dollars to Rupee, Press 4 - Dollars to Rial, Press 5 - Dollars to Won, Press 6 - Dollars to Yen, Press 7 - Dollars to Yuan, Press 8 - Dollars to Pound, Press 9 - Dollars to Euro)\n\t\t=>\t");

					try{
						strPick2 = scr3.next();
						c2 = Integer.parseInt(strPick2);
						go2 = true;

						if(c2 <= 0 || c2 > 9){
							System.out.print("\n\n\tError:Please enter valid number from the choices! \t");
							go2 = false;
						}
					}catch(Exception e){
							System.out.print("\n\n\tError:Please enter valid number from the choices! \t");
							go2 = false; 
					}

				}while(!go2);

			if(c2 == 1){
				exchangecurrency = "PHP";
				rateNow = sr.getExchangeRatesForDollar(c2-1);
			
			}else if(c2 == 2){
				exchangecurrency = "THB";
				rateNow = sr.getExchangeRatesForDollar(c2-1);
				
			}else if(c2 == 3){
				exchangecurrency = "INR";
				rateNow = sr.getExchangeRatesForDollar(c2-1);
				
			}else if(c2 == 4){
				exchangecurrency = "QAR";
				rateNow = sr.getExchangeRatesForDollar(c2-1);
				
			}else if(c2 == 5){
				exchangecurrency = "KRW";
				rateNow = sr.getExchangeRatesForDollar(c2-1);
				
			}else if(c2 == 6){
				exchangecurrency = "JPY";
				rateNow = sr.getExchangeRatesForDollar(c2-1);
				
			}else if(c2 == 7){
				exchangecurrency = "CNY";
				rateNow = sr.getExchangeRatesForDollar(c2-1);
				
			}else if(c2 == 8){
				exchangecurrency = "EGP";
				rateNow = sr.getExchangeRatesForDollar(c2-1);
				
			}else if(c2 == 9){
				exchangecurrency = "EUR";
				rateNow = sr.getExchangeRatesForDollar(c2-1);
				
			}else{
				System.out.print("\n\tError:Please enter valid number from the choices! \t");
			
			}
		 }
			
		}else if(c == 2){ // PESO //////////////////////////
			
			if(sr.checkIfEmptyPesoRate()){
			System.out.println("\n\n\t\t== Ops! Empty rate. Cannot proceed further. Please try again. ==\n");
			menu();
			 }else{
			 	currency = "PHP";
			 	do{
					System.out.print("\n\t\tConvert/Exchange it into currency ...\n\t\t(Press 1 - Peso to Dollars, Press 2 - Peso to Baht, Press 3 - Peso to Rupee, Press 4 - Peso to Rial, Press 5 - Peso to Won, Press 6 - Peso to Yen, Press 7 - Peso to Yuan, Press 8 - Peso to Pound, Press 9 - Peso to Euro)\n\t\t=>\t");

					try{
						strPick2 = scr3.next();
						c2 = Integer.parseInt(strPick2);
						go2 = true;

						if(c2 <= 0 || c2 > 9){
							go = false;
						}
					}catch(Exception e){
							System.out.print("\n\tError:Please enter valid number from the choices! \t");
							go2 = false; 
					}

				}while(!go2);

			if(c2 == 1){
				exchangecurrency = "USD";
				rateNow = sr.getExchangeRatesForPeso(c2-1);
			
			}else if(c2 == 2){
				exchangecurrency = "THB";
				rateNow = sr.getExchangeRatesForPeso(c2-1);
				
			}else if(c2 == 3){
				exchangecurrency = "INR";
				rateNow = sr.getExchangeRatesForPeso(c2-1);
				
			}else if(c2 == 4){
				exchangecurrency = "QAR";
				rateNow = sr.getExchangeRatesForPeso(c2-1);
				
			}else if(c2 == 5){
				exchangecurrency = "KRW";
				rateNow = sr.getExchangeRatesForPeso(c2-1);
				
			}else if(c2 == 6){
				exchangecurrency = "JPY";
				rateNow = sr.getExchangeRatesForPeso(c2-1);
				
			}else if(c2 == 7){
				exchangecurrency = "CNY";
				rateNow = sr.getExchangeRatesForPeso(c2-1);
				
			}else if(c2 == 8){
				exchangecurrency = "EGP";
				rateNow = sr.getExchangeRatesForPeso(c2-1);
				
			}else if(c2 == 9){
				exchangecurrency = "EUR";
				rateNow = sr.getExchangeRatesForPeso(c2-1);
				
			}else{
				System.out.print("\n\tError:Please enter valid number from the choices! \t");
			
			}
		 }
			
			////////////////// END OF PESO /////////////////////////
			
		}else if(c == 3){ /// BAHT /////////////////////////////
			

			if(sr.checkIfEmptyBahtRate()){
			System.out.println("\n\n\t\t== Ops! Empty rate. Cannot proceed further. Please try again. ==\n");
			menu();
			 }else{
			 	currency = "THB";
			 	do{
					System.out.print("\n\t\tConvert/Exchange it into currency ...\n\t\t(Press 1 - Baht to Dollars, Press 2 - Baht to Peso, Press 3 - Baht to Rupee, Press 4 - Baht to Rial, Press 5 - Baht to Won, Press 6 - Baht to Yen, Press 7 - Baht to Yuan, Press 8 - Baht to Pound, Press 9 - Baht to Euro)\n\t\t=>\t");

					try{
						strPick2 = scr3.next();
						c2 = Integer.parseInt(strPick2);
						go2 = true;

						if(c2 <= 0 || c2 > 9){
							go = false;
						}
					}catch(Exception e){
							System.out.print("\n\tError:Please enter valid number from the choices! \t");
							go2 = false; 
					}

				}while(!go2);

			if(c2 == 1){
				exchangecurrency = "USD";
				rateNow = sr.getExchangeRatesForBaht(c2-1);
			
			}else if(c2 == 2){
				exchangecurrency = "PHP";
				rateNow = sr.getExchangeRatesForBaht(c2-1);
				
			}else if(c2 == 3){
				exchangecurrency = "INR";
				rateNow = sr.getExchangeRatesForBaht(c2-1);
				
			}else if(c2 == 4){
				exchangecurrency = "QAR";
				rateNow = sr.getExchangeRatesForBaht(c2-1);
				
			}else if(c2 == 5){
				exchangecurrency = "KRW";
				rateNow = sr.getExchangeRatesForBaht(c2-1);
				
			}else if(c2 == 6){
				exchangecurrency = "JPY";
				rateNow = sr.getExchangeRatesForBaht(c2-1);
				
			}else if(c2 == 7){
				exchangecurrency = "CNY";
				rateNow = sr.getExchangeRatesForBaht(c2-1);
				
			}else if(c2 == 8){
				exchangecurrency = "EGP";
				rateNow = sr.getExchangeRatesForBaht(c2-1);
				
			}else if(c2 == 9){
				exchangecurrency = "EUR";
				rateNow = sr.getExchangeRatesForBaht(c2-1);
				
			}else{
				System.out.print("\n\tError:Please enter valid number from the choices! \t");
			
			}
		 }
			


			///////////// END OF BAHT ////////////////
			
		}else if(c == 4){ // RUPEEE //////////////////////
			
			if(sr.checkIfEmptyRupeerRate()){
			System.out.println("\n\n\t\t== Ops! Empty rate. Cannot proceed further. Please try again. ==\n");
			menu();
			 }else{
			 	currency = "INR";
			 	do{
					System.out.print("\n\t\tConvert/Exchange it into currency ...\n\t\t(Press 1 - Rupee to Dollars, Press 2 - Rupee to Peso, Press 3 - Rupee to Baht, Press 4 - Rupee to Rial, Press 5 - Rupee to Won, Press 6 - Rupee to Yen, Press 7 - Rupee to Yuan, Press 8 - Rupee to Pound, Press 9 - Rupee to Euro)\n\t\t=>\t");

					try{
						strPick2 = scr3.next();
						c2 = Integer.parseInt(strPick2);
						go2 = true;

						if(c2 <= 0 || c2 > 9){
							go = false;
						}
					}catch(Exception e){
							System.out.print("\n\tError:Please enter valid number from the choices! \t");
							go2 = false; 
					}

				}while(!go2);

			if(c2 == 1){
				exchangecurrency = "USD";
				rateNow = sr.getExchangeRatesForRupee(c2-1);
			
			}else if(c2 == 2){
				exchangecurrency = "PHP";
				rateNow = sr.getExchangeRatesForRupee(c2-1);
				
			}else if(c2 == 3){
				exchangecurrency = "THB";
				rateNow = sr.getExchangeRatesForRupee(c2-1);
				
			}else if(c2 == 4){
				exchangecurrency = "QAR";
				rateNow = sr.getExchangeRatesForRupee(c2-1);
				
			}else if(c2 == 5){
				exchangecurrency = "KRW";
				rateNow = sr.getExchangeRatesForRupee(c2-1);
				
			}else if(c2 == 6){
				exchangecurrency = "JPY";
				rateNow = sr.getExchangeRatesForRupee(c2-1);
				
			}else if(c2 == 7){
				exchangecurrency = "CNY";
				rateNow = sr.getExchangeRatesForRupee(c2-1);
				
			}else if(c2 == 8){
				exchangecurrency = "EGP";
				rateNow = sr.getExchangeRatesForRupee(c2-1);
				
			}else if(c2 == 9){
				exchangecurrency = "EUR";
				rateNow = sr.getExchangeRatesForRupee(c2-1);
				
			}else{
				System.out.print("\n\tError:Please enter valid number from the choices! \t");
			
			}
		 }
			
			//// END OF RUPEE /////////////////////
		}else if(c == 5){ ///// RIAL //////////////////
			
			if(sr.checkIfEmptyRialRate()){
			System.out.println("\n\n\t\t== Ops! Empty rate. Cannot proceed further. Please try again. ==\n");
			menu();
			 }else{
			 	currency = "QAR";
			 	do{
					System.out.print("\n\t\tConvert/Exchange it into currency ...\n\t\t(Press 1 - Rial to Dollars, Press 2 - Rial to Peso, Press 3 - Rial to Baht, Press 4 - Rial to Rupee, Press 5 - Rial to Won, Press 6 - Rial to Yen, Press 7 - Rial to Yuan, Press 8 - Rial to Pound, Press 9 - Rial to Euro)\n\t\t=>\t");

					try{
						strPick2 = scr3.next();
						c2 = Integer.parseInt(strPick2);
						go2 = true;

						if(c2 <= 0 || c2 > 9){
							go = false;
						}
					}catch(Exception e){
							System.out.print("\n\tError:Please enter valid number from the choices! \t");
							go2 = false; 
					}

				}while(!go2);

			if(c2 == 1){
				exchangecurrency = "USD";
				rateNow = sr.getExchangeRatesForRial(c2-1);
			
			}else if(c2 == 2){
				exchangecurrency = "PHP";
				rateNow = sr.getExchangeRatesForRial(c2-1);
				
			}else if(c2 == 3){
				exchangecurrency = "THB";
				rateNow = sr.getExchangeRatesForRial(c2-1);
				
			}else if(c2 == 4){
				exchangecurrency = "INR";
				rateNow = sr.getExchangeRatesForRial(c2-1);
				
			}else if(c2 == 5){
				exchangecurrency = "KRW";
				rateNow = sr.getExchangeRatesForRial(c2-1);
				
			}else if(c2 == 6){
				exchangecurrency = "JPY";
				rateNow = sr.getExchangeRatesForRial(c2-1);
				
			}else if(c2 == 7){
				exchangecurrency = "CNY";
				rateNow = sr.getExchangeRatesForRial(c2-1);
				
			}else if(c2 == 8){
				exchangecurrency = "EGP";
				rateNow = sr.getExchangeRatesForRial(c2-1);
				
			}else if(c2 == 9){
				exchangecurrency = "EUR";
				rateNow = sr.getExchangeRatesForRial(c2-1);
				
			}else{
				System.out.print("\n\tError:Please enter valid number from the choices! \t");
			
			}
		 }
			
			//// END OF RIAL /////////////////////
			
		}else if(c == 6){///// WON //////////////////
			
			if(sr.checkIfEmptyWonRate()){
			System.out.println("\n\n\t\t== Ops! Empty rate. Cannot proceed further. Please try again. ==\n");
			menu();
			 }else{
			 	currency = "KRW";
			 	do{
					System.out.print("\n\t\tConvert/Exchange it into currency ...\n\t\t(Press 1 - Won to Dollars, Press 2 - Won to Peso, Press 3 - Won to Baht, Press 4 - Won to Rupee, Press 5 - Won to Rial, Press 6 - Won to Yen, Press 7 - Won to Yuan, Press 8 - Won to Pound, Press 9 - Won to Euro)\n\t\t=>\t");

					try{
						strPick2 = scr3.next();
						c2 = Integer.parseInt(strPick2);
						go2 = true;

						if(c2 <= 0 || c2 > 9){
							go = false;
						}
					}catch(Exception e){
							System.out.print("\n\tError:Please enter valid number from the choices! \t");
							go2 = false; 
					}

				}while(!go2);

			if(c2 == 1){
				exchangecurrency = "USD";
				rateNow = sr.getExchangeRatesForWon(c2-1);
			
			}else if(c2 == 2){
				exchangecurrency = "PHP";
				rateNow = sr.getExchangeRatesForWon(c2-1);
				
			}else if(c2 == 3){
				exchangecurrency = "THB";
				rateNow = sr.getExchangeRatesForWon(c2-1);
				
			}else if(c2 == 4){
				exchangecurrency = "INR";
				rateNow = sr.getExchangeRatesForWon(c2-1);
				
			}else if(c2 == 5){
				exchangecurrency = "QAR";
				rateNow = sr.getExchangeRatesForWon(c2-1);
				
			}else if(c2 == 6){
				exchangecurrency = "JPY";
				rateNow = sr.getExchangeRatesForWon(c2-1);
				
			}else if(c2 == 7){
				exchangecurrency = "CNY";
				rateNow = sr.getExchangeRatesForWon(c2-1);
				
			}else if(c2 == 8){
				exchangecurrency = "EGP";
				rateNow = sr.getExchangeRatesForWon(c2-1);
				
			}else if(c2 == 9){
				exchangecurrency = "EUR";
				rateNow = sr.getExchangeRatesForWon(c2-1);
				
			}else{
				System.out.print("\n\tError:Please enter valid number from the choices! \t");
			
			}
		 }
			
			//// END OF WON /////////////////////
			
			
		}else if(c == 7){///// YEN //////////////////
			
			if(sr.checkIfEmptyYenRate()){
			System.out.println("\n\n\t\t== Ops! Empty rate. Cannot proceed further. Please try again. ==\n");
			menu();
			 }else{
			 	
			currency = "JPY";
			 	do{
					System.out.print("\n\t\tConvert/Exchange it into currency ...\n\t\t(Press 1 - Yen to Dollars, Press 2 - Yen to Peso, Press 3 - Yen to Baht, Press 4 - Yen to Rupee, Press 5 - Yen to Rial, Press 6 - Yen to Won, Press 7 - Yen to Yuan, Press 8 - Yen to Pound, Press 9 - Yen to Euro)\n\t\t=>\t");

					try{
						strPick2 = scr3.next();
						c2 = Integer.parseInt(strPick2);
						go2 = true;

						if(c2 <= 0 || c2 > 9){
							go2 = false;
						}
					}catch(Exception e){
							System.out.print("\n\tError:Please enter valid number from the choices! \t");
							go2 = false; 
					}

				}while(!go2);

			if(c2 == 1){
				exchangecurrency = "USD";
				rateNow = sr.getExchangeRatesForWon(c2-1);
			
			}else if(c2 == 2){
				exchangecurrency = "PHP";
				rateNow = sr.getExchangeRatesForWon(c2-1);
				
			}else if(c2 == 3){
				exchangecurrency = "THB";
				rateNow = sr.getExchangeRatesForWon(c2-1);
				
			}else if(c2 == 4){
				exchangecurrency = "INR";
				rateNow = sr.getExchangeRatesForWon(c2-1);
				
			}else if(c2 == 5){
				exchangecurrency = "QAR";
				rateNow = sr.getExchangeRatesForWon(c2-1);
				
			}else if(c2 == 6){
				exchangecurrency = "KRW";
				rateNow = sr.getExchangeRatesForWon(c2-1);
				
			}else if(c2 == 7){
				exchangecurrency = "CNY";
				rateNow = sr.getExchangeRatesForWon(c2-1);
				
			}else if(c2 == 8){
				exchangecurrency = "EGP";
				rateNow = sr.getExchangeRatesForWon(c2-1);
				
			}else if(c2 == 9){
				exchangecurrency = "EUR";
				rateNow = sr.getExchangeRatesForWon(c2-1);
				
			}else{
				System.out.print("\n\tError:Please enter valid number from the choices! \t");
			
			}
		 }
			
			//// END OF YEN /////////////////////
			
		}else if(c == 8){///// YUAN //////////////////
			
			if(sr.checkIfEmptyYuanRate()){
			System.out.println("\n\n\t\t== Ops! Empty rate. Cannot proceed further. Please try again. ==\n");
			menu();
			 }else{
			 	
			currency = "CNY";
			 	do{
					System.out.print("\n\t\tConvert/Exchange it into currency ...\n\t\t(Press 1 - Yuan to Dollars, Press 2 - Yuan to Peso, Press 3 - Yuan to Baht, Press 4 - Yuan to Rupee, Press 5 - Yuan to Rial, Press 6 - Yuan to Won, Press 7 - Yuan to Yuan, Press 8 - Yuan to Pound, Press 9 - Yuan to Euro)\n\t\t=>\t");

					try{
						strPick2 = scr3.next();
						c2 = Integer.parseInt(strPick2);
						go2 = true;

						if(c2 <= 0 || c2 > 9){
							go2 = false;
						}
					}catch(Exception e){
							System.out.print("\n\tError:Please enter valid number from the choices! \t");
							go2 = false; 
					}

				}while(!go2);

			if(c2 == 1){
				exchangecurrency = "USD";
				rateNow = sr.getExchangeRatesForYuan(c2-1);
			
			}else if(c2 == 2){
				exchangecurrency = "PHP";
				rateNow = sr.getExchangeRatesForYuan(c2-1);
				
			}else if(c2 == 3){
				exchangecurrency = "THB";
				rateNow = sr.getExchangeRatesForYuan(c2-1);
				
			}else if(c2 == 4){
				exchangecurrency = "INR";
				rateNow = sr.getExchangeRatesForYuan(c2-1);
				
			}else if(c2 == 5){
				exchangecurrency = "QAR";
				rateNow = sr.getExchangeRatesForYuan(c2-1);
				
			}else if(c2 == 6){
				exchangecurrency = "KRW";
				rateNow = sr.getExchangeRatesForYuan(c2-1);
				
			}else if(c2 == 7){
				exchangecurrency = "JPY";
				rateNow = sr.getExchangeRatesForYuan(c2-1);
				
			}else if(c2 == 8){
				exchangecurrency = "EGP";
				rateNow = sr.getExchangeRatesForYuan(c2-1);
				
			}else if(c2 == 9){
				exchangecurrency = "EUR";
				rateNow = sr.getExchangeRatesForYuan(c2-1);
				
			}else{
				System.out.print("\n\tError:Please enter valid number from the choices! \t");
			
			}
		 }
			
			//// END OF YUAN /////////////////////
			
		}else if(c == 9){///// POUND//////////////////
			
			if(sr.checkIfEmptyPoundRate()){
			System.out.println("\n\n\t\t== Ops! Empty rate. Cannot proceed further. Please try again. ==\n");
			menu();
			 }else{
			 	
			currency = "EGP";
			 	do{
					System.out.print("\n\t\tConvert/Exchange it into currency ...\n\t\t(Press 1 - Pound to Dollars, Press 2 - Pound to Peso, Press 3 - Pound to Baht, Press 4 - Pound to Rupee, Press 5 - Pound to Rial, Press 6 - Pound to Won, Press 7 - Pound to Yuan, Press 8 - Pound to Yuan, Press 9 - Pound to Euro)\n\t\t=>\t");

					try{
						strPick2 = scr3.next();
						c2 = Integer.parseInt(strPick2);
						go2 = true;

						if(c2 <= 0 || c2 > 9){
							go2 = false;
						}
					}catch(Exception e){
							System.out.print("\n\tError:Please enter valid number from the choices! \t");
							go2 = false; 
					}

				}while(!go2);

			if(c2 == 1){
				exchangecurrency = "USD";
				rateNow = sr.getExchangeRatesForPound(c2-1);
			
			}else if(c2 == 2){
				exchangecurrency = "PHP";
				rateNow = sr.getExchangeRatesForPound(c2-1);
				
			}else if(c2 == 3){
				exchangecurrency = "THB";
				rateNow = sr.getExchangeRatesForPound(c2-1);
				
			}else if(c2 == 4){
				exchangecurrency = "INR";
				rateNow = sr.getExchangeRatesForPound(c2-1);
				
			}else if(c2 == 5){
				exchangecurrency = "QAR";
				rateNow = sr.getExchangeRatesForPound(c2-1);
				
			}else if(c2 == 6){
				exchangecurrency = "KRW";
				rateNow = sr.getExchangeRatesForPound(c2-1);
				
			}else if(c2 == 7){
				exchangecurrency = "JPY";
				rateNow = sr.getExchangeRatesForPound(c2-1);
				
			}else if(c2 == 8){
				exchangecurrency = "CNY";
				rateNow = sr.getExchangeRatesForPound(c2-1);
				
			}else if(c2 == 9){
				exchangecurrency = "EUR";
				rateNow = sr.getExchangeRatesForPound(c2-1);
				
			}else{
				System.out.print("\n\tError:Please enter valid number from the choices! \t");
			
			}
		 }
			
			//// END OF POUND /////////////////////
			
			
		}else if(c == 10){///// EURO//////////////////
			
			if(sr.checkIfEmptyEuroRate()){
			System.out.println("\n\n\t\t== Ops! Empty rate. Cannot proceed further. Please try again. ==\n");
			menu();
			 }else{
			 	
			currency = "EUR";
			 	do{
					System.out.print("\n\t\tConvert/Exchange it into currency ...\n\t\t(Press 1 - Euro to Dollars, Press 2 - Euro to Peso, Press 3 - Euro to Baht, Press 4 - Euro to Rupee, Press 5 - Euro to Rial, Press 6 - Euro to Won, Press 7 - Euro to Yuan, Press 8 - Euro to Yuan, Press 9 - Euro to Pound)\n\t\t=>\t");

					try{
						strPick2 = scr3.next();
						c2 = Integer.parseInt(strPick2);
						go2 = true;

						if(c2 <= 0 || c2 > 9){
							go2 = false;
						}
					}catch(Exception e){
							System.out.print("\n\tError:Please enter valid number from the choices! \t");
							go2 = false; 
					}

				}while(!go2);

			if(c2 == 1){
				exchangecurrency = "USD";
				rateNow = sr.getExchangeRatesForEuro(c2-1);
			
			}else if(c2 == 2){
				exchangecurrency = "PHP";
				rateNow = sr.getExchangeRatesForEuro(c2-1);
				
			}else if(c2 == 3){
				exchangecurrency = "THB";
				rateNow = sr.getExchangeRatesForEuro(c2-1);
				
			}else if(c2 == 4){
				exchangecurrency = "INR";
				rateNow = sr.getExchangeRatesForEuro(c2-1);
				
			}else if(c2 == 5){
				exchangecurrency = "QAR";
				rateNow = sr.getExchangeRatesForEuro(c2-1);
				
			}else if(c2 == 6){
				exchangecurrency = "KRW";
				rateNow = sr.getExchangeRatesForEuro(c2-1);
				
			}else if(c2 == 7){
				exchangecurrency = "JPY";
				rateNow = sr.getExchangeRatesForEuro(c2-1);
				
			}else if(c2 == 8){
				exchangecurrency = "CNY";
				rateNow = sr.getExchangeRatesForEuro(c2-1);
				
			}else if(c2 == 9){
				exchangecurrency = "EGP";
				rateNow = sr.getExchangeRatesForEuro(c2-1);
				
			}else{
				System.out.print("\n\tError:Please enter valid number from the choices! \t");
			
			}
		 }
			
			//// END OF Euro /////////////////////
			
			
		}else{
			System.out.print("\n\tError:Please enter valid number from the choices! \t");
			
		}
		
		
			
			do{
				System.out.print("\n\n\t\tAmount of money to be exchanged:\t");
				try{
					strmoney = scr4.next();
					moneyRec = Double.parseDouble(strmoney);
					goods = true;
				}catch(Exception e){
						System.out.print("\n\n\t\tError! Please enter valid money value.\t");
						goods = false;
				}
			}while(!goods);
					

							

			System.out.print("\n\t[Processing... ] \t\n");
			try
        	{
            	Thread.sleep(1500);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}

        	System.out.print("\n\t[Process Successful!] \t\n");
        	System.out.print("\n\t=========================");
        	System.out.printf("\n\tTransaction Number: %d",cid);
        	System.out.printf("\n\tCustomer Name: %s",cname.toUpperCase());
        	System.out.printf("\n\tID Presented: %s",c_idpresentFinal.toUpperCase());
        	System.out.printf("\n\tAmount of Cash: %.4f %s",moneyRec,currency);
        	System.out.printf("\n\t%s to %s Rate: %.4f ",currency,exchangecurrency,rateNow);
        	 double finalval = cv.procConvert(moneyRec,rateNow);
        	System.out.printf("\n\tExchanged Final Value: %.4f %s",finalval,exchangecurrency);

			cv.addTransact(cid,cname,c_idpresentFinal,moneyRec,currency,exchangecurrency,rateNow);


			}

	}
	//Admin Menu
	public static void menuAdmin(){
		Scanner input2 = new Scanner(System.in);
		int menuAdmin;
		boolean check;
		System.out.println("\n\n\n\t=====ADMINISTRATOR - CURRENCY CONVERTION SYSTEM=====");
		System.out.println("\n\t------------------------------------");
		System.out.println("\tPress 1: View Exchange rates");
		System.out.println("\tPress 2: Set Exchange rates");
		System.out.println("\tPress 3: View Transactions");
		System.out.println("\tPress 4: Sign Out");
		System.out.println("\t--------------------------------------");	
		System.out.print("\n\t=>\t");

		
		try{
			menuAdmin = input2.nextInt();
		}catch(Exception e){
			System.out.println("\t\t== Please enter digit only. ==\n");
			menuAdmin = 0; 
		}
		
		if(menuAdmin == 1){
			
			System.out.println("\n\t[Loading....]\n"); 
			try
        	{
            	Thread.sleep(2000);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}
			viewExchangeRates();	
			try
        	{
            	Thread.sleep(1500);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}		
			menuAdmin();
		}else if(menuAdmin == 2){
			setExchangeRate();
		}else if(menuAdmin == 3){
			System.out.println("\n\t[Loading....]\n"); 
			try
        	{
            	Thread.sleep(2000);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}

			cv.viewTransactions();
			try
        	{
            	Thread.sleep(1000);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}
			menuAdmin();
		}else if(menuAdmin == 4){
			String checkExit;
			boolean blCheck;
			Scanner x = new Scanner(System.in);
			do{
				blCheck = true;
				System.out.println("\n\t Do you want to sign out?"); 
				System.out.print("\t (Yes/Y|No/N) =>\t\t");
				checkExit = x.nextLine();
				if(checkExit.equalsIgnoreCase("Yes") || checkExit.equalsIgnoreCase("Y")){
					System.out.println("\t[ADMIN SIGNING OUT....]\n"); 
					try
        			{
            			Thread.sleep(2500);
        			}catch(InterruptedException ex){
            			Thread.currentThread().interrupt();
        			}
            		menu();
				}else if(checkExit.equalsIgnoreCase("No") || checkExit.equalsIgnoreCase("N")){
					System.out.println("\n\t[SIGN OUT ABORTED....]\n"); 
					menuAdmin();
				}else{
					System.out.println("\n\t[ERROR....]\n"); 
					blCheck = false;
				}
			}while(!blCheck);
            
           

		}else{
			System.out.println("\n\tError! Please Try again.\n\n");
			menuAdmin();
			
		}
	}

	//Home menu
	public static void menu(){
		Scanner input1 = new Scanner(System.in);
		int menu;
		boolean check;
		System.out.println("\n\n\n\t=====CURRENCY CONVERTION SYSTEM=====");
		System.out.println("\n\t------------------------------------");
		System.out.println("\tPress 1: Convert Money");
		System.out.println("\tPress 2: View Exchange Rates");
		System.out.println("\tPress 3: Administrator Sign in");
		System.out.println("\tPress 4: Exit");
		System.out.println("\t--------------------------------------");	
		System.out.print("\n\t=>\t");

		
		try{
			menu = input1.nextInt();
		}catch(Exception e){
			System.out.println("\t\t== Please enter digit only. ==");
			menu = 0; 
		}
		
		if(menu == 1){
			convertTransact();
		
			menu();
		}else if(menu == 2){
			System.out.println("\n\t[Loading....]\n"); 
			try
        	{
            	Thread.sleep(2000);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}
			viewExchangeRates();	
			try
        	{
            	Thread.sleep(1000);
        	}catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        	}	
			menu();
		}else if(menu == 3){
			signinAdmin();
			menuAdmin();
		}else if(menu == 4){
			String checkExit;
			boolean blCheck;
			Scanner x = new Scanner(System.in);
			do{
				blCheck = true;
				System.out.println("\n\t Do you want to exit the program?(By Exiting, all changes made will be wiped out.)"); 
				System.out.print("\t (Yes/Y|No/N) =>\t\t");
				checkExit = x.nextLine();
				if(checkExit.equalsIgnoreCase("Yes") || checkExit.equalsIgnoreCase("Y")){
					System.out.println("\t\n[PROGRAM EXITING....]\n"); 
					try
        			{
            			Thread.sleep(2500);
        			}catch(InterruptedException ex){
            			Thread.currentThread().interrupt();
        			}
            		System.exit(0); 
				}else if(checkExit.equalsIgnoreCase("No") || checkExit.equalsIgnoreCase("N")){
					System.out.println("\n\t[EXIT ABORTED....]\n"); 
					menu();
				}else{
					System.out.println("\n\t[ERROR....]\n"); 
					blCheck = false;
				}
			}while(!blCheck);
            

		}else{
			System.out.println("\n\tError! Please Try again.\n\n");
			menu();
			
		}
	}

	//main function
	public static void main(String []args){
		System.out.println("\t\t\nWELCOME TO CURRENCY CONVERTION SYSTEM");
		signin();
		menu();
	}
}