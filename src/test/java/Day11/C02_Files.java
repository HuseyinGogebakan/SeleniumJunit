package Day11;

import Utilities.Base;
import org.junit.Test;

public class C02_Files {




    @Test
    public void files(){

        String fileSeperator = System.getProperty("file.separator");
        System.out.println("fileSeperator = " + fileSeperator);
//      Home path
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);
 //     Current file we are in (path)
        String dir = System.getProperty("user.dir");
        System.out.println("dir = " + dir);
    }
}
