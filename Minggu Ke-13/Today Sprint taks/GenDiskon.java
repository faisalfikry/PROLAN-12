public class GenDiskon <T> {

    T diskon;
    
   public <T> void HargaDiskon(T x){
       System.out.println("Diskon : " + x);
   }
   public <K> void Harga(K y){
       System.out.println("Harga  : " + y);
   }
   public void Diskon(T z){
       diskon = z;
       System.out.println("Anda Mendapat Diskon Sebesar : " +diskon);
   }
  public static void main (String []args){
      GenDiskon<Float>dis = new GenDiskon<>();
      GenDiskon kon = new GenDiskon();
      
      dis.HargaDiskon(50.000);
      dis.Harga(200000000);
      kon.Diskon(222f);
  }
}
