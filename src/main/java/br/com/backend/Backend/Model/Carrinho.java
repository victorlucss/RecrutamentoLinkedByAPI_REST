package br.com.backend.Backend.Model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Carrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_carrinho;

    @OneToMany
    private List<Produto> produto;
}
