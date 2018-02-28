package byranemery.csc445.customerappdemo.nonActivity;

/**
 * Created by Siren10 on 26-Feb-18.
 */

public class User {
    private String firstName, lastName, address, apartmentNumber, stateAbb, zipCode, phoneNumber, email, password;

    public User(String firstName, String lastName, String address, String apartmentNumber, String stateAbb, String zipCode, String phoneNumber, String email, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.apartmentNumber = apartmentNumber;
        this.stateAbb = stateAbb;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
    }

}
