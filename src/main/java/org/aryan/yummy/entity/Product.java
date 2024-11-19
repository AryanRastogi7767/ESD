package org.aryan.yummy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // IDENTITY for auto-increment in MySQL
    private Long id;

    @Column(name = "tname", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private Double price;
}
