class student {
    private String name, city;
    private int age, marks;
    void getData(String n, String c, int a, int m) {
        name = n;
        city = c;
        age = a;
        marks = m;
    }

    void printData() {
        System.out.println("Enter your name : " + name);
        System.out.println("Enter your city : " + city);
        System.out.println("Enter your age : " + age);
        System.out.println("Enter your marks : " + marks);
    }
    
}

public class data {
    public static void main(String[] args){
        student s1 = new student();
        student s2 = new student();
        s1.getData("Pranshul" , "Jaipur" , 19 , 95);
        s2.getData("Ritik" , "Jaipur" , 20 , 96);
        s1.printData();
        s2.printData();

    }
}
