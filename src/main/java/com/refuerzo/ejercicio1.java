package com.refuerzo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // 1. Pedir al usuario la cantidad de estudiantes que desea registrar.
        System.out.print("Ingrese la cantidad de estudiantes que desea registrar: ");
        int cantidadEstudiantes = teclado.nextInt();
        teclado.nextLine(); // Consumir el salto de línea

        // 2. Solicitamos los nombres de los estudiantes y los amlnamos en una List<String>.
        List<String> estudiantes = new ArrayList<>();
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = teclado.nextLine();
            estudiantes.add(nombre);
        }

        // 3. Mostrar la lista completa de estudiantes.
        System.out.println("Lista de estudiantes:");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        // 4. Ordenar los nombres en orden alfabético y mostrarlos.
        Collections.sort(estudiantes);
        System.out.println("Lista de estudiantes ordenada alfabéticamente:");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        // 5. Permitir que el usuario busque si un estudiante está en la lista.
        System.out.print("Ingrese el nombre del estudiante que desea buscar: ");
        String nombreBusqueda = teclado.nextLine();
        if (estudiantes.contains(nombreBusqueda)) {
            System.out.println("El estudiante " + nombreBusqueda + " está en la lista.");
        } else {
            System.out.println("El estudiante " + nombreBusqueda + " no está en la lista.");
        }

        teclado.close();
    }
}
