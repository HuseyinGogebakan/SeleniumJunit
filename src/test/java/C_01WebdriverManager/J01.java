package C_01WebdriverManager;

import org.junit.*;

public class J01 {

    @BeforeClass
    public static void classGreeting(){
        System.out.println("welcome to the class");
    }
    @Before
    public void testingbefore() {
        System.out.println("pre testing phase is done ");
    }

    @Test // testler alfabektik siraya gore calisir!
    public void testing01() {
        System.out.println(" test01 is successfully executed");
    }
    @Test
    public void testing02(){
        System.out.println("test02 is succesfully executed");
    }

    @After
    public void theGoodending() {
        System.out.println("THE END");
    }
    @Ignore
    public void youbetterignore(){
        throw new RuntimeException();
    }
    @AfterClass
    public  static void bye(){ // it shouldn't belong to the object So we clarify them as STATIC
        System.out.println("bye bye see you soon");
    }
}