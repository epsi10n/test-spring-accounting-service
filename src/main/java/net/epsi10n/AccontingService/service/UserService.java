package net.epsi10n.AccontingService.service;

import net.epsi10n.AccontingService.data.dto.UserData;

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
    UserData addPhoneOrEmail(Long id, UserData data);

    /**
     *
     * @param id
     * @param data
     * @return
     */
    UserData updatePhoneOrEmail(Long id, UserData data);

    /**
     *
     * @param id
     * @param data
     * @return
     */
    UserData deletePhoneOrEmail(Long id, UserData data);

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
