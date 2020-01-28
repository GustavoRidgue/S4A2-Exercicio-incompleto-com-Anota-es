package br.com.site.evento.repository;

import br.com.site.evento.model.eventoModel;
import org.springframework.data.repository.CrudRepository;

public interface eventoRepository extends CrudRepository<eventoModel, String> {

}
