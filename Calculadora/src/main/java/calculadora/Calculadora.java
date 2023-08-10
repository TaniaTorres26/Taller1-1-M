package calculadora;
import java.util.Scanner;

/*Tania Sofia Torres Romero*/
public class Calculadora {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int opcion;
    float num1 = 0;
    float num2 = 0;
    float res;

    do{
    System.out.println("Elige la operacion a realizar\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Seno\n6. Dividir\n7. Dividir\n8. Salir");
    opcion = leer.nextInt();
    System.out.println("Digite el primer numero");
    num1 = leer.nextInt();
    System.out.println("Digite el segundo numero");
    num2 = leer.nextInt();
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
      res = (float)Math.sin(num1);
      System.out.println("El seno del numero es: " + res );
      break;
    }
    case 8 -> {
      continue;
    }
    }
    } while (opcion !=8);
}
}
