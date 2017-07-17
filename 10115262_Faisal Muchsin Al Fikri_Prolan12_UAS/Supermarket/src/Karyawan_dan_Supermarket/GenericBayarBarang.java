package Karyawan_dan_Supermarket;

import Barang_dan_Cabang.InterfaceBarangYogya;

public class GenericBayarBarang <T> implements InterfaceBarangYogya{
    T Bayar,Harga,NamaP,Kembalian;
     float Diskon=0.5f;
        
public T getBayar(){
        return Bayar;
    }
    public void setBayar(T Bayar){
        this.Bayar = Bayar;
    }
public T getHarga(){
        return Harga;
    }
    public void setHarga(T Harga){
        this.Harga = Harga;
    }
public T getNamaPembayar(){
        return NamaP;
    }
    public void setNamaPembayar(T NamaP){
        this.NamaP = NamaP;
    }
public T getKembalian(){
        return Kembalian;
    }
    public void setKembalian(T Kembalian){
        this.Kembalian = Kembalian;
    }
    

    @Override
    public void TampilMenu() {
        System.out.println("======Hitung Barang Yogya======");
    }

    @Override
    public void DataPembeli() {
        System.out.println("Nama Barang         : " + getNamaPembayar());
        System.out.println("Harga Barang        : " + getHarga());
        System.out.println("Uang Yang Di Bayar  : " + getBayar());
        System.out.println("Diskon              : " + Diskon);
        System.out.println("Kembalian           : " + getKembalian());    
    }
    @Override
    public void GarisPenutup() {
        System.out.println("=================================");
    }   
}
