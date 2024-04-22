package academy.devdojo.springboot2.essentials.controller;


import academy.devdojo.springboot2.essentials.domain.Anime;
import academy.devdojo.springboot2.essentials.services.AnimeService;
import academy.devdojo.springboot2.essentials.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

    private final DateUtil dateUtil;

    private final AnimeService animeService;
    @GetMapping
    public ResponseEntity<List<Anime>> list() {;
        return new ResponseEntity<>(animeService.listAll(), HttpStatus.OK);
        // return ResponseEntity.ok(animeService.listAll()); // outro jeito de fazer
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Anime> findById(@PathVariable long id) {;
         return ResponseEntity.ok(animeService.findById(id));
    }

    @PostMapping
    // @ResponseStatus(HttpStatus.CREATED) // assim tmb é possível
    public ResponseEntity<Anime> save(@RequestBody Anime anime){
        // Eu utilizo o Jackson para fazer o mapemaneto automático
        // Se ele encontrar o Json igula ao conteúdo de classe, ele faz o mapeamento
        // ResponseEntity.created() precisa de uma URI
        return new ResponseEntity<>(animeService.save(anime), HttpStatus.CREATED); // Assim eu retorno um 201
    }
    @DeleteMapping(path = "{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        animeService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<Void> replace(@RequestBody Anime anime){
        animeService.replace(anime);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
