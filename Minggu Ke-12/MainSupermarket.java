import java.util.Scanner;
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
                KaryawanYogya Kasir = new Yogya();
                Kerja hh = new Kerja();
                Yogya kk = new Yogya();
                CabangYogya fs = new CabangYogya();
                GenericBayarBarang<String> hitung = new GenericBayarBarang<>();
                
                char menu;
                System.out.println("====Program Supermarket====");
                System.out.println("A. Biodata Karyawan Yogya");
                System.out.println("B. Daftar Data Makanan");
                System.out.println("C. Data Karyawan");
                System.out.println("D. Tampil Data Barang");
                System.out.println("E. Jadwal Karyawan");
                System.out.println("F. Tampil Pembeli");
                System.out.println("G. Data Cabang Yogya");
                System.out.println("H. Hitung Barang Yogya");
                
                
                Scanner input = new Scanner (System.in);
                System.out.print("Silakan Masukan Menu !# ");
                menu = input.next().charAt(0);
                        
        //Menggunakan Inputan
        switch (menu){
        case 'A' :
        System.out.println("----BIODATA KARYAWAN YOGYA----");
        System.out.println("======================================================");
       satu.setNamaKaryawan(input.nextLine());    
        System.out.print("Nama Karyawan Yogya      : ");
       satu.setNamaKaryawan(input.nextLine());
            System.out.print("Alamat Karyawan          : ");
       satu.setAlamatKaryawan(input.nextLine());
            System.out.print("Gaji Perbulan            : ");
       satu.setGaji(input.nextInt());
            System.out.print("Status Aktif/Tidak Aktif : ");
       satu.setStatusAkif(input.nextLine());
       satu.setStatusAkif(input.nextLine());
            System.out.print("Status Karyawan          : ");
       satu.setStatusKar(input.nextLine());
      
        System.out.println("=======================================================\n");
        break;
        
        //Menggunakan Inputan
        case 'B':
        System.out.println("----DAFTAR DATA MAKANAN----");
                System.out.println("================================================");
                grand.setNaMak(input.nextLine());
                System.out.print("Nama Makanan : ");
                grand.setNaMak(input.nextLine());
                System.out.print("Jumlah Makanan : ");
                grand.setJumlBarang(input.nextInt());
                System.out.print("Harga Makanan : ");
                grand.setHargaBar(input.nextInt());
                System.out.print("Tanggal Expire : ");
                grand.setBatas(input.nextLine());
                grand.setBatas(input.nextLine());   
                System.out.println("=================================================================\n");
                break;
        case 'C':
                grand.TambahData("Faisal", "Majalengka", "16-11-1996");
		grand.TambahJK('L');
                grand.TambahUmur(20);
		grand.Daftar_karyawan();
                Kasir.Pegawai();
                Kasir.fisik();
                break;
        case 'D':
                grand.Tambah_barang1("Fanta");
                grand.Expire=12;
		grand.Daftar_Barang_Yogya();
               break;
        case 'E':
                hh.setNamaKaryawan(input.nextLine());
                System.out.print("Nama Karyawan : ");
                hh.setNamaKaryawan(input.nextLine());
                System.out.print("Hari Masuk Kerja  : ");
                hh.setHariKerja(input.nextLine());
                System.out.print("Jam Kerja : ");
                hh.setJamKerja(input.nextLine());
                hh.TampilMenu();
                hh.JadwalKerja ();
                hh.PenutupBaris();
               break; 
        case 'F':
                kk.setNamaPembeli(input.nextLine());
                System.out.print("Nama Pembeli : ");
                kk.setNamaPembeli(input.nextLine());
                System.out.print("Nama Barang : ");
                kk.setNamaBrng(input.nextLine());
                System.out.print("Jumlah Barang : ");
                kk.setJumlahBrng(input.nextLine());
                System.out.print("Harga Barang : ");
                kk.setHargaBrng(input.nextLine());
                kk.TampilMenu();
                kk.DataPembeli();
                kk.GarisPenutup();   
                break;
        case 'G':
                fs.setNamaCabang(input.nextLine());
                System.out.print("Nama Cabang : ");
                fs.setNamaCabang(input.nextLine());
                System.out.print("Alamat Cabang : ");
                fs.setAlamatCabang(input.nextLine());
                System.out.print("Keterangan : ");
                fs.setKeterangan(input.nextLine());
                fs.TampilMenu();
                fs.DataCabang();
                fs.GarisPenutup();
                break;
                
                //pemanggilan Generic
        case 'H':
               hitung.setNama(input.nextLine());
               System.out.print("Nama Pembeli      : ");
               hitung.setNama(input.nextLine());
               System.out.print("Harga Barang      : ");
               hitung.setHarga(input.nextLine());
               System.out.print("Bayar             : ");
               hitung.setBayar(input.nextLine());
               System.out.print("Kembalian         : ");
               hitung.setKembalian(input.nextLine());
               hitung.TampilMenu();
               hitung.DataPembeli();
               hitung.GarisPenutup();
               break;
               
        }
    }
}

