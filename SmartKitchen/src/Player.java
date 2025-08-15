public class Player {
    public int health;
    public String name;
    public String weapon;


    // No Constructor:


    // Method to do Soemthing when health is finished
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
