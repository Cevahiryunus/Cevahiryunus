package Derskosulvemantik;
import java.util.Scanner;
public class classminiproje2 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Boyunuz(cm):");
			double boy=scanner.nextDouble();
			System.out.println("Kilonuzu girin(kg):");
			double kilo=scanner.nextDouble();
			double bki=kilo/((boy/100)*(boy/100));
			if(bki <= 18.5)
			{
				System.out.println(bki+"-Zayıf");
			}
			else if(bki <=25)
			{
				System.out.println(bki+"-Normal");
			}
			else if(bki <=30)
			{
				System.out.println(bki+"-Fazla kilolu");
			}
			else if(bki >30)
			{
				System.out.println(bki+"-Obez");
			}
			
			
			
			
			
	}

}
