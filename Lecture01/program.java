
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
