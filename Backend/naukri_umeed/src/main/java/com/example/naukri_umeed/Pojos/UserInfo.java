package com.example.naukri_umeed.Pojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_info")
public class UserInfo
{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private Integer role;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "userInfo")
    private OrganisationInfo organisationInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserInfo)) return false;
        UserInfo user = (UserInfo) o;
        return Objects.equals(username, user.username) &&
                Objects.equals(password, user.password);
    }
}
