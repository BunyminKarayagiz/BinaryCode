import java.util.ArrayList;
import java.util.Scanner;

public class Binarycode {
	public static void main(String[] args) {
			
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir Sayi Giriniz:");
		int Sayý=scan.nextInt();
		
		ArrayList <String> list=new ArrayList<String>();
		
			while(Sayý>0) {
				
				if(Sayý%2==1) {
					list.add("1");
				}
				
				else if(Sayý%2==0) {
					list.add("0");
				}
				
				Sayý/=2;
			}
			System.out.print("Girdiðiniz Sayinin Ýkilik Sistemdeki Hali:"+" ");
		for(int dön=list.size()-1 ; dön>=0; dön-- ) {
			System.out.print(list.get(dön));
		}
	}

}
