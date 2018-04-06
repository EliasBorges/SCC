package br.com.scc.entity;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class PessoaFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer idPessoaFisica;
    
    @NotNull(message = "Informe o CPF")
    private Integer CPF;
    
    @NotNull(message = "Informe o RG")
    private Integer RG;
    
    @NotNull(message = "Informe a Data de Nascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    
    @ManyToMany (mappedBy="pessoaFisica")
    private List<Carta> carta;
}
