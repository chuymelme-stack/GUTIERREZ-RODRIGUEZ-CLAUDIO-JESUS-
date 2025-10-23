import java.util.Scanner;
public class Ej14{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double com1,com2, com3, com4, total;
	
		System.out.print("\n\t---CALCULO DE COMISIONES DE UN VENDEDOR---");
		
		System.out.print("\n\nIngresa el valor de la venta No.1 $");
		double venta1=sc.nextDouble();
		if(venta1<=10000000){
			com1=venta1*0.02;
		}else if(venta1>10000000 && venta1<15000000){
			com1=venta1*0.04;
		}else{
			com1=venta1*0.10;
		}
		System.out.print("Comisión venta No.1 $" + com1);
	
		System.out.print("\n\nIngresa el valor de la venta No.2 $");
		double venta2=sc.nextDouble();
		if(venta2<=10000000){
			com2=venta2*0.02;
		}else if(venta2>10000000 && venta2<15000000){
			com2=venta2*0.04;
		}else{
			com2=venta2*0.10;
		}
		System.out.print("Comisión venta No.2 $" + com2);

		System.out.print("\n\nIngresa el valor de la venta No.3 $");
		double venta3=sc.nextDouble();
		if(venta3<=10000000){
			com3=venta3*0.02;
		}else if(venta3>10000000 && venta3<15000000){
			com3=venta3*0.04;
		}else{
			com3=venta3*0.10;
		}
		System.out.print("Comisión venta No.3 $" + com3);

		System.out.print("\n\nIngresa el valor de la venta No.4 $");
		double venta4=sc.nextDouble();
		if(venta4<=10000000){
			com4=venta4*0.02;
		}else if(venta4>10000000 && venta4<15000000){
			com4=venta4*0.04;
		}else{
			com4=venta4*0.10;
		}
		System.out.print("Comisión venta No.4 $" + com4);

		total=com1+com2+com3+com4;
		System.out.print("\n\n\t---RESULTADO---" + "\n\nComisión total del mes: $" + total);
	}
}