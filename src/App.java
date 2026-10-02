import java.util.Random;
import java.util.Scanner;  

public class App {
    public static void main(String[] args) throws Exception {
        int [] oikeat_numerot = new int[7];
        int [] kayttajan_syotto = new int [7];
         Scanner in = new Scanner(System.in);
		int num1=0;
        int randomNumber;

        //Generate 7 random numbers
        for (int i =0; i<7; i++)
        {
            
        Random random = new Random(); 
        randomNumber = random.nextInt(5)+1;
        oikeat_numerot [i]= randomNumber;
        }

        System.out.println("Yritä muistaa alla olevat numerot. Näet numerot 3 sekunnin ajan.");
        
        for (int j =0; j<7; j++){

             System.out.print(oikeat_numerot[j] + " ");

        }


        // after 3s the numbers will be hidden
         System.out.println("(3 sekunnin jälkeen ruutu tyhjennetään)");
        try {
                Thread.sleep(3000);
                
            }
            catch(InterruptedException ex)  
            { 
   Thread.currentThread().interrupt(); 
            } 
            

        
        //ruudun tyhennys
            
        for (int k=0; k<20; k++)
        {
            
            System.out.println();
           
        }


        //user will input 7 numbers
   
        for (int i =0; i<7; i++)
        {

        System.out.println("Syötä " + (i+1) + " .numero:");
        num1 = in.nextInt();
        kayttajan_syotto [i]= num1;

        }


        
         System.out.print("Oikeat numerot: ");

        for (int j =0; j<7; j++){

             System.out.print(+ oikeat_numerot[j] + " ");

        }
        



        System.out.print("\nSinun numerosi: ");
             for (int j =0; j<7; j++){

             System.out.print(+ kayttajan_syotto[j] +  " ");

        }

        int count =0;
           for (int i=0; i<7; i++)
        {
            if (kayttajan_syotto[i]!= oikeat_numerot[i])
                {count=count+1;
                }

        }

        System.out.println("\n\n " + count + " numeroa oli väärin.");

          double prosenttia = (count / 7.0) * 100;

       System.out.printf("\n%.1f%% oli väärin%n", prosenttia);

       
    }
}
