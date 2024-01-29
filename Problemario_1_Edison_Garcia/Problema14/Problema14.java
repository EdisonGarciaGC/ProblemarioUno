import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema14 {

    public static void main(String[] args) {
        int respuesta;

        do {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Ingrese el área a pintar: ");
                String input1 = reader.readLine();

                System.out.print("Ingrese el cobro por metro: ");
                String input2 = reader.readLine();

                int metros = Integer.parseInt(input1);
                int cobro = Integer.parseInt(input2);

                int total = metros * cobro;

                System.out.println("El total es de: " + total);

                System.out.print("¿Desea ingresar nuevos datos? (0: NO. 1: SÍ): ");
                String input4 = reader.readLine();

                respuesta = Integer.parseInt(input4);
            } catch (IOException | NumberFormatException e) {
                System.out.println("Error: Asegúrate de introducir valores válidos.");
                respuesta = 1;
            }

        } while (respuesta != 0);
    }
}

