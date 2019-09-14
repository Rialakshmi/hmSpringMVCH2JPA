package com.lakshmi.hospitalmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {
    @Column
    private long id;
    @Column
    private String slot;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public Booking(long id, String slot) {
        this.id = id;
        this.slot = slot;
    }
}
