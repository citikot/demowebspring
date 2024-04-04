package online.agatstudio.demoweb.controller;

import online.agatstudio.demoweb.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonTableController {

    @GetMapping("/people")
    public String showFriends(Model model) {

        List<Person> friends = new ArrayList<>();

        friends.add(new Person(0, "Allan", 23, 85.3f));
        friends.add(new Person(1, "Dennis", 31, 124.1f));
        friends.add(new Person(2, "Carol", 45, 114.8f));
        friends.add(new Person(3, "Sarah", 28, 78.1f));

        model.addAttribute("people", friends);

        return "friendsPage";
    }

    @GetMapping("/peopleJSON")
    @ResponseBody
    public List<Person> showFriendsJSON(Model model) {

        List<Person> friends = new ArrayList<>();

        friends.add(new Person(0, "Allan", 23, 85.3f));
        friends.add(new Person(1, "Dennis", 31, 124.1f));
        friends.add(new Person(2, "Carol", 45, 114.8f));
        friends.add(new Person(3, "Sarah", 28, 78.1f));

        model.addAttribute("people", friends);

        return friends;
    }
}
