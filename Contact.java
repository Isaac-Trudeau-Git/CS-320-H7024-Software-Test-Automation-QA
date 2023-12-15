//Isaac Trudeau

package contactService;

public class Contact {
 private String contactID;
 private String firstName;
 private String lastName;
 private String phone;
 private String address;

 public Contact(String contactID, String firstName, String lastName, String phone, String address) {
     setContactID(contactID);
     setFirstName(firstName);
     setLastName(lastName);
     setPhone(phone);
     setAddress(address);
 }

 public String getContactID() {
     return contactID;
 }

 public void setContactID(String contactID) {
     if (contactID == null || contactID.length() > 10) {
         throw new IllegalArgumentException("Contact ID cannot be null or more than 10 characters.");
     }
     this.contactID = contactID;
 }

 public String getFirstName() {
     return firstName;
 }

 public void setFirstName(String firstName) {
     if (firstName == null || firstName.length() > 10) {
         throw new IllegalArgumentException("First name cannot be null or more than 10 characters.");
     }
     this.firstName = firstName;
 }

 public String getLastName() {
     return lastName;
 }

 public void setLastName(String lastName) {
     if (lastName == null || lastName.length() > 10) {
         throw new IllegalArgumentException("Last name cannot be null or more than 10 characters.");
     }
     this.lastName = lastName;
 }

 public String getPhone() {
     return phone;
 }

 public void setPhone(String phone) {
     if (phone == null || phone.length() != 10) {
         throw new IllegalArgumentException("Phone number cannot be null and needs to be 10 characters.");
     }
     this.phone = phone;
 }

 public String getAddress() {
     return address;
 }

 public void setAddress(String address) {
     if (address == null || address.length() > 30) {
         throw new IllegalArgumentException("Address cannot be null or more than 30 characters.");
     }
     this.address = address;
 }
}
