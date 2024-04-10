package com.vehiculos1.vehiculosspringboot1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "vehiculos")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String marca;

    @Column( length = 30)
    private String modelo;

    @Column(nullable = false)
    private String chasis;

}
