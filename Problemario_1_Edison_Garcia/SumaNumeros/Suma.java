import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Suma {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


            System.out.print("Introduce el primer número: ");
            String input1 = reader.readLine();
            System.out.print("Introduce el segundo número: ");
            String input2 = reader.readLine();

            
            int numero1 = Integer.parseInt(input1);
            int numero2 = Integer.parseInt(input2);


            int resultado = numero1 + numero2;


            System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Asegúrate de introducir dos números enteros válidos.");
        }
    }
}



