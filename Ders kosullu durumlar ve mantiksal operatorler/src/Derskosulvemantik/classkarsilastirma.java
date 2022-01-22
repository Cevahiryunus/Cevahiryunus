package Derskosulvemantik;

import java.util.Scanner;

public class classkarsilastirma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double kenar1,kenar2,kenar3;
		
		System.out.print("1.kenarı girin:");    //üçgen olup olmadığını tanımlıyor.
		kenar1=scanner.nextDouble();
		
		System.out.print("\n2.kenarı girin:");
		kenar2=scanner.nextDouble();
		
		System.out.print("\n3.(hipotenüs)kenarı girin:");
		kenar3=scanner.nextDouble();
		
		System.out.println(kenar3==Math.sqrt(kenar2*kenar2+kenar1*kenar1));
		
		
		
	}

}
