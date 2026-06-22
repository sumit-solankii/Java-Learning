public class arrays {
    public static void main(String[] args) {
        //arrays
        int[] numbers = {10,20,30};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println(); // blank line 

        for(int i = 0 ; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println(); // blank line

        int[] newnumbers = new int[5];
        
        newnumbers[0] = 1;
        newnumbers[1] = 2;
        newnumbers[2] = 3;
        newnumbers[3] = 4;
        newnumbers[4] = 5;

        for(int j = 0 ; j < newnumbers.length ; j++) {
            System.out.println(newnumbers[j]);
        }
    }
    
}
