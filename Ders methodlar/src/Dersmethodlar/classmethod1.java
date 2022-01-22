package Dersmethodlar;

import java.util.Scanner;

public class classmethod1 {

	public static void faktoriyel() {
		
			Scanner scanner = new Scanner(System.in);
			System.out.print("Faktoryelini bulmak isteiğiniz sayıyı girin:");
			int sayı=scanner.nextInt();
			int faktoryel=1;
			
			while(sayı>0) {
				faktoryel*=sayı;
				sayı--;
				
			}
			System.out.println("Faktoryel="+faktoryel);
		
	}
	public static void main(String[] args) {
		
		faktoriyel();
		
		
		
	}

}
