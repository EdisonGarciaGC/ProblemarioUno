import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema25 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Ingrese el cobro del hotel por noche: ");
            String input1 = reader.readLine();

            System.out.print("Ingrese el gasto de comida por dia: ");
            String input2 = reader.readLine();

            System.out.print("Ingrese el total de dias: ");
            String input3 = reader.readLine();

            int hotel= Integer.parseInt(input1);
            double comida = Double.parseDouble(input2);
            int dias = Integer.parseInt(input3);

            double resultado = (hotel+comida+100)*dias;
            System.out.println("El total del chece es de: " + resultado);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Asegúrate de introducir valores válidos.");
        }
    }
}
