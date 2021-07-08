package ru.job4j.cars.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "engine")
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String volume;

    public Engine() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Objects.equals(id, engine.id) &&
                Objects.equals(volume, engine.volume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, volume);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", volume='" + volume + '\'' +
                '}';
    }
}
