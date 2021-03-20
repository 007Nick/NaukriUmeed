package com.example.naukri_umeed.Pojos;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "organisation_info")
public class OrganisationInfo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @JoinColumn(name = "user_id")
    @OneToOne
    private UserInfo userInfo;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "mobile")
    private Integer mobile;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "verified")
    private boolean Verified;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "organisationInfo")
    @Fetch(FetchMode.SUBSELECT)
    private List<Profile> profiles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isVerified() {
        return Verified;
    }

    public void setVerified(boolean verified) {
        Verified = verified;
    }
}
