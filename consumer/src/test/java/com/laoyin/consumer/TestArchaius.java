package com.laoyin.consumer;

import com.netflix.config.*;
import com.sun.deploy.ref.Helpers;
import org.junit.jupiter.api.Test;
import rx.Observable;
import rx.functions.Action1;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * ClassName TestArchaius
 * Description
 * Create by gongyinquan
 * Date 2021/3/10 2:15 下午
 */
public class TestArchaius {


    @Test
    public void testArchaius() throws InterruptedException {
        AbstractPollingScheduler scheduler = new FixedDelayPollingScheduler(500, 500, false);
        DynamicConfiguration dynamicConfiguration = new DynamicConfiguration((initial, checkPoint) -> {
            Map<String, Object> map = new HashMap<>();
            map.put("test", UUID.randomUUID().toString());
            return PollResult.createFull(map);
        }, scheduler);

        ConfigurationManager.install(dynamicConfiguration);
        DynamicStringProperty stringProperty = DynamicPropertyFactory.getInstance().getStringProperty("test", "nodata");
        for (int i = 0; i < 10; i++) {
            System.out.println(stringProperty.get());
            TimeUnit.SECONDS.sleep(1L);
        }

        Observable.create(t -> {});
        Observable.interval(1L, TimeUnit.SECONDS).take(20).doOnNext(aLong -> {
            System.out.println(stringProperty.get());
        });

    }

    @Test
    public void testRx() {

    }


}
