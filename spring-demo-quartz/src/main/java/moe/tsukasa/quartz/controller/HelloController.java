package moe.tsukasa.quartz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * Class/Interface/Enum/Annotation description
 * </p>
 *
 * @package: moe.tsukasa.quartz.controller
 * @description: Description message
 * @author: Tsukasa
 * @date: Created in 2021/2/27 00:46
 * @copyright: Copyright (c) 2021
 * @version: V1.0
 * @modified: Tsukasa
 */
@Controller
public class HelloController {

    @RequestMapping(path = "/hello")
    @ResponseBody
    public String hello() {
        return "Hello Spring!";
    }
}
