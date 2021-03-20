package com.example.naukri_umeed.Controllers;

import com.example.naukri_umeed.Pojos.Profile;
import com.example.naukri_umeed.Repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    ProfileRepository profileRepository;

    @CrossOrigin
    @PostMapping("/saveprofile")
    public Profile prolInfo (@RequestBody Profile profile)
    {
        profileRepository.save(profile);
        return profile;
    }

    @CrossOrigin
    @GetMapping("/getallprofile")
    public List<Profile> profileInfo(@RequestParam Integer id)
    {
//        Profile[] arr = new Profile[5];
//        arr.length
//        Profile x = arr[0];
//        Profile x = list[0];
        List<Profile> profileList = profileRepository.findAll();
//        Profile x = profileList.get(0);
//        int sizeOfProfileList = profileList.size();
        List<Profile> filteredList = new ArrayList<>();
        for(int i = 0 ;i<profileList.size(); i++) {
            if(profileList.get(i).getOrganisationInfo().getId() == id) {
                filteredList.add(profileList.get(i));
            }

        }
        return filteredList;
    }




}
