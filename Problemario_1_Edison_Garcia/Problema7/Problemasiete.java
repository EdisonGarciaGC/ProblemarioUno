import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problemasiete {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Ingrese el total de litros producidos: ");
            String input1 = reader.readLine();

            System.out.print("Ingrese el costo del litro: ");
            String input2 = reader.readLine();

            int litros = Integer.parseInt(input1);
            double costo = Double.parseDouble(input2);

            double resultado = (litros / 3.785) * costo;
            System.out.println("El pago es de: " + resultado);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Asegúrate de introducir valores válidos.");
        }
    }
}
