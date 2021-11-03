import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


public class JUnit {

    @Test
    //protected String getPOTraversal() {
    public void getPOTraversal() {
        //String traversal = "";
        BinaryTree<String> aTree = new BinaryTree<>();
        DriverBT.createTree1(aTree);

        verify(aTree, times(1)).postorderTraverse();
        //return traversal;
    }
    
    @Test
    public void testGetHeight_binaryNodeMethod()
    {
        BinaryTree<String> aTree = new BinaryTree<>();
        DriverBT.createTree1(aTree);
        assertEquals(4, aTree.getHeight());
    }

    @Test
    public void testGetNumberOfNodes_binaryNodeMethod()
    {
        BinaryTree<String> aTree = new BinaryTree<>();
        DriverBT.createTree1(aTree);
        assertEquals(7, aTree.getNumberOfNodes_callBinaryNodeMethod());
    }
    
    @Test
    //protected String getPOTraversal() {
    public void getPOTraversal_BinaryNode() {
        //String traversal = "";
        BinaryTree<String> aTree = new BinaryTree<>();
        DriverBT.createTree1(aTree);

        verify(aTree, times(1)).postorderTraverse_callBinaryNodeMethod();
        //return traversal;
    }
} 