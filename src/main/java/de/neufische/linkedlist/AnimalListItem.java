package de.neufische.linkedlist;

public class AnimalListItem {

    private Animal value;
    private AnimalListItem next;

    AnimalListItem(Animal animal){
        this.value = animal;
    }

    @Override
    public String toString() {

        if(next != null){
            return  value + "->" + next;
        }else{
            return "" + value;
        }
    }

    public void setNext(AnimalListItem nextItem){
        this.next = nextItem;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public Animal getValue(){
        return value;
    }
}
