package de.neufische.linkedlist;

import java.util.LinkedList;

public class AnimalList {

    private AnimalListItem head;

    @Override
    public String toString() {
        return "" + head ;
    }

    public void setHead(AnimalListItem listItem){
        this.head = listItem;
    }

    public void addListItem(Animal animal){
        AnimalListItem newItem = new AnimalListItem(animal);
        if(head == null){
            head = newItem;
        } else {
            var nextItem = head.getNext();
            if(nextItem != null) {
                setNextItem(nextItem, newItem);
            }else{
                head.setNext(newItem);
            }
        }
    }

    private void setNextItem(AnimalListItem nextItem, AnimalListItem newItem){
        var beforeLastItem = nextItem;
        while (nextItem != null) {
            nextItem = nextItem.getNext();
            if (nextItem != null) {
                beforeLastItem = nextItem;
            }
        }
        beforeLastItem.setNext(newItem);
    }

    public void removeAnimal(Animal animal) {
        if (head == null){
            return;
        } else if(head.getNext() == null){
            if(head.getValue().equals(animal)){
                head = null;
            }
        } else {
            var nextItem = head.getNext();
            while(nextItem != null){
                if(nextItem.getValue().equals(animal)){
                    var nextAfterItem = nextItem.getNext();
                    if(nextAfterItem == null){
                        nextItem.setNext(null);
                    }else{
                        nextItem.setNext(nextAfterItem);

                    }
                }else {
                    nextItem = nextItem.getNext();
                }
            }
            LinkedList list = new LinkedList<>();
//            list.remove()
        }

    }
}
