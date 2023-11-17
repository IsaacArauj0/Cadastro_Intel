import java.sql.Connection; // Cria a conexão com o banco de dados
import java.sql.DriverManager; // Gerencia o arquivio de conexão
import java.sql.PreparedStatement; // Cria o ambiente para a conexão
import java.sql.ResultSet; // Contém os resultados da consulta sql na forma de linhas e colunas, permitindo o acesso aos dados do banco de dados.
import java.sql.SQLException; // Informa os erros de conexão com o banco de dados

public class ConsultaSQL {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/inventory_intel"; // Caminho até o banco de dados
    private static final String USER = "root"; // Usuário
    private static final String PASSWORD = ""; // Senha

    public static void ConsultaProcessador() { // Método que consulta as informações na tabela processadores

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD); // Cria uma conexão com o banco de dados
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM processadores"); // Prepara o ambiente para a consulta
                ResultSet resultSet = stmt.executeQuery()) { // Executa a consulta de uma linha da tabela e guarda as informações

            while (resultSet.next()) { // Loop que faz o código percorrer todas as linhas da tabela

                // Consulta os valores das colunas da tabela e armazena esses valores em variáveis
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                double valor = resultSet.getDouble("valor_R$");
                int nucleos = resultSet.getInt("nucleos");
                int threads = resultSet.getInt("threads");
                double frequencia = resultSet.getDouble("frequencia_GHz");
                double frequenciaTurbo = resultSet.getDouble("frequencia_turbo_GHz");

                // Imprime o valor das variáveis
                System.out.println("\nID: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Valor: R$ " + valor);
                System.out.println("Núcleos: " + nucleos);
                System.out.println("Threads: " + threads);
                System.out.println("Frequência: " + frequencia + " GHz");
                System.out.println("Frequência Máx. Turbo: " + frequenciaTurbo + " GHz");
            }

        } catch (SQLException e) {
            System.out.println("\nErro na consulta: " + e.getMessage()); // Mensagem caso ocarra algum erro na consulta
        }
    }

    public static void ConsultaComputador() { // Método que consulta as informações na tabela computadores

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD); // Cria uma conexão com o banco de dados
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM computadores"); // Prepara o ambiente para a consulta
                ResultSet resultSet = stmt.executeQuery()) { // Executa a consulta de uma linha da tabela e guarda as informações

            while (resultSet.next()) { // Loop que faz o código percorrer todas as linhas da tabela
                
                // Consulta os valores das colunas da tabela e armazena esses valores em variáveis
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                Double valor = resultSet.getDouble("valor_R$");
                String tipo = resultSet.getString("tipo");
                String processador = resultSet.getString("processador");
                int ram = resultSet.getInt("memoria_ram_GB");
                String unidadeArmazenamento = resultSet.getString("unidade_armazenamento");
                int espaco = resultSet.getInt("espaco_interno_GB");

                // Imprime o valor das variáveis
                System.out.println("\nID: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Valor: R$ " + valor);
                System.out.println("Tipo: " + tipo);
                System.out.println("Processador: " + processador);
                System.out.println("Mémoria RAM: " + ram + " GB");
                System.out.println("Unidade de Armazenamento: " + unidadeArmazenamento);
                System.out.println("Espaço Interno: " + espaco + " GB");
            }

        } catch (SQLException e) {
            System.out.println("\nErro na consulta: " + e.getMessage()); // Mensagem caso ocarra algum erro na consulta
        }
    }

    public static void ConsultaSistemaOperacional() { // Método que consulta as informações na tabela sistemas

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD); // Cria uma conexão com o banco de dados
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM sistemas"); // Prepara o ambiente para a consulta
        ResultSet resultSet = stmt.executeQuery()) { // Executa a consulta de uma linha da tabela e guarda as informações

            while (resultSet.next()) { // Loop que faz o código percorrer todas as linhas da tabela

                // Consulta os valores das colunas da tabela e armazena esses valores em variáveis
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                double valor = resultSet.getDouble("valor_R$");
                String versao = resultSet.getString("versao");

                // Imprime o valor das variáveis
                System.out.println("\nID: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Valor: R$ " + valor);
                System.out.println("Versão: " + versao);
            }
            
        } catch (SQLException e) {
            System.out.println("\nErro na consulta: " + e.getMessage()); // Mensagem caso ocarra algum erro na consulta
        }
    }
}