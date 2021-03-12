package Warren_Lab10;

import java.util.LinkedList;

public class Warren_Lab10 {

	public static void main (String [] args) {
		
		Point p1 = new Point(5, 6);
		Point p2 = new Point(7, 10);
		Point p3 = new Point(50, 4);
		Point p4 = new Point(7, 3);

		LinkedList<Point> myList = new LinkedList<>();

		myList.add(p1);
		myList.add(p2);
		myList.add(p3);
		myList.add(p4);

		for (int i = 0; i < myList.size(); i++) {
			System.out.println("(" + myList.get(i).getX() + "," + myList.get(i).getY() + ")");
		}

		Sort.quickSort(myList, new PointComparator<>());

		System.out.println();
		System.out.println("Quick Sorted:");

		for (int i = 0; i < myList.size(); i++) {
			System.out.println("(" + myList.get(i).getX() + "," + myList.get(i).getY() + ")");
		}
	}
}
