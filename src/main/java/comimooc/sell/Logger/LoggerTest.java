package comimooc.sell.Logger;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith (SpringRuner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {
    private final Logger logger = LoggerFactory.getLogger (LoggerTest.class);

    @Test
    public void test1(){
        String name ="张曦";
        String password="2111111";

        log.debug ("debug。。。。");
        log.info  ("info 。。。。");
        log.error ("error。。。。");
        log.info ("name:{},password:{}",name ,password);

    }
}
