package ru.inheritance;

public class Engineer extends Profession {
    private int experience;

    public Engineer(int experience, boolean degree) {
        super(true);
        this.experience = experience;
    }
}