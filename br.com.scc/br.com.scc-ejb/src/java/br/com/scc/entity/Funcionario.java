package br.com.scc.entity;

import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer idPessoaFisicaFuncionario;
    
    @NotNull(message = "Informe a Data de Admissão")
    @Temporal(TemporalType.DATE)
    private Date dataAdmissao;
    
    @Temporal(TemporalType.DATE)
    private Date dataDemissao;
    
    @NotNull(message = "Informe a Matricula")
    private Integer matricula;
    
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name = "idCargo")
    private Cargo cargo;
    
    @OneToMany(mappedBy = "funcionario")
    private List<Cobranca> cobrancas;
}
