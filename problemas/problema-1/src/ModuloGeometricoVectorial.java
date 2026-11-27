import java.util.Scanner;

public class ModuloGeometricoVectorial {

    public static void ejecutar(Scanner sc) {
        int continuar = 1;

        do {
            System.out.println("\n==========================================");
            System.out.println("      MODULO GEOMETRICO-VECTORIAL");
            System.out.println("==========================================");

            System.out.print("Ingrese las coordenadas de P1 en formato x1,y1: ");
            String entradaP1 = sc.nextLine().trim();
            String[] partesP1 = entradaP1.split(",");

            System.out.print("Ingrese las coordenadas de P2 en formato x2,y2: ");
            String entradaP2 = sc.nextLine().trim();
            String[] partesP2 = entradaP2.split(",");

            if (partesP1.length != 2 || partesP2.length != 2) {
                System.out.println("ERROR: Ingrese ambos puntos en formato x,y (ejemplo: 0,0 y 3,4).");
            } else {
                double x1 = Double.parseDouble(partesP1[0].trim());
                double y1 = Double.parseDouble(partesP1[1].trim());
                double x2 = Double.parseDouble(partesP2[0].trim());
                double y2 = Double.parseDouble(partesP2[1].trim());

                double deltaX = x2 - x1;
                double deltaY = y2 - y1;
                double magnitud = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));

                System.out.println("\n--- RESULTADOS ---");
                System.out.println("P1(" + x1 + ", " + y1 + ") -> P2(" + x2 + ", " + y2 + ")");
                System.out.printf("Incremento en X (deltaX): %.2f%n", deltaX);
                System.out.printf("Incremento en Y (deltaY): %.2f%n", deltaY);

                if (deltaX == 0) {
                    System.out.println("Pendiente (m): No definida (division entre cero, deltaX = 0).");
                } else {
                    double pendiente = deltaY / deltaX;
                    System.out.printf("Pendiente (m): %.2f%n", pendiente);
                }

                System.out.printf("Magnitud del vector (d): %.2f unidades%n", magnitud);
            }

            System.out.print("\nDesea realizar otra operacion en este modulo? (1 = Si / 0 = No): ");
            continuar = sc.nextInt();
            sc.nextLine();
        } while (continuar != 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ejecutar(sc);
        sc.close();
    }
}
