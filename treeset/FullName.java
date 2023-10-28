package org.example.treeset;

import java.util.Comparator;

public class FullName implements Comparable{
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


    public static class FirstNameComparator implements Comparator<FullName>{
    @Override
    public int compare(FullName o1, FullName o2) {
        return o1.firstName.compareTo(o2.firstName);
    }
}

    }
