package moe.tsukasa.quartz.controller;

import moe.tsukasa.quartz.entity.User;
import moe.tsukasa.quartz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * Class/Interface/Enum/Annotation description
 * </p>
 *
 * @package: moe.tsukasa.quartz.controller
 * @description: Description message
 * @author: Tsukasa
 * @date: Created in 2021/2/27 01:45
 * @copyright: Copyright (c) 2021
 * @version: V1.0
 * @modified: Tsukasa
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/getAllUsers", method = RequestMethod.GET)
    @ResponseBody
    public List<User> displayAllUsers() {
        return userService.getAllUsers();
    }
}
