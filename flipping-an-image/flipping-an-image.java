class Solution {
    public int[][] flipAndInvertImage(int[][] image) 
    {
        int n = image.length;
        for(int i = 0; i<n; i++)
        {
            int j = 0;
            int k = n-1;
            while(j<=k)
            {
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
                j++;
                k--;
            }
            for(j = 0; j<n; j++)
            {
                if(image[i][j] == 1)
                    image[i][j] = 0;
                else 
                    image[i][j] = 1;
            }
        }
        return image;
    }
}