package br.com.congregacao.designacoes.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoDesignacao {

    DISCURSO_PUBLICO("Discurso Público"),
    PRIMEIRA_VISITA("Primeira Visita"),
    SEGUNDA_VISITA("Segunda Visita"),
    DISCURSO("Discurso");

    private final String description;
}
