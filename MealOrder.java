
public class MealOrder {
	
	private Burger burger;
	private Item drik;
	private Item side;
	
	public MealOrder() {
		this("regular", "coke", "fries");
	}
	
	public MealOrder( String burgerType,String drinkType, String sideType) {
		this.burger=new Burger(burgerType, 4.0);
		this.drik=new Item("drink", drinkType, 1.00); 
		this.side=new Item("side", sideType,1.50);
	}
	public double getTotalPrice() {
		return side.getAdjustedPrice()+drik.getAdjustedPrice()+burger.getAdjustedPrice();
	}
	public void printItemizedList() {
		burger.printItem();
		drik.printItem();
		side.printItem();
		System.out.println("-".repeat(30));
		Item.printItem("TOTAL PRICE", getTotalPrice());
	}
	
	public void addBurgerToppings(String extra1, String extra2, String extra3) {
		burger.addToppings(extra1, extra2, extra3);
	}
	
	public void setyDrinksSize(String size) {
		drik.setSize(size);
	}

}
