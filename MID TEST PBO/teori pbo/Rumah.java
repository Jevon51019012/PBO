// jevon kirk macciano
// 51019012

import java.util.Scanner;

public class Rumah {
	public static void main(String args[]){
		
		String nama;
		int meter, total, bayar, tipe;
		
		Scanner input = new Scanner(System.in);
		
		BebanHarga X = new BebanHarga();
		
		System.out.println("Mid Teori Aplikasi ---");
		System.out.println();
		
		System.out.print("Masukkan Nama Anda : ");
		nama = input.nextLine();
		System.out.println("Masukkan Tipe Rumah Anda");
		System.out.print("Tipe Yang Tersedia : \n31 32 33 \n");
		System.out.println("34 35 40");
		System.out.print("Tipe Rumah Anda : ");
		tipe = input.nextInt();
		X.setTipe(tipe);
		X.setBiayaBeban();
		System.out.println();
		System.out.println("Biaya Beban Tipe Rumah Anda : " + X.getBiayaBeban());
		System.out.print("Masukkan Jumlah Pemakaian Meteran Anda : " );
		meter = input.nextInt();
		X.setHargaTotal(meter);
		System.out.println();
		System.out.println("Total Harga Listrik Rumah Anda : " + X.getHargaTotal());
		System.out.print("Masukkan Jumlah Uang anda : ");
		bayar = input.nextInt();
		System.out.println("Kembalian Uang anda : "+X.getHargaKembalian(bayar));
		System.out.println();
		System.out.println("Halo! "+nama+", Biaya Beban Tipe Rumah Anda : "+X.getBiayaBeban()+", Total Harga Listrik Rumah Anda : "+X.getHargaTotal()+", dan Kembalian Uang Kamu  : "+X.getHargaKembalian(bayar));
		
	}
}