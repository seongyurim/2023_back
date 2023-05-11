import java.util.Scanner;

public class App2 {

    public static int checkMenu(String orderedMenu){

        String[] menu = new String[] {
            "아메리카노",
            "다방커피",
            "카페라떼",
            "에스프레소"
        };

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(orderedMenu))
            {
                return i;
            }
        }

    }

    public static void showMenuAll()
    {
        String[] menu = new String[] {
            "아메리카노",
            "다방커피",
            "카페라떼",
            "에스프레소"
        };
    
        int[] price = new int[] {
            4500,
            4000,
            5500,
            5000
        };

        for (int i = 0; i < menu.length; i++)
        {
            System.out.printf("%s, %d\n",
                                menu[i],
                                price[i]);
        }
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String orderedMenu;
        int orderNumber;

        do {

            showMenuAll();

            orderedMenu = scan.nextLine();

            orderNumber = checkMenu(orderedMenu);


        } while(orderNumber == -1);

        switch(orderNumber)
        {
            case 0:
            System.out.println("주문하신 아메리카노 나왔습니다. shot1");
            break;

            case 1:
            System.out.println("주문하신 다방커피 나왔습니다. shot1, milk");
            break;

            case 2:
            System.out.println("주문하신 카페라떼 나왔습니다. shot1, milk");
            break;

            case 3:
            System.out.println("주문하신 에스프레소 나왔습니다. shot2");
            break;
        }

    }
}
