package pizzaorder;

import javax.swing.JOptionPane;

public class UI implements ChefListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UI ui = new UI();
		for(int i = 0; i < 5; i++)
		ui.prompt();
	}
	
	public void prompt() {
		Pizza ct = new Pizza("Cheese and Tomato", 2, 5);
		Pizza bbq = new Pizza("BBQ", 5, 8);
		Pizza vs = new Pizza("Vegetarian Supreme", 12, 8);
		
		Pizza[] avaiablePizzas = new Pizza[] {ct, bbq, vs};
		for (Pizza pizza : avaiablePizzas) {
			System.out.println(pizza.getName());
		}
		
		int choice = Integer.parseInt(JOptionPane.showInputDialog(null,"Choose your pizza: "));
		Pizza selection = avaiablePizzas[choice];
		Chef chef = new Chef(selection, this);
	}
	
	public void pizzaCooked(Pizza pizza) {
		System.out.println(pizza.getName() + " pizza has been cooked. Enjoy!");
	}

}
