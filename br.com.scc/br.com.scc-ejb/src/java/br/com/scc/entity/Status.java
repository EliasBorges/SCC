package br.com.scc.entity;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Short idStatus;
    
    @NotNull(message = "Informe o nome do status")
    @Size(max = 80, message = "Nome do status deve ter até 80 caracteres")
    private String nomeStatus;
    
    @OneToMany(mappedBy = "status")
    private List<Carta> cartas;
}
