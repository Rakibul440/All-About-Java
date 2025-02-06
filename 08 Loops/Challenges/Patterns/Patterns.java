
public class Patterns {
    public static void main(String[] args) {
        //Patterns 1
        for(int i = 1; i <= 5 ; i++){
            for(int j = 1 ; j <= 5 ; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        System.out.println("\n");
        //Patterns 2
        for(int i = 1; i <= 5 ; i++){
            for(int j = 1 ; j <= 5 ; j++){
                System.out.print(i + " ");
            }
            System.out.println("");
        }

        System.out.println("\n");
        //Patterns 3
        for(int i = 1; i <= 5 ; i++){
            for(int j = 1 ; j <= 5 ; j++){
                System.out.print( i+j + " ");
            }
            System.out.println("");
        }

        System.out.println("\n");
        //Patterns 4
        int count = 0;
        for(int i = 1; i <= 5 ; i++){
            for(int j = 1 ; j <= 5 ; j++){
                count++;
                System.out.print( count + "\t");
            }
            System.out.println("");
        }

        System.out.println("\n");
        //Patterns 5
        for(int i = 1; i <= 5 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        System.out.println("\n");
        //Patterns 6
        int count_2 = 0;
        for(int i = 1; i <= 5 ; i++){
            for(int j = 1 ; j <= i ; j++){
                count_2++;
                System.out.print(count_2 + " ");
            }
            System.out.println("");
        }

        System.out.println("\n");
        //Patterns 7
        for(int i = 1; i <= 5 ; i++){
            for(int j = 1 ; j <= i ; j++){
                count_2++;
                System.out.print( "* ");
            }
            System.out.println("");
        }

        System.out.println("\n");
        //Patterns 8
        for(int i = 0; i < 5 ; i++){
            for(int j = 1 ; j <= 5-i ; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        
        System.out.println("\n");
        //Patterns 9
        for(int i = 1; i <= 5 ; i++){
            for(int j = 1 ; j <= 5 ; j++){
                if(j>=i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println("");
        }

        System.out.println("\n");
        //Patterns 10
        for(int i = 1; i <= 5 ; i++){
            for(int j = 1 ; j <= 5 ; j++){
                if((i+j) > 5){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println("");
        }
    }
}
