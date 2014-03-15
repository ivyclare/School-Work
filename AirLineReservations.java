import java.util.Scanner;
import java.util.Arrays;
public class AirLineReservations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i,j=1,h=6;
       for(i=1; i<=10; i++)
        {
          System.out.println("\nChoose 1 for FIRSTCLASS and 2 for ECONOMY\n");
          int number = input.nextInt();
          if (number == 1 ){
               firstClass(j);
                    ++j;
          }
        
          else if (number == 2){
                economy(h);
                   ++h;                
              }
          else
          {
              System.out.println("PLEASE, READ THE INSTRUCTIONS!!\n");
         }         
       }
    }
    
    
public static void firstClass(int a)
{    
      Scanner input = new Scanner(System.in);
    boolean[] firstClass = new boolean [10];
     firstClass[a] = false;
    if(a <= 5 && firstClass[a] != true)
       {
         firstClass[a] = true ;
         System.out.printf("You have been assigned seat %d in the first class section\n",a);
         a++;
        }
    else if (firstClass[a] = true ){
           System.out.println("FIRST CLASS is full\n Can you be assigned a seat in the ECONOMY?");
           System.out.println("\nEnter Yes or No");
           String answer = input.nextLine();
              switch (answer){
               case "Yes":
                   economy(a);
                   a++;
                break;
               case "No":
                System.out.println("SORRYYY!! \n Next flight leaves in 3hrs\n");
                break;                              
               }
         }
}



public static void economy(int a)
{
    Scanner input = new Scanner(System.in);   
    boolean[] economy = new boolean [16];
    if(a > 5 && a<=10 && economy[a] != true)
       {
         economy[a] = true ;
         System.out.printf("You have been assigned seat %d in the economy section\n",a);
         a++;
        }
     else if(economy[a] = true ){
              System.out.println("ECONOMY is full\n Can you be assigned a seat in the FIRST CLASS?");
              System.out.println("\nEnter Yes or No");
              String answer = input.nextLine();
              switch (answer){
               case "Yes":
                   firstClass(a);
                   a++;
                break;
               case "No":
                System.out.println("SORRYYY!! \nNext flight leaves in 3hrs\n");
                break;                              
               }
       }
   }
}
