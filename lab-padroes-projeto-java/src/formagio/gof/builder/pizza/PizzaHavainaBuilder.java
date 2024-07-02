package formagio.gof.builder.pizza;

//Construtor Concreto
class PizzaHavaianaBuilder implements PizzaBuilder {
	private Pizza pizza;

	public PizzaHavaianaBuilder() {
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
		pizza.setCobertura("presunto e abacaxi");
	}

	@Override
	public Pizza getPizza() {
		return pizza;
	}
}
