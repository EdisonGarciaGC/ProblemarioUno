import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problemasiete {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Ingrese la distancia en km: ");
            String input1 = reader.readLine();

            System.out.print("Ingrese la velocidad en km/h: ");
            String input2 = reader.readLine();

            double kilometros = Integer.parseInt(input1);
            double velocidad = Double.parseDouble(input2);

            double resultado = kilometros*velocidad;
            System.out.println("El total de horas: " + resultado);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Asegúrate de introducir valores válidos.");
        }
    }
}