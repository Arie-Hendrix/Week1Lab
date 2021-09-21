
public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Airline Seats Question
		int seatsAvailable = 86;
		int seatsBooked = 10;
		int seatsRemaining = (seatsAvailable - seatsBooked);
		
		System.out.println(seatsRemaining + " seats remain on this flight.");
		
		//Grocery Costs Question
		double itemCost = 85;
		//double taxRate = .2;
		//double totalCost = (itemCost + (itemCost*taxRate));
		
		System.out.println("Your total today is $" + itemCost + ".");
		
		//Middle Initial Question
		char middleInitial = 'A';
	
		System.out.println("My middle intial is " + middleInitial + ".");
		
		//Hot Or Not Question
		boolean hotOutside = true;
		
		System.out.println("It's summer, so it's " + hotOutside + " that it's very hot out.");
		
		//Customer First Name Question
		String firstName = "Adam";
		
		System.out.println("This customer's first name is " + firstName + ".");
		
		//Address Question
		String currentAddress = " Elvars Drive";
		String facingDirection = " W.";
		int streetNumber = 12583;
		String displayAddress = streetNumber + facingDirection + currentAddress;
		
		System.out.println("The address here is " + displayAddress + ".");
		
		
	}

}
