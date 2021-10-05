package com.travel.demo.model.dto;

import com.travel.demo.model.enums.Language;


public class BookingParamDto {
    private Integer id;
    private String name;
    private String placeholder;
    private Language language;
    private String type;

    public BookingParamDto() {
    }

    public BookingParamDto(Integer id, String name, String placeholder, Language language, String type) {
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
