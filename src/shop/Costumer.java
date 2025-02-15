package shop;

import java.util.Random;

public class Costumer {

    private long id;
    private String name;
    private int tier;
    Random random = new Random();

    public Costumer(String name, int tier){
        this.id = random.nextInt(100000, 500000);
        this.name = name;
        this.tier = tier;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTier() {
        return tier;
    }

    @Override
    public String toString() {
        return "Costumer: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier;
    }
}
