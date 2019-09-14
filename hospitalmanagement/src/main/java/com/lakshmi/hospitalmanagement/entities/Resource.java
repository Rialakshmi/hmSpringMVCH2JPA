package com.lakshmi.hospitalmanagement.entities;

import javax.persistence.*;

@Entity
@Table(name="resource")
public class Resource {
    @Id
    private long id;
    @Column
    private String resourceName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getResourceName() {
        return resourceName;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", resourceName='" + resourceName + '\'' +
                '}';
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Resource(long id, String resourceName) {
        this.id = id;
        this.resourceName = resourceName;
    }
}
