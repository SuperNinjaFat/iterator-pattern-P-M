import java.util.ArrayList;

public class PancakeHouseMenu {
	
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("K&B's pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
		
	}
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
		
	}
	
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
	
	public Iterator createIterator() {
		return null;
	}
}
