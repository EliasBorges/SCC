package br.com.scc.entity;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer idEndereco;    
    
    @NotNull(message = "Informe o nome do logradouro")
    @Size(max = 80, message = "Nome do logradouro deve ter até 80 caracteres")
    private String logradouro;
    
    @NotNull(message = "Informe o nome do bairro")
    @Size(max = 80, message = "Nome do bairro deve ter até 80 caracteres")
    private String bairro;
    
    @NotNull(message = "Informe o CEP")
    private Integer CEP;
    
    @ManyToOne
    @JoinColumn(name = "idCidade")
    private Cidade cidade;

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    @OneToMany(mappedBy = "endereco")
    private List<Pessoa> pessoas;

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getCEP() {
        return CEP;
    }

    public void setCEP(Integer CEP) {
        this.CEP = CEP;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
