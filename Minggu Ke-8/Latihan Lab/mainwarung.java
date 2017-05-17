public class mainwarung {
    
     public static void main(String args[]){
        
        Warung jajan = new Warung();
        
        jajan.setpembeli("Faisal M.");
        jajan.setbarang("Fanta");
        jajan.setjumlah(10);
        jajan.setharga(20000);
        
        
        System.out.println("DAFTAR NAMA BARANG\n");
        System.out.println("Nama Pembeli  : "+ jajan.getpembeli());
        System.out.println("Nama Barang   : "+ jajan.getbarang());
        System.out.println("Harga Barang  : "+ jajan.getharga());
        System.out.println("Jumlah Barang : "+ jajan.getjumlah());
        
    }
}

