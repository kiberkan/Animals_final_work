public class PetCreator extends CreatorAnimals {

    @Override
    protected Pet createNewPet (PetType type) {

        switch (type) {
            case Cat:
                return new Cat();
            case Dog:
                return new Dog();
            case Hamster:
                return new Hamster();
        }
        return null;
    }
}