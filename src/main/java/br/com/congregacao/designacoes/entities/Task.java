package br.com.congregacao.designacoes.entities;


import br.com.congregacao.designacoes.enums.TipoDesignacao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoDesignacao tipoDeDesignacao;

    //@Column(nullable = false)
    //private Date dataDeDesignacao;


}
