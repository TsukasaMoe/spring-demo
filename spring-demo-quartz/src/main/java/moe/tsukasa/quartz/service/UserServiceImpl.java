package moe.tsukasa.quartz.service;

import moe.tsukasa.quartz.dao.UserDao;
import moe.tsukasa.quartz.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * Class/Interface/Enum/Annotation description
 * </p>
 *
 * @package: moe.tsukasa.quartz.service
 * @description: Description message
 * @author: Tsukasa
 * @date: Created in 2021/3/3 00:51
 * @copyright: Copyright (c) 2021
 * @version: V1.0
 * @modified: Tsukasa
 */
@Service
public class UserServiceImpl implements UserService {

    public static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        logger.info("Start to getAllUsers.");
        List<User> allUsers = userDao.getAllUsers();
        logger.info("end to getAllUsers.");
        return allUsers;
    }
}
