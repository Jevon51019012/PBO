class BebanHarga extends PatokInput {
	public int biaya = 0, harga, kembalian;
	
	public void setBiayaBeban() {
		if (tipe == 31) {
			biaya = 100000;
		} else
		if (tipe == 32) {
			biaya = 125000;
		} else
		if (tipe == 33) {
			biaya = 450000;
		} else
		if (tipe == 34) {
			biaya = 480000;
		} else
		if (tipe == 35) {
			biaya = 500000;
		} else
		if (tipe == 40) {
			biaya = 500000;
		} else {
			System.out.println("Nomor Tipe Rumah yang Anda Masukkan Salah");
		}
		
	} 
	
	public int getBiayaBeban(){
	 	return biaya;
	 	
	 }
	
	public void setHargaTotal(int meter){
		harga = biaya*meter;
	}
	
	public int getHargaTotal(){
		return harga;
	}
	
	public int getHargaKembalian(int bayar){
		kembalian = bayar - harga;
		return kembalian;
	}
	
	}	
	
