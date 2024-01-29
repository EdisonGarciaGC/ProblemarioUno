import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema13 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Ingrese el total de pesos mexicanos: ");
            String input1 = reader.readLine();

            System.out.print("Ingrese el precio del dolar: ");
            String input2 = reader.readLine();

            double pesos = Integer.parseInt(input1);
            double dolar = Double.parseDouble(input2);

            double resultado =pesos/dolar ;
            System.out.println("Total de dolares que puedes comprar: " + resultado);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Asegúrate de introducir valores válidos.");
        }
    }
}
