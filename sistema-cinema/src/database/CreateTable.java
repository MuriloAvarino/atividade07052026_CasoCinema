package database;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {

    public static void criarTabela() {

        String sql = """
            CREATE TABLE IF NOT EXISTS sessao (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                horario_inicio TEXT,
                horario_fim TEXT,
                publico INTEGER
            )
        """

        ;

        try (
                Connection conn =
                        ConnectionFactory.conectar();

                Statement stmt =
                        conn.createStatement()
        ) {

            stmt.execute(sql);

            System.out.println("Tabela criada!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
