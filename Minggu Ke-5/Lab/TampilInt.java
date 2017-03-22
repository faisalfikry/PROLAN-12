import java.util.Scanner;
class TampilInt{

	public static void main(String[] args)
	{
		// Pilihan"A" adalah Nilai Minimum, Pilihan"B" Adalah Nilai Maxsimum.
		int Banyak,Nilai,i, minim=1000, maxim = 0;
		char pilihan; 
		
		MaxMin tes = new MaxMin();
		Scanner input = new Scanner (System.in);
		System.out.print(">> Masukkan Banyak Bilangan / Data      : ");
		Banyak = input.nextInt();
		System.out.print(">> Masukkan Pilihan Anda(A(Min)/B(Max)) : ");
		pilihan = input.next().charAt(0);
		System.out.print("=============================================\n\n");
			for (i=1;i<=Banyak;i++)
			{
			
				System.out.print(">> Silakan Masukkan Nilai...............: ");
				Nilai = input.nextInt();
				if (pilihan == 'A'){
				minim=tes.pilihanA(Nilai,minim);
			}
				if (pilihan == 'B'){
				maxim=tes.pilihanB(Nilai,maxim);
			}
				
		}
		System.out.print("=============================================\n\n");
			
			System.out.println(">> Jumlah Nilai Yang Di Masukkan........: " + Banyak);
			System.out.println(">> Nilai Minimum........................: " + minim);
			System.out.println(">> Nilai maximum........................: " + maxim);
			System.out.print("=============================================\n");
			
			}
	}
		
	
	class MaxMin{
		int pilihanA(int x , int y){
		if(x<y){
			y=x;
			return y;
		}
		return y;
		}
	
		int pilihanB(int x , int y){
		if(x>y){
			y=x;
			return y;
		}
		return y;
		}
	}
		