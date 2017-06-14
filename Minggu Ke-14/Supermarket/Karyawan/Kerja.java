package Karyawan;

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

    @Override
    protected void Pegawai() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void fisik() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
 
   