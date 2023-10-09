public class Processador extends Produto { // Classe filha da classe 'Produto'

    private int nucleos;
    private int threads;
    private double frequencia;
    private double frequenciaTurbo;

    public Processador(String nome, double valor, int nucleos, int threads, double frequencia, double frequenciaTurbo) {

        super(nome, valor); // Chama o construtor e inicia os atributos herdados da classe pai

        // Atribui o valor da variável para um atributo do construtor 'Processador'
        this.nucleos = nucleos;
        this.threads = threads;
        this.frequencia = frequencia;
        this.frequenciaTurbo = frequenciaTurbo;
    }

    public String getNome() { // Método para acessar o valor da variável
        return nome;
    }

    public double getValor() { // Método para acessar o valor da variável
        return valor;
    }

    public int getNucleos() { // Método para acessar o valor da variável
        return nucleos;
    }

    public int getThreads() { // Método para acessar o valor da variável
        return threads;
    }

    public double getFrequencia() { // Método para acessar o valor da variável
        return frequencia;
    }

    public double getFrequenciaTurbo() { // Método para acessar o valor da variável
        return frequenciaTurbo;
    }

    public void exibirinfo() { // Método para exibir as informações do processador

        super.exibirinfo(); // Chama o método exibirinfo() da classe pai

        // Mostra as informações que o usuário inseriu
        System.out.println("Núcleos: " + nucleos);
        System.out.println("Threads: " + threads);
        System.out.println("Frequência: " + frequencia + " GHz");
        System.out.println("Frequência Máx. Turbo: " + frequenciaTurbo + " GHz");
    }
}