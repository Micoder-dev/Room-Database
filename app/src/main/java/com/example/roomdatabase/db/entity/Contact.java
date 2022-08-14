package com.example.roomdatabase.db.entity;

public class Contact {

    // 1 - Constants for Database
    public static final String TABLE_NAME = "contacts";
    public static final String COLUMN_ID = "contact_id";
    public static final String COLUMN_NAME = "contact_name";
    public static final String COLUMN_EMAIL = "contact_email";

    // 2 - Variables
    private String name;
    private String email;
    private int id;

    // 3 - Constructors
    public Contact() {

    }

    public Contact(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    // 4 - Getters & Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // SQL Query: Creating the Table
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
            + COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COLUMN_NAME + " TEXT,"
            + COLUMN_EMAIL + " DATETIME DEFAULT CURRENT TIMESTAMP"
            + ")";

}
