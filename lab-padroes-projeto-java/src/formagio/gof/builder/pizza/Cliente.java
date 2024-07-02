package formagio.gof.builder.pizza;

//Cliente
public class Cliente {
	public static void main(String[] args) {
		PizzaBuilder builderHavaina = new PizzaHavaianaBuilder();
		PizzaBuilder builderFrango = new PizzaFrangoBuilder();
		Diretor diretor = new Diretor();
		Pizza pizzaHavaiava = diretor.montarPizza(builderHavaina);
		Pizza pizzaFrango = diretor.montarPizza(builderFrango);
		System.out.println(pizzaHavaiava);
		System.out.println(pizzaFrango);		
	}
}