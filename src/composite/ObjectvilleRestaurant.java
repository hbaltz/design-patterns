package composite;

import composite.menu.IMenuComposite;
import composite.menu.Menu;
import composite.menu.menu_item.MenuItem;
import composite.waitress.Waitress;

public class ObjectvilleRestaurant {
    public static void main(String[] args) {
        // Pancake house menu
        IMenuComposite pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");

        pancakeHouseMenu.add(new MenuItem(
                "K&B's pancake breakfast",
                "Pancake with scrambled eggs and toast",
                true,
                2.99
        ));
        pancakeHouseMenu.add(new MenuItem(
                "Blueberry Pancakes",
                "Delicious pancakes made with fresh blueberries",
                true,
                3.99
        ));
        pancakeHouseMenu.add(new MenuItem(
                "Banana Walnut Pancakes",
                "Fluffy pancakes with sliced bananas and walnuts",
                true,
                5.49
        ));
        pancakeHouseMenu.add(new MenuItem(
                "Chocolate Chip Pancakes",
                "Pancakes loaded with chocolate chips",
                true,
                6.19
        ));

        // Diner menu
        IMenuComposite dinerMenu = new Menu("DINER MENU", "Lunch");

        dinerMenu.add(new MenuItem(
                "Cheeseburger",
                "Juicy beef patty topped with cheese",
                false,
                9.99
        ));
        dinerMenu.add(new MenuItem(
                "BLT Sandwich",
                "Classic bacon, lettuce, and tomato sandwich",
                true,
                8.49
        ));
        dinerMenu.add(new MenuItem(
                "Chicken Caesar Salad",
                "Grilled chicken breast on a bed of fresh romaine lettuce",
                false,
                10.99
        ));
        dinerMenu.add(new MenuItem(
                "Hot Dog",
                "Grilled hot dog served with mustard and ketchup",
                false,
                6.99
        ));

        //Dessert menu include in the diner menu
        IMenuComposite dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Classic New York Cheesecake",
                "Creamy cheesecake with a graham cracker crust, topped with fresh strawberries",
                true,
                5.99
        ));
        dessertMenu.add(new MenuItem(
                "Chocolate Lava Cake",
                "Warm chocolate cake with a molten chocolate center, served with vanilla ice cream",
                true,
                6.49
        ));
        dessertMenu.add( new MenuItem(
                "Fruit Tart",
                "Butter pastry shell filled with vanilla custard and topped with assorted fresh fruits",
                true,
                4.99
        ));

        // Cafe menu
        IMenuComposite cafeMenu = new Menu("CAFE MENU", "Dinner");

        cafeMenu.add(new MenuItem(
                "Classic Cheeseburger",
                "Juicy beef patty with melted cheese, lettuce, tomato, and special sauce on a sesame seed bun",
                false,
                8.99
        ));
        cafeMenu.add(new MenuItem(
                "Vegetarian Club Sandwich",
                "Grilled tofu, avocado, lettuce, tomato, and vegan mayo on whole wheat bread",
                true,
                9.49
        ));
        cafeMenu.add(new MenuItem(
                "Homestyle Chicken Pot Pie",
                "Tender chicken and mixed vegetables in a savory gravy, topped with flaky pastry crust",
                false,
                10.99
        ));


        // Global menu
        IMenuComposite globalMenu = new Menu("MENU", "Enjoy your meal!");
        globalMenu.add(pancakeHouseMenu);
        globalMenu.add(dinerMenu);
        globalMenu.add(cafeMenu);

        // Waitress
        Waitress waitress= new Waitress(globalMenu);

        waitress.printMenu();
    }
}
