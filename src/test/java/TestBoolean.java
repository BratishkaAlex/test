import org.testng.annotations.Test;

public class TestBoolean {
    @Test
    public void test() {
        if(Boolean.getBoolean(System.getenv("isRemote"))){
            System.out.println("isRemote");
        } else {
            System.out.println("Not isRemote");
        }
    }
}
