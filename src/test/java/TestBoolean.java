import org.testng.annotations.Test;

public class TestBoolean {
    @Test
    public void test() {
        if(Boolean.parseBoolean(System.getenv("isRemote"))){
            System.out.println("isRemote");
            System.out.println(System.getenv("isRemote"));
        } else {
            System.out.println("Not isRemote");
            System.out.println(System.getenv("isRemote"));
        }
    }
}
