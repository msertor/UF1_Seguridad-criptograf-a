
package uf1_seguridad.criptografía;

import java.util.Scanner;


public class UF1_SeguridadCriptografía {
    
    
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        String texto;
        String cifrado;
        int opcion=0;
        System.out.println("Bienvenido al programa de cifrado y descifrado.");
        while (opcion!=3){
        System.out.println("¿Qué desea hacer?\n"
                + "1. Cifrar\n"
                + "2. Descrifrar\n"
                + "3. Salir");
        opcion = Integer.parseInt(s.nextLine());
        
        switch(opcion){
            case 1: System.out.println("Introduzca el texto a cifrar:");
            texto = s.nextLine();
            char array[] = texto.toCharArray();
		for(int i = 0; i< array.length;i++)
		{
			array[i] = (char)(array[i]+(char)5);
		}
		cifrado = String.valueOf(array);
               
                System.out.println("Su texto cifrado es: " + cifrado);
                    break;
            case 2: System.out.println("Introduzca el código a descifrar:");
            cifrado = s.nextLine();
            char arrayD[] = cifrado.toCharArray();
                for(int i = 0; i< arrayD.length;i++)
		{
			arrayD[i] = (char)(arrayD[i]-(char)5);
		}
		texto = String.valueOf(arrayD);
                System.out.println("Su texto descifrado es: " + texto);
                    break;
            case 3: System.out.println("¡Hasta la próxima!");
                    break;
            default: System.out.println("Esta no está disponible. Indique 1 para cifrar o 2 para descrifrar.");        
        }
  
    }

    }
}
