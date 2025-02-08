
public class Recursion {
    static void print(int number){
        if(number>0){
            System.out.println(number);
            print(number - 1);
        }
    }
    static int sum(int number){

        if(number ==0){
            return 0;
        }

        return number += sum(number-1);
    }
    public static void main(String[] args) {
        print(5);

        System.out.println(sum(100));
    }
}
