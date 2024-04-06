package academy.devdojo.springboot2.essentials.controller;


import academy.devdojo.springboot2.essentials.domain.Anime;
import academy.devdojo.springboot2.essentials.services.AnimeService;
import academy.devdojo.springboot2.essentials.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

    private final DateUtil dateUtil;

    private final AnimeService animeService;
    @GetMapping
    public List<Anime> list() {;
        return animeService.listAll();
    }

}
