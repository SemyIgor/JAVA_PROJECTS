package Lecture03;

// OBJECT data (continues)
public class Lec03Task02 {
   public static void main(String[] args) {
      System.out.println(Sum(1, 2));
      System.out.println(Sum(1.0, 2));
      System.out.println(Sum(1, 2.0));
      System.out.println(Sum(1.2, 2.0));
   }

   private static Object Sum(Object a, Object b) {
      if (a instanceof Double && b instanceof Double) {
         return (Object) ((Double) a + (Double) b);
      } else if (a instanceof Integer && b instanceof Integer) {
         return (Object) ((Integer) a + (Integer) b);
      } else
         return 0;
   }
}
