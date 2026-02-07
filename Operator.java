public class Operator {
    public static void main(String[] args) {
        int a=22;
        int b=12;
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
        a = a*b;
        b= a/b;
        a = a/b;
        System.out.println(a);
        System.out.println(b);
        }
}
