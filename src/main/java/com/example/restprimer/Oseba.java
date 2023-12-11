package com.example.restprimer;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

@Table(name = "osebe")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@DynamicUpdate
public class Oseba {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "ime", nullable = false)
    private String ime;

    @Column(name = "priimek", nullable = false)
    private String priimek;

}
