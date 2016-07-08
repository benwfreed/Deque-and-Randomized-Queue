import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Iterator;

public class Subset {
    
    public static void main(String[] args) {
        int k = 0;
        if (args.length > 0) {
            try {
                k = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {

                System.exit(1);
            }
        }
        RandomizedQueue<String> set = new RandomizedQueue<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            set.enqueue(item);
        }
        Iterator<String> subset = set.iterator();
        for (int i = 0; i < k; i++) {
            StdOut.println(subset.next());
        }
    } 
}
