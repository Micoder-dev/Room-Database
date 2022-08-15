package com.example.roomdatabase.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.roomdatabase.db.entity.Contact;

import java.util.List;

@Dao
public interface ContactDAO {

    // Insert Data into Database
    @Insert
    public long addContact(Contact contact);

    // Updating the Contacts
    @Update
    public void updateContact(Contact contact);

    //Deleting the Contacts
    @Delete
    public void deleteContact(Contact contact);

    // Getting all Contacts
    @Query("select * from contacts")
    public List<Contact> getContacts();

    // Getting Contact from Database
    @Query("select * from contacts where contact_id ==:contactId")
    public Contact getContact(long contactId);


}
