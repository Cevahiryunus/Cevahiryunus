package döngülervekararyapıları;
import java.util.Scanner;
public class classarmstrong {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayıyı girin:");
		int sayı = scanner.nextInt();
		System.out.print("Basamak sayısını girin:");
		int bas=scanner.nextInt();
		int geçicisayı=sayı;                     //ÇOK ÖNEMLİ
		int toplam=0;
		do {
			toplam +=Math.pow(geçicisayı%10,bas);//üs aldık
			geçicisayı/=10;
		}while(geçicisayı>0);
		if(sayı==toplam)
		{
			System.out.println("sayınız armstrong bir sayıdır.");
		}
		else
		{
			System.out.println("sayınız armstrong sayı değildir.");
			System.out.println(toplam);
		}
	}

}
