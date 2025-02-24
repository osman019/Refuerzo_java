package com.refuerzo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Pedir al usuario la cantidad de categorías.
        System.out.print("Ingrese la cantidad de categorías: ");
        int cantidadCategorias = teclado.nextInt();
        teclado.nextLine();

        // 2. Para cada categoría, pedir productos y almacenarlos en un Map<String, List<String>>.
        Map<String, List<String>> inventario = new HashMap<>();
        for (int i = 0; i < cantidadCategorias; i++) {
            System.out.print("Ingrese el nombre de la categoría " + (i + 1) + ": ");
            String categoria = teclado.nextLine();
            inventario.put(categoria, new ArrayList<>());

            System.out.print("Ingrese la cantidad de productos para la categoría " + categoria + ": ");
            int cantidadProductos = teclado.nextInt();
            teclado.nextLine();

            for (int j = 0; j < cantidadProductos; j++) {
                System.out.print("Ingrese el nombre del producto " + (j + 1) + " para la categoría " + categoria + ": ");
                String producto = teclado.nextLine();
                inventario.get(categoria).add(producto);
            }
        }

        // 3. Permitir mostrar todos los productos de una categoría específica.
        System.out.print("Ingrese el nombre de la categoría para mostrar sus productos: ");
        String categoriaBusqueda = teclado.nextLine();
        if (inventario.containsKey(categoriaBusqueda)) {
            System.out.println("Productos en la categoría " + categoriaBusqueda + ": " + inventario.get(categoriaBusqueda));
        } else {
            System.out.println("La categoría " + categoriaBusqueda + " no está en el inventario.");
        }

        // 4. Permitir agregar un nuevo producto a una categoría existente.
        System.out.print("Ingrese el nombre de la categoría para agregar un nuevo producto: ");
        String categoriaAgregar = teclado.nextLine();
        if (inventario.containsKey(categoriaAgregar)) {
            System.out.print("Ingrese el nombre del nuevo producto: ");
            String nuevoProducto = teclado.nextLine();
            inventario.get(categoriaAgregar).add(nuevoProducto);
            System.out.println("Producto agregado exitosamente.");
        } else {
            System.out.println("La categoría " + categoriaAgregar + " no está en el inventario.");
        }

        // 5. Mostrar la lista completa de categorías y productos.
        System.out.println("Lista completa de categorías y productos:");
        for (Map.Entry<String, List<String>> entry : inventario.entrySet()) {
            System.out.println("Categoría: " + entry.getKey() + ", Productos: " + entry.getValue());
        }

        teclado.close();
    }
}