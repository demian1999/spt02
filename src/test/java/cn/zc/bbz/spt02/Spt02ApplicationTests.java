package cn.zc.bbz.spt02;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Spt02ApplicationTests {

    Logger r = LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads() {
        r.trace("这是trace级别");
        r.debug("这是debug级别");
        r.info("这是info级别");
        r.warn("这是warn级别");
        r.error("这是error级别");
    }

}
