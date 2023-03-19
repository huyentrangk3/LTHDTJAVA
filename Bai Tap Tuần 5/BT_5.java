package BT_5;

import java.util.Scanner;

public class BT_5 {

	public static void main(String[] args) {
		int n, tong = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap cac so nguyen: ");
			n = sc.nextInt();
			//Tinh tong cac so
			tong += n;
			if ( tong > 100 ) 
				break;
			
		} while (n > 0);
		System.out.println("Tong: " + tong);
	}
	
}
