package ru.job4j.cars.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ads")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Car car;
    private Boolean isSold;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;
}
