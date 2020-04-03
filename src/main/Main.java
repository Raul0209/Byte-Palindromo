/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;

/**
 *
 * @author byrau
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        
        
        System.out.println("Ingrese una palabra");
        System.out.println("");
        String palabra = reader.nextLine();
        StringBuilder cadena = new StringBuilder(palabra);
        String volteado = cadena.reverse().toString();
        System.out.println(volteado);
        
        if(volteado.equals(palabra) ){
            System.out.println("La palabra es un palindromo");
        }else {
        
            System.out.println("La palabra no es un palindromo");}
                        
       
    }
    
}
