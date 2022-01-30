class Solution {
    public boolean isSumEqual(String a, String b, String c) {
        StringBuilder ac = new StringBuilder("");
        StringBuilder bc = new StringBuilder("");
        StringBuilder cc = new StringBuilder("");
        for(int i = 0; i<a.length(); i++)
        {
            int ch = (a.charAt(i) - 'a');
            ac.append((char)(ch+'0'));
        }
        for(int i = 0; i<b.length(); i++)
        {
            int ch = (b.charAt(i) - 'a');
            bc.append((char)(ch+'0'));
        }
        for(int i = 0; i<c.length(); i++)
        {
            int ch = (c.charAt(i) - 'a');
            cc.append((char)(ch+'0'));
        }
        long an = Long.parseLong(ac.toString());
        long bn = Long.parseLong(bc.toString());
        long cn = Long.parseLong(cc.toString());
        return ((an+bn) == cn);
    }
}