import java.util.ArrayList;

public class ContactInfo {
    private ArrayList<Contact> contactList=
            new ArrayList<Contact>();

    public void createContactList(){
        Contact c1=new Contact("Rahim","01888888");
        Contact c2=new Contact("Karim","01788888");
        Contact c3=new Contact("John","01988888");

        contactList.add(c1);
        contactList.add(c2);
        contactList.add(c3);


    }

    public void showContactList(){
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println((i+1)+"."+contactList.get(i).getName());
            System.out.println((i+1)+"."+contactList.get(i).getPhoneNo());
        }
    }

    public ArrayList<Contact> getContactList(){
        return contactList;
    }
}
