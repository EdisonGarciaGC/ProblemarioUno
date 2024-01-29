import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problemadiez {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Ingrese el total de metros: ");
            String input1 = reader.readLine();
            double total_metros = Double.parseDouble(input1);
            double resultado = (total_metros / 0.0254) ;
            System.out.println("El total en pulgadas es de: " + resultado);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Asegúrate de introducir valores válidos.");
        }
    }
}
