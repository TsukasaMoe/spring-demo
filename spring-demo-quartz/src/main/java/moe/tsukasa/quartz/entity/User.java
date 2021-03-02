package moe.tsukasa.quartz.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * Class/Interface/Enum/Annotation description
 * </p>
 *
 * @package: moe.tsukasa.quartz.entity
 * @description: Description message
 * @author: Tsukasa
 * @date: Created in 2021/2/27 01:41
 * @copyright: Copyright (c) 2021
 * @version: V1.0
 * @modified: Tsukasa
 */
@Getter
@Setter
@AllArgsConstructor
public class User {
    private int userId;
    private String userName;
    private String sex;
}
