package geek.javastart.lesson1.hw;


public class Lesson1 {

    /* 1) Написать метод вычисляющий выражение a * (b + (c / d))
      и возвращающий результат с плавающей точкой,
      где a, b, c, d – целочисленные входные параметры этого метода */

    public static double computedExpressions(double a,double b,double c, double d){
        return (a * (b + (c / d)));
    }


    /*    2) Написать метод, принимающий на вход два целых числа,
     и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    если да – вернуть true, в противном случае – false; */

    public static boolean limitVerifying(int a, int b) {
        int sum = a + b;
        if ((sum >= 10) && (sum <= 20)) {
            return true;
        }
            return false;
    }

  /*  3) Написать метод, которому в качестве параметра передается целое число,
   метод должен проверить положительное ли число передали, или отрицательное.
   Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль */

  public static Object numberCheck(int a){
      if (a >= 0){
          return ("Число " + a + " положительное." );
      }else {
          return ("Число " + a + " отрицательное." );
      }
  }

    /*   4) Написать метод, которому в качестве параметра передается строка,
        обозначающая имя, метод должен вернуть приветственное сообщение
        «Привет, переданное_имя!»; Вывести приветствие в консоль.*/
    public static String welcome(String name){
        return "Привет " + name + "!";
    }

 /*  5)  Написать метод, который определяет является ли год високосным.
        Каждый 4-й год является високосным,
        кроме каждого 100-го,
        при этом каждый 400-й – високосный.
        Для проверки работы вывести результаты работы метода в консоль*/

    public static Object leapYear(int year){
        if(((year % 4 == 0) || (year % 400 == 0)) && (year % 100 != 0)){
            return (year + " високосный!");
        }else{
            return (year + " не високосный!");
        }
    }


    public static void main(String[] args) {

        System.out.println("Задание № 1.");
        int a,b,c,d;
        a = 1;
        b = 12;
        c = 32;
        d = 6;
        double result = computedExpressions(a,b,c,d);
        System.out.println(result + "\n");

        System.out.println("Задание № 2.");
        int arg1,arg2;
        arg1 = 6;
        arg2 = 8;
        boolean ret = limitVerifying(arg1,arg2);
        System.out.println(ret + "\n");

        System.out.println("Задание № 3.");
        int numCheck;
        numCheck = 8;
        System.out.println(numberCheck(numCheck) + "\n");

        System.out.println("Задание № 4.");
        String name;
        name = "Иван";
        String returnWelcom = welcome(name);
        System.out.println(returnWelcom + "\n");

        System.out.println("Задание № 5.");
        int year;
        year = 2020;
        System.out.println(leapYear(year) + "\n");


    }

}
