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
                
                char menu;
                System.out.println("====Program Supermarket====");
                System.out.println("A. Biodata Karyawan Yogya");
                System.out.println("B. Daftar Data Makanan");
                System.out.println("C. Data Karyawan");
                System.out.println("D. Tampil Data Barang");
                System.out.println("E. Jadwal Karyawan");
                System.out.println("F. Tampil Pembeli");
                System.out.println("G. Data Cabang Yogya");
                
                
                Scanner input = new Scanner (System.in);
                System.out.print("Silakan Masukan Menu !# ");
                menu = input.next().charAt(0);
                
        //Pemanggilan Enkapsulation
        
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
                
                System.out.println("Nama Makanan Yang Tersedia   : " + grand.getNaMak());
                System.out.println("Jumlah Makanan Yang Tersedia : " + grand.getJumlBarang());
                System.out.println("Harga Makanan                : " + grand.getHargaBar());
                System.out.println("Tanggal Expire               : " + grand.getBatas());    
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
                //Pemanggilan Abstraction

		//Pemanggilan Interface
               break;
        case 'E':
        
                hh.setNamaKaryawan("Faisal Muchsin Al Fikri");
                hh.setHariKerja("Senin - Sabtu");
                hh.setJamKerja("07.30 s/d 12.45");
                hh.TampilMenu();
                hh.JadwalKerja ();
                hh.PenutupBaris();
               break; 
        case 'F':        
                kk.setNamaPembeli("Ganjar Firmansyah");
                kk.setNamaBrng("Televisi Samsung LED");
                kk.setJumlahBrng("2 Unit");
                kk.setHargaBrng("2500.000");
                kk.TampilMenu();
                kk.DataPembeli();
                kk.GarisPenutup();   
                break;
        case 'G':        
                fs.setNamaCabang("Belanja Hemat Yuks");
                fs.setAlamatCabang("Jl. Soekarno Hatta, No 156 Bandung");
                fs.setKeterangan("Telah Dibuka Pada 25 April 2014");
                fs.TampilMenu();
                fs.DataCabang();
                fs.GarisPenutup();
                break;
        }
	}
}

