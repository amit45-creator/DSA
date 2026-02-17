import java.util.*;
public class Pattern19 {
    

public static void pattern19(int N) {
      // for the upper half of the pattern.
      
      // initial spaces.
      int iniS = 0;
      for(int i=0;i< N;i++){
          
          //for printing the stars in the row.
          for(int j=1;j<=N-i;j++){
              System.out.print("*");
          }
          
          //for printing the spaces in the row.
          for(int j=0;j<iniS;j++){
              System.out.print(" ");
          }
          
          //for printing the stars in the row.
          for(int j=1;j<=N-i;j++){
              System.out.print("*");
          }
          
          // The spaces increase by 2 every time we hit a new row.
          iniS+=2;
          
          // As soon as the letters for each iteration are printed, we move to the
          // next row and give a line break otherwise all letters
          // would get printed in 1 line.
          System.out.println();
      }
      
      // for lower half of the pattern
      
      // initial spaces.
      iniS = 2*N -2;
      for(int i=1;i<=N;i++){
          
          //for printing the stars in the row.
          for(int j=1;j<=i;j++){
              System.out.print("*");
          }
          
          //for printing the spaces in the row.
          for(int j=0;j<iniS;j++){
              System.out.print(" ");
          }
          
          //for printing the stars in the row.
          for(int j=1;j<=i;j++){
              System.out.print("*");
          }
          
          // The spaces decrease by 2 every time we hit a new row.
          iniS-=2;
          
          // As soon as the letters for each iteration are printed, we move to the
          // next row and give a line break otherwise all letters
          // would get printed in 1 line.
          System.out.println();
      }
   



}



public static void main(String[]args){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int N=sc.nextInt();
    pattern19(N);
    sc.close();
}}
