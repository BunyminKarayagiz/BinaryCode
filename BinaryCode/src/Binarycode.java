import java.util.ArrayList;
import java.util.Scanner;

public class Binarycode {
	public static void main(String[] args) {
			
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir Sayi Giriniz:");
		int Say�=scan.nextInt();
		
		ArrayList <String> list=new ArrayList<String>();
		
			while(Say�>0) {
				
				if(Say�%2==1) {
					list.add("1");
				}
				
				else if(Say�%2==0) {
					list.add("0");
				}
				
				Say�/=2;
			}
			System.out.print("Girdi�iniz Sayinin �kilik Sistemdeki Hali:"+" ");
		for(int d�n=list.size()-1 ; d�n>=0; d�n-- ) {
			System.out.print(list.get(d�n));
		}
	}

}
