package Inheritance;

import java.util.Scanner;

public class TwoWheelerAppraisal extends TwoWheeler {

	Scanner sc = new Scanner(System.in);
	

	public boolean vehicleAppraisal() {

		TwoWheelerPOJO pojo = new TwoWheelerPOJO();
		System.out.println("Enter the vehicle speed limit in speedometer");
		pojo.setMaximumSpeed(sc.nextInt());
		System.out.println("Enter the vehicle average mileage efficiency per litre");
		pojo.setMileageLimit(sc.nextInt());
		System.out.println("Enter the vehicle rating out of 5");
		pojo.setTotalRating(sc.nextDouble());
		return evaluate(pojo);

	}
//The Inheritance Proof :
	/*This derived class accessing the behaviours and properties from base class - TwoWheeler*/
	private boolean evaluate(TwoWheelerPOJO pojo){
		boolean test = false;
		
		
		TwoWheeler twoWheelerBase = new TwoWheeler();
		if(pojo.getMaximumSpeed()<=twoWheelerBase.maximumSpeed()){
			test =true;
		}
		else
			return test;
		
		if(pojo.getMileageLimit()>=twoWheelerBase.mileagePerLitre()){
			test =true;
		}
		else
			return false;
		
		if(pojo.getTotalRating()>=twoWheelerBase.ratingsOutofFive()){
			test = true;
		}
		else
			return false;
		
		
		
		return test;
		
	}
	
	
	
}
