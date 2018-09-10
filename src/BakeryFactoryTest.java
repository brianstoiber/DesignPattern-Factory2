import java.util.Scanner;

public class BakeryFactoryTest {

	// asking customer what item they want
	public static void main(String[] args) {
		System.out.println("Would you like to purchase a...(enter the number) \n1. Donut \n2. Cookie");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		DonutFactory donutStore = new DonutFactory();
		CookieFactory cookieStore = new CookieFactory();
		switch(choice){
		case 1:
			System.out.println("What kind of donut do you want? \nBostonCream \nGlazed \nLongJohn \nMarbleFrosted \nChocolateFrosted");
			String type = sc.next();
			donutStore.order(type);
			break;
		case 2: 
			System.out.println("What kind of donut do you want? \nChocolateChip \nPeanutButter \nOatmeal");
			String cookieType = sc.next();
			cookieStore.order(cookieType);
			break;
		default:
			break;
			
		}
	}

}