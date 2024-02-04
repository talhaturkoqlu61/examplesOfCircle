package myFifthProject;
import java.util.Scanner;

public class examplesOfCircle {
	public static void main(String[]args){
		//descriptions of variables
		double p=3.14,r,a;
		Scanner input=new Scanner(System.in);
        System.out.print("Lütfen bir yarıçap değeri giriniz:");
        r=input.nextDouble();
        System.out.print("Lütfen 0 ile 360 arasında  bir açı değeri giriniz:");
        a=input.nextDouble();
        double circumferenceOfCircle=2*p*r;
        double areaOfCircle=p*Math.pow(r, 2)*a/360;
        System.out.print("Çemberin çevresi:");
        System.out.println(circumferenceOfCircle);
        System.out.print("Dairenin alanı:");
        System.out.println(areaOfCircle);
        
        
		
		
		
		
	}
	

}
