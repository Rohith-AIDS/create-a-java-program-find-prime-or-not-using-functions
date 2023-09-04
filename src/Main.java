import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        if(isEven(num))
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
    static boolean isEven(int num)
    {
        return num%2==0;
    }
}