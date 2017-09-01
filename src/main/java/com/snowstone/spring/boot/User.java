package com.snowstone.spring.boot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	 private Integer id;
     private String name;
     private String email;

 public User(int number, String strName, String strEmail){
     id = number;
     name = strName;
     email = strEmail;
 }

 public User(){

 }
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 public Integer getId() {
     return id;
 }

 public String getEmail() {
     return email;
 }

 public String getName() {
     return name;
 }


 public void setId(Integer id) {
     this.id = id;
 }
 @Column(name = "email")
 public void setEmail(String email) {
     this.email = email;
 }
 @Column(name = "name")
 public void setName(String name) {
     this.name = name;
 }
}
