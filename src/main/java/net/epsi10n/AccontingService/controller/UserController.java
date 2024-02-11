package net.epsi10n.AccontingService.controller;

import net.epsi10n.AccontingService.data.dto.CreationResponse;
import net.epsi10n.AccontingService.data.dto.UserData;
import net.epsi10n.AccontingService.data.dto.request.UserDataChangeRequest;
import net.epsi10n.AccontingService.exception.NotFoundException;
import net.epsi10n.AccontingService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/user")
@Validated
public class UserController {
    private final UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    @PutMapping("/addPhone/{id}")
    CreationResponse addPhone(@PathVariable Long id, @RequestBody @Valid UserDataChangeRequest data) throws NotFoundException {
        return userService.addPhone(id, data);
    }

    @PutMapping("/addEmail/{id}")
    CreationResponse addEmail(@PathVariable Long id, @RequestBody @Valid UserDataChangeRequest data) throws NotFoundException {
        return userService.addEmail(id, data);
    }

    @PostMapping("/updatePhone/{id}")
    CreationResponse updatePhone(@PathVariable Long id, @RequestBody UserDataChangeRequest data) throws NotFoundException {
        // TODO add or update data
        return userService.updatePhone(id, data);
    }

    @PostMapping("/updateEmail/{id}")
    CreationResponse updateEmail(@PathVariable Long id, @RequestBody UserDataChangeRequest data) throws NotFoundException {
        // TODO add or update data
        return userService.updateEmail(id, data);
    }

    @DeleteMapping("/delete/{id}")
    CreationResponse deletePhoneOrEmail(@PathVariable Long id, @RequestBody UserData data) {
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
