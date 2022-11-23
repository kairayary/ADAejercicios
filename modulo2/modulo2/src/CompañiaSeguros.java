package modulo2.src;

import java.util.Scanner;

//Una compañía de seguros para autos ofrece dos tipos de póliza: cobertura amplia (A) y daños a terceros (B).
//Para el plan A, la cuota base es de $1,200, y para el B, de $950. A ambos planes se les carga 10% del
//costo si la persona que conduce tiene por hábito beber alcohol, 5% si utiliza lentes,
//5% si padece alguna enfermedad ?como de- ficiencia cardiaca o diabetes?, y si tiene más de 40 años,
//se le carga 20%, de lo contrario sólo 10%. Todos estos cargos se realizan sobre el costo base.
//Realice diagrama de flujo que represente el algoritmo para determinar cuánto le cuesta a una persona contratar una póliza.
public class CompañiaSeguros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga su edad");
        int edad = scanner.nextInt();
        System.out.println("Selecione el tipo de poliza:");
        System.out.println("1._ Cobertura amplia A");
        System.out.println("2._Daños a terceros B");
        int tipo_poliza;

        do {
            tipo_poliza = scanner.nextInt();
            if (tipo_poliza<1 || tipo_poliza>2){
                System.out.println("Valor incorrecto.Ingrese su selección nuevamente");
            }
        }while( tipo_poliza<1 || tipo_poliza>2 );

        System.out.println("Selecione: ¿ Bebe Alcohol?:");
        System.out.println("1._ Si");
        System.out.println("2._ No");
        int beber_alcohol;

        do {
           beber_alcohol = scanner.nextInt();
            if (beber_alcohol<1 || beber_alcohol>2){
                System.out.println("Valor incorrecto.Ingrese su selección nuevamente");
            }
        }while( beber_alcohol<1 || beber_alcohol>2 );

        System.out.println("Selecione: ¿Usa lentes?:");
        System.out.println("1._ Si");
        System.out.println("2._ No");
        int usa_lentes;

        do {
            usa_lentes = scanner.nextInt();
            if (usa_lentes<1 || usa_lentes>2){
                System.out.println("Valor incorrecto.Ingrese su selección nuevamente");
            }
        }while( usa_lentes<1 || usa_lentes>2 );

        System.out.println("Selecione: ¿Padece alguna enfermedad?:");
        System.out.println("1._ Si");
        System.out.println("2._ No");
        int padece_enfermedad;

        do {
            padece_enfermedad = scanner.nextInt();
            if (padece_enfermedad<1 || padece_enfermedad>2){
                System.out.println("Valor incorrecto.Ingrese su selección nuevamente");
            }
        }while( padece_enfermedad<1 || padece_enfermedad>2 );

        int cuota_base;
        if(tipo_poliza==1){
             cuota_base= 1200;
        }else{
             cuota_base= 950;
        }
        int cargos = 0;

        if(beber_alcohol==1){

             cargos = (int) (cargos + cuota_base*0.1);
        }
        if (usa_lentes==1){
            cargos = (int) (cargos + cuota_base*0.05);
        }
        if(padece_enfermedad==1){
            cargos = (int) (cargos + cuota_base*0.05);
        }
        if(edad>40){
            cargos = (int) (cargos + cuota_base*0.2);
        }else {
            cargos = (int) (cargos + cuota_base*0.1);
        }
        int total= (int)(cuota_base + cargos);
        System.out.println("Valor de cargos:" + cargos);
        System.out.println("Valor de cuota base:" + cuota_base);
        System.out.println("Total a pagar:" + total);
    }
}
