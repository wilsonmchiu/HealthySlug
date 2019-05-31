package com.example.wilso.healthyslug;

public class Food {

    private String id;
    private String food;

    public Food(){

    }

    public Food(String food){
        this.food = food;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getFood() {
        return this.food;
    }

    public void setFood(String food) {
        this.food = food;
    }


}
