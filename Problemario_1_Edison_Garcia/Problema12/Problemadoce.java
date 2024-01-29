import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problemadoce {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Ingrese la altura: ");
            String input1 = reader.readLine();

            System.out.print("Ingrese el largo: ");
            String input2 = reader.readLine();

            double altura = Integer.parseInt(input1);
            double base = Double.parseDouble(input2);

            double resultado = (altura*base)/2 ;

            System.out.println("El area del triangulo es de : " + resultado);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Asegúrate de introducir valores válidos.");
        }
    }
}