class Solution {
    public String simplifyPath(String path) 
    {
        String[] arr = path.split("/");
        Stack<String> dir = new Stack<>();
        for(int i = 0; i<arr.length; i++)
        {
            if(!arr[i].equals(""))
            {
                if(arr[i].equals(".."))
                {
                    if(!dir.isEmpty())
                        dir.pop();                
                }
                else if(arr[i].equals("."))
                    continue;
                else 
                    dir.push(arr[i]);                    
            }
        }
        Stack<String> dir1 = new Stack<>();
        while(!dir.isEmpty())
        {
            dir1.push(dir.pop());
        }
        StringBuilder ans = new StringBuilder("/");
        while(!dir1.isEmpty())
        {
            if(dir1.size()!=1)
                ans.append(dir1.pop() + "/");
            else 
                ans.append(dir1.pop());
        }
        return ans.toString();
        
//         for(int i = arr.length-1; i>=0; i--)
//         {
//             if(!arr[i].equals(""))
//             {
//                 if(arr[i].equals(".."))
//                     break;
//                 else if(!arr[i].equals("."))
//                 {
//                     st.insert(0, arr[i]);
//                     st.insert(0, "/");
//                 }
//             }
//         }
//         if(st.length() == 0)
//             return "/";
//         return st.toString();
    }
}