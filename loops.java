public class loops {
    public static void main(String[] args) {
         
        // while
        int i = 5;
        while(i <= 8) {
            System.out.println(i + " is less than or equal to 8.");
            i++;
        }

        // do while 
        int j = 10;
        do {
            System.out.println(j + " is greater than or equal to 7.");
            j--;
        } while(j >= 7);

        //for 
        for(int k = 0; k <=5 ; k++) {
            System.out.println("The value of k is " + k);
        }
    }
    
}
