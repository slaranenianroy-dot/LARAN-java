package project;
import java.util.*;
import java.lang.*;
public class task {
	Scanner s=new Scanner(System.in);
	static int total=0;
	public void menu() {
		System.out.println("\n=======PIZZA PALACE=======\n");
		System.out.println("1. Veg Pizza");
		System.out.println("2. Non Veg Pizza");
		System.out.println("3. Burgers");
		System.out.println("4. Pasta");
		System.out.println("5. Beverage");
		System.out.println("6. View Bill");
		System.out.println("7. Exit");
		System.out.println("\n==========================\n");
		System.out.println("Choose your option: ");
		int c=s.nextInt();
		switch (c) {
			case 1:
				vegPizza();
				break;
			case 2:
				nonVegPizza();
				break;
			case 3:
				burger();
				break;
			case 4:
				pasta();
				break;
			case 5:
				beverage();
				break;
			case 6:
				bill();
				break;
			default:
				System.out.println("Invalid Choice...");
		}
	}
	public void vegPizza() {
		System.out.println("\n-------Veg Pizza-------\n");
		String veg[]= {"1. Margherita","2. Farm House","3. Veg Supreme","4. Panner Pizza","5. Cheese Burst",
		};
		for(String i:veg) {
			System.out.println(i);
		}
		int c=s.nextInt();
		int price=0;
		switch (c) {
			case 1:
				price=150;
				break;
			case 2:
				price=220;
				break;
			case 3:
				price=280;
				break;
			case 4:
				price=300;
				break;
			case 5:
				price=350;
				break;	
			default:
				System.out.println("Invalid Choice...");
		}
		int n=size();
		int m=price+n;
		quantity(m);
	}
	public void nonVegPizza() {
		System.out.println("\n-------Non Veg Pizza-------\n");
		String nv[]= {"1. Chicken Pizza","2. Chicken Supreme","3. BBQ Chicken","4. Pepperoni","5. Chicken Cheese Burst",
		};
		for(String i:nv) {
			System.out.println(i);
		}
		int c=s.nextInt();
		int price=0;
		switch (c) {
			case 1:
				price=150;
				break;
			case 2:
				price=220;
				break;
			case 3:
				price=280;
				break;
			case 4:
				price=300;
				break;
			case 5:
				price=350;
				break;	
			default:
				System.out.println("Invalid Choice...");
		}
		int n=size();
		int m=price+n;
		quantity(m);
	}
	public void burger() {
		System.out.println("\n-------Burgers-------\n");
		String bur[]= {"1. Veg Burger","2. Chicken Burger","3. Chicken Burger","4. Panner Burger","5.Double Patty Burger",
		};
		for(String i:bur) {
			System.out.println(i);
		}
		int c=s.nextInt();
		int price=0;
		switch (c) {
			case 1:
				price=150;
				break;
			case 2:
				price=220;
				break;
			case 3:
				price=280;
				break;
			case 4:
				price=300;
				break;
			case 5:
				price=350;
				break;	
			default:
				System.out.println("Invalid Choice...");
		}
		int n=size();
		int m=price+n;
		quantity(m);
	}
	public void pasta() {
		System.out.println("\n-------Pasta-------\n");
		String pas[]= {"1. White Sauce pasta","2. Red Sauce Pasta","3. Alfredo Pasta","4. Cheese Pasta","5. Mixed Pasta",
		};
		for(String i:pas) {
			System.out.println(i);
		}
		int c=s.nextInt();
		int price=0;
		switch (c) {
			case 1:
				price=150;
				break;
			case 2:
				price=220;
				break;
			case 3:
				price=280;
				break;
			case 4:
				price=300;
				break;
			case 5:
				price=350;
				break;	
			default:
				System.out.println("Invalid Choice...");
		}
		int n=size();
		int m=price+n;
		quantity(m);
	}
	public void beverage() {
		System.out.println("\n-------Beverage-------\n");
		String bev[]= {"1. Coke","2. Pepsi","3. Sprite","4. Water Bottle","5. Cold Coffee",
		};
		for(String i:bev) {
			System.out.println(i);
		}
		int c=s.nextInt();
		int price=0;
		switch (c) {
			case 1:
				price=150;
				break;
			case 2:
				price=220;
				break;
			case 3:
				price=280;
				break;
			case 4:
				price=300;
				break;
			case 5:
				price=350;
				break;	
			default:
				System.out.println("Invalid Choice...");
		}
		int n=size();
		int m=price+n;
		quantity(m);
	}
	public int size() {
		String size[]= {"1. Small","2. Medium","3. Large"};
		for(String i:size) {
			System.out.println(i);
		}
		int c=s.nextInt();
			if(c==1) {
				return 10;}
			if(c==2) {
				return 80;}
			else {
				return 150;}
		}			
	public void quantity(int m) {
		s.nextInt();
		System.out.println("Enter the quantity: ");
		int q=s.nextInt();
		int amount=q*m;
		total+=amount;
		System.out.println("1.Continue");
		System.out.println("2.View Bill");
		int c=s.nextInt();
		if (c==1) {
			menu();
		}
		else {
			bill();
			coupon();
		}
	}
	public void bill() {
		System.out.println("Amount= Rs."+total);
	}
	public void coupon() {
		s.nextLine();
		System.out.println("Do you have coupon:Yes/No");
		String res=s.nextLine();
		if(res.equalsIgnoreCase("yes")) {
			System.out.println("Enter the coupon:");
			String coup=s.nextLine();
			if(coup.equals("PIZZA20")) {
				double tot=total*0.8;
				System.out.println("Final Amount="+tot);
			}
			else if(coup.equals("WELCOME10")) {
				double tot=total*0.9;
				System.out.println("Final Amount="+tot);
			}
			else{
				System.out.println("Invalid Coupon");
			}
		}
	}
	public static void main(String[] args) {
		task obj=new task();
		obj.menu();

	}

}
