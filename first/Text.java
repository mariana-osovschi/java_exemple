

package text;

import java.util.Scanner;


public class Text {
   

    
    public static void main(String[] args) {
    Scanner intr = new Scanner (System.in);
    System.out.println("Introduceti propozitia :");
    String text = intr.nextLine();
   
    System.out.println("Introduceti caracterul cu care se inlocueste :");
    String cr = intr.next();
    System.out.println("Introduceti indicele care trebiue inlocuit :");
    int poz = intr.nextInt();
     poz = poz-1;
     System.out.println("Rezultatul va fi  : " );
   String[] cuvinte;
        cuvinte = text.split(" ");
    for(String word : cuvinte){
   
// int lun = word.length();
 if (poz < word.length() ){
     
     StringBuffer  wordnew = new StringBuffer(word);
     wordnew = wordnew.replace(poz, poz, cr);
     
     System.out.print("  " + wordnew);
 } 
 else {
     System.out.print("  " + word);
 }
    }
     }
     }
    
