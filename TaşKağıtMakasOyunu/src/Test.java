
import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// 1.Taş
		// 2.Kağıt
		// 3.Makas

		int kisi, pc;

		Random rnd = new Random();
		pc = rnd.nextInt(3) + 1; // Bilgisayarın 1-3 aralığında değer tutmasını sağlar.
		System.out.println("1.tas");
		System.out.println("2.kagit");
		System.out.println("3.makas");
		System.out.println("Lutfen seciminizi yapiniz");
		Scanner gelenioku = new Scanner(System.in);
		kisi = gelenioku.nextInt();
		System.out.println("pc:" + pc);
		if (kisi!= 1 && kisi!= 2 && kisi!= 3) {
			System.out.println("Yanlis bir secim yapilmistir.");
		} 
		else 
		{
			// pc:1 k:1 berabere
			// pc:1 k:2 kisi kazandı
			// pc:1 k:3 pc kazandı
			// pc:2 k:1 pc kazandı
			// pc:2 k:2 berabere
			// pc:2 k:3 kişi kazandı
			// pc:3 k:1 kisi kazandı
			// pc:3 k:2 pc kazandı
			// pc:3 k:3 berabere
			
			if (pc==kisi)
			{
				System.out.println("Berabere");
			}
			if (pc==1 && kisi==2)
			{
				System.out.println("Kisi kazandi");
			}
			if (pc==2 && kisi==1)
			{
				System.out.println("Pc kazandi");
			}
			if (pc==2 && kisi==3) 
			{
				System.out.println("Kisi kazandi");
			}
			if (pc==3 && kisi==1)
			{
				System.out.println("Kisi kazandi");
			}
			if (pc==3 && kisi==2)
			{
				System.out.println("Pc kazandi");
			}
			
			  


		}

	}

}
