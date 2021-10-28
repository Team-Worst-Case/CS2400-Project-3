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

    BinaryTree<String> aTree = new BinaryTree<>();
    // Leaves
    BinaryTree<String> dTree = new BinaryTree<>("D");
    BinaryTree<String> eTree = new BinaryTree<>("E");
    BinaryTree<String> gTree = new BinaryTree<>("G");

    // Subtrees:
    BinaryTree<String> fTree = new BinaryTree<>("F", null, gTree);
    BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
    BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

    aTree.setTree("A", bTree, cTree);
    
    aTree.postorderTraverse();
    
    aTree.postorderTraverse_callBinaryNodeMethod();
    
    aTree.getHeight();
    aTree.getHeight_callBinaryNodeMethod();
    
    System.out.println();
    
    aTree.getNumberOfNodes();
    aTree.getNumberOfNodes_callBinaryNodeMethod();
		
}