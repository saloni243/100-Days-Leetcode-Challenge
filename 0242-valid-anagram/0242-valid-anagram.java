
class Solution {
    public boolean isAnagram(String s, String t) {
        int a = s.length();
        int b = t.length();

        if(a != b){
            return false;
        }

        char [] arr1 = s.toCharArray();
        char [] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i =0;i<a;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }

        }

        return true ;

    }
}