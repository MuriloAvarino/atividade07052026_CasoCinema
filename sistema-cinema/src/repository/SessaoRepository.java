package repository;

import database.ConnectionFactory;
import model.Sessao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SessaoRepository {

    public void salvar(Sessao sessao) {

        String sql =
        "INSERT INTO sessao(horario_inicio, horario_fim, publico) VALUES(?,?,?)";

        try (
                Connection conn =
                        ConnectionFactory.conectar();

                PreparedStatement stmt =
                        conn.prepareStatement(sql)
        ) {

            stmt.setString(1,
                    sessao.getHorarioInicio());

            stmt.setString(2,
                    sessao.getHorarioFim());

            stmt.setInt(3,
                    sessao.getPublico());

            stmt.execute();

            System.out.println("Sessão salva!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
