package br.com.ebac.microservicegerenciamentomemes.controllers;

import br.com.ebac.microservicegerenciamentomemes.entities.Meme;
import br.com.ebac.microservicegerenciamentomemes.services.MemeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/memes")
public class MemeController {
    private final MemeService memeService;

    public MemeController(MemeService memeService) {
        this.memeService = memeService;
    }

    @GetMapping
    public Iterable<Meme> buscarTodosMemes() {
        return memeService.listarTodosMemes();
    }

    @PostMapping
    public Meme cadastrarNovoMeme(@RequestBody Meme meme) {
        return memeService.cadastrarNovoMeme(meme);
    }

    @GetMapping("/do-dia")
    public Meme obterMemeDoDia(Meme meme) {
        return memeService.obterMemeDoDia(meme);
    }
}
