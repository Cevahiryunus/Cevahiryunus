package Derskosulvemantik;
import java.util.Scanner;
public class classelseif {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	
		System.out.println("1-toplama");
		System.out.println("2-çıkarma");
		System.out.println("3-çarpma");
		System.out.println("4-bölme\n");
		System.out.print("Hangi işlemi seçeceğinizi girin:");
		int işlem=scanner.nextInt();
		float sayi1,sayi2;
		if(işlem==1)
		{
			System.out.println("sayıları girin:");
			sayi1=scanner.nextFloat();
			sayi2=scanner.nextFloat();
			System.out.println("sonuç(toplam)="+(sayi1+sayi2));
		}
		else if(işlem==2)
		{
			System.out.println("sayıları girin:");
			sayi1=scanner.nextFloat();
			sayi2=scanner.nextFloat();
			System.out.println("sonuç(çıkarma)="+sayi1+"-"+sayi2+"="+(sayi1-sayi2));
		}
		else if(işlem == 3)
		{
			System.out.println("sayıları girin:");
			sayi1=scanner.nextFloat();
			sayi2=scanner.nextFloat();
			System.out.println("sonuç(çarpma)="+(sayi1*sayi2));
			
		}
		else if(işlem==4)
		{
			System.out.println("sayıları girin:");
			sayi1=scanner.nextFloat();
			sayi2=scanner.nextFloat();
			System.out.println("sonuç(bölme)="+sayi1+"/"+sayi2+"="+(sayi1/sayi2));
		}
		else
		{
			System.out.println("ERROR");
		}
		
		
	}

}
