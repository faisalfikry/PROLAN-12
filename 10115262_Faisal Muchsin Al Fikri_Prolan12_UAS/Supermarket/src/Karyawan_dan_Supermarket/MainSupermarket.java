package Karyawan_dan_Supermarket;

import Barang_dan_Cabang.CabangYogya;
import Barang_dan_Cabang.GenericBayarBarang;
import java.util.Scanner;
public class MainSupermarket extends Yogya{
	
	public static void main(String argd[]){
            char menu;
		Yogya grand = new Yogya();
                Kerja fb = new Kerja();
                KaryawanYogya Kasir = new Yogya();
                Kerja hh = new Kerja();
                Yogya kk = new Yogya();
                CabangYogya fs = new CabangYogya();
                Kerja fa = new Kerja();
                GenericBayarBarang<String> hitung = new GenericBayarBarang<>();
                
                    
                
                do{
                System.out.println("====Program Supermarket====");
                System.out.println("A. Daftar Biodata Karyawan Yogya");
                System.out.println("B. Daftar Data Makanan");
                System.out.println("C. Daftar Data Karyawan");
                System.out.println("D. Daftar Tampil Data Barang");
                System.out.println("E. Daftar Jadwal Karyawan");
                System.out.println("F. Daftar Tampil Pembeli");
                System.out.println("G. Daftar Data Cabang Yogya");
                System.out.println("H. Hitung Barang Yogya");
                System.out.println("0. Kembali Ke Menu Pilihan");
                
                
                Scanner input = new Scanner (System.in);
                System.out.print("Silakan Masukan Menu !# ");
                menu = input.next().charAt(0);
                        

        switch (menu){
        case 'A' :
           
        System.out.println("\n----BIODATA KARYAWAN YOGYA----\n");
            System.out.println("Silakan Masukkan Data !");
       fa.setNamaKaryawan(input.nextLine());    
        System.out.print("Nama Karyawan Yogya      : ");
       fa.setNamaKaryawan(input.nextLine());
            System.out.print("Alamat Karyawan          : ");
       fa.setAlamatKaryawan(input.nextLine());
            System.out.print("Gaji Perbulan            : ");
       fa.setGaji(input.nextInt());
            System.out.print("Status Aktif/Tidak Aktif : ");
       fa.setStatusAkif(input.nextLine());
       fa.setStatusAkif(input.nextLine());
            System.out.print("Status Karyawan          : ");  
       fa.setStatusKar(input.nextLine());

       fa.Tampilan();
       fa.Pegawai();
       fa.PenutupBaris();
 
        System.out.print("0.Kembali Ke Menu Pilihan / E. Jika Keluar# ");
               menu = input.next().charAt(0);
            
        break;
            
        
        case 'B':

        System.out.println("\n----DAFTAR DATA MAKANAN----\n");
        System.out.println("Silakan Masukkan Data !");
                fb.setNamaBrng(input.nextLine());
                System.out.print("Nama Makanan : ");
                fb.setNamaBrng(input.nextLine());
                System.out.print("Jumlah Makanan : ");
                fb.setJumlahBrng(input.nextLine());
                System.out.print("Harga Makanan : ");
                fb.setHargaBrng(input.nextLine());
                System.out.print("Tanggal Expire : ");
                fb.setExpire(input.nextInt());
                fb.TampilAwal();
                fb.fisik();
                fb.PenutupBaris();
                System.out.print("0.Kembali Ke Menu Pilihan / E. Jika Keluar# ");
               menu = input.next().charAt(0);

                break;
        case 'C':
        
                grand.TambahData("Faisal", "Majalengka", "16-11-1996");
		grand.TambahJK('L');
                grand.TambahUmur(20);
		grand.Daftar_karyawan();
                Kasir.Pegawai();
                Kasir.fisik();
                System.out.print("0.Kembali Ke Menu Pilihan / E. Jika Keluar# ");
               menu = input.next().charAt(0);
                break;
        case 'D':
                grand.Tambah_barang1("Fanta");
                grand.Expire=12;
		grand.Daftar_Barang_Yogya();
                System.out.print("0.Kembali Ke Menu Pilihan / E. Jika Keluar# ");
               menu = input.next().charAt(0);
               break;
        case 'E':
            System.out.println("\n----JADWAL KARYAWAN----\n");
            System.out.println("Silakan Masukkan Data !");
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
                System.out.print("0.Kembali Ke Menu Pilihan / E. Jika Keluar# ");
               menu = input.next().charAt(0);
               break; 
        case 'F':
            System.out.println("\n----DATA PEMBELI----\n");
                System.out.println("Silakan Masukkan Data !");
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
                System.out.print("0.Kembali Ke Menu Pilihan / E. Jika Keluar# ");
                menu = input.next().charAt(0);
                break;
        case 'G':
            System.out.println("\n----DATA CABANG YOGYA----\n");
            System.out.println("Silakan Masukkan Data !");
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
                System.out.print("0.Kembali Ke Menu Pilihan / E. Jika Keluar# ");
                menu = input.next().charAt(0);
                break;
                
                //pemanggilan Generic
        case 'H':
            System.out.println("\n----HITUNG BARANG----\n");
            System.out.println("Silakan Masukkan Data !");
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
               System.out.print("0.Kembali Ke Menu Pilihan / E. Jika Keluar # ");
               menu = input.next().charAt(0);
               break;
            
               
        }
        } while (menu == '0');
    }
}

