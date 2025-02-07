public class OneD_Array {
    public static void main(String[] args) {

        int myArray[] = new int[5]; 

        myArray[0] = 10;
        myArray[1] = 20;

        int myArray_2[] = {1,2,3,5,6,4};

        for(int value : myArray){
            System.out.print(value + "\t");
        }
        System.out.println("");
        for(int value : myArray_2){
            System.out.print(value + "\t");
        }
    }
}
