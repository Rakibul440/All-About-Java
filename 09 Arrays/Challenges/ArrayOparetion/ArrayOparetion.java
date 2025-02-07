/* Finding Sum of all elements
 * Searching an Element
 * Finding Maximum Element
 * Finding Second largest Elements
 */
public class ArrayOparetion {
    public static void main(String[] args) {
        int A[] = {3,9,7,8,12,6,15,5,4,10};

        //Finding sum of all elements
        int sum = 0;
        for(int value : A){
            sum += value;
        }
        System.out.println("Sum of all elements is : " + sum);

        //Searching an elements (ex:12)
        boolean isElementFound = false;
        for(int value : A){
            if(value == 12){
                isElementFound = true;
                // System.exit(0);
            }
        }
        if(isElementFound){
            System.out.println("Element found!");
        }else{
            System.out.println("Element not found!");
        }

        //Find Largest Element
        int largest = A[0];
        for(int value : A){
            if(value > largest){
                largest = value;
            }
        }
        System.out.println("Largest element is : "+largest);

        //Finding Second Larges
        int secondLarg = 0;
        for(int value : A){
            if(value < largest && value > secondLarg){
                secondLarg = value;
            }
        }
        System.out.println("Second largest element is : "+secondLarg);
    }
}
