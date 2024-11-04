package Chat;

import java.util.Scanner;
import java.util.Random;

    
public class App {
    public static void main(String[] args)  {
        int[] Coloction = new int[789];
    
        System.out.println(Coloction[1]);
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("Hello Family, ");
            System.out.println("You are new user ? Y/n");
            String y_n = scan.nextLine();
            
            


            if(y_n.equals("y")|| y_n.equals("Y")||y_n.equals("Yes")){
                
                System.out.println("Sure. I generate a new key for you...");
                int number = rnd.nextInt(1000);
                Coloction[number] = number;

                
            
                
                System.out.println("idea! is you User Key: " + Coloction[number] +"\n");
                

            }
            while (true) {
                while (true) {
                    System.out.println("Good! Wtire you key ");
                int num = scan.nextInt();

                if(Coloction[num] !=0){
                    System.out.println("Good! I identified your key ");
                    System.out.println("EnD (f)");
                
                
                }















                if(Coloction[num] ==0){
                    System.out.println("Sorry :( i not found your key\nTry again");
                    break;
                }
                }
                
            }
            
            
           




        }     
        
        
    }
    
    
}
