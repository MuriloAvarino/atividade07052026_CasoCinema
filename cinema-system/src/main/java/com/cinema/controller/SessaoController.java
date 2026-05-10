package com.cinema.controller;

import com.cinema.model.Sessao;
import com.cinema.service.SessaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sessoes")
public class SessaoController {

    @Autowired
    private SessaoService service;

    @PostMapping
    public Sessao cadastrar(@RequestBody Sessao sessao) {
        return service.salvar(sessao);
    }
}