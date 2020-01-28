package br.com.site.evento.controller;

import br.com.site.evento.model.eventoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import br.com.site.evento.service.eventoService;

@Controller
public class eventoController {
    @Autowired
    private eventoService service;

    @GetMapping("/")
    public String showHome(){
        return "index";
    }
    @PostMapping("/agendar")
    public String cadastrarEvento(eventoModel evento) {

        return "index";
    }
}
