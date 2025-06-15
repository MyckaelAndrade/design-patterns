public class Celular {
    private String processador;
    private String memoriaRAM;
    private String armazenamento;
    private String camera;

    // Métodos setters
    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    // Método para exibir as informações
    public void exibirConfiguracao() {
        System.out.println("📱 Celular Configurado:");
        System.out.println("- Processador: " + processador);
        System.out.println("- RAM: " + memoriaRAM);
        System.out.println("- Armazenamento: " + armazenamento);
        System.out.println("- Câmera: " + camera);
    }
}
