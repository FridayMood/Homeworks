public class Additional1 {
    public static void main(String[] args) {
        int a=1;
        int b =1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int k=0; k<=8;k++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
}
