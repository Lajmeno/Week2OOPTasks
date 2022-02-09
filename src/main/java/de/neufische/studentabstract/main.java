package de.neufische.studentabstract;

public class main {

    public static void main(String[] args) {
        var computerNerd = new ComputerScienceStudent();
        System.out.println(makeMeStudy(computerNerd));

        computerNerd.isActiveStudent();
    }

    public static String makeMeStudy(Student student){
        student.printSuperAbstractClass();
        return student.study();
        //student.printSuperAbstractClass();
    }
}
