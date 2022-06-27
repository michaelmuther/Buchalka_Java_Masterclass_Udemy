package arrayList_challenge;

import java.util.ArrayList;

public class MobilePhone {

    private final ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(String name, String number) {
        contacts.add(new Contact(name, number));
    }

    private int findIndexByName(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void modifyName(String oldName, String newName) {
        int index = findIndexByName(oldName);
        contacts.get(index).setName(newName);
    }

    public void modifyNumber(String name, String newNumber) {
        int index = findIndexByName(name);
        contacts.get(index).setNumber(newNumber);
    }

    public void removeContact(String name) {
        int index = findIndexByName(name);
        contacts.remove(index);
    }

    public boolean queryContact(String name) {
        return findIndexByName(name) >= 0;
    }

    public void printContacts() {
        System.out.println();
        for (Contact c : contacts) {
            System.out.println(c.getName() + " " + c.getNumber());
        }
    }
}
