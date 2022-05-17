import org.apache.log4j.Logger;

public class TestUse {
    @org.junit.Test
    public void test(){
        Logger logger = Logger.getLogger(TestUse.class);
        logger.info("test");
    }
}
