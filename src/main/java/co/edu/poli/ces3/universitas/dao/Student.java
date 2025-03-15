package co.edu.poli.ces3.universitas.dao;

import java.util.Date;

public class Student {
    private Integer id;
    private String name;
    private String lastName;
    private Date birthDay;
    private String mail;
    private int level;
    private boolean isMarried;

    public Student(){}

    public Student(String name, String lastName, Date birthDay, String mail, int level, boolean isMarried) {
        this.name = name;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.mail = mail;
        this.level = level;
        this.isMarried = isMarried;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}
