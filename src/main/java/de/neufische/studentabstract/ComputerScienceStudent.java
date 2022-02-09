package de.neufische.studentabstract;

public class ComputerScienceStudent extends Student {


    @Override
    public String study() {
        return "Learn programming!";
    }

    @Override
    boolean isActiveStudent() {
        return false;
    }
}
