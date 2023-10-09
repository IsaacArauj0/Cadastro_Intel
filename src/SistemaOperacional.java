public class SistemaOperacional extends Produto { // Classe filha da classe 'Produto'

    private String versao;

    public SistemaOperacional (String nome, double valor, String versao) {

        // Chama o construtor e inicia os atributos herdados da classe pai
        super(nome, valor); 

        // Atribui o valor da variável para um atributo do construtor 'SistemaOperacional'
        this.versao = versao; 
    }
    
    public String getNome() { // Método para acessar o valor da variável
        return nome;
    }

    public double getValor() { // Método para acessar o valor da variável
        return valor;
    }
    
    public String getVersao() { // Método para acessar o valor da variável
        return versao;
    }
    
    public void exibirinfo() { // Método para exibir as informações do Sistema Operacional
        
        super.exibirinfo(); // Chama o método exibirinfo() da classe pai
        System.out.println("Versão: " + versao); // Mostra as informações que o usuário inseriu
    }
    
}