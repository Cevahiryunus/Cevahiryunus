package döngülervekararyapıları;
import java.util.Scanner;
public class classATM {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);

		System.out.println("*******************");
		System.out.println("SÖMÜRÜR BANK ATM");
		System.out.println("*******************");
		int bakiye=1000;
		while(true) {
	
		String atm="1-Bakiye Öğrenme\n"
					+"2-Para çekme\n"
					+"3-Para yatırma\n"
					+"Çıkış yapmak için q";
		System.out.println(atm);
		String işlem=scanner.nextLine();
		
		
		if(işlem.equals("1")) {
			System.out.println("Bakiyeniz="+bakiye+"\n");
		}
		else if(işlem.equals("2")) {
			System.out.print("Çekmek istediğiniz miktar=");
			int tutar=scanner.nextInt();
			scanner.nextLine();//DUMMY
			if(bakiye-tutar<0) {
				System.out.println("bakiyenizde yeterli miktar yok...");
			}
			else
			{
			bakiye-=tutar;
			System.out.println("Yeni bakiyeniz="+bakiye);
			}
		}
		else if(işlem.equals("3")) {
			System.out.print("Yatırmak istediğiniz tutar=");
			int tutar=scanner.nextInt();
			scanner.nextLine();//DUMMY
			bakiye+=tutar;
			System.out.println("yeni bakiyeniz="+bakiye);
		}
		else if(işlem.equals("q")) {
			System.out.println("programdan çıkılıyor...");
			break;
		}
		else
		{
			System.out.println("Geçersiz işlem...");	
		}

		}
	}
}
