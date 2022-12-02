package Lecture03;

// OBJECT data
public class Lec03Task01 {
   public static void main(String[] args) {
      Object ob = 1;
      GetType(ob); // java.lang.Integer
      ob = 1.2;
      GetType(ob); // java.lang.Double
   }

   private static void GetType(Object ob) {
      System.out.println(ob.getClass().getName());
   }
}
