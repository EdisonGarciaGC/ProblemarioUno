import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema24 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Ingrese su salario: ");
            String input1 = reader.readLine();

            double salario = Double.parseDouble(input1);
            double porcentaje = salario * 0.15;
            double ahorro = 0;

            for (int i = 0; i < 47; i++) {
                ahorro = porcentaje + (porcentaje * 0.15);
                porcentaje = ahorro;
            }

            System.out.println("El total de ahorro después de 48 iteraciones: " + ahorro);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Asegúrate de introducir valores válidos.");
        }
    }
}
