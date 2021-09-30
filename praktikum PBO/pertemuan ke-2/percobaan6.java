/**
 * aplikasi untuk melakukan penambahan 2 nilai integer
 *yang dimasukkan melalui layar konsol sewktu run program
*/

import java.util.Scanner;

public class percobaan6{
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int nilai1, nilai2, hasil;
		
		System.out.print("masukkan integer pertama:");
		nilai1 = input.nextInt();
		
		System.out.print("masukkan integer kedua:");
		nilai2 = input.nextInt();
		
		hasil = nilai1 + nilai2;
		System.out.println("hasil " +nilai1+ " + " +nilai2+ " = " +hasil);
		
	}
}