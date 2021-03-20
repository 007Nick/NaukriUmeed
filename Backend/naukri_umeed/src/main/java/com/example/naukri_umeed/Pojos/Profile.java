package com.example.naukri_umeed.Pojos;

import javax.persistence.*;

@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "organisation_id")
    private OrganisationInfo organisationInfo;

    @Column(name = "experience")
    private Integer experience;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "designation")
    private String designation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrganisationInfo getOrganisationInfo() {
        return organisationInfo;
    }

    public void setOrganisationInfo(OrganisationInfo organisationInfo) {
        this.organisationInfo = organisationInfo;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
