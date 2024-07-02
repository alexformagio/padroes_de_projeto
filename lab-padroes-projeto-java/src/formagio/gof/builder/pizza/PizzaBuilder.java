package formagio.gof.builder.pizza;

//Interface Builder
interface PizzaBuilder {
	void buildMassa();

	void buildMolho();

	void buildCobertura();

	Pizza getPizza();
}
