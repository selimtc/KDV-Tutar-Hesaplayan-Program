
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    double tutar, ilkKdvOran=0.18,ikinciKdvOran=0.08, KDVtutar, KDVlitutar, oran;
	    
	    Scanner inp = new Scanner(System.in);
	    System.out.println("urun fiyati giriniz : ");
	    tutar = inp.nextDouble();
	    
	    KDVtutar = tutar>1000 ? tutar * ikinciKdvOran : tutar * ilkKdvOran;
        KDVlitutar = tutar + KDVtutar;
        oran = tutar<1000 ? ikinciKdvOran : ilkKdvOran;
        
	    System.out.println("KDV'siz tutar :"+tutar);
	    System.out.println("KDV Oranı :"+oran);
	    System.out.println("KDV Tutarı :"+KDVtutar);
	    System.out.println("KDV'litutar :"+KDVlitutar);
	    
	}
}
