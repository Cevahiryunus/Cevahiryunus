package Degiskenler2;

import java.util.Scanner;

public class classinput4 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Birinci kenarı girin:");
		int kenar1=scanner.nextInt();
		System.out.print("İkinci kenarı girin:");
		int kenar2=scanner.nextInt();
		
		double kenar3=Math.sqrt(kenar2*kenar2+kenar1*kenar1);
		System.out.println("3.kenar:"+kenar3);
		
		
		
		
		
		
	}

}
