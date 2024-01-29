import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problemaseis {

    public static void main(String[] args) {
        // Utilizar BufferedReader para leer las entradas del usuario
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("ingrese la hipotenusa: ");
            String input1 = reader.readLine();

            System.out.print("ingrese el radio: ");
            String input2 = reader.readLine();

            // Convertir las entradas a números enteros
            int numero1 = Integer.parseInt(input1);
            int numero2 = Integer.parseInt(input2);
            double b = Math.sqrt((numero1*numero1)-(numero2*numero2));

            // Calcular la suma de los números
            double resultado = ( (((numero2*2)*b)/2)+((3.1416*numero2)/2)         );

            // Mostrar el resultado de la suma
            System.out.println("El area de la figura es de : " + resultado);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Asegurate de introducir dos numeros enteros validos.");
        }
    }
}