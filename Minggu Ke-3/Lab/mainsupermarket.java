class karyawanyogya
{
   String Namakaryawan; 
   String ttl, pass;
   String alamat;
   byte umurkaryawan;
   char jeniskelamin = 'L';
   
   void Tampil_data_Karyawan()
   {
        System.out.println("Nama Karyawan    : " + Namakaryawan);
		System.out.println("Pass             : " + pass);
		System.out.println("Alamat           : " + alamat);
		System.out.println("Tanggal Lahir    : " + ttl);
		System.out.println("Umur Karyawan    : " + umurkaryawan);
		System.out.println("Jenis Kelamin    : " + jeniskelamin);
		System.out.println("=========================================\n");
   } 

}
class yogya
{
    String namabarang;
	int hargabarang;
	int jumlahbarang;
	int kodebarang;
   
   void Tampil_barang_yogya()
   {
        System.out.println("Nama Barang      : " + namabarang);
		System.out.println("Harga Barang     : " + hargabarang);
		System.out.println("Jumlah Barang    : " + jumlahbarang);
		System.out.println("Kode Barang      : " + kodebarang);
		System.out.println("=========================================\n");
   }
}
class gamemaster
{
    String namapermainan;
	String lamapermainan;
	int hargapermainan;
	int skor;
	byte levelpermainan;
   
   void Tampil_data_gamemaster()
   {
        System.out.println("Nama Permainan   : " + namapermainan);
		System.out.println("Harga Perjam     : " + hargapermainan);
		System.out.println("Lama Permainan   : " + lamapermainan);
		System.out.println("Level Permainan  : " + levelpermainan);
		System.out.println("Total Skor       : " + skor);
		System.out.println("=========================================\n");
   }
}

public class mainsupermarket
{
     public static void main(String[]args)
	 {
           karyawanyogya faisal = new karyawanyogya();
	       yogya grand = new yogya();
		   gamemaster yogya = new gamemaster();
		   
		   faisal.Namakaryawan = "Faisal Muchsin Al Fikri";
		   faisal.pass = "10115262";
		   faisal.ttl = "16 November 1996";
		   faisal.alamat = "Majalengka";
		   faisal.umurkaryawan = 21;
		   faisal.jeniskelamin = 'L';
		   
		   grand.namabarang = "Samsung Galaxy S7";
		   grand.hargabarang = 10500000;
		   grand.jumlahbarang = 4;
		   grand.kodebarang = 0052;
		   
		   yogya.namapermainan = "PIN BALL";
		   yogya.lamapermainan = "5 Jam";
		   yogya.hargapermainan = 100000;
		   yogya.levelpermainan = 10;
		   yogya.skor = 115;
		   
		   
		   faisal.Tampil_data_Karyawan();
		   grand.Tampil_barang_yogya();
		   yogya.Tampil_data_gamemaster();

	 }
}