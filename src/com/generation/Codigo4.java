package com.generation;
import java.util.Scanner;
//Se importa funciön de Scanner


public class Codigo4 {
    // Se añade PSVM
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String j1;
        String j2;
        //Se agregan variables j1 y 2 de manera previa para habilitar el uso de bucles

        // Se añaden bucles while para evaluar resultados no válidos
        do {
            System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
            j1 = scan.nextLine().toLowerCase();
            if (!j1.equals("piedra")&&!j1.equals("papel")&&!j1.equals("tijeras")){
                System.out.println("Opción inválida, escribe piedra, papel o tijeras");
            }
            // Se añade toLowerCase para evitar problemas con mayus
        }while(!j1.equals("piedra")&&!j1.equals("papel")&&!j1.equals("tijeras"));


        do {
            // Se corrige turno del jugador 2
            System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
            //Scanner s2 = new Scanner(); Se elimina escáner sin usar
            j2 = scan.nextLine().toLowerCase();
            if (!j2.equals("piedra")&&!j2.equals("papel")&&!j2.equals("tijeras")) {
                System.out.println("Opción inválida, escribe piedra, papel o tijeras");
            }
        }while(!j2.equals("piedra")&&!j2.equals("papel")&&!j2.equals("tijeras"));

        System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");


        // Se rehace la estructura para comparar los inputs
        // Se elimina ")" sobrante y se sustituye "==" por ".equals"
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
        switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        System.out.println("Ha ganado el primer jugador");
                    } else {
                        System.out.println("Ha ganado el segundo jugador");
                    }
                    break;
                case "tijeras":
                    if (j2.equals("piedra")){
                        System.out.println("Ha ganado el segundo jugador");
                    } else {
                        System.out.println("Ha ganado el segundo jugador");
                    }
                    break;
                case "papel":
                    if (j2.equals("tijeras")){
                        System.out.println("Ha ganado el segundo jugador");
                    } else {
                        System.out.println("Ha ganado el primer jugador");
                    }
                    break;
        }
        }
    }
}