import org.junit.Test;
import static org.mockito.Mockito.*;

public class JUnit {

    @Test
    //protected String getPOTraversal() {
    protected void getPOTraversal() {
        //String traversal = "";
        BinaryTree<String> aTree = new BinaryTree<>();
        DriverBT.createTree1(aTree);

        verify(aTree, times(1)).postorderTraverse();
        //return traversal;
    }
    
    @Test
    //protected String getPOTraversal() {
    protected void getPOTraversal_BinaryNode() {
        //String traversal = "";
        BinaryTree<String> aTree = new BinaryTree<>();
        DriverBT.createTree1(aTree);

        verify(aTree, times(1)).postorderTraverse_callBinaryNodeMethod();
        //return traversal;
    }

    /**public void poTraverse() {
        String traversal = getPOTraversal();
        System.out.println(traversal);
    }*/
    
    /*aTree.getHeight();
    aTree.getHeight_callBinaryNodeMethod();
    
    aTree.getNumberOfNodes();
    aTree.getNumberOfNodes_callBinaryNodeMethod();**/
}