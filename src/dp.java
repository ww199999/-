import java.util.ArrayList;
import java.util.List;

public class dp {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        ans.add(row1);
        for(int i = 1; i < numRows; i++){
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            List<Integer> list = ans.get(i - 1);
            for(int j = 1; j < i; j++){
                row.add(list.get(j) + list.get(j-1));
            }
            row.add(1);
            ans.add(row);
        }
        return ans;
    }
}
