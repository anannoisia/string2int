package com.th.test;
import java.util.Scanner;

public class String2Int {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter input : ");
		 String input = sc.next();
		 System.out.println("Input = " + input);
		 int answer = 0;
		 Boolean isSubZero = false;
		 for(int i= 0; i<=input.length()-1 ; i++) {
			 int ascii = input.charAt(i);
			 if((ascii >= 48 && ascii <= 57) || ascii == 45) {
				 if(ascii == 45 && answer == 0) {
					 isSubZero = true;
				 }
				 if(ascii >= 48 && ascii <= 57){
					 answer += (input.charAt(i) - '0');
					 answer *= 10;
				 }
			 }
		 }
		 answer /= 10;
		 if(isSubZero) {
			 answer *= -1;
		 }
		 System.out.println("output = "+answer);
	}

}
