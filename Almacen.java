

package almacen;

import java.io.*;
import java.text.DecimalFormat;

public class Almacen {

    public static void main(String[] args) throws IOException {
        BufferedReader cp = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0;
        int tam = 0;
        int cantidad = 0;
        
        do {
            String menu = "\n Menu Principal \n"
                        + "1. Punto 8\n"
                        + "2. Punto 9\n"
                        + "3. Punto 10\n"
                        + "0. Salir\n"
                        + "Ingrese el punto del taller para visualizar: ";
            System.out.println(menu);
            opcion = Integer.parseInt(cp.readLine());

            switch(opcion) {
                case 1:
                    System.out.println(" Ingrese la dimension de la matriz:");
                    tam = Integer.parseInt(cp.readLine());
                    Punto8 Cat = new Punto8();
                    Cat.CategoriasP(tam);
                    break;

                case 2:
                    tam = Integer.parseInt(cp.readLine());
                    Punto9 Ven = new Punto9();
                    Ventas[][] matrizVentas = Ven.Matriz_Ventas(5);  // La matriz parece tener tamaño fijo 5x5
                    System.out.println("--- Matriz de ventas ---");
                    Ven.Mostrar_M(matrizVentas);
                    String resultadoMejorVendedor = Ven.mostrarMejorVendedor(matrizVentas);
                    System.out.println(resultadoMejorVendedor);
                    break;
  case 3:
                    System.out.println("Ingrese la cantidad de productos:");
                    cantidad = Integer.parseInt(cp.readLine());
                    Punto10 Of = new Punto10();
                    Of.Matriz_O(cantidad);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }
}
