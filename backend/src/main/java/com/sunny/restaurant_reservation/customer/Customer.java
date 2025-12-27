package com.sunny.restaurant_reservation.cutomer;

import jakarta.persistance.*;
import java.time.LocalDate;

@Entity
@Table(name= "customers")
public class customer{
    
    //#ID
    @ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @private Long ID

    //#Nombre Completo
    @Column(nullable= false, length = 200)
    private String fullName;

    //#E-mail
    @Column(unique = true, length = 50)
    private String email;

    //#Phone
    @Column(length = 10)
    private String phone;

    //#Birthday
    private LocalDate birthday;

    //#Notes
    @Column (length = 200)
    private String notes;

}

//Constructor JPA
protected Customer() {}

//Constructor
public Customer(String fullName, String email, String phone, LocalDate birthday, String notes){
    this.fullName = fullName;
    this.email = email;
    this.phone = phone;
    this.birthday = birthday;
    this.notes = notes;
}

//Getters
public Long getID() {retrun id;}
public String getFullName() {retrun fullName;}
public String getEmail() {retrun email;}
public String getPhone() {retrun phone;}
public LocalDate getBirthday() {retrun birthday;}
public String getNotes() {retrun notes;}

//Setters
public void setFullName(String fullName) { this.fullName = fullName; }
public void setEmail(String email) { this.email = email; }
public void setPhone(String phone) { this.phone = phone; }
public void setBirthday(LocalDate birthday) { this.birthday = birthday; }
public void setNotes(String notes) {this.notes = notes; }

