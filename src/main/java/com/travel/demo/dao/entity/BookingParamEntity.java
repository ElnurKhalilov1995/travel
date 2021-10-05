package com.travel.demo.dao.entity;

import com.travel.demo.model.enums.Language;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking_params")
public class BookingParamEntity {
    @Id
    private Integer id;
    private String name;
    private String placeholder;
    @Enumerated(EnumType.STRING)
    private Language language;
    private String type;

    public BookingParamEntity() {
    }

    public BookingParamEntity(Integer id, String name, String placeholder, Language language, String type) {
        this.id = id;
        this.name = name;
        this.placeholder = placeholder;
        this.language = language;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
