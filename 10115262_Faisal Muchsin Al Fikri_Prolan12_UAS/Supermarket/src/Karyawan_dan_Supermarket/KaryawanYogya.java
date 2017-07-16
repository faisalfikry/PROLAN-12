package Karyawan_dan_Supermarket;

public abstract class KaryawanYogya  {
    
    private String StatusKar;
    private String JamKerja;
    private String NamaPembeli,NamaBrng,JumlahBrng,HargaBrng;
    private int Gaji;
    private String StatusAkif;
    private String HariKerja;
    private String NamaKaryawan;
    private String AlamatKaryawan;
    protected String nama,jabatan,GolDarah;
    protected String Tinggi, Berat;
    	String  Pass;
	String NamaKar, Alamat, Tgl;
	int Umur,Expire;
	char JK;
    
    //Abtraction
      
      protected abstract void Pegawai();
      protected abstract void fisik();
      

    //Enkapsulation
	
    public String getStatusKar(){
        return StatusKar;
    }
    public void setStatusKar(String StatusKar){
        this.StatusKar = StatusKar;
    }
    public int getGaji(){
        return Gaji;
    }
    public void setGaji(int Gaji){
      this.Gaji = Gaji;
    }
    public String getStatusAktif(){
        return StatusAkif;
    }
    public void setStatusAkif(String StatusAkif){
        this.StatusAkif = StatusAkif;
    }
     public String getNamaKaryawan(){
        return NamaKaryawan;
    }
    public void setNamaKaryawan(String NamaKaryawan){
        this.NamaKaryawan = NamaKaryawan;
    }
     public String getAlamatKaryawan(){
        return AlamatKaryawan;
    }
     public void setAlamatKaryawan(String AlamatKaryawan){
        this.AlamatKaryawan = AlamatKaryawan;
    }
         public String getHariKerja(){
        return HariKerja;
    }
     public void setHariKerja(String HariKerja){
        this.HariKerja = HariKerja;
    }
     public String getJamKerja(){
        return JamKerja;
    }
     public void setJamKerja(String JamKerja){
        this.JamKerja = JamKerja;
    }
    public String getNamaPembeli(){
        return NamaPembeli;
    }
     public void setNamaPembeli(String NamaPembeli){
        this.NamaPembeli = NamaPembeli;
    }
    public String getNamaBrng(){
        return NamaBrng;
    }
     public void setNamaBrng(String NamaBrng){
        this.NamaBrng = NamaBrng;
    }
     public String getJumlahBrng(){
        return JumlahBrng;
    }
     public void setJumlahBrng(String JumlahBrng){
        this.JumlahBrng = JumlahBrng;
    }
      public String getHargaBrng(){
        return HargaBrng;
    }
     public void setHargaBrng(String HargaBrng){
        this.HargaBrng = HargaBrng;
    }

    public int getExpire() {
        return Expire;
    }

    public void setExpire(int Expire) {
        this.Expire = Expire;
    }
     
    
    
    public KaryawanYogya() {
        this.Pass = "3636";
    }
	
	void Tampil(){
		System.out.println("Tampilan Data Anggota Karyawan Yogya");
		System.out.println("------------------------------");	
	}
	void TambahData(String nama, String alamat, String tgl){
		NamaKar=nama;
		Alamat=alamat;
		Tgl=tgl;
	}
 
	void TambahUmur(int umur){
		this.Umur=umur;	
	}
 
	void TambahJK(char j){
		JK=j;
	
    }  
}
