package contactService;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
 @Test
 public void contactCreation_ValidData_Success() {
     Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
     assertEquals("12345", contact.getContactID());
     assertEquals("John", contact.getFirstName());
     assertEquals("Doe", contact.getLastName());
     assertEquals("1234567890", contact.getPhone());
     assertEquals("123 Main St", contact.getAddress());
 }

 @Test
 public void contactCreation_InvalidData_ExceptionThrown() {
     assertThrows(IllegalArgumentException.class, () -> {
         new Contact("12345678910111213141516", "Longfirstnameovertenchar", "werbenjagermanjensen", "8675309", "This address is way too long to be valid");
     });
 }
}
