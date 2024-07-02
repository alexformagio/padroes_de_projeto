package formagio.gof.builder.computador;

//Cliente
public class Cliente {
	public static void main(String[] args) {
		ComputadorBuilder builder = new ComputadorGamerBuilder();
		Diretor diretor = new Diretor();
		Computador computador = diretor.montarComputador(builder);
		System.out.println(computador);
	}
}
