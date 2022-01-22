package Degiskenler2;

import java.util.Scanner;

public class classinput {

	public static void main(String[] args) {
		
	Scanner scanner =new Scanner(System.in);	
	
	System.out.println("ağırlık:");
	float ağırlık=scanner.nextFloat();
	System.out.println("boy cm:");
	float boy =scanner.nextFloat();
	float endeks=ağırlık/((boy/100)*(boy/100));
	System.out.println("vücut kütle endeksi:"+endeks);
	
	}

}
