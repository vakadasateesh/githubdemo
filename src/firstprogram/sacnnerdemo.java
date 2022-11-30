package firstprogram;

import java.util.Scanner;

public class sacnnerdemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any name");
        String value =sc.nextLine();
	    System.out.println("Enter value is :"+value);
	    
	    System.out.println("Enter 1stnumber");
        String num1 = sc.nextLine();
        System.out.println("Enter 2nd number");
	    String num2 = sc.nextLine();
		System.out.println("sum of the total numbers is:"+(num1+num2));
	}

}
