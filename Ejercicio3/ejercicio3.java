//Primer ejercicio
package Ejercicio3;

import java.util.Scanner;

public class ejercicio3 {
        public static void name(String[]args) {
            Scanner entrada = new Scanner(System.in);      
            int sumaresultados,numero1, numero2, numero3;

            System.out.print("Digite numero: ");
            numero1 = entrada.nextInt();

            System.out.print("Digite numero: ");
            numero2 = entrada.nextInt();

            System.out.print("Digite numero: ");
            numero3 = entrada.nextInt();
            sumaresultados = suma (numero1, numero2, numero3);
            System.out.println(sumaresultados);


            //ejercicio3 COCHE
            Coche miCoche = new Coche();
             miCoche.AgregarPuerta();
            System.out.println(miCoche.puerta);


        }






        public static int suma(int numero1, int numero2, int numero3){
            return numero1 + numero2 + numero3;
            
        }


}

class Coche {
        
    int puerta = 2;
    public void AgregarPuerta() {
        this.puerta ++;
    }
}