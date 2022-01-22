package döngülervekararyapıları;
import java.util.Scanner;
public class classwhile {
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String işlemler="*\t"+"sin\t"+"cos\t"+"log\t"+"karekök\t"+"\n/\n"+"+\n"+"-";
		String işlem;
		double s1,s2;
		
		while(true) {
			System.out.println(işlemler);
			s1=scanner.nextDouble();
			scanner.nextLine();
			işlem=scanner.nextLine();
			
			
			if(işlem.equals("*")) {
				s2=scanner.nextDouble();
				System.out.println("="+s1*s2);
			}
			else if(işlem.equals("/")) {
				s2=scanner.nextDouble();
				System.out.println("="+s1/s2);		
			}
			else if(işlem.equals("+")) {
				s2=scanner.nextDouble();
				System.out.println("="+(s1+s2));			
			}
			else if(işlem.equals("-")) {
				s2=scanner.nextDouble();
				System.out.println("="+(s1-s2));				
			}
			else if(işlem.equals("sin")) {
				System.out.println("="+Math.sin(s1));
			}
			else if(işlem.equals("cos")) {
				System.out.println("="+Math.cos(s1));
			}
			else if(işlem.equals("log")) {
				System.out.println("="+Math.log(s1)+"(doğal logaritma)");
			}
			else if(işlem.equals("karekök")) {
				System.out.println("="+Math.sqrt(s1));
			}
			else if(işlem.equals("q")) {
				System.out.println("Programdan çıkılıyor...");
				break;
			}
			else
			{
				System.out.println("ERROR...");
			}
			
			
			
			
		}
		
	}

}
