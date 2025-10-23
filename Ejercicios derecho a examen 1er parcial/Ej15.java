import java.util.Scanner;
public class Ej15{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\n\t---Calificaciones universidad---" + "\n\tIngrese la nota [0.0-5.0]: ");
		double nota=sc.nextDouble();
		if(nota<0 || nota>5){
			System.out.println("\n\tError. La nota debe estar entre 0 y 5");
		}else{
			if(nota>=0 && nota<=1){
				System.out.println("\n\tP (Pésimo)");
			}else if(nota>=1.1 && nota<=2.0){
				System.out.println("\n\tM (Mal)");
			}else if(nota>=2.1 && nota<=2.9){
				System.out.println("\n\nR (Regular)");
			}else if(nota>=3.0 && nota<=4.0){
				System.out.println("\n\tB (bien)");
			}else{
				System.out.println("\n\tE (Excelente)");
		
			}

		}		
	}
}