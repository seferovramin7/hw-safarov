package Homeworks.hw_4;

public class Main {
    public static void main(String[] args) {

        System.out.println("Family first:");
        String[][] schedule1 = {
                {"Monday"}, {"Go to school"},
                {"Wednesday"}, {"Music festival"},
                {"Friday"}, {"Visit dances club"}
        };

        Pet pet1 = new Pet("dog", "Maxy", 4, 54,
                new String[]{"playing with ball", "barking", "walking"});

        Human grandpa1 = new Human("Greta", "Grace", 1941);
        Human grandma1 = new Human("Tommy", "Grace", 1944);

        Human grandpa2 = new Human("Frank", "Hardone", 1943);
        Human grandma2 = new Human("Ronald", "Hardone", 1948);

        Human father1 = new Human("Mark", "Grace", 1972, 95, grandpa1, grandma1);
        Human mother1 = new Human("Victoria", "Grace", 1978, 98, grandpa2, grandma2);

        Human child1 = new Human("Gerrard", "Grace", 1998, 92,
                father1, mother1, schedule1, pet1);

        child1.greetPet();
        child1.pet.respond();
        child1.pet.eat();

        System.out.println();
        System.out.println("Family second:");

        Pet pet2 = new Pet("husky", "HavHav", 4, 94,
                new String[]{"Screeching", "Playing with Grenda", "Running"});
        Pet pet3 = new Pet("cat", "Grenda", 2, 91,
                new String[]{"Eating", "Sleeping ", "Playing with Tim", "Barking at wall"});

        Human grandpa3 = new Human("Paul", "Anderson", 1959);
        Human grandma3 = new Human("Lumy", "Anderson", 1966);

        Human grandpa4 = new Human("Gimmy", "Steeve", 1960);
        Human grandma4 = new Human("Frank", "Steeve", 1962);

        Human father2 = new Human("Herald", "Anderson", 1986, 90, grandpa3, grandma3);
        Human mother2 = new Human("Esmeralda", "Anderson", 1988, 76, grandpa4, grandma4);

        Human child2 = new Human("Howard", "Anderson", 2017, 76, father2, mother2);
        Human child3 = new Human("Jimmy", "Anderson", 2011, 32, father2, mother2);

        father2.pet = pet2;
        mother2.pet = pet3;

        child2.pet = child3.pet = pet3;
        mother2.greetPet();
        mother2.pet.respond();
        child1.describePet();

    }
}
