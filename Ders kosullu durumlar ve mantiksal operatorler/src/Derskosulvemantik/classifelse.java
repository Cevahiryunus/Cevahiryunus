package Derskosulvemantik;

import java.util.Scanner;

public class classifelse {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.print("Birinci vize notunuz:");		
		float vize1 =scanner.nextFloat();
		
		System.out.print("İkinci vize notunuz:");	
		float vize2 =scanner.nextFloat();
		
		System.out.print("Final notunuz:");		
		float finalnot =scanner.nextFloat();
		float sonuç =(float)(vize1 * 0.3+vize2*0.3+finalnot*0.4);
		System.out.print("okul ortalamanızı girin:");
		float ort=scanner.nextFloat();
		
		
		
		if(sonuç>=90)
		{
			System.out.println("AA");
		}
		else if(sonuç>=85)
		{
			System.out.println("BA");// 80 75 70 65   55 55
		}
		else if(sonuç>=80)
		{
			System.out.println("BB");
		}
		else if(sonuç>=75)
		{
			System.out.println("CB");
		}
		else if (sonuç>=70)
		{
			System.out.println("CC");
		}
		else if(sonuç>=65)
		{
			System.out.println("DC");
		}
		else if(sonuç>=60)
		{
			System.out.println("DD");
			if(ort<2.50)
			{
				System.out.println("DD aldın ve notun düşük salak adam.");
			}
		}
		else if(sonuç>=55)
		{
			System.out.println("FD");
		}
		else if(sonuç<55)
		{
			System.out.println("F to respect FF");
		}
		
		
		
	}

}
