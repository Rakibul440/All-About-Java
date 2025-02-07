/* Adding 2 Matrices
 * Multiplying 2 Matrices
 */
public class Matrix {
    public static void main(String[] args) {
        int A[][] = {
            {3,5,9},
            {7,6,2},
            {4,3,5}
        };
        int B[][] = {
            {1,5,2},
            {6,8,4},
            {3,9,7}
        };

        // Adding Matrices
        int C[][] = new int[3][3];

        for(int i = 0 ; i < A.length ; i++){
            for(int j = 0 ; j < A[i].length ; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Array C : ");
        for(int i = 0 ; i < A.length ; i++){
            for(int j = 0 ; j < A[i].length ; j++){
                System.out.print(C[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");

        // Multiplying Matrices
        int D[][] = new int[3][3];


        for(int i = 0 ; i < A.length ; i++){
            for(int j = 0 ; j < A[i].length ; j++){
                D[i][j] = 0;
                for(int k = 0; k < 3 ; k++){
                    D[i][j] +=  (A[i][k] * B[k][j]);
                }

            }
        }


        System.out.println("Array D : ");
        for(int i = 0 ; i < A.length ; i++){
            for(int j = 0 ; j < A[i].length ; j++){
                System.out.print(D[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }    
}
