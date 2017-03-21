public class MainSupermarket extends Yogya{
String Nama, TglKdlwrsa, TglPrdk;

void Tampil_Barang()
{

System.out.println("Nama Barang/Makanan Yang Tersedia");
System.out.println("=================================");
}
void Tambah_barang(String x, String y, String z)
{
Nama = x;
TglPrdk = y;
TglKdlwrsa = z;


	System.out.println("Nama Barang/Makanan        = " + Nama);
	System.out.println("Tanggal Produksi Brng/mknan= " + TglPrdk);
	System.out.println("Tanggal Kedaluarsa         = " + TglKdlwrsa);
	System.out.println("=============================================\n\n");
}
public static void main(String argd[])
{
 
	MainSupermarket Yogya = new MainSupermarket();
	Yogya.Tampil_data();
	
	Yogya.Tambah_data("Faisal",22,"Sidoarjo");
	Yogya.Tambah_Ttl("Majalengka, 16 November 1993");
	Yogya.Tambah_JenisK('L');
	Yogya.Tambah_Pass("6363");
	Yogya.Tambah_barang1("Fanta","5-08-2017");
	Yogya.Tambah_barang("Sari Roti","2-06-2017","5-06-2017");
	Yogya.Daftar_karyawan();
	Yogya.Daftar_Barang_Yogya();
 }
}