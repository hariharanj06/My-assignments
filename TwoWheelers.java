package Weel1day1ass2;

public class TwoWheelers {
int noOfWheels=2;
short noOfMirrors=2;
long chassisNumber=576554521l;
boolean isPunctured=false;
String bikeName="JAVA";
double runningKM= 25453.4;
public static void main(String[] args) {
	
	TwoWheelers myBike=new TwoWheelers();
	System.out.println("No of wheeles " +myBike.noOfWheels);
	System.out.println("No of mirrors " +myBike.noOfMirrors);
	System.out.println("chass Number " +myBike.chassisNumber);
	System.out.println("status of Bike Puincture " +myBike.isPunctured);
	System.out.println("Bike Name " +myBike.bikeName);
	System.out.println("Running Km " +myBike.runningKM);
}
}
