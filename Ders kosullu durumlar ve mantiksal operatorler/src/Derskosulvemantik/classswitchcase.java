package Derskosulvemantik;
import java.util.Scanner;
public class classswitchcase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hesap Makinesi");//Basic hesap makinesi
		System.out.println("--------------");
		double s1=scanner.nextDouble();

		String işlemler="1- x\n"
					   +"2- /\n"
					   +"3- +\n"
					   +"4- -";
		System.out.println(işlemler);
		System.out.print("seçim:");
		
		/*
		char seçim=scanner.next().charAt(0);//ilk harf alıyor cümlede başka yolu var  sayı ile
		double s2=scanner.nextDouble();
		switch(seçim)
		{
		case '*':
			System.out.println("çarpım="+(s1*s2));
			break;
		case '/':
			System.out.println("bölüm="+(s1/s2));
			break;
		case '+':
			System.out.println("toplam="+(s1+s2));
			break;
		case '-':
			System.out.println("sonuç="+(s1-s2));
			break;
			default:
				System.out.println("error");
				}
				*/
		int seçim=scanner.nextInt();
		double s2=scanner.nextDouble();
		switch(seçim)
		{
		case 1:
			System.out.println("çarpım="+(s1*s2));
			break;
		case 2:
			System.out.println("bölme="+(s1/s2));
			break;
		case 3:
			System.out.println("toplam="+(s1+s2));
			break;
		case 4:
			System.out.println("sonuç="+(s1-s2));
			break;
		default:
			System.out.println("ERROR");
		
		}
		
		
	}

}
