import java.util.Scanner;

public class DisplayNumberInWords {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter any positive number : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();
        
        String numberInWords = "" ;

        while (number>0) {
            int reminder = number % 10;
            number /= 10;
            switch(reminder){
                case 1 : 
                    numberInWords = "One " + numberInWords;
                    break;
                case 2 : 
                    numberInWords = "Two " + numberInWords;
                    break;
                case 3 : 
                    numberInWords = "Three " + numberInWords;
                    break;
                case 4 : 
                    numberInWords = "Four " + numberInWords;
                    break;
                case 5 : 
                    numberInWords = "Five " + numberInWords;
                    break;
                case 6 : 
                    numberInWords = "Six " + numberInWords;
                    break;
                case 7 : 
                    numberInWords = "Seven " + numberInWords;
                    break;
                case 8 : 
                    numberInWords = "Eight " + numberInWords;
                    break;
                case 9 : 
                    numberInWords = "Nine " + numberInWords;
                    break;
                case 0 : 
                    numberInWords = "Zero " + numberInWords;
                    break;
            }
        }

        System.out.println(numberInWords);
    }    
}
