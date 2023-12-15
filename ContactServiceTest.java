package contactService;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
 @Test
 public void addContact_NewContact_Success() {
     ContactService contactService = new ContactService();
     Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");

     contactService.addContact(contact);
     assertEquals(contact, contactService.getContactByID("12345"));
 }

 @Test
 public void deleteContact_ExistingContact_Success() {
     ContactService contactService = new ContactService();
     Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");

     contactService.addContact(contact);
     contactService.deleteContact("12345");
     assertThrows(IllegalArgumentException.class, () -> {
         contactService.getContactByID("12345");
     });
  }
}
