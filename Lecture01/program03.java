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
