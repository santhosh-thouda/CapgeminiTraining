public class LogicalOperators1{
    public static void main(String[]args){
        int age = 24;
        String country = "India";
        String completedBachelors = "Yes";

        // logical and
        System.out.println(age >=21 && country == "India" && completedBachelors == "Yes");
        System.out.println(age >=21 && country.equals("India") && completedBachelors.equals("Yes"));
        
        boolean hasIdCard = true;
        boolean hasGuestCard = false;
        System.out.println(hasIdCard || hasGuestCard);

        //logical not
        int a = 10;
        System.out.println(!(a==10));
        System.out.println((a==10));
    }
}
