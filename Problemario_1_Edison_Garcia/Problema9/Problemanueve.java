import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problemanueve {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Ingrese horas totales trabajadas en esta semana: ");
            String input1 = reader.readLine();

            System.out.print("Ingrese el pago por hora que recibe: ");
            String input2 = reader.readLine();

            int horas = Integer.parseInt(input1);
            double pago = Double.parseDouble(input2);

            double resultado = horas * pago;

            System.out.println("El pago es de: " + resultado);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Asegúrate de introducir valores válidos.");
        }
    }
}
