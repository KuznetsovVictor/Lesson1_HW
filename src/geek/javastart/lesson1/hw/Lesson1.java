package geek.javastart.lesson1.hw;

public class Lesson1 {

    /* Написать метод вычисляющий выражение a * (b + (c / d))
      и возвращающий результат с плавающей точкой,
      где a, b, c, d – целочисленные входные параметры этого метода */

    public static double computedExpressions(double a,double b,double c, double d){
        return (a * (b + (c / d)));
    }

    public static void main(String[] args) {
        double a,b,c,d;
        a = 1;
        b = 1;
        c = 1;
        d = 1;
        double result = computedExpressions(a,b,c,d);
        System.out.println(result);


    }

}
