/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ecografia;

import java.util.Scanner;

/**
 * Ejercicio de Protocolo médico. Para practicar condicionales y bucles
 *
 * @author Otra Cuenta
 */
public class Ecografia {

    public static void main(String[] args) {

        String respuesta;
        boolean salir = false;

        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("Derrame pleural paraneuomónico");
            System.out.println("Ecografía transtorácica");
            System.out.println("¿Complicado septos s/n");
            respuesta = entrada.nextLine();

            if (respuesta.equals("s")) {

                System.out.println("Drenaje pleural + fibrinolíticos, + antibioterapia");
                System.out.println("¿Mala evolución");
                respuesta = entrada.nextLine();

                if (respuesta.equals("s")) {

                    System.out.println("Ecografía");
                    System.out.println("¿Persistencia de derrame y septos");
                    respuesta = entrada.nextLine();

                    if (respuesta.equals("s")) {

                        System.out.println("Videotoracoscopia");

                    }

                } else {

                    System.out.println("Continuar tratamiento");

                }

            } else {

                System.out.println("¿Dificultad respiratoria?");

                respuesta = entrada.nextLine();

                if (respuesta.equals("s")) {

                    System.out.println("Drenaje plural + Antibioterapia");
                    System.out.println("¿Empeoramiento en siguientes 24-48h");
                    respuesta = entrada.nextLine();

                    if (respuesta.equals("s")) {

                        System.out.println("Vuelvo al principio");
                        salir = false;

                    } else {

                        System.out.println("Continuar tratamiento");

                    }

                } else {

                    System.out.println(">10 mm?");
                    respuesta = entrada.nextLine();

                    if (respuesta.equals("s")) {

                        System.out.println("Toraconcentesis diagnóstica");
                        System.out.println("¿Pus o pH <7.2?");
                        respuesta = entrada.nextLine();

                        if (respuesta.equals("s")) {

                            System.out.println(" Voy a Tratamiento conservador");

                        }

                    } else {

                        System.out.println("Tratamiento conservador: Antibioterapia");
                        System.out.println("Empeoramiento en 24-48h");
                        respuesta = entrada.nextLine();
                        if (respuesta.equals("s")) {

                            System.out.println("Salgo");
                            salir = false;

                        } else {

                            System.out.println("Continuar tratamiento");

                        }

                    }

                }
            }

        } while (!salir);
    }
}
