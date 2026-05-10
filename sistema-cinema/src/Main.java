import controller.SessaoController;
import database.CreateTable;
import model.Sessao;

public class Main {

    public static void main(String[] args) {

        CreateTable.criarTabela();

        Sessao sessao = new Sessao(
                "14:00",
                "16:00",
                120
        );

        SessaoController controller =
                new SessaoController();

        controller.cadastrar(sessao);
    }
}
