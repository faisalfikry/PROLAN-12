public abstract class KaryawanYogya {
    
    private String StatusKar;
    private int Gaji;
    private String StatusAkif;
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
