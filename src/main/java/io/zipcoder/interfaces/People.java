package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
 private List<Person> personList = new ArrayList<>();

  public void add(Person person) {
     personList.add(person);
 }

 public Person findById(long id) {
      int index = 0;
     for (int i = 0; i < personList.size(); i++) {
         if (personList.get(i).getId()==id) {
             index = i;
         }
     }
     return personList.get(index);
 }

 public boolean contains(Person person) {
      return personList.contains(person);
 }

 public void remove(Person person) {
      personList.remove(person);
 }

 public void remove(long id) {
      personList.remove(findById(id));
 }

 public void removeAll() {
     for (Person rev:personList) {
         remove(rev);
     }
 }
 public Integer count() {
    return personList.size();
 }

 public Person[] toArray() {
      return personList.toArray(new Person[0]);
 }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
