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


