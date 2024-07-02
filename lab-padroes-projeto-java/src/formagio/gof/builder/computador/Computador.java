package formagio.gof.builder.computador;

//Produto final
class Computador {
	private String CPU;
	private String GPU;
	private String memoriaRAM;
	private String armazenamento;
	
	

	public void setCPU(String CPU) {
		this.CPU = CPU;
	}

	public void setGPU(String GPU) {
		this.GPU = GPU;
	}

	public void setMemoriaRAM(String memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}

	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}
	

	public String getCPU() {
		return CPU;
	}

	public String getGPU() {
		return GPU;
	}

	public String getMemoriaRAM() {
		return memoriaRAM;
	}

	public String getArmazenamento() {
		return armazenamento;
	}

	@Override
	public String toString() {
		return "Computador{" + "CPU='" + CPU + '\'' + ", GPU='" + GPU + '\'' + ", memoriaRAM='" + memoriaRAM + '\''
				+ ", armazenamento='" + armazenamento + '\'' + '}';
	}
}