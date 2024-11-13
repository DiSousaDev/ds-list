package br.dev.diego.dslist.controllers;

import br.dev.diego.dslist.dto.GameMinRecord;
import br.dev.diego.dslist.services.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    private final GameService service;

    public GameController(GameService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<GameMinRecord>> findAll() {
        List<GameMinRecord> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
