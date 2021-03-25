import java.util.Scanner;

public class JavaLibs5026201002 {
	public static void main(String[] args) {
 
     	Scanner sc = new Scanner(System.in);
	
	//question to user
	System.out.println("What is your name?");
	String name = sc.next();
	

	//Math with at least 1 integer input
	System.out.println("What year were you born in?");
	int yrs = sc.nextInt();
	int old = 2020 - yrs;
	System.out.println("What month (in number) were you born on?");
	int mth = sc.nextInt();
	int mth1 = 13 - mth;
	
	int day = mth1*30 + old*365;
	
	
	//Input float number
     	System.out.println("What is your height in meter?");
    	float fnum = sc.nextFloat();
    	
	//math with at least 1 double input
	System.out.println("Pick a decimal number");
	Double doubleVar2 = sc.nextDouble();
	System.out.println("Pick another decimal number");
	Double doubleVar3 = sc.nextDouble();
	Double doubleVar4 = doubleVar2*doubleVar3;
	

	//Math with an integer input
	System.out.println("How many sister/brother(s) do you have?");
	int sbl = sc.nextInt();
	sbl++;
     	
 
     	//Parsing as an integer
    	System.out.println("What is your bad luck number");
    	String badNum = sc.next();
	int number = Integer.parseInt(badNum);
     	
    	
	//Parsing as a double
    	System.out.println("Pick a number from 5-6");
	String num1 = sc.next();
    	double doubleVar1 = Double.parseDouble(num1);


	//Parsing as a string
    	System.out.println("What is your favourite food?");
	String fav = sc.next();    	
	String food = new String(fav);


	System.out.println("Hello! my name is "+ name + "!"
			+ "I'm "+ old + " years and " + mth1 + " months old by early 2021."  
			+ " Or if I could be precise, I am " + day + " days old. I like doing math, hehe."
			+ " I am "+ fnum + " meters in tall. Tall enough, right?"
			+ " You know what? I am taller " + doubleVar2 + " inch for the past year." 	
			+ " I'm one of the " + sbl + " siblings in my family."	
			+ " Talking about number, I don't like " + number + " because it is hard to write."
			+ " But, I like number "+doubleVar1 + " because it is unique."
			+ "\n" + "That's it from me, nice to meet " + food + "!");
	
	}
}