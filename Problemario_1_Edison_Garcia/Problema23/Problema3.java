import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema3 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Ingrese el precio del producto: ");
            String input1 = reader.readLine();

            double costo = Integer.parseInt(input1);
            double costo_descuento = costo-(costo*.20);
            double costo_final = costo_descuento+(costo_descuento*.16);



            System.out.println("El precio con descuento: " + costo_descuento);
            System.out.println("El precio final: " + costo_final);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Asegúrate de introducir valores válidos.");
        }
    }
}
