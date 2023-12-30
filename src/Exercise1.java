import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {

    /* Exercise 1 */

    /* Calculatrice de pourboire
    * qui prend en entrée un montant (float)
    * effectue une operation d'un pourboire
    * et redonne en sortie un montant (float)
    * */


    /**
     * @param montant
     * @return montant
     */
   static float calculerPourboire(float montant) {
        montant += montant * 15/100;

        return montant;
    }
    static float calculerPourboire(float montant, float pourcentage) {
        montant += montant * pourcentage/100;

        return montant;
    }



    static int menuPrincipale(){
        int a = 0;
        Scanner sc = new Scanner(System.in);
       do {
           System.out.println("Bienvenue sur notre application pour donner du pourboire");
           System.out.println("\n 1. Taper le montant en applicant la taxe de base  \n 2. Choisir cet option pour rentrer un pourboire personel \n 3. Quitter");
           try {
               a = sc.nextInt();
           } catch (InputMismatchException e) {
               System.out.println("Veuillez saisir un nombre valide.");
               sc.next();
               a = 0;
           }
       }while ((a<1) || (a>3));

       return  a ;
    }

    public static void main(String[] args) {
      int a = menuPrincipale();

       var resulat = switch(a){
            case 1  -> calculerPourboire(100);
            case 2 -> calculerPourboire(100,10);
           default -> 1234;
       };

     System.out.println(calculerPourboire(100));
        System.out.println(calculerPourboire(100,10));
    }


}
