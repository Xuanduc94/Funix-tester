package basic.bai2;

import java.awt.PageAttributes.OriginType;
import java.util.Iterator;
import java.util.Scanner;

public class MainScreen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen N");
		int n = scanner.nextInt();
		if (n >0) {
			int totalEventNumber = 0, totalOddNumber =0, count =0;
			for (int number = 0; number<= n; number++) {
				if (number%2 == 0) {
					totalEventNumber = totalEventNumber +number;
				}else {
					totalOddNumber = totalOddNumber+ number;
				}
				
				if (number % 2!= 0 && number %3== 0) {
					count++;
				}
			}
			System.out.println("Tong so chan la: "+ totalEventNumber);
			System.out.println("Tong so le la: "+ totalOddNumber);
			System.out.println("So chia het cho 3 nhung khong chia het cho 2: "+ count);
			
		}else {
			System.out.println("Vui long nhap so > 0");
		}

	}

}
