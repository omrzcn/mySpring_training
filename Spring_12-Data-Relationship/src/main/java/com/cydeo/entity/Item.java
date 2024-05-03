package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "items")
@Data
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String name;



    @ManyToMany(mappedBy = "itemList")
    private List<Cart> carts;



    public Item( String name,String code) {
        this.code = code;
        this.name = name;
    }
}
