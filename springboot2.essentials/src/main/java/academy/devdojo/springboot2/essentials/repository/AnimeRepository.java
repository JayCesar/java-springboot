package academy.devdojo.springboot2.essentials.repository;

import academy.devdojo.springboot2.essentials.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
