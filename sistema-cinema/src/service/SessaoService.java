package service;

import model.Sessao;
import repository.SessaoRepository;

public class SessaoService {

    private SessaoRepository repository =
            new SessaoRepository();

    public void cadastrarSessao(
            Sessao sessao) {

        if(sessao.getPublico() < 0) {

            System.out.println(
                    "Público inválido");

            return;
        }

        repository.salvar(sessao);
    }
}
