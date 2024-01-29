import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problemados {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Introduce la primera calificacion: ");
            String input1 = reader.readLine();
            int calificacion1 = Integer.parseInt(input1);

            System.out.print("Introduce la segunda calificacion: ");
            String input2 = reader.readLine();
            int calificacion2 = Integer.parseInt(input2);

            System.out.print("Introduce la tercera calificacion: ");
            String input3 = reader.readLine();
            int calificacion3 = Integer.parseInt(input3);

            System.out.print("Introduce la cuarta calificacion: ");
            String input4 = reader.readLine();
            int calificacion4 = Integer.parseInt(input4);

            int sumaCalificaciones = calificacion1 + calificacion2 + calificacion3 + calificacion4;
            double promedio = (double) sumaCalificaciones / 4;

            System.out.println("El promedio de las calificaciones es: " + promedio);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Asegurate de introducir calificaciones validas.");
        } finally {
            try {
                // cierra el bufferedReader
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



