package Warren_Lab10;
import java.util.Comparator;

public class PointComparator<E> implements Comparator<E> {

	
    int x1, y1, x2, y2;
    
    public int compare(Object one, Object two) throws ClassCastException {
        
        x1 = ((Point)one).getX();
        
        
        y1 = ((Point)one).getY();
        
      
        x2 = ((Point)two).getX();
        
        
        y2 = ((Point)two).getY();
        
        
        if (x1 != x2) {
            return (x1 - x2);
        }
        
        else {
            return (y1 - y2);
        }
    }
}