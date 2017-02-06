/**
 *
 * @author tut-exam Riku Ketonen, 254700
 */

import java.util.Scanner;


public class NumeroAly {
   
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner lukija1 = new Scanner(System.in);
        int x;
        int y;
        
        System.out.print("Anna pelin yläraja: ");
        x = Integer.parseInt(lukija1.nextLine());
        
        System.out.print("Anna pelin alaraja: ");
        y = Integer.parseInt(lukija1.nextLine());
        
        numeroPeli(x,y);
        
    }
    
    public static void numeroPeli(int yla, int ala){
    
        Scanner lukija = new Scanner(System.in);
        double ylaraja = yla;
        double alaraja = ala;
        double keskiarvo = Math.ceil((ylaraja+alaraja)/2);
        String vastaus;

        System.out.println("Ajattele jotain lukua väliltä "+(int)alaraja+".."+(int)ylaraja);
        System.out.println("Vastaa kirjoittamalla k tai e.");  
        
            
        while (!(alaraja == ylaraja)){
            System.out.print("Onko lukusi pienempi kuin "+(int)keskiarvo+"? ");
            vastaus = lukija.nextLine();
            
            if ("k".equals(vastaus)){
                ylaraja = keskiarvo;
            }
            if ("e".equals(vastaus)){
                alaraja = keskiarvo;
            }
            
            if (keskiarvo == Math.ceil((ylaraja+alaraja)/2)){
                keskiarvo = keskiarvo-1;
            }else{
                keskiarvo = Math.ceil((ylaraja+alaraja)/2);
            }
            if (alaraja == keskiarvo){
                break;
            }           
        }
        
        System.out.println("Lukusi on: "+(int)alaraja);
        
    }
    
}
