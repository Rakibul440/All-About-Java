/* Overload method to reverse a int or an array
 * Overload method to validate name and age
 */
public class MethodOverLoad {
    //reverse a number digit
    static int reverse(int num){
        int number = num;
        int reverseNum = 0;
        int count = 0;
        while(num>0){
            int reminder = num % 10;
            num /= 10;
            count++ ;
        }
       
        while(number > 0 && count > 0){
            int reminder = number % 10;
            number /= 10;
            int powOf10 = 1;
            for(int i = count - 1 ; i > 0 ; i--){
                powOf10 = (powOf10 * 10);
            }
            count--;
            reverseNum += (reminder * powOf10);
        }
        
        return reverseNum;
    }

    //reverse an array
    static int[] reverse(int A[]){
        int B[] = new int[A.length];
        for(int i = 0,j=A.length-1; i < A.length && j >= 0 ; i++,j--){
            B[i] = A[j];
        }

        A = B;
        B = null;
        return A;
    }

    // validate name
    static boolean validate(String name){
        if(name.matches("[A-Za-z]*")){
            return true;
        }
        return false;
    }

    //validate name
    static boolean validate(int age){
        if(age > 3 && age <= 15){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        /* --------------Reversing------------ */

        int number = 7_02_2005;
        int A[] = {21,10,2002,156};
        
        System.out.println("Before reversing digits : "+number);
        number = reverse(number);
        System.out.println("After reversing digits : "+number);

        System.out.println("Before reversing Array elements : ");
        for (int x : A) {
            System.out.print(x + "\t");
        }
        System.out.println("");

       

        System.out.println("After reversing Array elements : ");
        for (int x :  reverse(A)) {
            System.out.print(x + "\t");
        }
        System.out.println("");

        //------validate name and Age-------------
        String name = "BacchaMeye";
        int age = 10;
        boolean isNameValid = validate(name);
        boolean isAgeValid = validate(age);
        System.out.println("you've enter valid name : "+isNameValid);
        System.out.println("You can go to school in this age : " + isAgeValid);

    }
}
