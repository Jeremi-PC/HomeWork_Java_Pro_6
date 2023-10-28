package org.example.treeset;

import java.util.TreeSet;

//Создайте класс FullName полного имени человека (firstName, lastName).
// Создайте TreeSet с экземплярами этого класса.
// При создании TreeSet передайте в него компаратор,
// который сравнивает экземпляры по полю firstName.
// Выведите множество в консоль.
public class Main {
    public static void main(String[] args) {
        TreeSet<FullName> fullName = new TreeSet<FullName>(new FullName.FirstNameComparator());
        fullName.add(new FullName("Alice", "Briton"));
        fullName.add(new FullName("Mike", "Kirche"));
        fullName.add(new FullName("Simon", "Buble"));
        fullName.add(new FullName("Mary", "Norton"));

        for (FullName element: fullName) {
            System.out.println(element);

        }
    }
}