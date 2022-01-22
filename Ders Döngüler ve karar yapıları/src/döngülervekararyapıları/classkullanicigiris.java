package döngülervekararyapıları;
import java.util.Scanner;
public class classkullanicigiris {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Merhabalar..");
		int girishakkı=3;
		System.out.println("********************");
		String nick="Headshoterr_25";
		String parola="532420adc";
		while(girishakkı>0) {
			System.out.print("Nickname:");
			String girnick=scanner.nextLine();
			System.out.print("Parola:");
			String girparola=scanner.nextLine();
			if(girnick.equals("Headshoterr_25")&&girparola.equals(parola)) {
				System.out.println("Giriş Başarılı.Lobiye Yönlendiriliyorsunuz....");
				break;
			}
			else 
			{
					System.out.println("Nick ya da Parola HATALI!!");
					
					girishakkı--;
			}
			if(0>=girishakkı) {
				System.out.println("giriş hakkınız doldu");
			}
		}
				
		
		
		
	}

}
