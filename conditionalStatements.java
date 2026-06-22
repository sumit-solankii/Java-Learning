public class conditionalStatements {
    public static void main(String[] args) {

        //if 
        int i = 5;
        if( i==5 ) {
            System.out.println("i is 5."); // i is 5.
        }

        //if-else
        int j = 10;
        if(j <= 5) {
            System.out.println("j is less than or equal to 5.");
        } else {
            System.out.println("j is greater than 5."); // j is greater than 5.
        }

        //else-if
        int k = 5;
        if(k == 1) {
            System.out.println("k is equal to 5.");
        } else if(k == 2) {
            System.out.println("k is equal to 2.");
        } else if(k == 3) {
            System.out.println("k is equal to 3.");
        } else if(k == 4) {
            System.out.println("k is equal to 4.");
        } else if(k == 5) {
            System.out.println("k is equal to 5."); // k is equal to 5.
        }
    }
    
}
