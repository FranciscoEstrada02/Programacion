package e3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Bug bug1 = new Bug("Zombi",20, 40, 50, 72);
        Bug bug2 = new Bug("Zomboyyy",20, 65, 50, 67);
        Developer developer1 = new Developer("Fran",30, 62, 77, 80);
        Developer developer2 = new Developer("Paco",50, 70, 50, 65);

        LinkedList<Bug> bandoBug = new LinkedList<>();
        ArrayList<Developer> bandoDeveloper = new ArrayList<>();

        bandoBug.add(bug2);
        bandoBug.add(bug1);
        bandoDeveloper.add(developer1);
        bandoDeveloper.add(developer2);

        System.out.println(developer1.toString());


    }
}
