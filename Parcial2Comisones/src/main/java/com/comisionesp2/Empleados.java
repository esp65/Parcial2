/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.comisionesp2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Empleados {
    private static final Scanner scanner= new Scanner(System.in);
    private static int opcion = -1;
  
   
   
    
    
    public static void main(String[] args){
               //Mientras la opcion elegida sea 0, preguntamos al usuario
        while (opcion != 0) {
            try {
                System.out.println("Prodria elegir una opcion: :"
                        + "\n1.- Muestra todo"
                        + "\n2.- Modificar  \n"
                        + "3.- Consulto NIV \n"
                        + "4.- Lista  \n"
                        + "5.- Eliminemos \n"
                        + "6.- Actualizar nombre\n"
                        + "0.- Salir");

                opcion = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch (opcion) {
                    case 1:
                        Principal.ej1();
                        break;
                   
                    case 2:
                        System.out.println("ingresa el NIV para actualizar el nombre:");
                        int idd = Integer.parseInt(scanner.nextLine());
                      if(idd !=0)
                          {
                          System.out.println("ingresa las ventas del mes de enero");
                        int ms1 = Integer.parseInt(scanner.nextLine());
                         System.out.println("ingresa las ventas del mes de febrero");
                        int ms2 = Integer.parseInt(scanner.nextLine());
                         System.out.println("ingresa las ventas del mes de marzo");
                         int ms3 = Integer.parseInt(scanner.nextLine());
                         System.out.println("ingresa las ventas del mes de abril");
                         int ms4 = Integer.parseInt(scanner.nextLine());
                         System.out.println("ingresa las ventas del mes de mayo");
                         int ms5 = Integer.parseInt(scanner.nextLine());
                         System.out.println("ingresa las ventas del mes de junio");
                         int ms6 = Integer.parseInt(scanner.nextLine());
                         Principal.meses(idd,ms1,ms2,ms3,ms4,ms5,ms6);
                          }
                        break;
                        
                    case 3:
                        System.out.println("ingresa el NIV del vendedor");
                        int niv = Integer.parseInt(scanner.nextLine());
                       Principal.niv(niv);
                        break;
                        case 4:
                            Principal.empleados();
                    Principal.total_meses();
                        break;
                        
                         case 5:
                    System.out.println("ingresa el NIV para borrar:");
                        int in = Integer.parseInt(scanner.nextLine());
                       Principal.eliminar_Datos(in);
                        System.out.println("precione 1 para borrar y 2 para cancelar");
                       int k = Integer.parseInt(scanner.nextLine());
                       if (k != 1)
                       { 
                          
                       
                        System.out.println("Borro el NIV ingresado");
                       }
                       
                        break;
                        
                        case 6:
                    System.out.println("ingresa el NIV para actualizar el nombre:");
                        int ñ = Integer.parseInt(scanner.nextLine());
                         System.out.println("ingrese el nuevo nombre");
                         String s = scanner.nextLine();
                       Principal.Datos(ñ,s);
                       
                        break;
                    case 0:
                        System.out.println("!Fin!");
                        break;
                    default:
                        System.out.println("No lo acepto");
                        break;
                }
                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Tuvimos error!");
            }
        }

    }
    
}
