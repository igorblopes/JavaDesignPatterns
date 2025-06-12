package com.creational.builder;

import java.time.LocalDate;


public class PersonPattern {

    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final LocalDate dateOfBirth;
    private final String emailAddress;
    private final String phoneNumber;


    public PersonPattern(PersonBuilder builder){
        
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.dateOfBirth = builder.dateOfBirth;
        this.emailAddress = builder.emailAddress;
        this.phoneNumber = builder.phoneNumber;
    }


    @Override
    public String toString() {
        return "com.creational.builder.Person{ firstName='"+firstName+"', middleName='"+middleName+"', lastName='"+lastName+"', dateOfBirth='"+dateOfBirth+"', emailAddress='"+emailAddress+"', phoneNumber='"+phoneNumber+"' }";
    }

    public static class PersonBuilder {
        private String firstName;
        private String middleName;
        private String lastName;
        private LocalDate dateOfBirth;
        private String emailAddress;
        private String phoneNumber;

        public PersonBuilder() {}


        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public PersonBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public PersonPattern build() {
            return new PersonPattern(this);
        }
    }
}