package Barang_dan_Cabang;

public class GenericBayarBarang <T> implements InterfaceBarangYogya{
    T Bayar,Harga,Nama,Kembalian;
        
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
public T getNama(){
        return Nama;
    }
    public void setNama(T Nama){
        this.Nama = Nama;
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
        System.out.println("Nama Barang         : " + getNama());
        System.out.println("Harga Barang        : " + getHarga());
        System.out.println("Uang Yang Di Bayar  : " + getBayar());
        System.out.println("Kembalian           : " + getKembalian());    
    }
    @Override
    public void GarisPenutup() {
        System.out.println("=================================");
    }   
}
