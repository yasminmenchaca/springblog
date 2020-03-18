package com.codeup.springblog.controllers;

import com.codeup.springblog.Repositories.DogRepository;
import com.codeup.springblog.models.Dogs;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DogsController {

    private DogRepository dogDao;

    public DogsController(DogRepository dogDao) {
        this.dogDao = dogDao;
    }

    @GetMapping("/dogs")
    @ResponseBody
    public List<Dogs> getAllAds() {
        return dogDao.findAll();
    }

    @GetMapping("/dogs/save")
    @ResponseBody
    public String saveDog() {
        Dogs newDog = new Dogs();
        newDog.setAge(2);
        newDog.setName("Toby");
        dogDao.save(newDog);
        return "Saving Dog";
    }

    @GetMapping("/dogs/update")
    @ResponseBody
    public String updateDog() {
        Dogs dog = dogDao.getOne(1L);
        dog.setName("Tooby");
        dogDao.save(dog);
        return "Updating pup";
    }

    @GetMapping("dogs/search")
    @ResponseBody
    public String searchDog(Model model) {
        Dogs dog = dogDao.findByName("Bowser");
        model.addAttribute("dog", dog);
        return "dogs/search";
    }

}
