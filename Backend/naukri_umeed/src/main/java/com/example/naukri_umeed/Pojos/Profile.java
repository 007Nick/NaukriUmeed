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
    @JoinColumn(columnDefinition = "organisation_id")
    private OrganisationInfo organisationInfo;

    @Column(name = "experience")
    private Integer experience;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "designation")
    private String designation;
}
