package net.epsi10n.AccontingService.service;

import net.epsi10n.AccontingService.data.dto.CreationResponse;
import net.epsi10n.AccontingService.data.dto.UserData;
import net.epsi10n.AccontingService.data.dto.request.UserDataChangeRequest;
import net.epsi10n.AccontingService.exception.NotFoundException;

import java.util.List;

/**
 *
 */
public interface UserService {
    /**
     *
     * @param id
     * @param data
     * @return
     */
    CreationResponse addPhone(Long id, UserDataChangeRequest data) throws NotFoundException;

    /**
     *
     * @param id
     * @param data
     * @return
     */
    CreationResponse addEmail(Long id, UserDataChangeRequest data) throws NotFoundException;

    /**
     *
     * @param id
     * @param data
     * @return
     */
    CreationResponse updatePhone(Long id, UserDataChangeRequest data) throws NotFoundException;

    /**
     *
     * @param id
     * @param data
     * @return
     */
    CreationResponse updateEmail(Long id, UserDataChangeRequest data) throws NotFoundException;

    /**
     *
     * @param id
     * @param data
     * @return
     */
    CreationResponse deletePhoneOrEmail(Long id, UserData data);

    /**
     *
     * @param email
     * @param phone
     * @return
     */
    UserData getUser(String email, String phone);

    /**
     *
     * @param dateOfBirth
     * @param name
     * @return
     */
    List<UserData> searchUsers(String dateOfBirth, String name);
}
