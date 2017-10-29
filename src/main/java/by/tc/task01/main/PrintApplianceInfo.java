package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) {

		System.out.println();
		System.out.println("--------------------------NEW REQUEST--------------------------------");

			if (appliance == null) {
				System.out.println("Ничего не нашлось");
			} else {
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<FIND!>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println(appliance.toString());
			}
	}
	
	// you may add your own code here

}
