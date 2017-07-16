package Karyawan_dan_Supermarket;

public class Kerja extends KaryawanYogya implements InterfaceKaryawan{

    @Override
    public void TampilMenu() {
        System.out.println("======JADWAL KARYAWAN=========");
    }
    
    @Override
    public void JadwalKerja() {
        System.out.println("Nama Karyawan : " + getNamaKaryawan());
        System.out.println("Hari Kerja    : " + getHariKerja());
        System.out.println("Jam Kerja     : " + getJamKerja());
        
    }
    @Override
    public void PenutupBaris() {
        System.out.println("===================================\n");
    }
    public void Tampilan() {
        System.out.println("\n=========Biodata Karyawan=========");
    }

    @Override
    protected void Pegawai() {
        System.out.println("Nama Karyawan Yogya : " +getNamaKaryawan());
        System.out.println("Alamat Karyawan  : " +getAlamatKaryawan());
        System.out.println("Gaji Perbulan : " +getGaji());
        System.out.println("Status Aktif/Tidak Aktif : " +getStatusAktif());
        System.out.println("Status Karyawan : " +getStatusKar());
    
    
    }
    public void TampilAwal() {
        System.out.println("\n=========Data Makanan=========");
    }

    @Override
    protected void fisik() {
        System.out.println("Nama Makanan :" +getNamaBrng());
        System.out.println("Jumlah Makanan :" +getJumlahBrng());
        System.out.println("Harga Makanan :" +getHargaBrng());
        System.out.println("Tanggal Expire :" +getExpire());
    }
    
}
 
   