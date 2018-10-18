/*
 * Gavin Scott
to do numbers to various powers and to practice while and for loops
Some thursday in October 2018
 */


package loopdielooppowers;

/**
 *
 * @author gasco1246
 */

import java.util.Scanner;
public class LoopdieLoopPowers {

    /**
     * @param args the command line arguments
     */
    
    
    
    
    
    public static void main(String[] args) {
        //variable declaration
        double num = 0,numNew = 0, pow = 0;
        int choice;
        Scanner keyInput = new Scanner(System.in);
        boolean cont = true;
        while(cont == true){
            //prompt for function
            System.out.println("Type 1 to calculate the square of any number");
            System.out.println("Type 2 to calculate the cube of any number");
            System.out.println("Type 3 to calculate any power of any number");
            System.out.println("Type 4 to exit this program");
            
            //set choice
            choice =  keyInput.nextInt();
            
            //actions for each choice
            switch(choice){
                case 1:
                    System.out.println("What is the number?");
                    num = keyInput.nextDouble();
                    num = num*num;
                    System.out.println("Answer : "+num);
                    break;
                case 2:
                    System.out.println("What is the number?");
                    num = keyInput.nextDouble();
                    numNew = num;
                    for(int i = 1; i <= 3; i++){
                        numNew = numNew*num;
                    }
                    System.out.println("Answer : "+numNew); 
                    break;
                case 3:
                    System.out.println("What is the number?");
                    num = keyInput.nextDouble();
                    numNew = num;
                    System.out.println("To what power?");
                    pow = keyInput.nextDouble();
                    
                    for(int i = 1; i <= pow-1; i++){
                        numNew = numNew*num;
                    }
                    System.out.println("Answer : "+numNew); 
                    break;
                case 4:
                    cont = false;//end program
                    break;
                
            }
            
        }
        
    }
    
}
