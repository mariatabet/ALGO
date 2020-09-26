package EXO26092020;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {

     Scanner clavier = new Scanner(System.in);
     System.out.println("entrer la valeur de la borne inférieur");
        int a = clavier.nextInt();
        System.out.println("entrer la valeur de la borne supérieur");
        int b = clavier.nextInt();

        System.out.println("[ a = " + a + " , b =" + b + "]");



        int somme=0;
        for (int i = a; i <= b; i++) {
            somme = somme + i;
        }
        System.out.println("la somme est : "+somme);

        clavier.close();

      /*  Scanner clavier = new Scanner(System.in);

        System.out.print("Saisir votre age : ");
        age = clavier.nextInt();


        // fermer les ressources
        clavier.close();*/

    }

}
