public class mainsupermarket
{
	public static void main(String[]args)
	{
		//pemanggilan kontruktor
		yogya method = new yogya();
		karyawanyogya faisal = new karyawanyogya();
		gamemaster yogya = new gamemaster();
		
		System.out.println("Nama Barang     : " +method.namabarang);
		System.out.println("Harga Barang    : " +method.hargabarang);
		System.out.println("Jumlah Barang   : " +method.jumlahbarang);
		System.out.println("Kode Barang     : " +method.kodebarang);
		System.out.println("=====================================");
		
		faisal.Tampil_Nama_karyawan("Faisal Muchsin A");
		faisal.Tampil_data_karyawan("Zacky","Majalengka",21);
		faisal.Tampil_data_karyawan("Budi","Cirebon",30,'L');
		
		yogya.Tampil_gamemaster("Basket", "2jam", 50000, 114, 11);
		System.out.println("Nama Permainan  : " +yogya.namapermainan);
		System.out.println("Lama Permainan  : " +yogya.lamapermainan);
		System.out.println("Harga Permainan : " +yogya.hargapermainan);
		System.out.println("Skor            : " +yogya.skor);
		System.out.println("Level Permainan : " +yogya.levelpermainan);
		
	}
}