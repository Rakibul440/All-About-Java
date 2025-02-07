/* Rotating an Array
 * Inserting an Element
 * Deleting an Element
 */
public class RotationArray {
    public static void main(String[] args) {
        int A[] = {5,9,6,10,12,7,3,5,4,2};

        System.out.println("Original Array : ");
        for(int x : A){
            System.out.print(x + "\t");
        }
        System.out.println("");

        //Left rotating
        int temp = A[0];
        for(int i = 1; i<A.length; i++){
            A[i-1] = A[i];
        }

        A[A.length - 1] = temp;

        System.out.println("After left rotation by one element :-");
        for(int x : A){
            System.out.print(x + "\t");
        }
        System.out.println("");

        //Right rotating
        int rightTemp = A[A.length-1];
        for(int i =  A.length - 1 ; i >=1 ; i--){
            A[i] = A[i-1];
        }

        A[0] = rightTemp;

        System.out.println("After Right rotation by one element :-");
        for(int x : A){
            System.out.print(x + "\t");
        }
        System.out.println("");
    }
}
