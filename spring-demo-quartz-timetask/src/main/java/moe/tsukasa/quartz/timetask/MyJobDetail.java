package moe.tsukasa.quartz.timetask;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * Class/Interface/Enum/Annotation description
 * </p>
 *
 * @package: moe.tsukasa.quartz.task
 * @description: Description message
 * @author: Tsukasa
 * @date: Created in 2021/3/6 17:04
 * @copyright: Copyright (c) 2021
 * @version: V1.0
 * @modified: Tsukasa
 */
public class MyJobDetail implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("MyJobDetail execute...");
    }
}
