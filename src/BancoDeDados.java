import java.sql.Connection; // Cria a conexão com o banco de dados
import java.sql.DriverManager; // Gerencia o arquivio de conexão
import java.sql.PreparedStatement; // Cria o ambiente para a conexão
import java.sql.SQLException; // Informa os erros de conexão com o banco de dados

public class BancoDeDados {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/inventario_intel"; // Caminho até o banco de dados
    private static final String USER = "root"; // Usuário
    private static final String PASSWORD = ""; // Senha

    public static void inserirProcessador(Processador processador) { // Método que insere os processadores no banco de dados

        criarProcessador(); // Chama o método criarProcessador() para criar a tabela processadores

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD); // Cria uma conexão com o banco de dados
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO processadores(nome, valor_R$, nucleos, threads, frequencia_GHz, frequencia_turbo_GHz) VALUES (?, ?, ?, ?, ?, ?)")) { // Prepara o ambiente para inserir os dados

            // Substitue as interrogações pelos valores que o usuário inseriu
            stmt.setString(1, processador.getNome());
            stmt.setDouble(2, processador.getValor());
            stmt.setInt(3, processador.getNucleos());
            stmt.setInt(4, processador.getThreads());
            stmt.setDouble(5, processador.getFrequencia());
            stmt.setDouble(6, processador.getFrequenciaTurbo());

            stmt.executeUpdate(); // Executa o código sql 'INSERT INTO'
            System.out.println("Dados inseridos"); // Mensagem caso os dados sejam inseridos com sucesso

        } catch (SQLException e) {
            System.out.println("Erros ao inserir dados: " + e.getMessage()); // Mensagem caso ocorra algum erro ao inserir os dados
        }
    }

    public static void inserirComputador(Computador computador) { // Método que insere os computadores no banco de dados

        criarComputador(); // Chama o método criarComputador() para criar a tabela computadores

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD); // Cria uma conexão com o banco de dados
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO computadores(nome, valor_R$, tipo, processador, memoria_ram_GB, unidade_armazenamento, espaco_interno_GB) VALUES (?, ?, ?, ?, ?, ?, ?)")) { // Prepara o ambiente para inserir os dados

            // Substitue as interrogações pelos valores que o usuário inseriu
            stmt.setString(1, computador.getNome());
            stmt.setDouble(2, computador.getValor());
            stmt.setString(3, computador.getTipo());
            stmt.setString(4, computador.getProcessador());
            stmt.setInt(5, computador.getRam());
            stmt.setString(6, computador.getUnidadeArmazenamento());
            stmt.setInt(7, computador.espaco());


            stmt.executeUpdate(); // Executa o código sql 'INSERT INTO'
            System.out.println("Dados inseridos"); // Mensagem caso os dados sejam inseridos com sucesso

        } catch (SQLException e) {
            System.out.println("Erros ao inserir dados: " + e.getMessage()); // Mensagem caso ocorra algum erro ao inserir os dados
        }
    }

    public static void inserirSistemaOperacional(SistemaOperacional sistemaOperacional) { // Método que insere os sistemas operacionais no banco de dados

        criarSistemaOperacional(); // Chama o método criarSistemaOperacional() para criar a tabela sistemas

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD); // Cria uma conexão com o banco de dados
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO sistemas(nome, valor_R$, versao) VALUES (?, ?, ?)")) { // Prepara o ambiente para inserir os dados

            // Substitue as interrogações pelos valores que o usuário inseriu
            stmt.setString(1, sistemaOperacional.getNome());    
            stmt.setDouble(2, sistemaOperacional.getValor());
            stmt.setString(3, sistemaOperacional.getVersao());

            stmt.executeUpdate(); // Executa o código sql 'INSERT INTO'
            System.out.println("Dados inseridos"); // Mensagem caso os dados sejam inseridos com sucesso

        } catch (SQLException e) {
            System.out.println("Erros ao inserir dados: " + e.getMessage()); // Mensagem caso ocorra algum erro ao inserir os dados
        }
    }

    public static void criarProcessador() { // Método que cria a tabela dos processadores

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD))  { // Cria uma conexão com o banco de dados

            // Cria a tabela processadores
            String createTableSQL = "CREATE TABLE IF NOT EXISTS processadores (" +
                    "Id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "valor_R$ DOUBLE," +
                    "nucleos INT," +
                    "threads INT," +
                    "frequencia_GHz DOUBLE," +
                    "frequencia_turbo_GHz DOUBLE" +
                ")";

            try (PreparedStatement stmt = conn.prepareStatement(createTableSQL)) { // Prepara o ambiente para a criação da tabela
                stmt.executeUpdate(); // Executa o código sql 'CREATE TABLE IF NOT EXISTS'
                System.out.println("\nTabela criada com sucesso"); // Mensagem caso a tabela seja criada com sucesso
            }

        } catch (SQLException e) {
            System.out.println("\nErro ao criar tabela: " + e.getMessage()); // Mensagem caso ocarra algum erro na criação da tabela
        }
    }

    public static void criarComputador() { // Método que cria a tabela dos computadores

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) { // Cria uma conexão com o banco de dados

            // Cria a tabela computadores
            String createTableSQL = "CREATE TABLE IF NOT EXISTS computadores (" +
                    "Id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "valor_R$ DOUBLE," +
                    "tipo VARCHAR(100)," +
                    "processador VARCHAR(100)," +
                    "memoria_ram_GB INT," +
                    "unidade_armazenamento VARCHAR(100)," +
                    "espaco_interno_GB INT" +
                ")";

            try (PreparedStatement stmt = conn.prepareStatement(createTableSQL)) { // Prepara o ambiente para a criação da tabela
                stmt.executeUpdate(); // Executa o código sql 'CREATE TABLE IF NOT EXISTS'
                System.out.println("\nTabela criada com sucesso"); // Mensagem caso a tabela seja criada com sucesso
            }

        } catch (SQLException e) {
            System.out.println("\nErro ao criar tabela: " + e.getMessage()); // Mensagem caso ocarra algum erro na criação da tabela
        }
    }

    public static void criarSistemaOperacional() { // Método que cria a tabela dos sistemas operacionais

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) { // Cria uma conexão com o banco de dados

            // Cria a tabela sistemas
            String createTableSQL = "CREATE TABLE IF NOT EXISTS sistemas (" +
                    "Id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "valor_R$ DOUBLE," +
                    "versao VARCHAR(100)" +
                ")";

            try (PreparedStatement stmt = conn.prepareStatement(createTableSQL)) { // Prepara o ambiente para a criação da tabela
                stmt.executeUpdate(); // Executa o código sql 'CREATE TABLE IF NOT EXISTS'
                System.out.println("\nTabela criada com sucesso"); // Mensagem caso a tabela seja criada com sucesso
            }
            
        } catch (SQLException e) {
            System.out.println("\nErro ao criar tabela: " + e.getMessage()); // Mensagem caso ocarra algum erro na criação da tabela
        }
    }
}