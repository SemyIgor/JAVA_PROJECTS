# ВВЕДЕНИЕ В СИНТАКСИС JAVA
## ЛЕКЦИЯ №1

## Создание проекта, комментарии, вывод в терминал, получение типа переменной
``` java
public class program {
   public static void main(String[] args) {
      System.out.println( "Hello, World !"); // Комментарий
      // Комментарий 

      /* 
      Многострочный комментарий 
      */
      float x = 2.7f;
      System.out.println(x);
      boolean asd = 125 > 13;
      boolean qwe = 13 > 125;
      System.out.println(asd); // True
      System.out.println(qwe); // False
      System.out.println(asd & qwe); // False
      System.out.println(asd | qwe); // True
      System.out.println(asd ^ qwe); // True (Исключающее 'или')
      
      System.out.println((getType(asd))); //
    
   }
   static String getType(Object o){
      return o.getClass().getSimpleName();
   }
}
```

## Символ в строке, классы-обёртки
``` java
public class program01 {
   public static void main(String[] args) {
      String s = "qwer"; 
      s.charAt(0);
      System.out.println(s); // qwer
      System.out.println(s.charAt(0)); // q
      System.out.println(Integer.MAX_VALUE); // 2_147_483_647
   }
}
```

## Сокращённые операции
``` java
public class program02 {
   public static void main(String[] args) {
      short ind;
      ind = -6;
      System.out.println(++ind); // -5 (-6 + 1 инкремент до печати, или префиксный инкремент)
      System.out.println(ind++); // -5 (-5 + 1 инкремент после печати, или постфиксный инкремент)
      System.out.println(ind+=-2); // -6 (-4 - 2)
      System.out.println(--ind-ind--); // 0 (-7 - -7) Здесь --ind даёт ind = -7, ind-- даёт -8, но ПОСЛЕ печати, 
      System.out.println(ind); // -8 которое мы можем увидеть здесь
   }
}
```

## Массивы одномерные
``` java
public class Program {
   public static void main(String[] args) {

      int[] arr = new int[10];
      System.out.println(arr.length); // 10

      arr = new int[] { 1, 2, 3, 4, 5 };
      System.out.println(arr.length); // 5
   }
}
```

## Многомерные массивы (массивы массивов)
``` java
public class program03 {
   public static void main(String[] args) {
      // Многомерные массивы (массивы массивов)
      int[] array[] = new int[3][5];
      for ( int[] line: array){
         for (int item: line) {
            System.out.printf("%d", item);
         }
         System.out.println();
      }
      System.out.println();
      
      int[][] arrNext = new int[3][5];
      
      for (int i = 0; i<arrNext.length; i++){
         for (int j = 0; j<arrNext[i].length; j++){
            System.out.printf("%d", arrNext[i][j]);
         }
         System.out.println();
      }
   }
}
```

## Неявное и явное преобразование
``` java
public class program04 {
   public static void main(String[] args) {
      // Неявное преобразование
      int i = 123; double d = i;
      System.out.println(i); // 123
      System.out.println(d); // 123.0
      d = 3.1415; i = (int)d;
      System.out.println(d); // 3.1415
      System.out.println(i); // 3
      // Явное преобразование (используется обёртка)
      byte b = Byte.parseByte("123");
      System.out.println(b); // 123
      // Нельзя "затолкать" в переменную больше, чем объём её типа
      // b = Byte.parseByte("1234");
      // System.out.println(b); // NumberFormatException: Value out of range. Value:"1234"

      // НО !!! Нельзя положить массив целых чисел в массив вещественных чисел напрямую
      // int[] a = new int[10];
      // double[] d = a; // Ошибка: Type mismatch: cannot convert from int[] to double[]
      // Подробнее - гуглить инварианты, ковариантность и контрвариантность

   }
}
```

## Сканер ввода данных
``` java
import java.util.Scanner;

public class program05 {
   public static void main(String[] args) {
      Scanner iScanner = new Scanner(System.in);
      System.out.printf("name: ");
      String name = iScanner.nextLine();
      System.out.printf("Привет, %s!", name);
      iScanner.close();
   }
}
```

## Сканер ввода данных (разные типы данных)
``` java
public class program06 {
   public static void main(String[] args) {
      Scanner iScanner = new Scanner(System.in);
      System.out.printf("int a: ");
      int x = iScanner.nextInt(); // 5 (вводим число с типом int) 
      System.out.printf("double a: ");
      double y = iScanner.nextDouble(); // 17 (вводим число с типом double)
      System.out.printf("%d + %f = %f", x, y, x + y); // 5 + 17,000000 = 22,000000
      iScanner.close();

   }
}
```

## Проверка типа введенных данных
``` java
import java.util.Scanner;

public class program07 {
   public static void main(String[] args) {
      Scanner iScanner = new Scanner(System.in);
      System.out.printf("int a: ");
      boolean flag = iScanner.hasNextInt(); // Проверяет, действительно ли пользователь ввёл int
      if (flag){
         System.out.println(flag);
         int i = iScanner.nextInt();
         System.out.println(i);
      }
      iScanner.close();
   }
}
```

## ФОРМАТИРОВАННЫЙ ВЫВОД
``` java
public class program08 {
   public static void main(String[] args) {
      /*
       ФОРМАТИРОВАННЫЙ ВЫВОД 
       Виды спецификаторов:
       %d - целочисленных значений
       %x - шестнадцатиричных чисел
       %f - числа с плавающей точкой
       %e - числа в экспоненциальной форме (Например: 3.1415e+01, что соответствует 3.1415*10)
       %c - одиночный символ
       %s - строковое значение
      */
      int a = 1, b = 2;
      int c = a + b;
      String res = a + " + " + b + " = " + c + "\n";
      System.out.println(res);
      res = String.format("%d + %d = %d \n", a, b, c); // Сохраняем форматированную строку в переменную
      System.out.println(res);
      System.out.printf("%d + %d = %d \n", a, b, c);
      System.out.println(3.1415e+01); // 31.415
   }
}
```

## Расточительная конкатенация строк
``` java
public class program09 {
   public static void main(String[] args) {
      /* 
      РАСТОЧИТЕЛЬНАЯ КОНКАТЕНАЦИЯ СТРОК
      При выполнении этого кода в памяти будет сформировано 4 строки: 
      1. s ("que")
      2. a ("123") - неявное преобразование
      3. s + a - формируемая новая строка во временной памяти
      4. q - результат формирования новой строки
      */
      String s = "que";
      int a = 123;
      String q = s + a;
      System.out.println(q); // "qwe123"
   }
}
```

## ФОРМАТИРОВАННЫЙ ВЫВОД (продолжение). Количество знаков после запятой
``` java
public class program10 {
   public static void main(String[] args) {
      /*
       * ФОРМАТИРОВАННЫЙ ВЫВОД (продолжение)
       * Количество знаков после запятой
       */
      float pi = 3.1415f;
      System.out.printf("%f\n", pi); // 3,141500
      System.out.printf("%.2f\n", pi); // 3,14
      System.out.printf("%.3f\n", pi); // 3,141
      System.out.printf("%e\n", pi); // 3,141500e+00
      System.out.printf("%.2e\n", pi); // 3,14e+00
      System.out.printf("%.3e\n", pi); // 3,141e+00

   }
}
```

## Видимость переменных
``` java
public class program11 {
   public static void main(String[] args) {
      int b = 111;
      {
         int a = 222; // Если эта переменная будет объявлена ДО этого блока,
         // то внутри блока её объявить будет невозможно, так как это будет
         // восприниматься
         // как объявление уже объявленной переменной
         System.out.println(a + b); // 333
      }
      int a = 123; // После блока объявление возможно, и оно имеет приоретет над внутриблочным
      System.out.println(a); // 123
   }
}
```

## ФУНКЦИЯ В ОТДЕЛЬНОМ ФАЙЛЕ
``` java
public class program12 {
   // ФУНКЦИЯ В ОТДЕЛЬНОМ ФАЙЛЕ
   // Функция sayHi() вынесена в отдельный файл lib.java, обращение к ней (строка
   // 19) lib.sayHi()
   // Для запуска в командной строке пишем: javac program12.java && java program12
   // static void sayHi() {
   // System.out.println("Hi!");
   // }

   static int sum(int a, int b) {
      return a + b;
   }

   static double factor(int n) {
      if (n == 1 || n == 0)
         return 1;
      return n * factor(n - 1);
   }

   public static void main(String[] args) {
      lib.sayHi(); // Hi!
      System.out.println(sum(1, 3)); // 4
      System.out.println(factor(5)); // 120
   }
}
```

## УПРАВЛЯЮЩИЕ КОНСТРУКЦИИ
``` java
public class program13 {
   public static void main(String[] args) {
      // УПРАВЛЯЮЩИЕ КОНСТРУКЦИИ
      // Условный оператор
      int a = 1, b = 2, c;
      if (a > b) {
         c = a;
      } else {
         c = b;
      }
      System.out.println(c);
      // Сокращенная форма условного оператора
      if (a > b)
         c = a;
      if (b > a)
         c = b;
      System.out.println(c);
      // Тернарный оператор
      int min = a < b ? a : b;
      System.out.println(min);
      // Оператор выбора
      int month = 8;
      switch (month) {
         case 1:
         case 2:
         case 12:
            System.out.println("Это зима !");
            break;
         case 3:
         case 4:
         case 5:
            System.out.println("Это весна !");
            break;
         case 6:
         case 7:
         case 8:
            System.out.println("Это лето !");
            break;
         case 9:
         case 10:
         case 11:
            System.out.println("Это зима");
            break;
         default:
            System.out.println("Это другая планета !!!");
            break;
      }
   }
}
```

## ЦИКЛЫ
``` java
public class program14 {
   public static void main(String[] args) {
      // ЦИКЛЫ
      int value = 321;
      int count = 0;

      // while
      while (value != 0) {
         value /= 10;
         count++;
      }
      System.out.println(count); // 3

      // do while
      do {
         value /= 10;
         count++;
      } while (value != 0);
      System.out.println(count); // 4

      // for
      int s = 0;
      for (int i = 1; i <= 10; i++) {
         s += i;
      }
      System.out.println(s); // 55

      // for:
      // Работает только для коллекций
      int[] arr = new int[10];
      for (int item : arr) {
         arr[3] = 12; // 10 раз в цикле присваивает значение 12 элементу с индексом 3
         System.out.printf("%d ", item); // 0 0 0 12 0 0 0 0 0 0
      }
      System.out.println();
      // Примечание: item - это временная переменная, а не элемент массива.
      // Поэтому нельзя в цикле присвоить значение элементу массива, используя item =
      // value.
      // Надо использовать arr[i] = value
   }
}
```

## РАБОТА С ФАЙЛАМИ (начала). Создание и запись / дозапись
``` java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class program15 {
   public static void main(String[] args) {
      // РАБОТА С ФАЙЛАМИ (начала)
      // Создание и запись / дозапись
      try (FileWriter fw = new FileWriter("file.txt", false)) {
         // false применяется для исключения попытки дописать в существующий файл
         // и заставляет создавать новый файл или перезаписывать старый, если такой файл
         // уже существует
         fw.write("line 1+");
         fw.append('\n');
         fw.append('2');
         fw.append('\n');
         fw.write("line 3");
         fw.flush();

         // Читаем файл построчно
         BufferedReader br = new BufferedReader(new FileReader("file.txt"));
         String str;
         while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
            /*
             * Выводит в цикле строки файла:
             * == line 1+ ==
             * == 2 ==
             * == line 3 ==
             */
         }
         br.close();
      } catch (IOException ex) {
         System.out.println(ex.getMessage());
      }
   }
}
```

## РАБОТА С ФАЙЛАМИ (начала). Чтение посимвольно. 
## Использование краткой формы исключений
``` java
import java.io.FileReader;

public class program16 {
   public static void main(String[] args) throws Exception {
      // Сообщаем, что возможно выбрасывание исключений (throws Exception)
      // Эта конструкция может использоваться вместо try...catch
      // РАБОТА С ФАЙЛАМИ (начала)
      // Чтение, вариант посимвольно
      FileReader fr = new FileReader("file.txt");
      int c;
      while ((c = fr.read()) != -1) {
         char ch = (char) c;
         if (ch == '\n') {
            System.out.print(ch);
         } else {
            System.out.print(ch);
         }
      }
      fr.close();
   }
}

```