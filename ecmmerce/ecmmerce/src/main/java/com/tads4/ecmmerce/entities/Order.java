package com.tads4.ecmmerce.entities;
import jakarta.persistence.*;
import org.hibernate.annotations.Columns;

import java.time.Instant;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "tb_order")
public class Order{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private Instant moment;
    private OrderStatus status;

    @ManyToOne
    @JoinColumn(name= "client_id")
    private User client;

@OneToOne(mappedBy = "order",cascade = CascadeType.ALL)
    private Payment payment;

    Order() {
    }

    Order(Long id, Instant moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
