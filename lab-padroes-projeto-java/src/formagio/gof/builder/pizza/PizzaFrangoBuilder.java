package formagio.gof.builder.pizza;

//Construtor Concreto
class PizzaFrangoBuilder implements PizzaBuilder {
	private Pizza pizza;

	public PizzaFrangoBuilder() {
		this.pizza = new Pizza();
	}

	@Override
	public void buildMassa() {
		pizza.setMassa("massa fina");
	}

	@Override
	public void buildMolho() {
		pizza.setMolho("molho de tomate");
	}

	@Override
	public void buildCobertura() {
		pizza.setCobertura("frango desfiado e catupiry");
	}

	@Override
	public Pizza getPizza() {
		return pizza;
	}
}