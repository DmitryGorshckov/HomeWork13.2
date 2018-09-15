package ru.gorshckov.food;

public abstract class Food {
    private String title;

    public String name(String title){
        System.out.println("еда = " + title);
        return title;
    }


}
