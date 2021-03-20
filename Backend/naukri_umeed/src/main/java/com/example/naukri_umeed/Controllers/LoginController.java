package com.example.naukri_umeed.Controllers;

import com.example.naukri_umeed.Pojos.OrganisationInfo;
import com.example.naukri_umeed.Pojos.UserInfo;
import com.example.naukri_umeed.Repositories.OrganisationInfoRepository;
import com.example.naukri_umeed.Repositories.ProfileRepository;
import com.example.naukri_umeed.Repositories.UserInfoRepository;
import com.example.naukri_umeed.Services.ResgistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    OrganisationInfoRepository organisationInfoRepository;

    @Autowired
    ProfileRepository profileRepository;

    @Autowired
    UserInfoRepository userInfoRepository;

    @Autowired
    ResgistrationService resgistrationService;

    @CrossOrigin
    @GetMapping("/index")
    public String index()
    {
        return "index";
    }

    @CrossOrigin
    @PostMapping("/registerUser")
    public Status userRegistration(@RequestBody UserInfo userInfo)
    {
        return resgistrationService.userRegistraion(userInfo);
    }



}
