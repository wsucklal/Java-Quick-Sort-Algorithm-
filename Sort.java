package Warren_Lab10;

import java.util.LinkedList;

public class Sort {
	
	//Creating a method to quick-sort a list
    public static <K> void quickSort(LinkedList<K> k, PointComparator<K> E) {
        int n = k.size();

        if (n < 2) {
            return;
        }

        K pivot = k.peek();

        LinkedList<K> A = new LinkedList<>();
        LinkedList<K> B = new LinkedList<>();
        LinkedList<K> C = new LinkedList<>();

        while (!k.isEmpty()) {
            K element = k.remove();

            int c = E.compare(element, pivot);

            if (c < 0) {
                A.add(element);
            } 
            
            else if (c == 0) {
                B.add(element);
            } 
            
            else {
                C.add(element);
            }
        }

        quickSort(A, E);
        quickSort(C, E);
        
        while (!A.isEmpty()) {
            k.add(A.remove());
        }

        while (!B.isEmpty()) {
            k.add(B.remove());
        }

        while (!C.isEmpty()) {
            
            k.add(C.remove());
        }
    }
}

