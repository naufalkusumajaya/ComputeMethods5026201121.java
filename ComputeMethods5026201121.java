import java.lang.Math;

public class ComputeMethods5026201121 {
 public static double fToC(double [] degreesF){
        double fahrenheit = 100.4000000018;
        fahrenheit = fahrenheit - 32;
        fahrenheit = fahrenheit / 9;
        fahrenheit = fahrenheit * 5;
        System.out.println("Temp in celsius is " + fahrenheit);
        return 0;
    }
    public static double hypotenuse(int a, int b){
        double c,d,e,f;
        a = 9;
        b = 2;
        c= Math.pow(a,b);
        d = 6;
        e = Math.pow(d,b);
        f = e + c;
        f = Math.sqrt(f);
        System.out.println("Hypotenuse is " + f);
        return 0.0;
    }
    public static int roll(){
        int a,b,c,d;
        a = 3;
        b = 4;
        c = 5;
        d = 6;
        a = a + d;
        c = c + b;
        int [] e = {a , c};
        int random = (int) (Math.random()*2);
        System.out.println("The sum of the dice values is "+ e[random]);
        return 0;
    }
}