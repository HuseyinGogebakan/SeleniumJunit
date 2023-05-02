package Day11;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FileExists extends Base {

    @Test
    public void test01(){

        // str = System.getProperty("user.dir")

        // str + System.getProperty("file.separator") or str + /fileExists.txt
        String path = System.getProperty("user.dir")
                +System.getProperty("file.separator")
                +"fileExists.txt";

        System.out.println("Path  is  " + path);

        Assert.assertTrue(Files.exists(Paths.get(path)));



    }



}
