package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts = new ArrayList<Contact>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    public boolean addNewContact(Contact theContact){
        if (findContact(theContact.getName()) >=0){
            return false;
        }else {
            myContacts.add(theContact);
            return true;
        }
    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        if (findContact(oldContact) >= 0){
            if (findContact(newContact.getName()) == -1){
                int position = myContacts.indexOf(oldContact);
                myContacts.set(position, newContact);
                return true;
            }
        }
        return false;
    }
    public boolean removeContact(Contact theContact){
        if (findContact(theContact) >= 0){
            int position = myContacts.indexOf(theContact);
            myContacts.remove(theContact);
            return true;
        }
        return false;
    }
    private int findContact(Contact theContact){
        int position = myContacts.indexOf(theContact);
        if (position >= 0){
            return position;
        }
        return -1;
    }
    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact(String name){
        for (int i=0; i<this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(name)){
                return contact;
            }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i=0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            System.out.println((i+1)+". " + contact.getName()+ " -> " + contact.getPhoneNumber());
        }
    }
}
