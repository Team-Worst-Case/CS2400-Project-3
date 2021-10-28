import org.junit.Test;
import static org.mockito.Mockito.*;

public class JUnit {
    protected String getPOTraversal() {
        String traversal = "";

        return traversal;
    }

    public void poTraverse() {
        String traversal = getPOTraversal();
        System.out.println(traversal);
    }
}