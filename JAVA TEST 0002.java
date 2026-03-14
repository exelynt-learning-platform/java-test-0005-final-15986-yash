public class Assignment2 {
    public static void main(String[] args) {
        int rows = 5; 

        for (int i = 1; i <= rows; i++) {
             for (int k = 1; k <= rows - i; k++) {
                 System.out.print(" ");
             }

                        for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

                        System.out.println();
        }
    }
}
