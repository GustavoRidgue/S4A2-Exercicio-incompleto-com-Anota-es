package br.com.site.evento.service;

import br.com.site.evento.model.eventoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.site.evento.repository.eventoRepository;

@Service
public class eventoService {

    @Autowired
    private eventoRepository repository;

    public eventoModel agendarEvento(eventoModel evento) {
        return repository.save(evento);
    }
}