package moe.tsukasa.quartz.cron.local;

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
 * @package: moe.tsukasa.quartz.cron
 * @description: Description message
 * @author: Tsukasa
 * @date: Created in 2021/3/3 01:06
 * @copyright: Copyright (c) 2021
 * @version: V1.0
 * @modified: Tsukasa
 */
@DisallowConcurrentExecution
public class LocalCacheRefreshJob extends QuartzJobBean {

    public static final Logger logger = LoggerFactory.getLogger(LocalCacheRefreshJob.class);

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("LocalCacheRefreshJob start.");
        logger.info("Do something in LocalCacheRefreshJob.");
        logger.info("LocalCacheRefreshJob end.");
    }
}
