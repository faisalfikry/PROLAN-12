public class Yogya extends KaryawanYogya {
    
    private String NaMak;
    private int JumlBarang;
    private int HargaBar;
    private String Batas;
    String NamaPekerjaan, NamaBarang; 
    String Berlaku, KodeBarang;
	
@Override  
    protected void Pegawai(){
        nama = "Budi";
        jabatan = "Kasir";
        GolDarah = "A";
        System.out.println("--Jabatan Karyawan--");
        System.out.println("==============================");
        System.out.println("Nama Karyawan : " +nama);
        System.out.println("Jabatan       : " +jabatan);
        System.out.println("Golongan Darah: " +GolDarah);
        System.out.println("==============================\n");
        
    }
    @Override
    protected void fisik(){
        nama = "Faisal M";
        Tinggi = "170cm";
        Berat = "60kg";
        System.out.println("--Fisik Karyawan--");
        System.out.println("==============================");
        System.out.println("Nama Karyawan : " +nama);
        System.out.println("Tinggi Badan  : " +Tinggi);
        System.out.println("Berat Badan   : " +Berat);
        System.out.println("==============================");
    }
    //Enkapsulation
    public String getNaMak(){
        return NaMak;
    }
    public void setNaMak(String NaMak){
        this.NaMak = NaMak;
    }
    public int getJumlBarang(){
        return JumlBarang;
    }
    public void setJumlBarang(int JumlBarang){
      this.JumlBarang = JumlBarang;
    }
    public int getHargaBar(){
        return HargaBar;
    }
    public void setHargaBar(int HargaBar){
        this.HargaBar = HargaBar;
    }  
    public String getBatas(){
        return Batas;
    }
    public void setBatas(String Batas){
        this.Batas = Batas;
    }
    
void Tambah_barang1(String o){
		NamaBarang = o;
	}
	
@Override
void Tampil(){
		System.out.println("Tampil Data Barang");
		System.out.println("---------------------------------");
	}
	
void Daftar_karyawan()
{
	super.Tampil();
	System.out.println("Nama Karyawan Yogya   = " + super.NamaKar);
	System.out.println("Pass Karyawan Yogya   = " + super.Pass);
	System.out.println("Alamat Karyawan Yogya = " + super.Alamat);
	System.out.println("Tempat Tanggal Lahir  = " + super.Tgl);
	System.out.println("Umur Karyawan Yogya   = " + super.Umur);
	System.out.println("Jenis Kelamin         = " + super.JK);
	System.out.println("============================================\n\n");
	}	
void Daftar_Barang_Yogya()
{
	Tampil();
	System.out.println("Kode Barang         = " + super.Pass);
	System.out.println("Nama Barang         = " + NamaBarang);
	System.out.println("Tanggal Expire      = " + super.Expire);
	System.out.println("========================================\n");
        
	}
}
    
