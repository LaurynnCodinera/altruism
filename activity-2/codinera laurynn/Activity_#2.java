import java.util.Scanner;

class Main {
          //FOODS WITH RICE
        static int burgerSteak = 0;
		static int friedChicken = 0;
		static int porkAdobo = 0;
		static int burger = 0;
		static int fries = 0;
		static int pizza = 0;
		static int sprite = 0;
		static int cocacola = 0;
		static int icedTea = 0;
           //LIST OF PRICE
		static int pBurgerSteak = 75;
		static int pFriedChicken = 85;
		static int pPorkAdobo = 85;
		static int pBurger = 45;
		static int pFries = 45;
		static int pPizza = 129;
		static int pSprite = 30;
		static int pCocacola = 30;
		static int pIcedTea = 30;
       //SUM
        static int sBurgerSteak = 0;
		static int sFriedChicken = 0;
		static int sPorkAdobo = 0;
		static int sBurger = 0;
		static int sFries = 0;
		static int sPizza = 0;
		static int sSprite = 0;
		static int sCocacola = 0;
		static int sIcedTea = 0;
		static int total = 0;
        //repeat
        static boolean repeat1 = false;
        static boolean repeat2 = false;

    static void listAll() {
        Scanner paymentMethod = new Scanner(System.in);
        System.out.println("You ordered:");
        System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
            if (burgerSteak > 0) {
            System.out.println("Burger Steak: " + sBurgerSteak + " Pesos (" +burgerSteak + ")");
            repeat1 = false;
        }
            if (friedChicken > 0) {
                System.out.println("Fried Chicken: " + sFriedChicken + " Pesos (" +friedChicken + ")");
            repeat1 = false;
        }
            if (porkAdobo > 0) {
                System.out.println("Pork Adobo:  " + sPorkAdobo + " Pesos (" +porkAdobo + ")");
            repeat1 = false;
        }
            if (burger > 0) {
                System.out.println("Burger:  " + sBurger + " Pesos (" +burger + ")");
            repeat1 = false;
        }         
            if (fries > 0) {
                System.out.println("Fries: " + sFries + " Pesos (" +fries + ")");
            repeat1 = false;
        }     
            if (pizza > 0) {
                System.out.println("Pizza:  " + sPizza + " Pesos (" +pizza + ")");
            repeat1 = false;
        }     
            if (sprite > 0) {
                System.out.println("Sprite:  " + sSprite + " Pesos (" +sprite + ")");
            repeat1 = false;
        }     
            if (cocacola > 0) {
                System.out.println("Coca cola:  " + sCocacola + " Pesos (" +cocacola + ")");
            repeat1 = false;
        }     
            if (icedTea > 0) {
                System.out.println("Iced Tea: " + sIcedTea + " Pesos (" +icedTea + ")");
            repeat1 = false;
        }     
    System.out.println("Total: " + total + " Pesos");
    System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
    do {
    System.out.println("Select payment method");
    System.out.println("1. Gcash");
    System.out.println("2. Cash");
        int pM = paymentMethod.nextInt();
            switch (pM) {
                case 1:
                System.out.println("Sorry, this payment method is not available at the moment.");
                repeat2 = true;
                break;
                case 2:
                System.out.print("Thanks for your order! We'll deliver it to you shortly :) ");
                repeat2 = false;
                break;
                default:
                System.out.println("Invalid input.");
                System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
                repeat2 = true;
                break;
            }
        }
        while (repeat2);


    paymentMethod.close();
    }
    

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        
        System.out.print("Do you want to place an order? (Yes/No): ");
        String answer = console.nextLine();
        do {
            if (answer.equals("Yes")) {
                 System.out.println("☆☆☆MENU☆☆☆");
		System.out.println("••••FOODS WITH RICE••••");
			System.out.println("1. Burger Steak");
			System.out.println("2. Fried Chicken");
			System.out.println("3. Pork Adobo");
			System.out.println("••••SNACKS••••");
			System.out.println("4. Burger");
			System.out.println("5. Fries");
			System.out.println("6. Pizza");
			System.out.println("••••BEVERAGES••••");
			System.out.println("7. Sprite");
			System.out.println("8. Coca cola");
			System.out.println("9. Iced Tea");
			System.out.println("10. Cancel Order");
             int order = console.nextInt();
                console.nextLine();
                
                    switch (order) {
                        case 1:
                        burgerSteak++;
                        sBurgerSteak = sBurgerSteak + pBurgerSteak;
                        total = total + pBurgerSteak;
                        System.out.println("Successfully added Burger Steak");
                        System.out.println("Do you want to order more? (Yes/No): ");
                            String response1 = console.nextLine();
                            if (response1.equals("Yes")) {
                                repeat1 = true;
                            }
                            else if (response1.equals("No")){
                            System.out.println("Your total amount to pay is " + total); }   
                            else {
                	System.out.println("Invalid input!");
                	}
                            
                        break;
                        
                        case 2:
                        friedChicken++;
                        sFriedChicken = sFriedChicken + pFriedChicken;
                        total = total + pFriedChicken;
                        System.out.println("Successfully added Fried Chicken");
                        System.out.println("Do you want to order more? (Yes/No): ");
                            String response2 = console.nextLine();
                            if (response2.equals("Yes")) {
                                repeat1 = true;
                            }
                            else if (response2.equals("No"))  {
                            listAll();
                        }
                        else {
                	System.out.println("Invalid input!");
                	repeat1 = true;
                	}
                        break;
                        
                        case 3:
                        porkAdobo++;
                        sPorkAdobo = sPorkAdobo + pPorkAdobo;
                        total = total + pPorkAdobo;
                        System.out.println("Successfully added Pork Adobo");
                        System.out.println("Do you want to order more? (Yes/No): ");
                            String response3 = console.nextLine();
                            if (response3.equals("Yes")) {
                                repeat1 = true;
                            }
                            else if (response3.equals("No"))  {
                            listAll();
                        }
                        else {
                	System.out.println("Invalid input!");
                repeat1 = true;	}
                        break;
                        
  
                        case 4:
                        burger++;
                        sBurger = sBurger + pBurger;
                        total = total + pBurger;
                        System.out.println("Successfully added Burger");
                        System.out.println("Do you want to order more? (Yes/No): ");
                            String response4 = console.nextLine();
                            if (response4.equals("Yes")) {
                                repeat1 = true;
                            }
                            else if (response4.equals("No"))  {
                            listAll();
                            }
                            else {
                	System.out.println("Invalid input!");
                repeat1 = true;	}
                        break;
                        
                         case 5:
                        fries++;
                        sFries = sFries + pFries;
                        total = total + pFries;
                        System.out.println("Successfully added Fries ");
                        System.out.println("Do you want to order more? (Yes/No): ");
                            String response5 = console.nextLine();
                            if (response5.equals("Yes")) {
                                repeat1 = true;
                            }
                            else if (response5.equals("No"))  {
                            listAll();
                        }else {
                	System.out.println("Invalid input!");
                	repeat1 = true;
                	}
                        break;
                        
                        case 6:
                        pizza++;
                        sPizza = sPizza + pPizza;
                        total = total + pPizza;
                        System.out.println("Successfully added Pizza ");
                        System.out.println("Do you want to order more? (Yes/No): ");
                            String response6 = console.nextLine();
                            if (response6.equals("Yes")) {
                                repeat1 = true;
                            }
                            else if (response6.equals("No"))  {
                            listAll();
                        }else {
                	System.out.println("Invalid input!");
                	repeat1 = true;
                	}
                        break;
                        
                        case 7:
                        sprite++;
                        sSprite = sSprite + pSprite;
                        total = total + pSprite;
                        System.out.println("Successfully added Sprite");
                        System.out.println("Do you want to order more? (Yes/No): ");
                            String response7 = console.nextLine();
                            if (response7.equals("Yes")) {
                                repeat1 = true;
                            }
                            else if (response7.equals("No"))  {
                            listAll();
                        }else {
                	System.out.println("Invalid input!");
                	repeat1 = true;
                	}
                        break;
                        
                        
                        case 8:
                        cocacola++;
                        sCocacola = sCocacola + pCocacola;
                        total = total + pCocacola;
                        System.out.println("Successfully added Coca cola");
                        System.out.println("Do you want to order more? (Yes/No): ");
                            String response8 = console.nextLine();
                            if (response8.equals("Yes")) {
                                repeat1 = true;
                            }
                            else if (response8.equals("No"))  {
                            listAll();
                        }else {
                	System.out.println("Invalid input!");
                	repeat1 = true;
                	}
                        break;
                        
                        case 9:
                        icedTea++;
                        sIcedTea = sIcedTea + pIcedTea;
                        total = total + pIcedTea;
                        System.out.println("Successfully added Iced Tea");
                        System.out.println("Do you want to order more? (Yes/No): ");
                            String response9= console.nextLine();
                            if (response9.equals("Yes")) {
                                repeat1 = true;
                            }
                            else if (response9.equals("No"))  {
                            listAll();
                        }else {
                	System.out.println("Invalid input!");
                 		repeat1 = true;
                		}
                        break;
                        
                        case 10:
                        System.out.println("Order Cancelled!");
                        repeat1 = false;
                        break;
                        default:
                        System.out.println("Wrong Order Number!");
                        repeat1 = true;
                    }
                }
                if (answer.equals("No")){
                	System.out.println("Okay bye!");
                }
                
            }
                while (repeat1);
        console.close();
    }
}