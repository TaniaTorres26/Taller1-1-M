package calculadora;
import java.util.Scanner;

/* Tania Sofia Torres Romero calculadora en consola */
public class Calculadora {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        double num1 = 0;
        double num2 = 0;
        double res;

        do {
            System.out.println("Elige la operacion a realizar en la calculadora :D");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Seno");
            System.out.println("6. Coseno");
            System.out.println("7. Tangente");
            System.out.println("8. Raíz enésima");
            System.out.println("9. Potencia enésima");
            System.out.println("10. Calcular porcentaje de IVA");
            System.out.println("11. Salir");
            opcion = leer.nextInt();

            if (opcion >= 1 && opcion <= 10) {
                System.out.println("Digite el primer numero");
                num1 = leer.nextDouble();
                if (opcion != 5 && opcion != 6 && opcion != 7 && opcion != 8 && opcion != 9) {
                    System.out.println("Digite el segundo numero");
                    num2 = leer.nextDouble();
                }
            }

            switch (opcion) {
                case 1 -> {
                    res = num1 + num2;
                    System.out.println("La suma de los numeros es: " + res);
                    break;
                }
                case 2 -> {
                    res = num1 - num2;
                    System.out.println("La resta de los numeros es: " + res);
                    break;
                }
                case 3 -> {
                    res = num1 * num2;
                    System.out.println("La multiplicacion de los numeros es: " + res);
                    break;
                }
                case 4 -> {
                    if (num2 == 0) {
                        System.out.println("Esta respuesta es indefinida");
                    } else {
                        res = num1 / num2;
                        System.out.println("La division de los numeros es: " + res);
                    }
                    break;
                }
                case 5 -> {
                    res = Math.sin(num1);
                    System.out.println("El seno del numero en radianes es: " + res);
                    break;
                }
                case 6 -> {
                    res = Math.cos(num1);
                    System.out.println("El coseno del numero en radianes es: " + res);
                    break;
                }
                case 7 -> {
                    res = Math.tan(num1);
                    System.out.println("La tangente del numero en radianes es: " + res);
                    break;
                }
                case 8 -> {
                    System.out.println("Digite el índice de la raíz enésima");
                    int indice = leer.nextInt();
                    if (indice == 0) {
                        System.out.println("El índice de la raíz no puede ser cero");
                    } else {
                        res = Math.pow(num1, 1.0 / indice);
                        System.out.println("La raíz enésima del número es: " + res);
                    }
                    break;
                }
                case 9 -> {
                    System.out.println("Digite la potencia a la que desea elevar el primer número");
                    int potencia = leer.nextInt();
                    res = Math.pow(num1, potencia);
                    System.out.println(num1 + " elevado a la potencia " + potencia + " es: " + res);
                    break;
                }
                case 10 -> {
                    System.out.println("Digite el porcentaje de IVA");
                    double porcentajeIVA = leer.nextDouble();
                    res = num1 * (porcentajeIVA / 100);
                    System.out.println("El valor del " + porcentajeIVA + "% de IVA es: " + res);
                    break;
                }
            }
        } while (opcion != 11);
    }
}



