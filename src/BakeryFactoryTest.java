import java.util.Scanner;

public class BakeryFactoryTest {

	// asking customer what type of item they want
	public static void main(String[] args) {
		System.out.println("Would you like to purchase? \n1. Donut \n2. Cookie \n (enter the number)");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		// creating new item in respective factories
		DonutFactory donutStore = new DonutFactory();
		CookieFactory cookieStore = new CookieFactory();
		
		// selecting the type of donut or cookie the customer decided to choose
		switch(choice){
		case 1:
			System.out.println("What kind of donut do you want? \nBostonCream \nGlazed \nLongJohn \nMarbleFrosted \nChocolateFrosted \n (enter the name)");
			String type = sc.next();
			donutStore.order(type);
			break;
		case 2: 
			System.out.println("What kind of cookie do you want? \nChocolateChip \nPeanutButter \nOatmeal \n (enter the name)");
			String cookieType = sc.next();
			cookieStore.order(cookieType);
			break;
		default:
			break;
			
		}
	}

}