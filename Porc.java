import java.util.Scanner;
class Porc
{
	public static void main(String args[])
	{
		Scanner yay= new Scanner(System.in);
		System.out.print("DAME LA CANTIDAD DE HOMBRES QUE HAY:");
		double h = yay.nextDouble();
		System.out.print("DAME LA CANTIDAD DE MUJERES QUE HAY: ");
		double m = yay.nextDouble();
		double sum,p1,p2;
		sum=h+m; 
		p1=(h*100)/sum;
		p2=(m*100)/sum;
		System.out.print("EL PORCENTAJE DE HOMBRES ES:" + String.format("%.0f",p1) + "%" + " Y EL PRECENTAJE DE MUJERES ES:" + String.format("%.0f",p2) + "%");
	}
}