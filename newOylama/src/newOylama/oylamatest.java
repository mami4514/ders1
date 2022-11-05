package newOylama;

import java.util.Scanner;

public class oylamatest {

	public static void main(String[] args) {
	
		String[][] tablo=new String[5][11];
		Scanner scanner=new Scanner(System.in);
		double as=0.0;
		double as2=0.0;
		double as3=0.0;
		double as4=0.0;
		double as5=0.0;
		System.out.println("   "+"Sorular");
		tablo[0][0]= "ekonomik kriz ";
		tablo[1][0]= "saglık        ";
		tablo[2][0]= "kuresel isinma";
		tablo[3][0]= "teknoloji     ";
		tablo[4][0]= "insan haklari ";
		
	for(int i=0;i<5;i++) {
			
			for(int j=1;j<11;j++) {
				tablo[i][j]="0";
			}
		}
	System.out.println("Ankete katilacak kisi sayisini giriniz");
		int kisi=scanner.nextInt();
		double[] dizi=new double[5];
		
		double topcevap5=0;
		double topcevap4=0;
		double topcevap3=0;
		double topcevap2=0;
		double topcevap1=0;
		double a=kisi;
		for(int i=1;i<(kisi+1);i++) {
		
		System.out.println(" Lutfen 1-10 arasinda degerlendiriniz");
		System.out.println("ekonomik kriz");
		System.out.println("Puan veriniz");
		int cevap1=scanner.nextInt();
		tablo[0][cevap1]="X";
		topcevap1+=cevap1;
		as=topcevap1/a;
		
		System.out.println("Saglik");
		System.out.println("Puan veriniz");
		int cevap2=scanner.nextInt();
		tablo[1][cevap2]="1";
		topcevap2+=cevap2;
		as2=topcevap2/a;
		
		System.out.println("Kuresel isinma");
		System.out.println("Puan veriniz");
		int cevap3=scanner.nextInt();
		tablo[2][cevap3]="1";
		topcevap3+=cevap3;
		as3=topcevap3/a;
		System.out.println("Teknoli");
		System.out.println("Puan veriniz");
		int cevap4=scanner.nextInt();
		tablo[3][cevap4]="1";
		topcevap4+=cevap4;
		as4=topcevap4/a;
		
		System.out.println("insan haklari");
		System.out.println("Puan veriniz");
		int cevap5=scanner.nextInt();
		tablo[4][cevap5]="1";
		topcevap5+=cevap5;
		as5=topcevap5/a;
		
		}
		System.out.println(kisi);
		dizi[0]=as;
		dizi[1]=as2;
		dizi[2]=as3;
		dizi[3]=as4;
		dizi[4]=as5;
		
		
		System.out.println("ekonomik kriz");
		
		
		
		System.out.println("                  1  2  3  4  5  6  7  8  9 10 Ortalama ");
		System.out.println("--------------------------------------------------------------");
		for(int i=0;i<5;i++) {
			
			System.out.println(" ");
			for( int j=0;j<11;j++) {
				System.out.print("  "+tablo[i][j]);
			}System.out.print(" "+dizi[i]);
			
		}
		
		
	}



	}


