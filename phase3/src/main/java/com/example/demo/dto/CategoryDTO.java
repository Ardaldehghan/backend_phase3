package com.example.demo.dto;


import lombok.Data;

@Data
public class CategoryDTO {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

