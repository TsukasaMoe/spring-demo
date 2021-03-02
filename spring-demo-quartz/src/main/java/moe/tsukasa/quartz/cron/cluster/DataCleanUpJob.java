package moe.tsukasa.quartz.cron.cluster;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * <p>
 * Class/Interface/Enum/Annotation description
 * </p>
 *
 * @package: moe.tsukasa.quartz.cron.cluster
 * @description: Description message
 * @author: Tsukasa
 * @date: Created in 2021/3/3 01:11
 * @copyright: Copyright (c) 2021
 * @version: V1.0
 * @modified: Tsukasa
 */
@DisallowConcurrentExecution
public class DataCleanUpJob extends QuartzJobBean {

    public static final Logger logger = LoggerFactory.getLogger(DataCleanUpJob.class);

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("DataCleanUpJob start.");
        logger.info("Do something in DataCleanUpJob.");
        logger.info("DataCleanUpJob end.");
    }
}
