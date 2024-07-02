package formagio.gof.builder.computador;

//Interface Builder
interface ComputadorBuilder {
	void buildCPU();

	void buildGPU();

	void buildMemoriaRAM();

	void buildArmazenamento();

	Computador getComputador();
}