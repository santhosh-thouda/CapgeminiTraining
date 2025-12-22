public class IncrementDecrement{
    public static void main(String[] args){
        int x = 10;
        int y = 10;
        int z = x++ + ++y + ++x + y++;
        int z1 = ++z + z-- + y++ + --z;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(z1);
    }
}
