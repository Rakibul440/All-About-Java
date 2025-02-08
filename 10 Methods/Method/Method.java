
public class Method {
    //A static method for finding Max of two number
    static int max(int x , int y){
        if(x>y){
            return x;
        }
        return y;
    }
    //non-static method for min value
    int min(int x , int y){
        if(x<y){
            return x;
        }
        return y;
    }
    // Passing object as parameters
    static void UpdateMyArray(int A[]){
        A[0] = 25;
    }

    // Return type - object (String)

    static String username(String email){
        String user = email.substring(0, email.indexOf("@"));
        return user;
    }

    public static void main(String arg[]){
        int a = 10 , b = 15;
        int c = max(a,b);

        System.out.println("Max is : " + c);

        //for calling non-static method from a static method 
        //we have to create a object of that non static method

        Method obj = new Method();
        int minValue = obj.min(a, b);

        System.out.println("Min is : " + minValue);

        //Passing object as parameters
        int A[] = {1,2,3,6,4,5};
        UpdateMyArray(A); // Passing A's referance 

        for(int x : A){
            System.out.print( x + "\t");
        }
        System.out.println("");

        //Finding User name
        String email = "Baccha@gmail.com";
        String username = username(email);
        System.out.println("Your username : "+ username);
    }
}