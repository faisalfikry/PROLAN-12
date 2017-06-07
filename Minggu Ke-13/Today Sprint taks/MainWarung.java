public class MainWarung {
    public <T> GenDiskon Barang (T u){
        return (GenDiskon) u;
    }
    public <T>Warung Makanan (T p){
        return (Warung) p;
    }
     public static void main (String []args){
         MainWarung diskon = new MainWarung();
         
         diskon.Barang(new GenDiskon<>()).Harga(700000);
         diskon.Makanan(new Warung()).NamaBarang("Kentang Goreng");
     }
}
