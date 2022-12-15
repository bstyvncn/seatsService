package chapter4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class film {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer filmID;

    private String namaFilm;
    private String statusTayang;
}
