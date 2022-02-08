class Solution {
    public int minOperations(int n) {
     // 1 3 5 7 11 13       5 + 3 + 1
    // 1 3 5 7 11           4 + 2
       
        if(n%2 == 1)
        {
            int mid = (2 * (n/2)) + 1;    //3
            int no_of  = n/2;               //1
            int d = -2;                     
            int a = mid - 1;            //2
            int ans = (int)((no_of/2.0) * ((2*a) + ((no_of - 1)*d)));
            return ans;
        }
        else 
        {
            int eq = n;  //6  
            int i = n/2;        //3
            int a = n-1;       //5
            return (int)((i/2.0) * (2*a + ((i-1)*(-2))));
        }
    }
}

//1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33
//16 14 12 10 8 6 4 2 0 