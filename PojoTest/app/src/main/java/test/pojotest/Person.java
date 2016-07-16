package test.pojotest;

import java.io.Serializable;

/**
 * Created by tanmay on 15/07/16.
 */
public class Person implements Serializable{
        String name;
        String phoneNumber;
        String emailId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
