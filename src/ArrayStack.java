public class ArrayStack {
   private int[] arr;
   private int n;
   private int capacity;
   public ArrayStack(int cap) {
       capacity = cap;
       n = 0;
       arr = new int[cap];
   }
}