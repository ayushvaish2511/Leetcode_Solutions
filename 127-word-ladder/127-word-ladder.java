class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordLi) 
    {
        HashSet<String> wordList = new HashSet<>(wordLi);
        HashSet<String> visited = new HashSet<>();
        Queue<String> qu = new LinkedList<>();
        qu.add(beginWord);
        visited.add((beginWord));
        int count = 0;
        
        while(qu.size()>0)
        {
            int n = qu.size();
            count++;
            
            for(int i = 0; i<n; i++)
            {
                String curr = qu.remove();
                if(curr.equals(endWord))
                    return count;
                StringBuilder newWord = new StringBuilder(curr);
                for(int j = 0; j<newWord.length(); j++)
                {
                    char original = curr.charAt(j);
                    for(int k = 0; k<26; k++)
                    {
                        if('a'+k == original)
                            continue;
                        else
                        {
                            newWord.setCharAt(j, (char)('a'+k));
                            if(wordList.contains(newWord.toString()) && !visited.contains(newWord.toString()))
                            {
                                visited.add(newWord.toString());
                                qu.add(newWord.toString());
                            }
                        }
                    }
                    newWord.setCharAt(j, original);
                }
            }
        }
        return 0;        
    }
}