import java.util.*;


public class calculator {
    public static void main (String[]args){
        
        Scanner h=new Scanner(System.in);
         
        System.out.println("press 1 for ADD");
        System.out.println("press 2 for SUBTRACT");
        System.out.println("press 3 for MULTIPLY");
        System.out.println("press 4 for DIVIDE");
          
        System.out.println("Enter your choice");
           int choice=h.nextInt();
          
        System.out.println("Enter 1st no");
          float a=h.nextInt();
          
        System.out.println("Enter 2nd no");
          float b=h.nextInt();
        
          
          switch(choice){
             
     case 1:      System.out.println("ADD");
                  System.out.println("Total="+(a+b));
        break;
                  
                  
     case 2:      System.out.println("SUB");
                  System.out.println("Total="+(a-b));
        break;
                  
                  
     case 3:      System.out.println("MUL");
                  System.out.println("Total="+(a*b));
        break;
                  
                  
     case 4:      System.out.println("DIV");
                  System.out.println("Total="+(a/b));
        break;
        
          }
    }
}

