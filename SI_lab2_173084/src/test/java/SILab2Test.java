import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    private List<String> lista(String... elems){
        return new ArrayList<>(Arrays.asList());

    }

    @Test

    void everyStatementTest(){
        RuntimeException exception;
        SILab2 siLab2 = new SILab2();

        exception = assertThrows(RuntimeException.class, () -> siLab2.function(null, null));
        assertTrue(exception.getMessage().contains("The user argument is not initialized!"));

        User user2 = new User(null, "anything", "anything");
        exception = assertThrows(RuntimeException.class, () -> siLab2.function(user2, null));
        assertTrue(exception.getMessage().contains("User already exists!"));

        User user3 = new User("Antonio","Anything", null);
        assertEquals(false, siLab2.function(user3, null));

        User user4 = new User("Antonio" ,"Anything",   "antonio_trajkovski12@yahoo.com");
        assertEquals(true, siLab2.function(user4, null));


        User user5 = new User("Antonio" ,"Anything", "antonio_trajkovski12@yahoocom");
        assertEquals(false, siLab2.function(user5, null));


    }

    @Test
    void testEveryPath(){
        RuntimeException exception;
        SILab2 siLab2 = new SILab2();

        // 1,2,3,22
        exception = assertThrows(RuntimeException.class, () -> siLab2.function(null, null));
        assertTrue(exception.getMessage().contains("The user argument is not initialized!"));

        // 1,2,4,5,6,22
        User user2 = new User(null, "anything", "anything");
        exception = assertThrows(RuntimeException.class, () -> siLab2.function(user2, null));
        assertTrue(exception.getMessage().contains("User already exists!"));

        // 1,2,4,5,7,8,10,11.1,11.2,(12,13,14,15,16,11.3,11.2),17,19,20,21,22
        User user3 = new User("Antonio" ,"Anything", null);
        assertEquals(false, siLab2.function(user3, null));

        //1,2,4,5,7,8,10,11.1,11.2,(12,13,14,16,11.3,11.2),17,18,22
        User user4 = new User("Antonio" ,"Anything",   "antonio_trajkovski12@yahoo.com");
        assertEquals(true, siLab2.function(user4, null));

        //1,2,4,5,7,8,10,11.1,11.2,(12,13,14,16,11.3,11.2),17,18,22
        User user5 = new User("Antonio" ,"Anything",  "antonio_trajkovski12@yahoocom");
        assertEquals(false, siLab2.function(user5, null));

        //1,2,4,5,7,8,10,11.1,11.2,(12,14,15,16,11.3,11.2),17,18,22
        User user6 = new User("Antonio" ,"Anything",  "antonio_trajkovski12yahoo.com");
        assertEquals(false, siLab2.function(user6, null));

        // 1,2,4,5,7,8,10,11.1,11.2,(12,14,16,11.3,11.2),17,18,22
        User user7 = new User("Antonio" ,"Anything",  "antonio_trajkovski12yahoocom");
        assertEquals(false, siLab2.function(user7, null));
    }

}
