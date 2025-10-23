import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la duración de la llamada (en minutos): ");
        int minutos = sc.nextInt();
        double total;

        if (minutos <= 3) {
            total = 10;
        } else {
            total = 10 + (minutos - 3) * 1;
        }

        System.out.println("El costo total de la llamada es: N$" + total);
    }
}