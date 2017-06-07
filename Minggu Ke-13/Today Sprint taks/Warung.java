public class Warung {
    
    public <T> void NoBarang(T Nomor){
        System.out.println("Nomor Makanan                : " + Nomor);
    }
    public <T> void NamaBarang(T u){
        System.out.println("Nama Makanan                 : " + u);
    }
    public <N> void HargaBarang(N o){
        System.out.println("Harga Makanan                : " + o);
    }
    public <T, N> void Qty(T c , N z){
        System.out.println("Jumlah Makanan yang tersedia : " + c);
        System.out.println("Jumlah Makanan yang terjual  : " + z);
    }
    
    public static void main (String []args){
        Warung beli = new Warung();
        
        beli.NoBarang(112);
        beli.NamaBarang("KUKUBIMA ENERGI");
        beli.HargaBarang(15.00);
        beli.Qty(20, "2(Dua Buah)");
    }
}
