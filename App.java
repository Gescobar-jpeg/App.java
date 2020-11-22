
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double itemPrice = 3.99;
			System.out.println("I really want Pineapple, but it cost " + itemPrice);
			
		double priceOfToiletPaper = 49.99;
			System.out.println(priceOfToiletPaper);
			
		int moneyInWallet = 4;
			System.out.println(moneyInWallet);
		
		int ebt = 20;
			System.out.println(ebt);

		int friendsLastYear = 5;
			System.out.println(friendsLastYear);
		
		int friendsThisYear = 52;
				System.out.println(friendsThisYear);
		
		int ageLastYear = 25;
			System.out.println(ageLastYear);
		
		double ageThisYear = 26.5;
			System.out.println(ageThisYear);
		
		String firstName = "Gustavo";
			System.out.println(firstName);
		
		String lastName = "Escobar";
			System.out.println(lastName);
		
		char middleInitial = 'S';
			System.out.println(middleInitial);
		
		String aliasFirst = "Homer";
			System.out.println("Homer");
				
		String aliasLast = "Simpson";
			System.out.println("Simpson");
			
		char aliasMiddle = 'J';
			System.out.println('J');
			
		
		double change = moneyInWallet - itemPrice;
		
		double friendsPerYear = friendsThisYear / ageThisYear;
			
		String fullName = firstName + " " + middleInitial + ". " + lastName;
		

		
			System.out.println("I have only $" + moneyInWallet + " in my wallet, so all I got in change was " + change + " cents.");
			System.out.println("Not to worry, though, I have " + ebt + " on my ebt card.");
			System.out.println("Last year I spent a lot of time reflecting and growing, so I only had " + friendsLastYear + " friends.");
			System.out.println("This year I focused more on socializing, so i now have " + friendsThisYear + " friends.");
			System.out.println(ageLastYear + " was a difficult age for me, a hard year, but now that I am " + ageThisYear +" I am seeing life much brighter.");
			
			System.out.println("I've made " + friendsPerYear + " per year.");
			
			System.out.println("Hello, my current name is " + fullName + ".");
			System.out.println("But my friends call me " + aliasLast + ", " + aliasFirst + " " + aliasMiddle + ". " + aliasLast + ".");
		
	}

}
