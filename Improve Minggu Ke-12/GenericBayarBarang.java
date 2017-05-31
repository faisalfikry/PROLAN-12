public class GenericBayarBarang <T> implements InterfaceBarangYogya{
    T Bayar,Harga;
    String NoBarang;
    float Discon = 0.10f;
    int JumlahBarang;
        
public String getNoBarang(){
        return NoBarang;
    }
    public void setNoBarang(String NoBarang){
        this.NoBarang = NoBarang;
    }
public T getHarga(){
        return Harga;
    }
    public void setHarga(T Harga){
        this.Harga = Harga;
    }
public T getBayar(){
        return Bayar;
    }
    public void setBayar(T Bayar){
        this.Bayar = Bayar;
    }
    public void setJumlahBarang(int JumlahBarang){
        this.JumlahBarang=JumlahBarang;
    }
    public int getJumlahBarang(){
        return JumlahBarang;
    }
    @Override
    public void TampilMenu() {
        System.out.println("======Hitung Barang Yogya======");
    }
    

    @Override
    public void DataPembeli() {
        System.out.println("Kode Barang         : " + getNoBarang());
        System.out.println("Harga Barang        : " + getHarga());
        System.out.println("Jumlah Barang /QTY  : " + getJumlahBarang());
        System.out.println("Discon              : " + Discon);
        System.out.println("Total Harga         : " + getBayar());    
    }
    @Override
    public void GarisPenutup() {
        System.out.println("=================================");
    }   
}
