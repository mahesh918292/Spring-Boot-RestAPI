package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Model {
    private long id;
    private String name;
    private String gender;
    public Model(long id, String name, String gender) {
        this.id = id;
        this.gender = gender;
        this.name = name;
    }
   

}
