package BT_8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BT_8 {

    public static void main(String[] args) {
        int n, sum = 0, number;
        float avgNumber;
        Scanner scanner = new Scanner(System.in);
 
        DecimalFormat decimalFormat = new DecimalFormat("#.##");    
         
        System.out.println("Nhap vao so nguyen co trong day: ");
        n = scanner.nextInt();
        
        for (int i = 1; i <=n; i++) {
            System.out.println("Nhap so thu " + i + ": ");
            number = scanner.nextInt();
            sum += number;
        }
        avgNumber = (float) sum / n;
        System.out.println("TB cong = " + decimalFormat.format(avgNumber));
	}
}
