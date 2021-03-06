package moe.tsukasa.quartz.timetask;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;
import java.util.TimeZone;

/**
 * <p>
 * Class/Interface/Enum/Annotation description
 * </p>
 *
 * @package: moe.tsukasa.quartz.timetask
 * @description: Description message
 * @author: Tsukasa
 * @date: Created in 2021/3/6 17:45
 * @copyright: Copyright (c) 2021
 * @version: V1.0
 * @modified: Tsukasa
 */
public class CalendarTriggerTest {

    public static void main(String[] args) throws SchedulerException {
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();

        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("t1", "tg1")
                .startAt(new Date(2021, 3, 6))
                .withSchedule(CalendarIntervalScheduleBuilder.calendarIntervalSchedule()
                        .inTimeZone(TimeZone.getTimeZone("UTC+8"))
                        .withIntervalInMonths(1)
                )
                .build();

        JobDetail jobDetail = JobBuilder.newJob(MyJobDetail.class)
                .withIdentity("j1", "jg1")
                .build();

        scheduler.scheduleJob(jobDetail, trigger);
        scheduler.start();
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scheduler.shutdown();
    }
}
