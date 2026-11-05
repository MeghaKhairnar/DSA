class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        HashSet<Character> set = new HashSet<>();

        // store all character of jewels in set
        for(char ch: jewels.toCharArray())
        {
            set.add(ch);
        }

        // check each stone and count the matches
        int count =0;
        for(char ch : stones.toCharArray())
        {
            if(set.contains(ch))
            {
                count++;
            }

        }
        return count;
    }
}