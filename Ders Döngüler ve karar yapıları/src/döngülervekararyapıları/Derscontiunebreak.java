package döngülervekararyapıları;

public class Derscontiunebreak {

	public static void main(String[] args) {
	
	/*int i=0;
	while(i<10)
	{
		if(i==3 || i==5)
		{								//döngü continue ile başa sarıldı
										//döngü başa alınırken döngüde altta kalan komut 
			i++;						//okunmadı
			continue;					
		}
		System.out.println("i="+i);
		i++;
		
	}*/

		
		int i=0;
		while(i<11) {
			if(i==3||i==5) {
			
				break;						//çıktı i=0,i=1,i=2
			}								//döngü break ile kırıldı yani sonlandı		
				
			System.out.println("i="+i);
			i++;
	    }
	}
}
