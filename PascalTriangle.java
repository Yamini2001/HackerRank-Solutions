class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> rows = new ArrayList<>();
            rows.add(1);
            for(int j=1;j<i;j++){
                List<Integer> prevRows = triangle.get(i-1);
                int sum = prevRows.get(j-1) + prevRows.get(j);
                rows.add(sum);
            }
            if(i>0){
                rows.add(1);
            }
            triangle.add(rows);
        } 
        return triangle;
    }
}