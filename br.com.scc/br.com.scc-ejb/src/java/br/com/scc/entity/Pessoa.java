package br.com.scc.entity;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer idPessoa; 
    
    @NotNull(message = "Informe o nome")
    @Size(max = 80, message = "Nome deve ter até 80 caracteres")
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "idEndereco")
    private Endereco endereco;
        
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoa", cascade = CascadeType.ALL)
    private PessoaFisica pessoaFisica;


    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
