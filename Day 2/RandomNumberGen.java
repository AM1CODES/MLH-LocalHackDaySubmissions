import java.util.Random;
import java.util.Scanner;
class Gen{
    public static void main(String[] args)
    {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which will further help in generating random numbers:");
        int num = sc.nextInt();
        int i;
        for(i = 0;i<=num;i++)
        {
            num = ran.nextInt(num);
            System.out.print(num + " ");
        
        }
        
    }
}