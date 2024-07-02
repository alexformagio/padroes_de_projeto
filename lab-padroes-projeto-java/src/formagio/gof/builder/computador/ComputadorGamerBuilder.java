package formagio.gof.builder.computador;


class ComputadorGamerBuilder implements ComputadorBuilder {
	private Computador computador;

	public ComputadorGamerBuilder() {
		this.computador = new Computador();
	}

	@Override
	public void buildCPU() {
		computador.setCPU("Intel i9");
	}

	@Override
	public void buildGPU() {
		computador.setGPU("NVIDIA RTX 3080");
	}

	@Override
	public void buildMemoriaRAM() {
		computador.setMemoriaRAM("32GB");
	}

	@Override
	public void buildArmazenamento() {
		computador.setArmazenamento("1TB SSD");
	}

	@Override
	public Computador getComputador() {
		return computador;
	}
}