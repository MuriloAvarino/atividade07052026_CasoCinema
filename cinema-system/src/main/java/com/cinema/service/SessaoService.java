package com.cinema.service;

import com.cinema.model.Sessao;
import com.cinema.repository.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessaoService {

    @Autowired
    private SessaoRepository repository;

    public Sessao salvar(Sessao sessao) {
        return repository.save(sessao);
    }
}