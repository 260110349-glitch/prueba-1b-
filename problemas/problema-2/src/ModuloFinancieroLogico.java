import java.util.Scanner;

public class ModuloFinancieroLogico {

    public static void ejecutar(Scanner sc) {
        int continuar = 1;

        do {
            System.out.println("\n==========================================");
            System.out.println("       MODULO FINANCIERO-LOGICO");
            System.out.println("==========================================");

            int p;
            do {
                System.out.print("El comprador es estudiante acreditado? (1 = Si / 0 = No): ");
                p = sc.nextInt();
                if (p != 0 && p != 1) {
                    System.out.println("ERROR: Ingrese un valor valido (0 o 1).");
                }
            } while (p != 0 && p != 1);

            int q;
            do {
                System.out.print("El equipo pertenece al catalogo educativo? (1 = Si / 0 = No): ");
                q = sc.nextInt();
                if (q != 0 && q != 1) {
                    System.out.println("ERROR: Ingrese un valor valido (0 o 1).");
                }
            } while (q != 0 && q != 1);

            System.out.print("Ingrese el costo base del equipo: ");
            double costo = sc.nextDouble();
            sc.nextLine();

            double tasa = 0.16;
            String tipoRegla = "Impuesto General Estandar (16%)";

            if (p == 1 && q == 1) {
                tasa = 0.0;
                tipoRegla = "Exencion Total de Impuesto (0%)";
            } else if ((p == 1 && q == 0) || (p == 0 && q == 1)) {
                tasa = 0.08;
                tipoRegla = "Impuesto Subvencionado / Reducido (8%)";
            }

            double impuesto = costo * tasa;
            double importeFinal = costo + impuesto;

            System.out.println("\n--- RESUMEN FISCAL ---");
            System.out.println("Regla aplicada: " + tipoRegla);
            System.out.printf("Costo base: %.2f%n", costo);
            System.out.printf("Impuesto calculado: %.2f%n", impuesto);
            System.out.printf("Importe final: %.2f%n", importeFinal);

            System.out.print("\nDesea realizar otra evaluacion en este modulo? (1 = Si / 0 = No): ");
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
