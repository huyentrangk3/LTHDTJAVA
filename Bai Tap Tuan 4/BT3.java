package BT3;
import java.util.Scanner;
public class BT3 {
	public static void main(String[] args) {
		int namSinh;
		Scanner sc = new Scanner(System.in);	
		System.out.println("Moi ban nhap ten: ");
		String name = sc.nextLine();
		System.out.println("Moi ban nhap nam sinh: ");
		namSinh = sc.nextInt();
		if ( 2023 - namSinh < 16) {
			System.out.println("Ban " + name + " o do tuoi vi thanh nien");
		} 
		else if (2023 - namSinh >= 16 && 2023 - namSinh < 18) {
			System.out.println("Ban " + name + " o do tuoi truong thanh");
		}
		else {
			System.out.println("Ban " + name + " da gia");
		}
	}
}
