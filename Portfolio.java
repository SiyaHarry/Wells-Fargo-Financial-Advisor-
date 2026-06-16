package com.example.demo.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    public Portfolio(Long portfolioId, Client client,
                     List<Security> securities) {
        this.portfolioId = portfolioId;
        this.client = client;
        this.securities = securities;
    }

    public Portfolio() {}

    // Getters and Setters
}
