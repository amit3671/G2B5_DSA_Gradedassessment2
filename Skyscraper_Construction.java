package building_construction;

import java.util.Scanner;

import floor_delivery.FloorDelivery;
import floors_arrangement.Floor_Arrangement;

public class Skyscraper_Construction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scan = new Scanner(System.in)) {

			FloorDelivery FD = new FloorDelivery();
			Floor_Arrangement FA = new Floor_Arrangement();

			System.out.println("Enter the total no of floors in the building");
			int size = scan.nextInt();
			FD.Floors_Input(size);

			FA.sort_Floor(size);

		}

	}

}
