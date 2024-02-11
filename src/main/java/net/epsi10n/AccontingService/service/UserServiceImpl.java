package net.epsi10n.AccontingService.service;

import net.epsi10n.AccontingService.data.dto.CreationResponse;
import net.epsi10n.AccontingService.data.dto.UserData;
import net.epsi10n.AccontingService.data.dto.request.UserDataChangeRequest;
import net.epsi10n.AccontingService.data.entity.User;
import net.epsi10n.AccontingService.exception.NotFoundException;
import net.epsi10n.AccontingService.repo.crud.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 */
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public CreationResponse addPhone(Long id, UserDataChangeRequest data) throws NotFoundException {
        User u = findUserById(id);

        u.getPhoneData().forEach(ph -> {

        });

        return null;
    }

    @Override
    public CreationResponse addEmail(Long id, UserDataChangeRequest data) throws NotFoundException {
        User u = findUserById(id);

        u.getEmailData().forEach(email -> {

        });

        return null;
    }

    @Override
    public CreationResponse updatePhone(Long id, UserDataChangeRequest data) throws NotFoundException {
        User u = findUserById(id);
        return null;
    }

    @Override
    public CreationResponse updateEmail(Long id, UserDataChangeRequest data) throws NotFoundException {
        User u = findUserById(id);
        return null;
    }

    @Override
    public CreationResponse deletePhoneOrEmail(Long id, UserData data) {
        return null;
    }

    @Override
    public UserData getUser(String email, String phone) {
        return null;
    }

    @Override
    public List<UserData> searchUsers(String dateOfBirth, String name) {
        return null;
    }

    private User findUserById(Long id) throws NotFoundException {
        Optional<User> userOpt = userRepository.findById(id);

        if (userOpt.isPresent()) {
            throw new NotFoundException();
        }

        return userOpt.get();
    }
}
