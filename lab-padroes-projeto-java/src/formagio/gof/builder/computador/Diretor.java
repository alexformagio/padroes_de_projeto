package formagio.gof.builder.computador;

//Diretor
class Diretor {
	public Computador montarComputador(ComputadorBuilder builder) {
		builder.buildCPU();
		builder.buildGPU();
		builder.buildMemoriaRAM();
		builder.buildArmazenamento();
		return builder.getComputador();
	}
}