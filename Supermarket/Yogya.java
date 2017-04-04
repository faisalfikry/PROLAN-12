public class Yogya extends KaryawanYogya{
	String KodeBarang = "501";
	String NamaPekerjaan, NamaBarang, Expire;
	
	void Tambah_barang1(String o, String p){
		NamaBarang = o;
		Expire   = p;
	
	
	}
	
	@Override
	void Tampil(){
		System.out.println("Tampil Data Barang");
		System.out.println("---------------------------------");
	}
	
 void Daftar_karyawan()
{
	super.Tampil();
	System.out.println("Nama Karyawan Yogya   = " + super.Nama);
	System.out.println("Pass Karyawan Yogya   = " + super.Pass);
	System.out.println("Alamat Karyawan Yogya = " + super.Alamat);
	System.out.println("Tempat Tanggal Lahir  = " + super.Tgl);
	System.out.println("Umur Karyawan Yogya   = " + super.Umur);
	System.out.println("Jenis Kelamin         = " + super.JK);
	System.out.println("============================================\n\n");
	}	
void Daftar_Barang_Yogya()
{
	Tampil();
	System.out.println("Kode Barang         = " + super.Pass);
	System.out.println("Nama Barang         = " + super.Nama);
	System.out.println("Tanggal Expire      = " + super.Expire);
	System.out.println("========================================\n");
	}
}