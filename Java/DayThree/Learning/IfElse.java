public class IfElse{
    public static void main(String[]args){
        int age = 21;
        if (age >= 18)
            System.out.println("Adult");
        else
            System.out.println("Not an Adult");

        

        if(age <= 18){
            System.out.println("You're under 18");
        }
        else if(age >= 58){
            System.out.println("You're a senior citizen");
        }
        else{
            System.out.println("You're in a working age");
        }
    }
}