import java.util.Scanner;

/**
 *
 * @author sethu
 */
public class Mycappro2 {
    public static void main(String[] args) {
         int min,hr,days,years;
		System.out.println("enter the number of mintues");
		Scanner m=new Scanner(System.in);
		min=m.nextInt();
		hr=min/60;
		days=hr/24;
		years=days/365;
		System.out.println("Number of days : "+days);
		System.out.println("Numner of years: "+years);
 
    }
    
}
