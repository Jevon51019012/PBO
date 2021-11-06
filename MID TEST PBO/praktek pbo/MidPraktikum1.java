// jevon kirk macciano 
// 51019012

import java.util.Scanner;

public class MidPraktikum1 {
	public static void main(String args[]) {
	Double  hasil;
	int jari;
	
	
	Scanner input = new Scanner(System.in);
	


	// Proses Instansiasi Object baru dari Class CariLuasLingkaran
	CariLuasLingkaran rumus = new CariLuasLingkaran();
	
	
		
	System.out.println("Aplikasi polimorphisme untuk mencari luas lingkaran");
	System.out.println();
	

	System.out.print("Silahkan Masukkan nilai jari-jari / r: ");
	jari = input.nextInt();
	System.out.println();
			

	rumus.setJari(jari);
	rumus.setLuasLingkaran();
	System.out.println("Hasil Luas Lingkaran : " + String.format("%.2f",rumus.getLuasLingkaran()));



		
	}	
}