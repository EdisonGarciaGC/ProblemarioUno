import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problemacuatro {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Ingrese el radio del circulo: ");
            String inputRadio = reader.readLine();

            double radio = Double.parseDouble(inputRadio);

            double area = (radio*radio) * 3.1416;

            System.out.println("El area del circulo con radio " + radio + " es: " + area);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Asegurate de introducir un numero valido para el radio.");
        }
    }
}

