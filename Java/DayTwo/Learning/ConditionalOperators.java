public class ConditionalOperators{
    public static void main(String[]args){

        //variable scenario
        int a = 10;
        int b = 20;
        System.out.println(a > b ? a : b);

        int c = (a > b ? a : b);
        System.out.println(c);

        //expression scenario
        int marks = 89;
        int x = (marks >= 35 ? marks + 10 : marks - 10);
        System.out.println(x);

        int age = 19;
        String str = (age >= 18 ? "Eligible" : "Not Eligible");
        System.out.println(str);

        //value scenario
        System.out.println(20 > 30 ? 20 + 50 : 30 + 40);

        //boolean without variable
        System.out.println(20 > 10 ? true : false);

        //boolean with variable
        boolean yes = 20 > 10 ? true : false;
        System.out.println(yes);
    }
}
