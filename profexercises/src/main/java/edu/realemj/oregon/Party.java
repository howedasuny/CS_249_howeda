package edu.realemj.oregon;

import java.util.*;

public class Party {
    //private Person [] people;
    // Could be final because reference doesn't change
    private ArrayList<Person> allPeople = new ArrayList<>();

    public Party(String [] names) {
        int cnt = names.length;
        //people = new Person[cnt];
        for(int i = 0; i < cnt; i++) {
            //people[i] = new Person(names[i]);
            allPeople.add(new Person(names[i]));
        }
    }

    public int getPartyCnt() {
        int aliveCnt = 0;
        //for(int i = 0; i < people.length; i++) {
        for(int i = 0; i < allPeople.size(); i++) {
            //if(people[i].isAlive()) {
            if(allPeople.get(i).isAlive()) {
                aliveCnt++;
            }
        }
        return aliveCnt;
    }

    public void killEveryone() {
        //for(int i = 0; i < people.length; i++) {
        //    people[i].kill();
        //}
        for(Person p : allPeople) { // people) {
            p.kill();
        }
    }

    public void addPerson(String name) {
        allPeople.add(new Person(name));
    }

    public String toString() {
        String s = "PARTY:\n";
        s += getPartyCnt() + " souls alive.\n";
        for(var p : allPeople) { // people) {
            s += "* " + p + "\n";
        }
        //for(int i = 0; i < people.length; i++) {
        //    s += "* " + people[i] + "\n";
        //}
        return s;
    }

    public static Party askForPartyMembers(Scanner input) {

        System.out.println("How many people?");
        String cntStr = input.nextLine();
        int cnt = Integer.parseInt(cntStr);
        String [] names = new String[cnt];
        System.out.println("Enter names:");
        for(int i = 0; i < cnt; i++) {
            names[i] = input.nextLine();
        }
        //Party p = new Party(names);
        //return p;
        return new Party(names);
    }


}
