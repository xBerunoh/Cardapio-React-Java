package com.example.cardapio.food;


import jakarta.persistence.*;
import org.hibernate.annotations.IdGeneratorType;

@Table( name= "foods")
@Entity(name = "foods")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String img;

    private Integer price;

}
