public class KaryawanYogya{
	String  Pass = "3636";
	String Nama, Alamat, Tgl;
	int Umur,Expire;
	char JK;
	
	void Tampil(){
		System.out.println("Tampilan Data Anggota Karyawan Yogya");
		System.out.println("------------------------------");	
	}
	void TambahData(String nama, String alamat, String tgl){
		Nama=nama;
		Alamat=alamat;
		Tgl=tgl;
	}
 
	void TambahUmur(int umur){
		this.Umur=umur;	
	}
 
	void TambahJK(char j){
		JK=j;
	}
}