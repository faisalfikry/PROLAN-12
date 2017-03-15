import java.util.Scanner;
class NilaiIP
{
	public static void main(String[] args)
	{
	NilaiIP ipmahasiswa = new NilaiIP();
	
	Scanner input = new Scanner (System.in);
	float IP;
	float JmlhIP = 0;
	int JmlhMhs = 0, MhsLls = 0, TdkLlss = 0, IpAbaikan = 0;
	
	System.out.print("Masukkan Nilai IP : ");
	IP = input.nextFloat();
	
	while (IP != -999)
	{
			if (ipmahasiswa.isWithinRange(IP, 0, 4)==1)
			{
				JmlhMhs++;
			}else{
				IpAbaikan++;
			}
			if (IP >= 2.75)
			{
				MhsLls++;
			}
			if (IP >= 0 && IP <= 2.75)
			{
				TdkLlss++;
			}
			if (IP >= 0 && IP <= 4)
			{
				JmlhIP = JmlhIP+IP;
			}else{
				System.out.println("Tidak ada data !");
			}
			System.out.print("Masukkan Nilai IP : ");
			IP = input.nextFloat();
	}
	System.out.println("");
	System.out.println("==============================================");
	System.out.println("Jumlah Mahasiswa........................ :" + JmlhMhs);
	System.out.println("Jumlah IP yang di abaikan................:" + IpAbaikan);
	System.out.println("Jumlah Mahasiswa yang lulus adalah.......:"+MhsLls);
	System.out.println("Jumlah Mahasiswa yang tidak lulus adalah.:" + TdkLlss);
	System.out.println("IP Rata-Rata.............................:" +ipmahasiswa.Rata_Rata(JmlhIP, JmlhMhs));
	System.out.println("==============================================");
	
	}
	
	int isWithinRange(float X, int min, int max)
	{
		if (X >= min && X <= max)
	{
		return 1;
    }else{
		return 0;
	}
}
	
	float Rata_Rata(float A, int N)
	{
		return A/N;
	}
}
















