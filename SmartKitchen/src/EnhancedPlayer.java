public class EnhancedPlayer {
    private int health;
    private String name;
    private String weapon;

    // First Constructor:
    public EnhancedPlayer(int health, String name, String weapon){
        this.name = name;
        this.weapon = weapon;
        this.health = (health < 0 ? 1 : (health > 100 ? 100 : health));
    }

    // 2nd Constructor with only Name, and default parameters for the rest:
    public EnhancedPlayer(String name){
        this(100, name, "Sword");
    }




    // Method to do Something when health is finished
    public void looseHealth(int damage){
        health -= damage;
        if(health <= 0){
            System.out.println("Player knocked out of Game!>>>");
        }
    }


    public int healthRemaining(){
        return health;
    }


    public void restoreHealth(int extraHealth){
        health += extraHealth;

        if(health > 100){
            System.out.println("Player restored to 100%");

            health = 100;
        }

    }
}
