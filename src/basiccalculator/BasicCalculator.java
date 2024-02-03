package basiccalculator;

//@author GABI

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
char operador=1;
        double num1, num2, resultado;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Bienvenido a Basic Calculator by Gabriel A. Orellana") ;
        
        while (operador != '0') {
            System.out.println("Por favor, eliga el operador matemático: '+', '-', '*' o '/'");
            System.out.println("o ingrese '0' para finalizar");
            operador = input.next().charAt(0);
            
                if (operador == '0') {
                       System.out.println("Te esperamos pronto.");
                       return;
                   } else {
                       System.out.println("Por favor, ingrese el primer número: ");
                       num1 = input.nextDouble();
                       
                       System.out.println("Por favor, ingrese el segundo número: ");
                       num2 = input.nextDouble();
                     
                }

                switch (operador) {
                    case '+':
                        resultado = num1 + num2;
                        System.out.println(num1 + " + " + num2 + " = " + resultado);
                        System.out.println("¿Desea volver a intenarlo?");
                        break;

                    case '-':
                        resultado = num1 - num2;
                        System.out.println(num1 + " - " + num2 + " = " + resultado);
                        break;

                    case '*':
                        resultado = num1 - num2;
                        System.out.println(num1 + " * " + num2 + " = " + resultado);
                        break;

                    case '/':
                        resultado = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + resultado);
                        break;
                    case '0':
                        System.out.println("Hasta luego.");
                        break;            
                    default:
                        System.out.println("Operador matemático invalido.");
                        break;  
                }
                }
    }

}
