import java.util.Scanner;
public class Average {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter English marks:");
        int a=obj.nextInt();
        System.out.println("Enter maths marks:");
        int b=obj.nextInt();
        System.out.println("Enter Social marks:");
        int c=obj.nextInt();
        int sum=a+b+c;
        double ave=sum/3;
        System.out.println("The sum of marks:"+sum);
        System.out.println("The average of the marks:"+ave);
    }
}

