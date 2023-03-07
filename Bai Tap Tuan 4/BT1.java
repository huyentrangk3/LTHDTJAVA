package BT1;

import java.util.Scanner;

public class BT1 {

	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap 2 so a va b bat ki: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		System.out.println("Tong cua 2 so la: " + (a+b));
		System.out.println("Tru cua 2 so la: " + (a-b));
		System.out.println("Tich cua 2 so la: " + (a*b));
		System.out.println("Thuong cua 2 so la: " + (a/b));
		System.out.println("Lay so du cua 2 so la: " + (a%b));
		System.out.println("-----------------------------------");
		System.out.println("So sanh 2 so: ");
		if ( a > b ) {
			System.out.println( a + " > " + b);
		} else if (a < b) {
			System.out.println(a + " < " + b);
		} else {
			System.out.println(a + " = " + b);
		}
	}
	
}
