package de.neufische.studentabstract;

public class HistoryStudent extends Student {

    //private boolean isActive = true;

    @Override
    public String study() {
        return "Read history books!";
    }

    @Override
    boolean isActiveStudent() {
        return isActive;
    }

    public void setInActive(){
        isActive = false;
    }

    public boolean getIsActive(){
        return isActive;
    }
}
