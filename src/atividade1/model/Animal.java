package atividade1.model;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeSound() {
        return name + " emitiu um som";
    }
    public String move(String metros) {
        return name + " se moveu " + metros + " metros\n";
    }
    public String move() {
        return name + " se moveu\n";
    }
    public String toString() {
        return "Animal:" +
                "\nnome = " + name +
                "\nidade = " + age + "\n";
    }
}
