package com.snow.spring.boot.task.config;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 时间定时任务测试类
 *
 * @author jiaXue
 * @since 2024/1/25 15:01
 */
@Slf4j
@RequiredArgsConstructor
@Component
public class TimeTask {

    private final AsyncTask asyncTask;


    @Scheduled(fixedDelay = 2000)
    public void fixedCurrentTime() {
      // log.info("周期执行：当前时间：{}", LocalDateTime.now());
    }

    @Scheduled(initialDelay = 3000)
    public void initCurrentTime() {
        log.info("第一次执行：当前时间：{}", LocalDateTime.now());
        asyncTask.asyncTask();
        asyncTask.asyncTask2();

    }
}
