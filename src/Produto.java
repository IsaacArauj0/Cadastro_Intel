public class Produto {

    String nome;
    double valor;

    public Produto(String nome, double valor) {

        // Atribui o valor da variável para um atributo do construtor 'Produto'
        this.nome = nome;
        this.valor = valor;
    }

    public void exibirinfo() { // Método para exibir as informações que o usuário inseriu

        System.out.println("\nNome: " + nome); 
        System.out.println("Valor: R$ " + valor);
    }
}