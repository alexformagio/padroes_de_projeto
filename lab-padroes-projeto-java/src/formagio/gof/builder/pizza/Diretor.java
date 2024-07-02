package formagio.gof.builder.pizza;

//Diretor
class Diretor {
	public Pizza montarPizza(PizzaBuilder builder) {
		builder.buildMassa();
		builder.buildMolho();
		builder.buildCobertura();
		return builder.getPizza();
	}
}