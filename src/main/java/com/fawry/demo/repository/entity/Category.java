package com.fawry.demo.repository.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Categories")
public class Category implements Serializable {

    private static final long serialVersionUID = -7168715675685919727L;
    @Id
    @SequenceGenerator(sequenceName = "category_gen", allocationSize = 1, name = "categories_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_gen")

    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
}