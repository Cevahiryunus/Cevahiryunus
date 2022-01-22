package Degiskenler2;

import java.util.Scanner;

public class classinput3 {

	public static void main(String[] args) {
		
		 Scanner scanner=new Scanner(System.in);
		    int s1;
		    int s2;
		    
		        System.out.println("değiştirilmeden önce");
		        
		        System.out.print("1.sayiyi girin:");
		        s1=scanner.nextInt();
		        System.out.print("2.sayiyi girin:");
		        s2=scanner.nextInt();
		        System.out.println("değiştirilmeden sonra");
		    
		    int s=s1;
		    s1 = s2;
		    s2 = s;
		   
		      System.out.println("1.sayi:"+s1);
		      System.out.println("2.sayi:"+s2);
		      
	}

}
