package com.example.BlueCrown.Application.Model.UserModel;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.BlueCrown.Application.Model.ClassroomModel.ClassroomModel;

@Document(collection = "adminss")
@TypeAlias("Users") 
public class User {
  
	@Id
    private String id;

   
    private String email;

  
    private String username;


    private String password;
    private String userType;
   
    @DBRef
    private List<ClassroomModel> classrooms = new ArrayList<>();
      
    public List<ClassroomModel> getClassrooms() {
        return classrooms;
    }
    public void setClassrooms(List<ClassroomModel> classrooms) {
        this.classrooms = classrooms;
    }
    public User() {
    }
    public User(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }
  
    public String getId() { return id; }
    public void setId(String id) {
         this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) {
         this.email = email; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    
    @Override
  	public String toString() {
  		return "AdminModel [id=" + id + ", email=" + email + ", username=" + username + ", password=" + password + "]";
  	}
    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }
}
