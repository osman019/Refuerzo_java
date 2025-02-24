package com.refuerzo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Pedir al usuario la cantidad de estudiantes.
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = teclado.nextInt();
        teclado.nextLine(); 

        // 2. Solicitar nombres y notas para cada estudiante y almacenarlos en un Map<String, Double>.
        Map<String, Double> estudiantes = new HashMap<>();
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = teclado.nextLine();
            System.out.print("Ingrese la nota de " + nombre + ": ");
            double nota = teclado.nextDouble();
            teclado.nextLine(); 
            estudiantes.put(nombre, nota);
        }

        // 3. Mostrar la lista completa.
        System.out.println("Lista de estudiantes y sus notas:");
        for (Map.Entry<String, Double> entry : estudiantes.entrySet()) {
            System.out.println("Estudiante: " + entry.getKey() + ", Nota: " + entry.getValue());
        }

        // 4. Permitir buscar la nota de un estudiante ingresando su nombre.
        System.out.print("Ingrese el nombre del estudiante para buscar su nota: ");
        String nombreBusqueda = teclado.nextLine();
        if (estudiantes.containsKey(nombreBusqueda)) {
            System.out.println("La nota de " + nombreBusqueda + " es: " + estudiantes.get(nombreBusqueda));
        } else {
            System.out.println("El estudiante " + nombreBusqueda + " no está en la lista.");
        }

        // 5. Encontrar la nota más alta y el estudiante con mejor rendimiento.
        String mejorEstudiante = null;
        double mejorNota = -1;
        for (Map.Entry<String, Double> entry : estudiantes.entrySet()) {
            if (entry.getValue() > mejorNota) {
                mejorNota = entry.getValue();
                mejorEstudiante = entry.getKey();
            }
        }
        if (mejorEstudiante != null) {
            System.out.println("El estudiante con mejor rendimiento es " + mejorEstudiante + " con una nota de " + mejorNota);
        }

        teclado.close();
    }
}
