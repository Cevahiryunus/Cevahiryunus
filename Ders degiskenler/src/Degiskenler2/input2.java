package Degiskenler2;

import java.util.Scanner;

public class input2 {

	public static void main(String[] args) {
				
		Scanner Scanner=new Scanner(System.in);
		
		System.out.print("araç kilometrede kaç kuruş yakmakta:");
		double kk=Scanner.nextDouble();
		System.out.print("gittiğiniz yol(...km):");
		double km=Scanner.nextDouble();
		double tl=(kk*km)/100;
		
		System.out.println("\nödenecek tutar:"+tl+"TL");
		
	}

}
