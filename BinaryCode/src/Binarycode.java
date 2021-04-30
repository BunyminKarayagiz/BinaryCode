import java.util.ArrayList;
import java.util.Scanner;

public class Binarycode {
	public static void main(String[] args) {
			
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir Sayi Giriniz:");
		int Sayi=scan.nextInt();
		
		ArrayList <String> list=new ArrayList<String>();
		
			while(Sayi>0) {
				
				if(Sayi%2==1) {
					list.add("1");
				}
				
				else if(Sayi%2==0) {
					list.add("0");
				}
				
				Sayi/=2;
			}
			System.out.print("Girdiðiniz Sayinin Ikilik Sistemdeki Hali:"+" ");
		for(int dön=list.size()-1 ; dön>=0; dön-- ) {
			System.out.print(list.get(dön));
		}
	}

}
