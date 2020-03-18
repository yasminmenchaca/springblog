package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name="dogs")
public class Dogs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private int id;

    @Column(nullable = false, length = 3, columnDefinition = "TINYINT(3) UNSIGNED")
    private int age;

    @Column(nullable = false, length = 200)
    private String name;

    @Column(columnDefinition = "char(2) default 'XX'")
    private String resideState;


    public Dogs() {
    };

    public long getId() {
        return id;
    }

    public long getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getResideState() {
        return resideState;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResideState(String resideState) {
        this.resideState = resideState;
    }
}