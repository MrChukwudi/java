public class Test {
    public static void main(String[] args) {

        /*
       Animal smallAni = new Animal("Dude",  3.44d);



        Dog chow = new Dog("Pet",  39.44d, "Flat", "Short");


        doAnimalStuff(chow, "Super Fast");
        doAnimalStuff(smallAni, "Slow");
        */







        Employee tim0 = new Employee("Hortons", "05/27/1990", "01/01/2022" );

        System.out.println(tim0.toString());

        Employee jon = new Employee("Milton", "09/03/2000", "12/03/2024");
        System.out.println(jon.toString());

        System.out.println(tim0.getAge());


        System.out.printf("You are %d %n Mr %s", 33, "Desire");
    }

    //Build a method that takes an Animal and perform 3 ops on it:
    public static void doAnimalStuff(Animal animal, String speed){
        animal.noise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("____---___");

    }


}

