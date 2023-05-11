public class Server {
    // 역할
    private Menu menu;
    private int menuNumber;

    public Server()
    {
        menuNumber = -1;
    }

    public int getMenuNumber()
    {
        return this.menuNumber;
    }

    public void setMenu(Menu menu)
    {
        this.menu = menu;
    }

    public void showMenuAll()
    {
        for (int i = 0; i < menu.menu.length; i++)
        {
            System.out.printf("%s, %d\n",
                                menu.menu[i],
                                menu.price[i]);
        }
    }

    public boolean order(String menuName)
    {
        int orderNum = -1;
        for (int i = 0; i < menu.menu.length; i++)
        {
            if (menuName.equals(menu.menu[i]))
            {
                orderNum = i;
            }
        }

        if (orderNum == -1) {
            return false;
        }
        else {
            menuNumber = orderNum;
            return true;
        }
    }

    public void Serving(Coffee orderedCoffee)
    {
        System.out.printf("주문하신 커피 나왔습니다. %d\n", orderedCoffee.shot);
    }
}
