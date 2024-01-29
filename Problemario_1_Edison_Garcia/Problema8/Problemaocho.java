import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problemaocho {

    public static void main(String[] args) {
        // Utilizar BufferedReader para leer las entradas del usuario
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("ingrese x1 ");
            String input1 = reader.readLine();

            System.out.print("ingrese y1: ");
            String input2 = reader.readLine();

            System.out.print("ingrese x2: ");
            String input3 = reader.readLine();

            System.out.print("ingrese y2: ");
            String input4 = reader.readLine();

            // Convertir las entradas a números enteros
            int x1 = Integer.parseInt(input1);
            int y1 = Integer.parseInt(input2);
            int x2 = Integer.parseInt(input3);
            int y2 = Integer.parseInt(input4);


            // Calcular la suma de los números
            double resultado = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));

            // Mostrar el resultado de la suma
            System.out.println("Distancia es de: " + resultado);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Asegúrate de introducir dos números enteros válidos.");
        }
    }
}