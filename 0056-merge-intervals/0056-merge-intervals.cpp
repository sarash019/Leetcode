class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        std::sort(intervals.begin(), intervals.end());
        vector<vector<int>> ans;
        for(auto pairs : intervals){
            if(ans.empty() or ans.back()[1] < pairs[0]){
                ans.push_back(pairs);
            }else{
                ans.back()[1] = max(ans.back()[1], pairs[1]);
            }
        }
        return ans;
    }
};