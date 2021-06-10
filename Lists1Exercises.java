public class Lists1Exercises {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        int length = L.size();
        IntList Q = new IntList(L.get(length - 1), null);
        while (length > 0){
          Q = new IntList(L.get(length - 1) + x, Q);
          length = length - 1;
        }
        return Q;        
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        int i = L.size();
        IntList Q = L;
        while (i > 0) {
            Q.first = Q.first + x;
            Q = Q.rest;
            i = i - 1;
        }
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        //System.out.println(L);
        //System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        //System.out.println(L.get(1));
        //System.out.println(incrList(L, 3).get(0));
        //System.out.println(incrList(L, 3).get(1));
        //System.out.println(incrList(L, 3).get(2));
        System.out.println(dincrList(L, 3).size());        
        //System.out.println(dincrList(L, 3).get(1));  
        //System.out.println(dincrList(L, 3).get(2));  
    }
}