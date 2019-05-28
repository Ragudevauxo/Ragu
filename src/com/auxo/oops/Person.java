package com.auxo.oops;

public class Person {
    private String firstname;
    private String lastname;
    private int age;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getlastname() {
        return lastname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        if (!firstname.isEmpty() && !lastname.isEmpty()) {
            return firstname + " " + lastname;
        } else if (firstname.isEmpty() && !lastname.isEmpty()) {
            return lastname;
        } else if (lastname.isEmpty() && !firstname.isEmpty()) {
            return firstname;
        } else {
            String a = " ";
            return a;
        }
    }

    public static void main(String[] args) {
        Person obj = new Person();
        obj.setFirstname("Ragu");
        obj.setlastname("d");
        obj.setAge(23);
        System.out.println("Firstname: " + obj.getFirstname());
        System.out.println("Lastname: " + obj.getlastname());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Is this person teen?: " + obj.isTeen());
        System.out.println("Fullname: " + obj.getFullName());
    }
}
