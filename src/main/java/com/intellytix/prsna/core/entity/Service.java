package com.intellytix.prsna.core.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "service",schema = "prsna")
public class Service implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="service_id")
    private Long id;

    @Column(name ="name")
    private String name;

    @Column(name ="type")
    private String serviceType;

    @Column(name ="event_id")
    private Long eventId;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
