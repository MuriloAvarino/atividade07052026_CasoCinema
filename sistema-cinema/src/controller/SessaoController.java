package controller;

import model.Sessao;
import service.SessaoService;

public class SessaoController {

    private SessaoService service =
            new SessaoService();

    public void cadastrar(
            Sessao sessao) {

        service.cadastrarSessao(sessao);
    }
}
