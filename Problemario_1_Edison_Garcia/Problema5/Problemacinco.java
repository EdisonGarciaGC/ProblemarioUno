import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problemacinco {

    public static void main(String[] args) {
        // Utilizar BufferedReader para leer las entradas del usuario
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("INGRESA EL LADO A: ");
            String input1 = reader.readLine();

            System.out.print("EL LADO B: ");
            String input2 = reader.readLine();

            System.out.print("EL LADO C: ");
            String input3 = reader.readLine();

            // Convertir las entradas a números enteros
            int numero1 = Integer.parseInt(input1);
            int numero2 = Integer.parseInt(input2);
            int numero3 = Integer.parseInt(input3);

            // Calcular la suma de los números
            int resultado = (numero1 * numero2)-(((numero1 - numero3) * numero2)/2);

            // Mostrar el resultado de la suma
            System.out.println("El area del terreno es de : " + resultado);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Asegúrate de introducir dos números enteros válidos.");
        }
    }
}
