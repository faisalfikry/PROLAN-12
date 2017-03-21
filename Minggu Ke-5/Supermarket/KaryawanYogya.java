public class KaryawanYogya{

String NamaKaryawan, Pass, Alamat, Ttl;
int Umur;
char JenisK;

void Tampil_data(){
    System.out.println("Data Anggota Karyawan Yogya");
	System.out.println("===========================");
}
void Tambah_data(String a, int b, String c){
	NamaKaryawan = a;
	Umur = b;
	Alamat = c;
}
void Tambah_Ttl(String e){
Ttl = e;
}
void Tambah_JenisK(char f){
JenisK = f;
}
void Tambah_Pass(String k){
Pass = k;
}
}