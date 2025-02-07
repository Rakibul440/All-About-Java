/* Copying an Array
 * Reverse Copying an Array
 * Increasing size of Array
 */
public class CopyArray {
    public static void main(String[] args) {
        int A[] = {5,9,6,10,12,7,3,5,4,2};
        int sixeOfA = A.length;
        int B[] = new int[sixeOfA];

        System.out.println("Array B before copy element from A : ");
        for(int x : B){
            System.out.print(x + "\t");
        }
        System.out.println("");

        // Copying an Array
        for(int i = 0; i <sixeOfA ; i++){
            B[i] = A[i];
        }

        System.out.println("Array B : ");
        for(int x : B){
            System.out.print(x + "\t");
        }
        System.out.println("");

        // Reversing Copying an Array
        for(int i = sixeOfA - 1 , j = 0; i >= 0 && j < sixeOfA ; i-- , j++){
            B[j] = A[i]; 
        }

        System.out.println("Array B after reverse copying : ");
        for(int x : B){
            System.out.print(x + "\t");
        }
        System.out.println("");

        //Increasing Size of Array
        int C[] = new int[2*A.length];
        for(int i = 0; i < A.length ; i++){
            C[i] = A[i];
        }
        A = C; 
        C = null;

        System.out.println("Array C : ");
        System.out.println("");
        for(int i = 0; i < A.length ; i++){
            System.out.print(A[i]+"\t");
        }

    }
}
