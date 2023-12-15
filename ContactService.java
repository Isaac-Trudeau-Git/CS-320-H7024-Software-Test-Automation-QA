package contactService;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
 private Map<String, Contact> contacts;

 public ContactService() {
     contacts = new HashMap<>();
 }

 public void addContact(Contact contact) {
     if (contacts.containsKey(contact.getContactID())) {
         throw new IllegalArgumentException("ID already exists.");
     }
     contacts.put(contact.getContactID(), contact);
 }

 public void deleteContact(String contactID) {
     if (!contacts.containsKey(contactID)) {
         throw new IllegalArgumentException("ID not found.");
     }
     contacts.remove(contactID);
 }

 public void updateContact(String contactID, String firstName, String lastName, String phone, String address) {
     if (!contacts.containsKey(contactID)) {
         throw new IllegalArgumentException("ID not found.");
     }
     Contact contactToUpdate = contacts.get(contactID);
     contactToUpdate.setFirstName(firstName);
     contactToUpdate.setLastName(lastName);
     contactToUpdate.setPhone(phone);
     contactToUpdate.setAddress(address);
 }

 public Contact getContactByID(String contactID) {
     if (!contacts.containsKey(contactID)) {
         throw new IllegalArgumentException("ID not found.");
     }
     return contacts.get(contactID);
 }
}

