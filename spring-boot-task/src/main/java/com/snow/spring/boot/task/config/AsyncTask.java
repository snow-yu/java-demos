package com.snow.spring.boot.task.config;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 异步任务测试类
 *
 * @author jiaXue
 * @since 2024/1/25 15:09
 */
@Slf4j
@Component
public class AsyncTask {

    @Async
    public void asyncTask() {
        log.info("异步任务开始执行");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("异步任务执行完成");
    }

    @Async("asyncTaskExecutor")
    public void asyncTask2() {
        log.info("异步任务开始执行01");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("异步任务执行完成02");
    }
}
