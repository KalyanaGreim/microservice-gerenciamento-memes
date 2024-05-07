package br.com.ebac.microservicegerenciamentomemes.repositories;

import br.com.ebac.microservicegerenciamentomemes.entities.Meme;
import org.springframework.data.repository.CrudRepository;

public interface MemeRepository extends CrudRepository<Meme, Long> {
}
