public class SecondClass {
    public static void main(String[] args){

        System.out.println("Hello, Dee");
        System.out.println("Hello World");

        boolean isAlien = false;

        if(isAlien == false){
            System.out.println("This is an Alien!");
        }
        else{
            System.out.println("Don't worry, it's not an Alien");
        }

       String answer = isAlien ? "Oh my!" : "Don't Bother about it";
        System.out.println(answer);


    }
}
