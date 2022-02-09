package de.neufische.studentabstract;

public abstract class Student {

    protected boolean isActive = true;
    abstract String study();

    abstract boolean isActiveStudent();

    public void printSuperAbstractClass(){
        System.out.println(this);
    }

}
