//RECURSIVE
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inOrder(root, res);
        return res;
        
    }

    public void inOrder(TreeNode root, List<Integer> list){
        if(root == null) return;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
}

//ITERATIVE
List<Integer> inorder(TreeNode root){
   ListNode<Integer> res = new ArrayList<>();
   Stack<TreeNode> stack = new Stack<>();
   ListNode curr = root;
   while(curr != null || !stack.isEmpty()){
         while(curr != null){
                stack.push(curr);
                curr = curr.left;
          }
          curr = stack.pop();
          res.add(curr);
          curr = curr.right;
    }
    return res;
}
