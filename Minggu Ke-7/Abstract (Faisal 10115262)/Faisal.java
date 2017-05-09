public class Faisal extends Mahasiswa{
@Override
	protected void kuliah(){
	Nama = "Faisal Muchsin Al Fikri";
	Nim  = "10115262";
	Alamat = "Majalengka";
	System.out.println("Data Mahasiswa");
	System.out.println("Nama Mahasiswa : " +Nama);
	System.out.println("NIM Mahasiswa : " +Nim);
	System.out.println("Alamat Mahasiswa : " +Alamat);
	System.out.println("Mahasiswa Tersebut Kuliah di Unikom");
	System.out.println("=================================\n");
}
@Override
	protected void lulus(){
	System.out.println("Mahasiswa Dengan Nama : " +Nama);
	System.out.println("Dinyatakan Lulus Dari Unikom");
	System.out.println("===================================\n");
}	
@Override
	protected void tidaklulus(){
	System.out.println("Mahasiswa dengan NIM : " +Nim);
	System.out.println("Dan Alamat : " +Alamat);
	System.out.println("Dinyatakan Tidak Lulus dari Unikom");
	System.out.println("================================\n");	
	}
}