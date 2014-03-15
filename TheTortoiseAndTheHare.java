//A race between a tortoise and a hare 
//Learning how to use Random

import java.util.Random;
public class TheTortoiseAndTheHare {
    public static void main(String[] args)
     {
         Random randomNumbers = new Random();
         int i,j,H=1,T=1;
         int TotalT=1 , TotalH=1;
         System.out.println("Hare and Tortoise is at position 1");
         System.out.println("BANG!!!!\n AND THEY'RE OFF!!!!\n");
     
        for(j=1;j<100;j++) 
        {
          i = 1+randomNumbers.nextInt(10);
          System.out.printf(" Random Number = %d\n\n", i);
          
          switch(i){
              case 1: case 2:
                  T+=3;
                  H=1;
                  System.out.printf("T = %d and H = %d\n", T,H);
                  break;
              case 3: case 4:
                  T+=3;
                  H+=9;
                  System.out.printf("T = %d and H = %d\n", T,H);
                  break;
              case 5:
                  T+=3;
                  H-=12;
                  System.out.printf("T = %d and H = %d\n", T,H);
                  break;
              case 6: case7:
                  T-=6;
                  H+=1;
                  System.out.printf("T = %d and H = %d\n", T,H);
                  break;
              case 8:
                  T+=1;
                  H+=1;
                  System.out.printf("T = %d and H = %d\n", T,H);
                  break;
              case 9: case 10:
                  T+=1;
                  H-=2;
                  System.out.printf("T = %d and H = %d\n", T,H);
                  break;                 
              default:
                  System.out.printf("T = 1 and H = 1", T,H);
          }  
          
           if (T<=0){
               T=1;
               System.out.printf("But the real T is \n T=%d\n",T);
             }
           else if( H<=0){
               H=1;    
               System.out.printf("But the real H is \n H = %d\n",H);
             } 
           TotalT += T;
           TotalH += H;
           if(T>70 || H>70) 
               break;
          }
    
          System.out.printf("\nThe total for the Tortoise is %d \nand that for hare %d\n\n", T,H);
                   
         if (T == H)
             System.out.println("\nOUCH!!!\n Tortoise bites Hare\n\n");
         else if (H >=70 && T >=70)
            System.out.println("\n\nIt's a TIE!!!!\n\n");
         else if (T >70)
             System.out.println("\nYeeeh!!! TORTOISE WINS\n");
         else if (H>70)
             System.out.println("\nYUCH!! hare wins\nHare: I told you guys, this was just joke,it was no race atall.\n I was even sleep walking not running.IDIOTS \n\n");
        
     }        
}

