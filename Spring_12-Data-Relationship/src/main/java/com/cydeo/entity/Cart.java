package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.DomainEvents;

import java.util.List;

@Entity
@Table(name = "cart")
@Data
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToMany
    @JoinTable(name = "cart_item_rel", joinColumns= @JoinColumn(name = "c_id"),inverseJoinColumns = @JoinColumn(name = "i_id")) // This syntax is how to change join table column names.This is default name to define join table . this is how to change cart_items table name. Spring created that table
    private List<Item>itemList;

}
