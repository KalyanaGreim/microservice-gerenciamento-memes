package br.com.ebac.microservicegerenciamentomemes.services;

import br.com.ebac.microservicegerenciamentomemes.entities.Meme;
import br.com.ebac.microservicegerenciamentomemes.repositories.MemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemeService {
    @Autowired
    private MemeRepository memeRepository;

    public Iterable<Meme> listarTodosMemes() {
        return memeRepository.findAll();
    }

    public Meme cadastrarNovoMeme(Meme meme) {
        return memeRepository.save(meme);
    }

    public Meme obterMemeDoDia(Meme meme) {return meme;}
}
