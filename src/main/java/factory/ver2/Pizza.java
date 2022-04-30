package factory.ver2;

import factory.ver2.ingredient.*;

public abstract class Pizza {
    private String name;

    private Dough dough;
    private Sauce sauce;
    private Cheese cheese;
    private Pepperoni pepperoni;
    private Clams clams;
    private Veggies[] veggies;

    public abstract void prepare();


    public void bake(){
        System.out.println("175도에서 25분간 굽기");
    }

    public void cut(){
        System.out.println("8등분 하기");
    }

    public void box(){
        System.out.println("박스 감기");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                '}';
    }
}
