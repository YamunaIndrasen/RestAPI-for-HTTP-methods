package com.rest.springboot.bean;


import java.util.ArrayList;
import java.util.List;

public class UserRegistration {
	private List<User> UserRecords;
    private static UserRegistration usrregd = null;
    private UserRegistration(){
    UserRecords = new ArrayList<User>();
    }
    public static UserRegistration getInstance() {
        if(usrregd == null) {
              usrregd = new UserRegistration();
              return usrregd;
            }
            else {
                return usrregd;
            }
    }
    public void add(User std) {
    UserRecords.add(std);
    }
public String upDateUser(User std) {
for(int i=0; i<UserRecords.size(); i++)
        {
            User usr = UserRecords.get(i);
            if(usr.getUserregistrationnumber().equals(std.getUserregistrationnumber())) {
              UserRecords.set(i, std);//update the new record
              return "Update successful";
            }
        }
return "Update un-successful";
}
public String deleteUser(String userregistrationnumber) {
for(int i=0; i<UserRecords.size(); i++)
        {
            User usr = UserRecords.get(i);
            if(usr.getUserregistrationnumber().equals(userregistrationnumber)){
              UserRecords.remove(i);//update the new record
              return "Delete successful";
            }
        }
return "Delete un-successful";
}
    public List<User> getUserRecords() {
    return UserRecords;
    }
}
