package com.bonsgoles.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 150, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private Number price;

    @Column(length = 12, nullable = false)
    private String date;

    @Column(length = 30, nullable = false)
    private String status;
}
