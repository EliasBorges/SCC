package br.com.scc.entity;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity

public class PessoaJuridica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer idPessoaJuridica;
    
/*      @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "idPessoa")
    private Pessoa pessoa;
    */
    
    @NotNull(message = "Informe o CNPJ")
    private Integer CNPJ;
    
    @OneToMany(mappedBy = "pessoaJuridica")
    private List<Carta> cartas;
}
