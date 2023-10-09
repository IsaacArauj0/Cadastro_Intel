public class Computador extends Produto { // Classe filha da classe 'Produto'

    private String tipo;
    private String processador;
    private int ram;
    private String unidadeArmazenamento;
    private int espaco;

    public Computador(String nome, double valor, String tipo, String processador, int ram, String unidadeArmazenamento, int espaco) {

        super(nome, valor); // Chama o construtor e inicia os atributos herdados da classe pai

        // Atribui o valor da váriavel para um atributo do construtor 'Computador'
        this.tipo = tipo;
        this.processador = processador;
        this.ram = ram;
        this.unidadeArmazenamento = unidadeArmazenamento;
        this.espaco = espaco;
    }
    
    public String getNome() { // Método para acessar o valor da variável
        return nome;
    }

    public double getValor() { // Método para acessar o valor da variável
        return valor;
    }

    public String getTipo() { // Método para acessar o valor da variável
        return tipo;
    }

    public String getProcessador() { // Método para acessar o valor da variável
        return processador;
    }

    public int getRam() { // Método para acessar o valor da variável
        return ram;
    }

    public String getUnidadeArmazenamento() { // Método para acessar o valor da variável
        return unidadeArmazenamento;
    }

    public int espaco() { // Método para acessar o valor da variável
        return espaco;
    }

    // Método para exibir as informações do processador
    public void exibirinfo() {

        super.exibirinfo(); // Chama o método exibirinfo() da classe pai

        // Mostra as informações que o usuário inseriu
        System.out.println("Tipo: " + tipo);
        System.out.println("Processador: " + processador);
        System.out.println("Mémoria RAM: " + ram + " GB");
        System.out.println("Unidade de Armazenamento: " + unidadeArmazenamento);
        System.out.println("Espaço Interno: " + espaco + " GB");
    }
}