package de.neufische.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListItemTest {

    @Test
    void shouldCreateListItemWithAnimalsSpiderAndSnake(){
        Animal spider = new Animal("Spider");
        Animal snake = new Animal("Snake");
        AnimalListItem firstItem = new AnimalListItem(spider);

        AnimalListItem secondItem = new AnimalListItem(snake);

        AnimalList list = new AnimalList();
        list.setHead(firstItem);
        firstItem.setNext(secondItem);

        System.out.println(list.toString());
    }

    @Test
    void shouldAddAnimalPigToEmptyList(){
        AnimalList list = new AnimalList();
        list.addListItem(new Animal("Pig"));

        assertEquals("Pig", list.toString());
    }

    @Test
    void shouldAddAnimalSnakeToListWithPig(){
        Animal pig = new Animal("Pig");
        AnimalListItem firstItem = new AnimalListItem(pig);
        AnimalList list = new AnimalList();
        list.setHead(firstItem);
        list.addListItem(new Animal("Snake"));

        assertEquals("Pig->Snake", list.toString());
    }

    @Test
    void shouldAddAnimalDogToListWithPig(){
        Animal pig = new Animal("Pig");
        AnimalListItem firstItem = new AnimalListItem(pig);
        AnimalList list = new AnimalList();
        list.setHead(firstItem);
        list.addListItem(new Animal("Snake"));
        list.addListItem(new Animal("Dog"));

        assertEquals("Pig->Snake->Dog", list.toString());
    }

    @Test
    void shouldDeleteAnimalSnakeFromList(){
        AnimalList list = new AnimalList();
        list.addListItem(new Animal("Snake"));
        list.addListItem(new Animal("Dog"));
        list.addListItem(new Animal("Duck"));

        list.removeAnimal(new Animal("Dog"));
        assertEquals("Snake->Dog", list.toString());

    }

}