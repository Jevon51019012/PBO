// jevon kirk macciano
// 51019012

import java.util.Scanner;

public class MidPraktikum2 {
	public static void main(String args[]) {
	Double  hasil;
	int sisi;
	

	Scanner input = new Scanner(System.in);
	
	
	// Proses Instansiasi Object baru dari Class CariLuasPersegi
	CariLuasPersegi rumus = new CariLuasPersegi();
	
	
		

	System.out.println("Aplikasi polimorphisme untuk mencari luas Persegi");
	System.out.println();
	

	System.out.print("Silahkan Masukkan Sisi Persegi :  ");
	sisi = input.nextInt();
	System.out.println();
			

	rumus.setSisi(sisi);
	rumus.setLuasPersegi();
	System.out.println("Hasil Luas Persegi : " +  rumus.getLuasPersegi());




		
	}	
}