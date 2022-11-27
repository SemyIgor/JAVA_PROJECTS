package Seminar01;

public class ReverseCharArr {
   public static void main(String[] args) {
      System.out.println("Функция разворота массива символов");
   }

   // == Reverse Char Array =======================================================
   static char[] ReverseCharArray(char[] arr) {
      char temp;
      int arrLength = arr.length;
      for (int i = 0; i < arrLength / 2; i++) {
         temp = arr[i];
         arr[i] = arr[(arrLength - 1) - i];
         arr[(arrLength - 1) - i] = temp;
      }
      return arr;
   }
}
