package com.fawry.demo.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "ORDER_CARD_ITEMS", schema = "HR")
public class OrderCardItems implements Serializable {

    private static final long serialVersionUID = -7168715675685919727L;
    @Id
    @SequenceGenerator(sequenceName = "order_card_gen",
            allocationSize = 1,
            name = "hr.order_card_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "order_card_gen")
    @Column(name = "ID")
    private Long id;

    @Column(name = "ORDER_ITEMS_ID")
    private Long orderItemsId;

    @Column(name = "ORDER_ID")
    private String orderId;

}