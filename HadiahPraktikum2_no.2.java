//Ini Soal Genap 
//NIM : 51019020
//Ini Soal Nomor 2
import java.util.Scanner;
public class HadiahPrak2_2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
	
	int jam,menit,detik,totaldetik;
	
	System.out.println("Ini Soal Genap Nomor 2");
	
	System.out.print("Masukkan Jam : ");
	jam = input.nextInt();
	
	System.out.print("Masukkan Menit : ");
	menit = input.nextInt();
	 
	System.out.print("Masukkan Detik : ");
	detik = input.nextInt();
	
	System.out.println("\n");
	
	totaldetik=(jam*3600)+(menit*60)+detik;
	
	System.out.println("Total Detik : " +totaldetik);
	

}}