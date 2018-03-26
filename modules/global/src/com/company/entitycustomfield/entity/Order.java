package com.company.entitycustomfield.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Map;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "ENTITYCUSTOMFIELD_ORDER")
@Entity(name = "entitycustomfield$Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 6169918747956827291L;

    @Column(name = "NAME")
    protected String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_")
    protected Date date;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    @Transient
    @MetaProperty
    private Map<String, OrderLine> lines;
    public Map<String, OrderLine> getLines() {
        return lines;
    }

    public void setLines(Map<String, OrderLine> lines) {
        this.lines = lines;
    }
}