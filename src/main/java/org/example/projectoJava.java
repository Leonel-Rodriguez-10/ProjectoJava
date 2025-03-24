package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class projectoJava{
    public static void main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombresProductos = new ArrayList<>();
        ArrayList<Integer> cantidadesProductos = new ArrayList<>();

        final double IVA = 0.12;
        double Precio = 100;
        double PrecioConIVA = Precio * (1 + IVA);

        int opcion = 0;

        while (opcion != 5) {
            System.out.println("Menú de Inventario");
            System.out.println("Seleccione una opción: ");
            System.out.println("1) Agregar producto");
            System.out.println("2) Listar productos");
            System.out.println("3) Actualizar cantidad de un producto");
            System.out.println("4) Eliminar producto");
            System.out.println("5) Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Ingrese el nombre del producto: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese la cantidad del producto: ");
                int cantidad = scanner.nextInt();
                scanner.nextLine();

                nombresProductos.add(nombre);
                cantidadesProductos.add(cantidad);
                System.out.println("Producto agregado correctamente.");
            }
            else if (opcion == 2) {
                System.out.println("\n--- Productos en Inventario ---");
                if (nombresProductos.isEmpty()) {
                    System.out.println("No hay productos en el inventario.");
                } else {
                    for (int i = 0; i < nombresProductos.size(); i++) {
                        System.out.println((i + 1) + ". " + nombresProductos.get(i) + " - Cantidad: " + cantidadesProductos.get(i));
                    }
                }
            }
            else if (opcion == 3) {
                System.out.print("Ingrese el nombre del producto a actualizar: ");
                String productoActualizar = scanner.nextLine();
                int indexActualizar = nombresProductos.indexOf(productoActualizar);

                if (indexActualizar != -1) {
                    System.out.print("Ingrese la nueva cantidad: ");
                    int nuevaCantidad = scanner.nextInt();
                    scanner.nextLine();

                    cantidadesProductos.set(indexActualizar, nuevaCantidad);
                    System.out.println("Cantidad actualizada correctamente.");
                } else {
                    System.out.println("El producto no existe en el inventario.");
                }
            }
            else if (opcion == 4) {
                System.out.print("Ingrese el nombre del producto a eliminar: ");
                String productoEliminar = scanner.nextLine();
                int indexEliminar = nombresProductos.indexOf(productoEliminar);

                if (indexEliminar != -1) {
                    nombresProductos.remove(indexEliminar);
                    cantidadesProductos.remove(indexEliminar);
                    System.out.println("Producto eliminado correctamente.");
                } else {
                    System.out.println("El producto no existe en el inventario.");
                }
            }
            else if (opcion == 5) {
                System.out.println("Saliendo del programa.");
            }
            else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}
