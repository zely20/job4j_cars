package ru.job4j.cars.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "ads")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Boolean isSold;
    private String descriptions;
    @OneToMany (mappedBy="post")
    private List<Image> images;
    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;
}
