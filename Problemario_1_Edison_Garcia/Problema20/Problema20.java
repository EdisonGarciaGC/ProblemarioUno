import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema20 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Ingrese los minutos totales: ");
            String input1 = reader.readLine();

            System.out.print("Ingrese los segundos: ");
            String input2 = reader.readLine();

            System.out.print("Ingrese el costo por hora: ");
            String input3 = reader.readLine();

            int horas = Integer.parseInt(input1);
            int minutos = Integer.parseInt(input2);
            int costoPorHora = Integer.parseInt(input3);

            // Sumar una hora si hay minutos
            if (minutos > 0) {
                horas++;
            }

            int total = horas * costoPorHora;

            System.out.println("El total es de: " + total);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Asegúrate de introducir valores válidos.");
        }
    }
}
