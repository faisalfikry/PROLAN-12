public class Yogya extends KaryawanYogya{

String KodeBarang = "501";
String NamaPekerjaan, NamaBarang, Expire;

void Tambah_barang1(String o, String p){

NamaBarang = o;
Expire   = p;
}
void Tampil_data()
{
System.out.println("Tampil Data Barang Yogya");
System.out.println("========================");
}
void Daftar_karyawan()
{
	super.Tampil_data();
	System.out.println("Nama Karyawan Yogya   = " + super.NamaKaryawan);
	System.out.println("Pass Karyawan Yogya   = " + super.Pass);
	System.out.println("Alamat Karyawan Yogya = " + super.Alamat);
	System.out.println("Tempat Tanggal Lahir  = " + super.Ttl);
	System.out.println("Umur Karyawan Yogya   = " + super.Umur);
	System.out.println("Jenis Kelamin         = " + super.JenisK);
	System.out.println("============================================\n\n");
	

}
void Daftar_Barang_Yogya()
{
Tampil_data();
	System.out.println("Kode Barang         = " + KodeBarang);
	System.out.println("Nama Barang         = " + NamaBarang);
	System.out.println("Tanggal Expire      = " + Expire);
	System.out.println("========================================\n");
	
} 
}