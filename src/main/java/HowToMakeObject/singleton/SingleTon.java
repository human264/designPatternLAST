package HowToMakeObject.singleton;

class Animal {
    //public Animal() <- 1. public -> final 로 바꾼다.
    private Animal() {
    }

    private static class signleAnimal {
        private static final Animal animal = new Animal();
    }

    public static Animal getInstance() {
        return signleAnimal.animal;
    }
}


class SingleTon {
    public static void main(String[] args) {
        Animal animal = Animal.getInstance();
        Animal animal2 = Animal.getInstance();
        System.out.println(animal.equals(animal2));
    }


}
