package Inheritance;

public class VehicleTest {
	
public static void main(String args[]){
	boolean result; 
	TwoWheelerAppraisal appraisal = new TwoWheelerAppraisal();
	result=appraisal.vehicleAppraisal();
	if(result)
		System.out.println("The vehicle passed the test and eligible for Go live");
	else{
		System.out.println("The vehicle is not eligible");
		System.out.println("The maximum speed should be 200 kmph. It is voilating standards");
		System.out.println("The average mileage should be atleast 35 kumpl");
		System.out.println("The average rating should be atleast 3.5");
	}
}

}
