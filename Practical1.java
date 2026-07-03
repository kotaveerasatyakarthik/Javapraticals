public class Practical1 {
    public static void main(String[] args) {
     
        System.out.println("Hello world!");
        System.out.println();

        int age=20;
        double salary=35000.75;
        char grade='A';
        boolean isStudent=true;
        String name="rahul";

        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("salary:"+salary);
        System.out.println("grade:"+grade);
        System.out.println("student:"+isStudent);
        System.out.println();

        int number=50;
        double result=number;
        System.out.println("implicit type casting");
        System.out.println("double result:"+number);
        System.out.println("result:"+result);

        double marks=89.75;
        int totalmarks=(int)marks;

        System.out.println("\nexplicit type casting");
        System.out.println("double marks:"+marks);
        System.out.println("total marks:"+totalmarks);
    }
}