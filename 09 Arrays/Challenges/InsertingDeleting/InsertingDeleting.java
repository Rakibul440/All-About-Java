/* Inserting and Deleting Element */
public class InsertingDeleting {
    public static void main(String[] args) {
        int A[] = new int[10];
        A[0] = 5;
        A[1] = 9;
        A[2] = 6;
        A[3] = 10;
        A[4] = 12;
        A[5] = 7;

        System.out.println("Original Array : ");
        for(int x : A){
            System.out.print(x + "\t");
        }
        System.out.println("");

        int totalElement = 6;
        //Insering  69 at index 3;
        for(int i = totalElement; i>3; i--){
            A[i] = A[i-1];
        }

        A[3] = 69;
        totalElement++;

        System.out.println("After Inserting 69, Array : ");
        for(int x : A){
            System.out.print(x + "\t");
        }
        System.out.println("");

        //Deleting 6 at index 2;
        int index = 2;
        for(int i = index ; i < totalElement ; i++){
            A[i] = A[i+1];
        }

        System.out.println("After Deleting 5, Array : ");
        for(int x : A){
            System.out.print(x + "\t");
        }
        System.out.println("");

    }
}
