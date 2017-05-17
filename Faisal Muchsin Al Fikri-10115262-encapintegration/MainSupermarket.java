public class MainSupermarket extends Yogya{
	String Nama,  TglKdlwrsa, TglPrdk;
	
	

	@Override
	void TambahUmur(int umur){
		Umur=umur;
		System.out.println("Umur           = " + this.Umur);	
	}
	
	@Override
	void Tampil(){
		System.out.println("Tampil data Karyawan");
		System.out.println("----------------------");
	}
	@Override
	void TambahJK(char j){
		JK=j;
		System.out.println("jenis Kelamin           = " + this.JK);
	}
	
	void Tambah_data(String nama){
		Nama=nama;
		Tampil();
		System.out.println("Nama Karyawan      = " + Nama);
		this.TambahUmur(21);
        this.TambahJK('L');		
		System.out.println("=================\n\n");
	}
	
	public static void main(String argd[]){
	
		MainSupermarket satu = new MainSupermarket();
		Yogya grand = new Yogya();
                
        //Pemanggilan Enkapsulation
        
        System.out.println("----BIODATA KARYAWAN YOGYA----");
        System.out.println("======================================================");
       satu.setNamaKaryawan("Faisal Muchsin Al Fikri");
       satu.setAlamatKaryawan("Bandung");      
       satu.setGaji(2500000);
       satu.setStatusAkif("Aktif");
       satu.setStatusKar("Menikah");
        System.out.println("Nama Karyawan Yogya     : " + satu.getNamaKaryawan());
        System.out.println("Alamat Karyawan Yogya   : " + satu.getAlamatKaryawan());
        System.out.println("Gaji Perbulan           : " + satu.getGaji());
        System.out.println("Status Aktif/Tidak Aktif: " + satu.getStatusAktif());
        System.out.println("Status Karyawan         : " + satu.getStatusKar());
        System.out.println("=======================================================\n");
        
                System.out.println("----DAFTAR DATA MAKANAN----");
                System.out.println("================================================");
                grand.setNaMak("Rumput Laut");
                grand.setJumlBarang(15);
                grand.setHargaBar(50000);
                grand.setBatas("2 Januari 2015 s/d 5 Januari 2016");
                System.out.println("Nama Makanan Yang Tersedia   : " + grand.getNaMak());
                System.out.println("Jumlah Makanan Yang Tersedia : " + grand.getJumlBarang());
                System.out.println("Harga Makanan                : " + grand.getHargaBar());
                System.out.println("Tanggal Expire               : " + grand.getBatas());    
                System.out.println("=================================================================\n");
		grand.TambahData("Faisal", "Majalengka", "16-11-1996");
		grand.TambahJK('L');
                grand.Tambah_barang1("Fanta");
                grand.Expire=12;
                grand.TambahUmur(20);
		grand.Daftar_karyawan();
		grand.Daftar_Barang_Yogya();
                //Pemanggilan Abstraction
                KaryawanYogya Kasir = new Yogya();
                Kasir.Pegawai();
                Kasir.fisik();
		
	}
}

