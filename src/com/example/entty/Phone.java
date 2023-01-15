package com.example.entty;

public class Phone {
    String model;
    String name;
    String firstName;
    String secondName;
    int explatationPeriod;

    public  Phone(){
    }

    public Phone(String name,String  firstName,String secondName,String model,int explatationPeriod){
        this.name= name;
        this.firstName = firstName;
        this.secondName = secondName;
        this.model = model;
        this.explatationPeriod = explatationPeriod;
    }

    public int getExplatationPeriod(){
        return  explatationPeriod;
    }
    public  void setExplatatonPeriod(){
        this.explatationPeriod= explatationPeriod;
    }
    public  String getModel(){
        return  model;
    }
    public  void setModel(){
        this.model= model;
    }
    public  String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public  String getFirstName(){
        return  firstName;
    }
    public  void setFirstName(){
        this.firstName = firstName;
    }
    public String getSecondName(){
        return secondName;
    }
    public  void setSecondName(){
        this.secondName = secondName;
    }
}
