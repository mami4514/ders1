package kureselisinma;

import java.util.Scanner;

public class kureselsorular {

	public static void main(String[] args) {
		int point=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("1. Hangi ülke en çok sera gazı yaymaktadır?");
		System.out.println("A)endonezya B)moldova c)Türkiye D)hindistan");
		int answer1=scanner.nextInt();
		if(answer1==1)
		{
			System.out.println("sorunun cevabi dogrudur");
			point+=1;
			
			

		}
		else {
			
			
			
			System.out.println("cevabiniz yanlis");
			point+=0;
		}
			
	
		
		System.out.println("Hangi gezegenin atmosferi küresel ısınma ile yok edilmektedir?");
		System.out.println("A)jupiter B)mars C)plüton D)Dunya");
		int answer2=scanner.nextInt();
		if(answer2==1)
		{
			System.out.println("sorunun cevabi dogrudur");
			point+=1;
			
			

		}
		else {
			
			
			
			System.out.println("cevabiniz yanlis");
			point+=0;
		}
		
	
		
		System.out.println("3. Hangi tür ampul en az enerjiyi tüketir?");
		System.out.println("A)Akkor Ampul B)Halojen Ampul c)kompakt florasan ampul D)sari ampul");
		int answer3=scanner.nextInt();
		if(answer3==1)
		{
			System.out.println("sorunun cevabi dogrudur");
			point+=1;
			
			

		}
		else {
			
			
			
			System.out.println("cevabiniz yanlis");
			point+=0;
		}
		System.out.println("4.İklim değişikliği nedeniyle yılda kaç kişi ölmektedir? ");
		System.out.println("A)150 B)200 C)2000   D)1500");
		int answer4=scanner.nextInt();
		if(answer4==1)
		{
			System.out.println("sorunun cevabi dogrudur");
			point+=1;
			
			

		}
		else {
			
			
			
			System.out.println("cevabiniz yanlis");
			point+=0;
		}
				
		System.out.println(" Küresel ısınmaya karşı en savunmasız hayvan hangisidir? ");
		System.out.println("A)aslan B)panda C)fok balığı   D)kutup ayisi");
		int answer5=scanner.nextInt();
		if(answer5==1)
		{
			System.out.println("sorunun cevabi dogrudur");
			point+=1;
			
			

		}
		else {
			
			
			
			System.out.println("cevabiniz yanlis");
			point+=0;
		}
		if(point==5)
		{
			
			System.out.println("mukemmel");
			
		}
		else if(point==4){
			System.out.println("Çok iyi");
		}
		else if(point==3)
		{
			System.out.println("orta");
			
		}
		else
		{
			System.out.println("kuresel isinma bilgilerinizi tazelemelisiniz");
		}
		}
	}



