import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {
        int A[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements");
        for(int i = 0; i < A.length ; i++){
            for(int j = 0; j < A[i].length ; j++){
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your 2-D Array is :- ");
        for(int X[] : A){
            for(int value : X){
                System.out.print(value + "\t");
            }
            System.out.println("");
        }

        sc.close();

        // Jagged Array (Array of different size of rows)

        int C[][] = new int[3][];
        C[0] = new int[4]; // first row size four
        C[1] = new int[3] ; // Second row size three
        C[2] = new int[2]; // third row size two

        // Example
        
        int D[][] = 
        {
            {1,2,3,4},
            {1,2,3},
            {1,2}
        };

        

    }
}
