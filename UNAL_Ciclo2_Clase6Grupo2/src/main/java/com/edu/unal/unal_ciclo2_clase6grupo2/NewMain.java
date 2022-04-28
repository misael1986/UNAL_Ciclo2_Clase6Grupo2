/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unal.unal_ciclo2_clase6grupo2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        char letra= '\u0000';//
        String nombre="Algo";
        String miCadena ="¡Hola Mundo!";
        String miCadena2 = new String("¡Hola Mundo!");
        char charcad []= {'B','u','e','n','a','s'};
        String nombre2= new String(charcad);
        System.out.println(nombre + "\n" + miCadena + "\n" + miCadena2 + "\n"
                + charcad[0] + "\n" + nombre2);
        
        for (int i=0;i<charcad.length;i++){
            System.out.print(charcad[i]);
            if(i < charcad.length-1){
                System.out.print("-");
            }
        }
        System.out.println("");

         */
        //--------------------------------------------------------------------
        /*
        
        // Declararelobjetoeinicializa
        Scanner sc = new Scanner(System.in);
        // lee una cadena
        String miCadena = sc.nextLine();//<--- Esto es lo que lee la cadena
        // Imprime la cadena leida
        System.out.println(miCadena);

        String a = "Hola";
        String b = "hola";
        String c = "HOLA";
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c));//IgnoreCase - Salta si son
        // o no son mayusculas

         */
        //------------------------------------------------------------------
        /*
        
        // Declararelobjetoeinicializa
        Scanner sc2 = new Scanner(System.in);
        // leecadena1
        System.out.println("Digite una cadena: ");
        String miCadena1 = sc2.nextLine();
        // leecadena2
        System.out.println("Digite otra cadena: ");
        String miCadena2 = sc2.nextLine();
        // Imprimetrueofalse
        System.out.println(miCadena1.equals(miCadena2));

        String a = "hola Jorge"+" "+"Todo bien?";
        String b = "hola";
        System.out.println(a.contains(b));
        System.out.println(a.concat(b));
        
         */
        //--------------------------------------------------------------
        
        /*
        String s = "Programar es genial!";

        System.out.println(s.length());
        System.out.println(s.charAt(10));//solo extrae UN caracter, el que yo 
        //le indique en la posicion dada

        System.out.println(s.substring(10, s.length()));

        String notas = "4.5,4.0,4;4,3.6,4.0,3.2";
        String separadas[] = notas.split(",");
        for (String n : separadas) {
            System.out.println(n);
        }
        */
        //----------------------------------------------------------------
        /*
        
        Scanner sc3 = new Scanner(System.in);
        String s2 = sc3.nextLine();
        String[] line = s2.split("&");//Array - Arreglo - Vector
        String nombre = line[0];
        int edad = Integer.parseInt(line[1]);
        double estatura = Double.parseDouble(line[2]);
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("estatura: " + estatura + "m");
        
        System.out.println();

        */
        
        
        /***
         * Elabore un programa que dada una cadena diga si todos los simbolos
         * de la cadena son letras.
         */

        Scanner tec= new Scanner(System.in);
        System.out.println("Digite una cadena:");
        String cadena=tec.nextLine();
        int bandera=0;
        String filtro[]={"1","2","3","4","5","6","7","8","9","0",
            "#",".",",",";","?"," ","-"};
        
        for(int i=0;i<filtro.length;i++){
            if(cadena.contains(filtro[i])){
            bandera++;
            }
        
        }
        if(bandera==0){
            System.out.println("La cadena SOLO tiene letras");
        }
        else {
            System.out.println("La cadena SI tiene otros caracteres que no son letras");
            System.out.println("Bandera="+bandera);
        }
        
        // L E T R A
        // 0 1 2 3 4
        // A R T E L
        
        char letrassolas[]=cadena.toCharArray();
        System.out.println(letrassolas.length);//mostrar el tamaño
        String invertido="";
        for(int x=letrassolas.length-1; x>=0 ; x--){
        invertido=invertido+letrassolas[x];
        }
        
        System.out.println("la palabra '" + cadena + "' invertida queda: '"
                + invertido + "'");
    }

}
