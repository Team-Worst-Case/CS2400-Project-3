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
    
    /**
    need tests for:
    aTree.getHeight();
    aTree.getNumberOfNodes();
    */
    
    @Test
    //protected String getPOTraversal() {
    public void getPOTraversal_BinaryNode() {
        //String traversal = "";
        BinaryTree<String> aTree = new BinaryTree<>();
        DriverBT.createTree1(aTree);

        verify(aTree, times(1)).postorderTraverse_callBinaryNodeMethod();
        //return traversal;
    }

    @Test
    public void testGetHeight_binaryNodeMethod()
    {
        BinaryTree<String> aTree = new BinaryTree<>();
        DriverBT.createTree1(aTree);
        assertEquals(4, aTree.getHeight());

        BinaryTree<String> bTree = new BinaryTree<>();
        DriverBT.createTree2(bTree);
        assertEquals(7, bTree.getHeight());
    }

    @Test
    public void testGetNumberOfNodes_binaryNodeMethod()
    {
        BinaryTree<String> aTree = new BinaryTree<>();
        DriverBT.createTree1(aTree);
        assertEquals(4, aTree.getNumberOfNodes_callBinaryNodeMethod());

        BinaryTree<String> bTree = new BinaryTree<>();
        DriverBT.createTree2(bTree);
        assertEquals(7, bTree.getNumberOfNodes_callBinaryNodeMethod());
    }



    /**public void poTraverse() {
        String traversal = getPOTraversal();
        System.out.println(traversal);
    }*/
} // hi