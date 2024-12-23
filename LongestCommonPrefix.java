class Solution {
    public String longestCommonPrefix(String[] arr) {
        int n = arr.length;
        String result = arr[0];
        for(int i=1;i<n;i++){
            while(arr[i].indexOf(result)!=0){
                result = result.substring(0,result.length()-1);
                if(result.isEmpty()){
                    return "";
                }
            }
        }
        return result;
    }
}