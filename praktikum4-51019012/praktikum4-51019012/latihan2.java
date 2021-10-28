class Mahasiswa {
	int nrp;
	String nama;

public void setNRP (int i) {
	nrp = i;
	}
public void setNama (String i) {
		nama = i;
	}
}
public class latihan2 { 
public static void main(String args[]) {
Mahasiswa mhs=new Mahasiswa ();
 mhs.setNRP (7201);
  mhs.setNama ("Muhammad Ali");
  System.out.println("Nama mahasiswa "+mhs.nama+" NRP "+mhs.nrp);
  }
  }