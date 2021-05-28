package controlStatementProject;
import java.util.Scanner;

public class LeapYearCalculator {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);

		int bulan,tahun;
		System.out.println ("PROGRAM MENGETAHUI HARI DALAM BULAN");
		System.out.println (" ");
		System.out.print ("inputan bulan (Dalam bentuk numeric 1-12):");
		bulan = input.nextInt ();
		System.out.print ("inputan tahun :");
		tahun = input.nextInt ();
		
		String evenOdd = (bulan % 2 == 0) ? "even" : "odd"; 
		System.out.println("Bulan ke-"bulan + " adalah " + evenOdd);
		
		switch (bulan) {
		case 1 :
		System.out.println ("Jumlah Hari = 31 hari");
		break;
		case 2 :
		if (tahun%400==0) {
		System.out.println ("Jumlah Hari =29 hari");
		}
		else if((tahun%400!=0)&&(tahun%100==0)) {
		System.out.println ("Jumlah Hari = 28hari"); }
		else if((tahun%400!=0)&&(tahun%100!=0)&&(tahun%4==0)) {
		System.out.println ("Jumlah Hari = 29hari"); }
		else {
		System.out.println ("Jumlah Hari = 28hari");
		}
		break;
		case 3 :
		System.out.println ("Jumlah Hari = 31 hari");
		break;
		case 4 :
		System.out.println ("Jumlah Hari = 30 hari");
		break;
		case 5 :
		System.out.println ("Jumlah Hari = 31 hari");
		break;
		case 6 :
		System.out.println ("Jumlah Hari = 30 hari");
		break;
		case 7 :
		System.out.println ("Jumlah Hari = 31 hari");
		break;
		case 8 :
		System.out.println ("Jumlah Hari = 31 hari");
		break;
		case 9 :
		System.out.println ("Jumlah Hari = 30 hari");
		break;
		case 10 :
		System.out.println ("Jumlah Hari = 31 hari");
		break;
		case 11 :
		System.out.println ("Jumlah Hari = 30 hari");
		break;
		case 12 :
		break;
		default :
		System.out.println ("Invalid Input");
		break;
		}
		}
}
