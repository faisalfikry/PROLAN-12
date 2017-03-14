class karyawanyogya
{
   
   //method mengembalikan nilai dengan menggunakan parameter
   public String Tampil_Nama_karyawan(String Namakaryawan)
   {
        return Namakaryawan;
   }
   
   
   //method overloading dan menggunakan this dengan variabel
   public void Tampil_data_karyawan(String Namakaryawan, String alamat, int umurkaryawan)
   {
	   System.out.println("Nama Karyawan : "+Namakaryawan);
	   System.out.println("Alamat        : "+alamat);
	   System.out.println("Umur          : "+umurkaryawan);
	   System.out.println("=============================");
   
   }
   public void Tampil_data_karyawan(String Namakaryawan,String alamat,int umurkaryawan, char jeniskelamin)
   {
	   System.out.println("Nama Karyawan : "+Namakaryawan);
	   System.out.println("Alamat        : "+alamat);
	   System.out.println("Umur          : "+umurkaryawan);
	   System.out.println("Jenis Kelamin : "+jeniskelamin);
	   System.out.println("=============================");
      
   }
}
