package ru.micron.task3.human;

class Legs {
    private int HP;

    public Legs(int HP) { this.HP = HP; }
    public void setHP(int HP) { this.HP = HP; }
    public int getHP() { return HP; }
}

class Hands {
    private int HP;

    public Hands(int HP) { this.HP = HP; }
    public void setHP(int HP) { this.HP = HP; }
    public int getHP() { return HP; }
}

class Body {
    private int HP;

    public Body(int HP) { this.HP = HP; }
    public void setHP(int HP) { this.HP = HP; }
    public int getHP() { return HP; }
}

class Head {
    private int HP;

    public Head(int HP) { this.HP = HP; }
    public void setHP(int HP) { this.HP = HP; }
    public int getHP() { return HP; }
}

public class Human {
    private int height;
    private String name;
    private Legs legs;
    private Hands hands;
    private Body body;
    private Head head;

    public Human(String name, int height){
        this.name = name;
        this.height = height;
        legs = new Legs(100);
        hands = new Hands(100);
        body = new Body(255);
        head = new Head(50);
    }

    public String getName() { return name; }
    public int getHeight() { return height; }

    public void getHumanInfo(){
        System.out.printf("name = %s\nh = %d\n, Head HP = %d\nHands HP = %d\n\n",
                getName(), getHeight(), head.getHP(), hands.getHP());
    }
}
