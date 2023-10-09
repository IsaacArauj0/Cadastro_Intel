import java.util.Scanner; // Biblioteca que permite a entrada de dados pelo usuário

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Inicia o scanner
        boolean voltarAoInicio = true; // Variável que controla o loop

        while (voltarAoInicio) { // Loop que faz o código voltar ao menu principal depois de realizar alguma atividade
            // Menu principal
            System.out.println("\nEscolha um módulo:");
            System.out.println("1. Cadastro");
            System.out.println("2. Consulta");
            System.out.println("3. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (escolha) {
                case 1:
                // Menu de Cadastro
                    System.out.println("\nEscolha um produto para cadastrar:");
                    System.out.println("1. Processador");
                    System.out.println("2. Computadores");
                    System.out.println("3. Sistemas Operacionais");
                    System.out.println("4. Voltar");
                    int escolha2 = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner

                    switch (escolha2) {
                        case 1:
                            System.out.println("\nDigite o nome do Processador: ");
                            String nomeProcessador = scanner.nextLine(); // Lê e armazena o nome do processador

                            System.out.println("\nDigite o valor do Processador: ");
                            double valorProcessador = scanner.nextDouble(); // Lê e armazena o valor do processador
                            scanner.nextLine(); // Limpa o buffer do scanner

                            System.out.println("\nDigite quantos núcleos o Processador tem: ");
                            int nucleosProcessador = scanner.nextInt(); // Lê e armazena quantos nucleos o processador tem
                            scanner.nextLine(); // Limpa o buffer do scanner

                            System.out.println("\nDigite quantos threads o Processador tem: ");
                            int threadsProcessador = scanner.nextInt(); // Lê e armazena quantos threads o processador tem
                            scanner.nextLine(); // Limpa o buffer do scanner

                            System.out.println("\nDigite qual a frequência básica do Processador: ");
                            double frequenciaProcessador = scanner.nextDouble(); // Lê e armazena qual a frequencia basica do processador
                            scanner.nextLine(); // Limpa o buffer do scanner

                            System.out.println("\nDigite qual a frequência máxima do Processador: ");
                            double frequenciaTurboProcessador = scanner.nextDouble(); // Lê e armazena qual a frequencia máxima do processador
                            scanner.nextLine(); // Limpa o buffer do scanner

                            // Cria um novo objeto processador com base nos valores que o usuário inseriu
                            Processador novoProcessador = new Processador(nomeProcessador, valorProcessador, nucleosProcessador, threadsProcessador, frequenciaProcessador, frequenciaTurboProcessador);
                            novoProcessador.exibirinfo(); // Chama o método exibir.info() para imprimir na tela as informações do novo processador que foram inseridas pelo usuário
                            BancoDeDados.inserirProcessador(novoProcessador); // Chama o método inserirProcessador para inserir o novo objeto processador no Banco de Dados

                            /* Para Teste:
                            * nome: Intel Core I3-12100F
                            * valor: 659,00
                            * nucleos: 4
                            * threads: 8
                            * frequencia basica: 3,3
                            * frequencia turbo: 4,30 */
                        break;

                        case 2:
                            System.out.println("\nDigite o nome do Computador: ");
                            String nomeComputador = scanner.nextLine(); // Lê e armazena o nome do computador

                            System.out.println("\nDigite o valor do Computador: ");
                            double valorComputador = scanner.nextDouble(); // Lê e armazena o valor do computador
                            scanner.nextLine(); // Limpa o buffer do scanner

                            System.out.println("\nDigite o tipo do Computador: ");
                            String tipoComputador = scanner.nextLine(); // Lê e armazena o tipo do computador

                            System.out.println("\nDigite o processador do Computador: ");
                            String processadorComputador = scanner.nextLine(); // Lê e armazena o processador do computador

                            System.out.println("\nDigite a mémoria RAM do Computador: ");
                            int ramProcessador = scanner.nextInt(); // Lê e armazena a mémoria ram do computador
                            scanner.nextLine(); // Limpa o buffer do scanner

                            System.out.println("\nDigite qual a unidade de armazenamento do Computador: ");
                            String unidadeArmazenamentoComputador = scanner.nextLine(); // Lê e armazena o unidade de armazenamento do computador

                            System.out.println("\nDigite o espaço interno do Computador: ");
                            int espacoProcessador = scanner.nextInt(); // Lê e armazena o tamanho do espaço interno do computador
                            scanner.nextLine(); // Limpa o buffer do scanner

                            // Cria um novo objeto processador com base nos valores que o usuário inseriu
                            Computador novoComputador = new Computador(nomeComputador, valorComputador, tipoComputador, processadorComputador, ramProcessador, unidadeArmazenamentoComputador, espacoProcessador);
                            novoComputador.exibirinfo(); // Chama o método exibir.info() para imprimir na tela as informações do novo computador que foram inseridas pelo usuário
                            BancoDeDados.inserirComputador(novoComputador); // Chama o método inserirComputador para inserir o novo objeto computador no Banco de Dados

                            /* Para teste:
                            * nome: Computador Pichau Gamer
                            * valor: 3.489,98
                            * tipo: Desktop
                            * processador: Intel Core I5-10400F
                            * memoria ram: 16
                            * unidade de armazenamento: SSD
                            * espaço interno: 480 */
                        break;

                        case 3:
                            System.out.println("\nDigite o nome do Sistema Operacional"); 
                            String nomeSistemaOperacional = scanner.nextLine(); // Lê e armazena o nome do sistema operacional

                            System.out.println("\nDigite o valor do Sistema Operacional");
                            double valorSistemaOperacional = scanner.nextDouble(); // Lê e armazena o valor do sistema operacional
                            scanner.nextLine(); // Limpa o buffer do scanner

                            System.out.println("\nDigite a versão do Sistema Operacional");
                            String versaoSistemaOperacional = scanner.nextLine(); // Lê e armazena a versão do sistema operacional

                            // Cria um novo objeto sistemaOperacional com base nos valores que o usuário inseriu
                            SistemaOperacional novoSistemaOperacional = new SistemaOperacional(nomeSistemaOperacional, valorSistemaOperacional, versaoSistemaOperacional); 
                            novoSistemaOperacional.exibirinfo(); // Chama o método exibir.info() para imprimir na tela as informações do novo sistema operacional que foram inseridas pelo usuário
                            BancoDeDados.inserirSistemaOperacional(novoSistemaOperacional); // Chama o método inserirSistemaOperacional para inserir o novo objeto sistema operacional no Banco de Dados

                            /* Para teste:
                            * nome: Windows
                            * valor: 739,99
                            * versao: 10 PRO */
                        break;

                        case 4: // Volta para o menu principal
                        break;
                    }
                break;

                case 2:
                // Menu de consulta
                    System.out.println("\nEscolha um produto para consultar:");
                    System.out.println("1. Processador");
                    System.out.println("2. Computadores");
                    System.out.println("3. Sistemas Operacionais");
                    System.out.println("4. Voltar");
                    int escolha3 = scanner.nextInt();
                    scanner.nextLine();

                    switch (escolha3) {
                        case 1:
                        // Chama a função consultaProcessador() para consultar os processadores que estão no banco de dados
                            ConsultaSQL.ConsultaProcessador();
                        break;

                        case 2:
                        // Chama a função ConsultaComputador() para consultar os computadores que estão no banco de dados
                            ConsultaSQL.ConsultaComputador();
                        break;

                        case 3:
                        // Chama a função ConsultaSistemaOperacional() para consultar os sistemas operacionais que estão no banco de dados
                            ConsultaSQL.ConsultaSistemaOperacional();
                        break;

                        case 4: // Volta para o menu principal
                        break;
                    }
                break;

                case 3:
                    voltarAoInicio = false; // Encerra o loop
                    System.out.println("\nAté logo!");
                break;

                default:
                    System.out.println("\nEscolha inválida. Por favor, escolha uma opção válida."); // Caso o usuário escolha um número inválido
                break;
            }
        }

        scanner.close(); // Encerra o scanner
    }
}