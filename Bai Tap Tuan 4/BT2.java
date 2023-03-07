package BT2;
import java.util.Scanner;
public class BT2 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap 1 so bat ki: ");
		n = sc.nextInt();
		if(n % 2 ==0 ) { 
			System.out.println( n + " la so chan");
		} else {
			System.out.println(n + " la so le");
		}
		
	}
	
	
}

	

