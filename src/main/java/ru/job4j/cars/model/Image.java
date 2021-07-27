package ru.job4j.cars.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "images")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String path;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
