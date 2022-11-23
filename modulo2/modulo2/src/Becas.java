package modulo2.src;
//El presidente de la república ha decidido estimular a todos los estudiantes de una universidad
//mediante la asignación de becas mensuales, para esto se tomarán en consideración los siguientes criterios:
//Para alumnos mayores de 18 años con promedio mayor o igual a 9,
//la beca será de $2000.00; con promedio mayor o igual a 7.5, de $1000.00; para los promedios menores de 7.5
//pero mayores o iguales a 6.0, de $500.00; a los demás se les enviará una carta de invitación incitándolos a que estudien más en el próximo ciclo escolar.
//A los alumnos de 18 años o menores de esta edad, con promedios mayores o iguales a 9,
//se les dará $3000; con promedios menores a 9 pero mayores o iguales a 8, $2000; para los alumnos con promedios
//menores a 8 pero mayores o iguales a 6, se les dará $100, y a los alumnos que tengan promedios menores a 6 se les enviará carta
//de invitación. Realice el algoritmo correspondiente y represéntelo con un diagrama de flujo.

import java.util.Scanner;

public class Becas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        double edad = scanner.nextDouble();
        System.out.println("¿Cuál es su promedio de notas?");
        double prom = scanner.nextDouble();

        if (edad > 18 && prom >= 9) {
            System.out.println("Su beca es de $2000.00");
        } else if (edad > 18 && prom >= 7.5 && prom < 9) {
            System.out.println("Su beca es de $1000.00 ");
        } else if (edad > 18 && prom >= 6 && prom < 7.5) {
            System.out.println("La beca otorgada es de $500.00");
        } else if (edad > 18 && prom < 6) {
            System.out.println("Le invitamos a estudiar más y a mejorar sus notas");
        } else if (edad > 18 && prom >= 9) {
            System.out.println("Su beca es de $2000.00");
        } else if (edad <= 18 && prom >= 8 && prom < 9) {
            System.out.println("Su beca es de $2000.00 ");
        } else if (edad <= 18 && prom >= 6 && prom < 8) {
            System.out.println("La beca otorgada es de $100.00");
        } else if (edad <= 18 && prom < 6) {
            System.out.println("Le invitamos a estudiar m'as y a mejorar sus notas");
        }
    }
}