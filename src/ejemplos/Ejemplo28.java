/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author steve
 */
public class Ejemplo28 {
   public static void main(String[] args) {
        // TODO code application logic here
     Scanner reader = new Scanner(System.in);   
int numero = 0; 
System.out.println("Introduce el primer número:");			
numero = reader.nextInt();
if(numero >=28){
System.out.println("Usted a ganado el curso con: "+numero);
}else{System.out.println("Usted reprobo con: "+numero);}
   }
   
}