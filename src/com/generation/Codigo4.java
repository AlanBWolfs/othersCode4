package com.generation;
import java.util.Scanner;
//Se importa funciön de Scanner

public class Codigo4 {
    Scanner scan = new Scanner();

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = scan.nextLine();

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
//        Scanner s2 = new Scanner(); Se elimina escaner sin usar
        String j2 = scan.nextLine();
    // Se elimina ) sobrante
    if (j1 == j2) {
        System.out.println("Empate");
    } else {
int g = 2;
        switch(j1) {
        case "piedra":
        if (j2 == "tijeras") {
g = 1;
        }

        case "papel":
        if (j2 == "piedra") {
g = 1;

        case "tijera":
        if (j2.equals("papel")) {
g = 1;
        }
        break;
default:
        }
        System.out.println("Gana el jugador " + g);
        }
    }
}