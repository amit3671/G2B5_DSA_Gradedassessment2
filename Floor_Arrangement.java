package floors_arrangement;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

import floor_delivery.FloorDelivery;

public class Floor_Arrangement extends FloorDelivery {

	public void sort_Floor(int size) {

		int largestfloor = size;
		int Arraylength;
		LinkedList<Integer> arr1 = new LinkedList<Integer>();

		System.out.println("\nThe order of construction is as follows\n");
		Deque<Integer> queue = new LinkedList<>();
		int k = size;
		for (int i = 0; i < size; i++) {

			if (arr[i] != (largestfloor)) {
				queue.add(arr[i]);
				System.out.println("Day: " + (i + 1));
				System.out.println();
				k++;
			}

			else {
				queue.add(arr[i]);
				k++;
				while (!queue.isEmpty()) {

					for (int j = 0; j < k; j++) {

						if (!queue.isEmpty()) {
							arr1.add(queue.pop());
						}

					}

				}

				Collections.sort(arr1, Collections.reverseOrder());
				System.out.println("Day: " + (i + 1));
				Arraylength = largestfloor;

				for (int p = 0; p < Arraylength; p++) {

					if (arr1.peek() != null) {
						if ((largestfloor == arr1.peek()) && (!(arr1.isEmpty()))) {
							System.out.print(arr1.poll() + " ");
							largestfloor--;
						}
					}
				}
				System.out.println();
			}
		}
	}
}
