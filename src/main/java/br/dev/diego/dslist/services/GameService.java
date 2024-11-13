package br.dev.diego.dslist.services;

import br.dev.diego.dslist.dto.GameMinRecord;
import br.dev.diego.dslist.repositories.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    private final GameRepository repository;

    public GameService(GameRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<GameMinRecord> findAll() {
        return repository.findAll().stream().map(GameMinRecord::new).toList();
    }

}
