import java.util.*;
class Main
{
    static int printOdd(int input)
    {
        if(input==1)
        {
            System.out.println(input);
            return 0;
        }
        if(input%2!=0)
        {
            System.out.println(input);
            printOdd(input-2);
        }

        if(input%2==0)
        {
            printOdd(input-2);
        }
        return 1;
    }

    public static void main(String[] args)
        {
            Scanner in=new Scanner(System.in);
            printOdd(in.nextInt());
        }

}
