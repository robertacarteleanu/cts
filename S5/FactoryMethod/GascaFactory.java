package FactoryMethod;

public class GascaFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Gasca();
    }
}
