package moe.tsukasa.quartz.timetask;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * <p>
 * 每天18:00到20:00期间执行5+1次，每次执行时间间隔为2s
 * </p>
 *
 * @package: moe.tsukasa.quartz.timetask
 * @description: Description message
 * @author: Tsukasa
 * @date: Created in 2021/3/6 17:34
 * @copyright: Copyright (c) 2021
 * @version: V1.0
 * @modified: Tsukasa
 */
public class DailyTimeTriggerTest {

    public static void main(String[] args) throws SchedulerException {
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();

        Trigger trigger = TriggerBuilder.newTrigger()
                .startNow()
                .withSchedule(DailyTimeIntervalScheduleBuilder.dailyTimeIntervalSchedule()
                        .startingDailyAt(TimeOfDay.hourAndMinuteOfDay(18, 0))
                        .endingDailyAt(TimeOfDay.hourAndMinuteOfDay(20, 0))
                        .withIntervalInSeconds(2)
                        .withRepeatCount(5)
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
