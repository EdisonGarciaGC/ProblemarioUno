import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema18 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Ingrese los kilometros totales: ");
            String input1 = reader.readLine();

            System.out.print("Ingrese el costo por kilometro: ");
            String input2 = reader.readLine();



            double kilometro = Integer.parseInt(input1);
            double costo = Double.parseDouble(input2);

            double resultado = kilometro*costo;
            System.out.println("El total a cobrar: " + resultado);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Asegúrate de introducir valores válidos.");
        }
    }
}