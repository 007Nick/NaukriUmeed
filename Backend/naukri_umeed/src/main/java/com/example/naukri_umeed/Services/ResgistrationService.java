package com.example.naukri_umeed.Services;

import com.example.naukri_umeed.Controllers.Status;
import com.example.naukri_umeed.Pojos.UserInfo;
import com.example.naukri_umeed.Repositories.OrganisationInfoRepository;
import com.example.naukri_umeed.Repositories.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResgistrationService
{

    @Autowired
    UserInfoRepository userInfoRepository;

    @Autowired
    OrganisationInfoRepository organisationInfoRepository;

    public Status userRegistraion(UserInfo userInfo)
    {
        List<UserInfo> userInfoList = (List<UserInfo>) userInfoRepository.findAll();
        for(UserInfo user : userInfoList)
        {
            if(user.equals(userInfo))
            {
                System.out.println("user already exists");
                return Status.User_Already_Exists;
            }

        }
        userInfoRepository.save(userInfo);
        return Status.Success;

    }




}
