package Tema4;
public class Hero {
    private static final int CURACION_POCION = 10;
    private static final int CURACION_DESCANSO = 50;
    private static final int EXP_ATAQUE = 10;
    private static final int EXP_LIMITE = 50;
    private static final int DANO_MIN = 1;
    private static final int DANO_TOPE = 10;

    private static final int PLUS_VIDA = 5;
    private static final int PLUS_ATAQUE = 1;
    private static final int PLUS_DEFENSA = 1;

    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;

    public Hero(String name, int level, int maxHealth, int attack, int defense) {
        this.name = name;
        this.level = level;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.experience = 0;
        this.attack = attack;
        this.defense = defense;
    }

    public void drinkPotion() {
        this.health = this.health + CURACION_POCION;
        if (this.health > this.maxHealth) this.health = this.maxHealth;
    }

    public void rest() {
        this.health = this.health + CURACION_DESCANSO;
        if (this.health > this.maxHealth) this.health = this.maxHealth;
    }

    public void attack(Hero objetivo) {
        int calculoDano = this.attack - objetivo.getDefense();
        int maxDano = (calculoDano > DANO_TOPE) ? calculoDano : DANO_TOPE;

        int danoFinal = (int) (Math.random() * maxDano) + DANO_MIN;
        objetivo.receiveDamage(danoFinal);

        this.experience = this.experience + EXP_ATAQUE;
        if (this.experience >= EXP_LIMITE) {
            levelUp();
            this.experience = 0;
        }
    }

    private void levelUp() {
        this.level = this.level + 1;
        this.maxHealth = this.maxHealth + PLUS_VIDA;
        this.health = this.health + PLUS_VIDA;
        this.attack = this.attack + PLUS_ATAQUE;
        this.defense = this.defense + PLUS_DEFENSA;
        System.out.println("¡SUBIDA DE NIVEL! Ahora eres nivel " + this.level);
    }

    public void receiveDamage(int damage) {
        this.health = this.health - damage;
        if (this.health < 0) this.health = 0;
    }

    public boolean isAlive() { return this.health > 0; }
    public int getDefense() { return defense; }
    public String getName() { return name; }

    public String toString() {
        return "[" + name + "] LVL: " + level + " | HP: " + health + "/" + maxHealth +
                " | ATK: " + attack + " | DEF: " + defense;
    }
}