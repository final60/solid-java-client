package com.final60.github.model;

import com.taxonic.carml.rdf_mapper.annotations.RdfProperty;
import com.taxonic.carml.rdf_mapper.annotations.RdfType;

import java.util.Set;

public class Person {

    private Set<String> names;
    private String gender;
    private String jobTitle;
    private PostalAddress address;
    private String telephone;
    private String email;
    private Set<String> colleagues;
    private Set<Person> knows;

    static final String SCHEMAORG = "http://schema.org/";
    static final String SCHEMAORG_NAME = SCHEMAORG + "name";
    static final String SCHEMAORG_GENDER = SCHEMAORG + "gender";
    static final String SCHEMAORG_JOB_TITLE = SCHEMAORG + "jobTitle";
    static final String SCHEMAORG_ADDRESS = SCHEMAORG + "address";
    static final String SCHEMAORG_TELEPHONE = SCHEMAORG + "telephone";
    static final String SCHEMAORG_EMAIL = SCHEMAORG + "email";
    static final String SCHEMAORG_COLLEAGUES = SCHEMAORG + "colleagues";
    static final String SCHEMAORG_KNOWS = SCHEMAORG + "knows";

    @RdfProperty("http://www.w3.org/2006/vcard/ns#fn")
    public Set<String> getNames() {
        return names;
    }

    public void setNames(Set<String> names) {
        this.names = names;
    }

    @RdfProperty(SCHEMAORG_GENDER)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @RdfProperty(SCHEMAORG_JOB_TITLE)
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @RdfProperty("http://www.w3.org/2006/vcard/ns#hasAddress")
    @RdfType(PostalAddress.class)
    public PostalAddress getAddress() {
        return address;
    }

    public void setAddress(PostalAddress address) {
        this.address = address;
    }

    @RdfProperty(SCHEMAORG_TELEPHONE)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @RdfProperty(SCHEMAORG_EMAIL)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @RdfProperty(SCHEMAORG_COLLEAGUES)
    public Set<String> getColleagues() {
        return colleagues;
    }

    public void setColleagues(Set<String> colleagues) {
        this.colleagues = colleagues;
    }

    @RdfProperty(SCHEMAORG_KNOWS)
    @RdfType(Person.class)
    public Set<Person> getKnows() {
        return knows;
    }

    public void setKnows(Set<Person> knows) {
        this.knows = knows;
    }

    @Override
    public String toString() {
        return "Person [names=" + names + ", gender=" + gender + ", jobTitle=" + jobTitle
                + ", address=" + address + ", telephone=" + telephone + ", email=" + email
                + ", colleagues=" + colleagues + ", knows=" + knows + "]";
    }

}