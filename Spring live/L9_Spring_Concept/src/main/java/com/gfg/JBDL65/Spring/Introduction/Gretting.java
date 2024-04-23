package com.gfg.JBDL65.Spring.Introduction;

public class Gretting {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("from setter properties");
        this.message = message;
    }

    public Gretting(){

    }

    public Gretting(String message) {
        this.message = message;
    }

    public Gretting(int message) {
        super();
        System.out.println("from int");
    }

    public void display(){
        System.out.println("Message: "+message);
    }

    public void init(){
        System.out.println("init call");
    }
}
