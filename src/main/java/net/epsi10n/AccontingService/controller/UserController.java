package net.epsi10n.AccontingService.controller;

import net.epsi10n.AccontingService.data.dto.UserData;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @PutMapping("/add/{id}")
    UserData addPhoneOrEmail(@PathVariable Long id, @RequestBody UserData data) {
        // TODO add or update data
        return null;
    }

    @PostMapping("/update/{id}")
    UserData updatePhoneOrEmail(@PathVariable Long id, @RequestBody UserData data) {
        // TODO add or update data
        return null;
    }

    @DeleteMapping("/delete/{id}")
    UserData deletePhoneOrEmail(@PathVariable Long id, @RequestBody UserData data) {
        // TODO add or update data
        return null;
    }

    @GetMapping("/data")
    @ResponseBody
    UserData getUser(@RequestParam String email, @RequestParam String phone) {
        // TODO return unique user
        return null;
    }

    @GetMapping("/list")
    @ResponseBody
    List<UserData> searchUsers(@RequestParam String dateOfBirth, @RequestParam String name) {
        // TODO search by criteria
        return new ArrayList<>(0);
    }
}
