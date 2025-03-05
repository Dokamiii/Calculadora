
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int resultado = 0;
        char continuar;
        char continuarResultado = 'n';
        int valor1 = 0;
        int valor2 = 0;
        do {
            if(continuarResultado == 'n'|| continuarResultado == 'N') {
                System.out.println("primeiro numero");
                valor1 = teclado.nextInt();
                teclado.nextLine();
            } else {
                valor1 = resultado;
            }
            System.out.println("Selecione o operador: (+, -, *, /)");
            String operador = teclado.nextLine();
            
            System.out.println("Segundo numero");
            valor2 = teclado.nextInt();
            
            switch (operador) {
                case "+":
                resultado = valor1 + valor2;
                System.out.println(resultado);
                break;
                case "-":
                resultado = valor1 - valor2;
                System.out.println(resultado);
                break;
                case "*":
                resultado = valor1 * valor2;
                System.out.println(resultado);
                break;
                case "/":
                resultado = valor1 / valor2;
                if(valor2 == 0){
                    System.out.println("Nao divisivel por zero");
                }
                System.out.println(resultado);
                break;
            }
            System.out.println("Deseja continuar? S/N");
            continuar = teclado.next().charAt(0);
            teclado.nextLine();
            
            System.out.println("Deseja manter o mesmo resultado? S/N");
            continuarResultado = teclado.next().charAt(0);
            teclado.nextLine();

        } while (continuar == 's' || continuar =='S');
        teclado.close();
    }
}
