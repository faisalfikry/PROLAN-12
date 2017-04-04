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
		grand.TambahData("Faisal", "Majalengka", "16-11-1996");
		grand.TambahJK('L');
		grand.Daftar_karyawan();
		grand.Daftar_Barang_Yogya();
		
	}
}
