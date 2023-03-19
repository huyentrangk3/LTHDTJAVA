package BT_6;

import java.util.Scanner;

public class BT_6 {

	public static void main(String[] args) {
		int number, temp = 1;
        long giaiThua = 1;
         
        Scanner sc = new Scanner(System.in);
         
        do {
            System.out.println("Nhap vao 1 so bat ki nho hon 20: ");
            number = sc.nextInt();
            if (number > 20) {
            	System.out.println("Moi ban nhap lai");
            }
        } while ((number <= 0) || (number > 20));
         
        /*
         * Nếu giá trị biến temp còn nhỏ hơn hoặc bằng number
         * thì còn thực hiện đoạn lệnh bên trong while
         */
        while (temp <= number) { // 1 <= 9 ;   1 *= 1 * 1
            giaiThua *= temp;
            temp++;
        }
         
        System.out.println(number + "! = " + giaiThua);
	}
	
}
