package academy.devdojo.springboot2.essentials.services;

import academy.devdojo.springboot2.essentials.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    // private final AnimeRepository animeRepository;
    public List<Anime> listAll() {
        return List.of(new Anime(1L, "Dragon Ball (Test - Build - Hot Swap)"), new Anime(2L, "Bersek"));
    }
}
