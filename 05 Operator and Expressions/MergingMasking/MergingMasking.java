package MergingMasking;

public class MergingMasking {
    public static void main(String[] args) {
        byte a = 9, b = 12;
        //9 =  0b00001001
        //12 = 0b00001100
        byte c ;

        c = (byte)(a<<4);
        c = (byte) (c | b);

        // c = 0b1001 1100
            // 0b1111 0000
        System.out.println((c&0b11110000)>>4); //9
        System.out.println((c & 0b00001111)); 
        System.out.println(String.format("%s", Integer.toBinaryString(c)));
    }
}
