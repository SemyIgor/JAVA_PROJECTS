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
