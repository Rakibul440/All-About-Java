/* Maximum of numbers using varargs
 * Sum of all elements using varargs
 * Calculate Discount using varargs
 */
public class VariableArguments {
    // Max number 
    static int max(int ...number){
        int max = number[0];
        for(int i = 0; i < number.length ;i++){
            if(number[i] > max){
                max = number[i];
            }
        }
        return max;
    }

    // Sum of all number
    static int sum(int ...number){
        int sum = 0;
        for(int i = 0; i < number.length ;i++){
            sum += number[i];
        }
        return sum;
    }

    //Discounts
    static double discounts(int discounts , double ...price){
        int totalPrice = 0;
        for(int i = 0; i < price.length ;i++){
            totalPrice += price[i];
        }
        int totalAmount = (totalPrice - ((totalPrice * discounts)/100));

        return totalAmount;
    }
    public static void main(String[] args) {

        System.out.println("Lets find maximum number : ");
        int maxNum = max(10,5,3,4,78);
        System.out.println("Maximum number is : " + maxNum);

        System.out.println("Lets find sum of all numbers : ");
        int sum = sum(10,5,3,4,78);
        System.out.println("Sum of all numbers is : " + sum);

        System.out.println("Lets find discounts : ");
        double price = discounts(10,10,5,3,4,78);
        System.out.println("After discount coustomar's total price : " + price);
    }
}
