public class While1055 {
    public static void main(String[] args) {
        //for (int i = 10; i < 55; i++)
        int i=10;
        int sum = 0;
        while (i <= 55)
        {
            if(i%2== 0)
            {sum = sum + i;}
            i++;

        }
        System.out.println(sum);
    }
}


