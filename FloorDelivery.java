package floor_delivery;

import java.util.Scanner;

public class FloorDelivery {

	protected static int arr[];

	Scanner sc = new Scanner(System.in);

	public void Floors_Input(int size) {
		 arr = new int[size];

		int k = 0;
		for (int i = 0; i < size; i++) {
			System.out.println("enter the floor size given on day : " + (i + 1));
			k = sc.nextInt();
			if (k <= size) {
				arr[i] = k;
			} else {
				System.out.println("Please enter the value less than the top floor of the buliding");
				i--;
			}

		}
	}
}
