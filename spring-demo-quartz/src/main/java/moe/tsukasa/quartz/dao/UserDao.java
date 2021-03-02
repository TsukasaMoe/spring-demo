package moe.tsukasa.quartz.dao;

import moe.tsukasa.quartz.entity.User;

import java.util.List;

/**
 * <p>
 * Class/Interface/Enum/Annotation description
 * </p>
 *
 * @package: moe.tsukasa.quartz.dao
 * @description: Description message
 * @author: Tsukasa
 * @date: Created in 2021/2/27 01:42
 * @copyright: Copyright (c) 2021
 * @version: V1.0
 * @modified: Tsukasa
 */
public interface UserDao {

    /**
     * 获取所有用户列表
     *
     * @return 所有用户
     */
    List<User> getAllUsers();
}
