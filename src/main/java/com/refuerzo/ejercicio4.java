package com.refuerzo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Pedir al usuario cuántos estudiantes desea registrar.
        System.out.print("Ingrese la cantidad de estudiantes que desea registrar: ");
        int cantidadEstudiantes = teclado.nextInt();
        teclado.nextLine(); 

        // 2. Solicitar el nombre de los estudiantes y almacenarlos en un HashSet<String>.
        Set<String> estudiantes = new HashSet<>();
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = teclado.nextLine();
            estudiantes.add(nombre);
        }

        // 3. Mostrar la lista de estudiantes.
        System.out.println("Lista de estudiantes:");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        // 4. Verificar si un estudiante específico está en la lista.
        System.out.print("Ingrese el nombre del estudiante para verificar si está en la lista: ");
        String nombreBusqueda = teclado.nextLine();
        if (estudiantes.contains(nombreBusqueda)) {
            System.out.println("El estudiante " + nombreBusqueda + "si está en la lista.");
        } else {
            System.out.println("El estudiante " + nombreBusqueda + " no está en la lista.");
        }

        teclado.close();
    }
}
