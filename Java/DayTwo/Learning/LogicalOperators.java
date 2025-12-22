public class LogicalOperators{
    public static void main(String[]args){
        int age = 24;
        String country = "India";
        String completedBachelors = "Yes";

        // logical and
        if(age >=21 && country == "India" && completedBachelors == "Yes"){
            System.out.println("You are eligible for UPSC exam");
        }
        else{
            System.out.println("You are not eligible for UPSC exam");
        }


        //logical or
        boolean hasIdCard = true;
        boolean hasGuestCard = false;
        if(hasIdCard || hasGuestCard){
            System.out.println("You are eligible to enter into the campus");
        }
        else{
            System.out.println("You are not eligible to enter into the campus");
        }

        //logical not
        int a = 10;
        if(!(a==10)){
            System.out.println("The value is 10");
        }
        else{
            System.out.println("The value is not 10");
        }
    }
}