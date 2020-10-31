package geek.javastart.lesson1.hw;

public class Lesson1 {

    /* Написать метод вычисляющий выражение a * (b + (c / d))
      и возвращающий результат с плавающей точкой,
      где a, b, c, d – целочисленные входные параметры этого метода */

    public static double computedExpressions(double a,double b,double c, double d){
        return (a * (b + (c / d)));
    }


    /*    Написать метод, принимающий на вход два целых числа,
     и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    если да – вернуть true, в противном случае – false; */

    public static boolean limitVerifying(int a, int b){
        int sum = a + b;
        if((sum >= 10) && (sum <= 20 )){
            return true;
        }else
            return false;
    }

  /*  Написать метод, которому в качестве параметра передается целое число,
   метод должен проверить положительное ли число передали, или отрицательное.
   Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль */

  public static void numberCheck(int a){
      if (a >= 0){
          System.out.println("Число " + a + " положительное." );
      }else {
          System.out.println("Число " + a + " отрицательное." );
      }
  }

    /*   Написать метод, которому в качестве параметра передается строка,
        обозначающая имя, метод должен вернуть приветственное сообщение
        «Привет, переданное_имя!»; Вывести приветствие в консоль.*/
    public static String welcome(String name){
        return "Привет " + name + "!";
    }

 /*   Написать метод, который определяет является ли год високосным.
        Каждый 4-й год является високосным,
        кроме каждого 100-го,
        при этом каждый 400-й – високосный.
        Для проверки работы вывести результаты работы метода в консоль*/

    public static void leapYear(int year){
        if(((year % 4 == 0) || (year % 400 == 0)) && (year % 100 != 0)){
            System.out.println(year + " високосный!");
        }else{
            System.out.println(year + " не високосный!");
        }
    }


    public static void main(String[] args) {
        double a,b,c,d;
        a = 1;
        b = 12;
        c = 32;
        d = 6;
        double result = computedExpressions(a,b,c,d);
        System.out.println(result);

        int arg1,arg2;
        arg1 = 12;
        arg2 = 8;
        boolean ret = limitVerifying(arg1,arg2);
        System.out.println(ret);

        int numCheck;
        numCheck = -2;
        numberCheck(numCheck);

        String name;
        name = "Иван";
        String returnWelcom = welcome(name);
        System.out.println(returnWelcom);

        int year;
        year = 2020;
        leapYear(year);

    }

}
