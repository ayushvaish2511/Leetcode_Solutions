/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null)
        {
            return null;
        }
        Stack<TreeNode> st = new Stack<>();
        List<String> ans = new ArrayList<>();
        st.add(root);
        while(!st.isEmpty())
        {
            TreeNode temp = st.pop();
            if(temp!=null)
            {
                ans.add(temp.val + "");
                st.add(temp.right);
                st.add(temp.left);
            }
            else
            {
                ans.add("null");
            }
        }
        return String.join(",", ans);
        
    }
    static int t = 0;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) 
    {
        if(data == null)
            return null;
        String[] arr = data.split(",");
        t = 0;
        return converter(arr);
    }
    
    public TreeNode converter(String[] arr)
    {
        if(arr[t].equals("null"))
            return null;
        TreeNode temp = new TreeNode(Integer.parseInt(arr[t]));
        t++;
        temp.left = converter(arr);
        t++;
        temp.right = converter(arr);
        return temp;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));