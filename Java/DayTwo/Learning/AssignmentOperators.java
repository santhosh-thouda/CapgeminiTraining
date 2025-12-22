public class AssignmentOperators{
    public static void main(String[]args){
        // = is assignment
        // +=, -=, *=, /=, %= are the Compound Assignment operators

        //Employee 1
        System.out.println("<--- Employee 1 details --->");
        int monthlySalary = 5000;
        System.out.println(monthlySalary);

        int bonus = 2000;
        System.out.println(bonus);

        int credit = 1500;
        System.out.println(credit);

        int debit = 1200;
        System.out.println(debit);

        int totalSalary = monthlySalary + bonus + credit - debit;
        System.out.println(totalSalary);

        int doubleSalary = totalSalary * 2;
        System.out.println(doubleSalary);

        int yearSalary = totalSalary * 12;
        System.out.println(yearSalary);
        

        //Employee 2
        System.out.println("<--- Employee 2 details --->");
        int monthlySalary1 = 5000;
        System.out.println(monthlySalary1);

        int bonus1 = 1300;
        System.out.println(bonus1);

        int credit1 = 1000;
        System.out.println(credit1);

        int debit1 = 1200;
        System.out.println(debit1);

        int totalSalary1 = monthlySalary1 + bonus1 + credit1 - debit1;
        System.out.println(totalSalary1);

        int doubleSalary1 = totalSalary1 * 2;
        System.out.println(doubleSalary1);

        int yearSalary1 = totalSalary1 * 12;
        System.out.println(yearSalary1);
    }
}
