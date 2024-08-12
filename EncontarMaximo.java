import java.util.Scanner;

public class EncontrarMaximo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño del arreglo
        System.out.print("Digite el tamaño del arreglo: ");
        int n = scanner.nextInt();

        // Inicializar un arreglo para almacenar los datos
        double[] arreglo = new double[n];

        // Solicitar al usuario los datos del arreglo
        System.out.println("Digite los datos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]? ");
            arreglo[i] = scanner.nextDouble();
        }

        // Encontrar el máximo valor en el arreglo
        double maximo = arreglo[0]; // Suponemos que el primer elemento es el máximo inicialmente
        for (int i = 1; i < n; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }

        // Imprimir el resultado
        System.out.println("El mayor valor del arreglo dado es: " + maximo);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}