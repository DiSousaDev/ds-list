package br.dev.diego.dslist.dto;

import br.dev.diego.dslist.entities.Game;

public record GameMinRecord(
        Long id,
        String title,
        Integer year,
        String imgUrl,
        String shortDescription
) {
    public GameMinRecord(Game game) {
        this(
                game.getId(),
                game.getTitle(),
                game.getYear(),
                game.getImgUrl(),
                game.getShortDescription()
        );
    }
}
