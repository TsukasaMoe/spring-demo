package moe.tsukasa.quartz.timetask;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;


/**
 * <p>
 * 启动后5s开始调度定时任务，总共重复5+1次，每次间隔2s
 * </p>
 *
 * @package: moe.tsukasa.quartz.task
 * @description: Description message
 * @author: Tsukasa
 * @date: Created in 2021/3/6 16:38
 * @copyright: Copyright (c) 2021
 * @version: V1.0
 * @modified: Tsukasa
 */
public class SimpleTriggerTest {

    public static void main(String[] args) throws SchedulerException {
        // 1.通过SchedulerFactory获取schedule
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();

        long currentTime = System.currentTimeMillis();
        long delayTime = currentTime + 5*1000;

        // 2.通过具体的ScheduleBuilder创建Trigger
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("t1", "tg1")
                .startAt(new Date(delayTime))
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withRepeatCount(5).withIntervalInSeconds(2))
                .build();

        // 3.获取JobDetail
        JobDetail jobDetail = JobBuilder.newJob(MyJobDetail.class)
                .withIdentity("j1", "jg1")
                .build();

        // 4.scheduler将trigger与jobDetail绑定
        scheduler.scheduleJob(jobDetail, trigger);
        // 5.启动schedule
        scheduler.start();
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 6.停止schedule
        scheduler.shutdown();
    }
}
