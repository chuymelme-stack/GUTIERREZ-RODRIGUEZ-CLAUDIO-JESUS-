import java.util.Scanner;
class Pro
{
	public static void main(String args [])
	{
		Scanner yay = new Scanner(System.in);
		System.out.print("DAME LA CALIFICACION DE TU PRIMERA MATERIA IMPOTATNTE:");
		double m1=yay.nextDouble();
		System.out.print("DAME LA CALIFICACION DE TU SEGUNDA MATERIA IMPOTATNTE:");
		double m2=yay.nextDouble();
		System.out.print("DAME LA CALIFICACION DE TU TERCERA MATERIA IMPOTATNTE:");
		double m3=yay.nextDouble();
		double prom;
		prom = (m1+m2+m3)/3;
		System.out.print("EL PROMEDIO DE TU CALIFICACION ES:" + String.format("%.1f",prom));
	}
}