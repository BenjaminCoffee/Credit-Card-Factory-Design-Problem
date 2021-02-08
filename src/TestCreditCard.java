import java.util.ArrayList;

public class TestCreditCard {

	static ArrayList<String> badCards = new ArrayList<String>();
	static ArrayList<String> goodCards = new ArrayList<String>();

	public static void main(String[] args) {
		String[] creditCardTestData = { "5100123412341234,07/22,John Doe", "601112341234123,09/23,Jane Doe",
				"378282246310005,09/23,AmericanExpress Guy", "5555555555554444,09/23,MasterCard Guy",
				"4111111111111111,09/23,Visa Guy" };

		for (int i = 0; i < creditCardTestData.length; i++) {

			String[] line = creditCardTestData[i].split(",");

			CreditCard newCard = CreditCardFactory.makeCreditCard(line[0], line[1], line[1]);
			
		
			if (newCard != null) {
				System.out.println(newCard.toString());
				goodCards.add(creditCardTestData[i]);
			}
			if (newCard == null) {
				System.out.println("We found some bad input");
				badCards.add(creditCardTestData[i]);
			}
			
			System.out.println("Bad Data: ");
			System.out.print(badCards.toString());
			System.out.println("/n");
			
			System.out.println("Good Data: ");
			System.out.print(goodCards.toString());
			System.out.println("/n");
		}

//			CreditCardFactory.makeCreditCard(null, null, null);

//			creditCardFactory.makeCreditCard(null, null, null);
//			System.out.println(creditCardTestData[i]);
	}
}
