import java.io.Console;

public class solutions {

    public static int mystery(int n){
        if (n < 0){
            n = n * 3;
            return n;
        }else
        {
            n = n +3;
        }
        if (n%2 == 1){
            n = n + n % 10;
        }
        return n;
    }

    public static void ifElseMystery(int a, int b, int c){
        if (a < b && a < c){
            a = a + c;
            c++;
        }else if (a >= b){
            a = a-b;
            b--;
        }
        if (a>= b && a>=c){
            a++;
            c++;
        }
        System.out.println(a + " "+b + ""+c);
    }

    public static void slope(int x1, int y1, int x2, int y2){
        double dy = y2 - y1;
        double dx = x2 - x1;
        System.out.println(dy/dx);
    }

    public static void main(String[] args) {
        solutions s = new solutions();
        System.out.println(s.mystery(-5));
        System.out.println(s.mystery(0));


        ifElseMystery(4,6,7); //12 69
        ifElseMystery(20,5,5);//16 46
        String name = "Bill Bob";
        System.out.println(name.charAt(4));

        System.out.println("What is your age?");
        //int age = Console.nextInt();

        int x = (int) Math.pow(10,3);
        System.out.println(x);
        slope(1,3,5,11);




    }
}
