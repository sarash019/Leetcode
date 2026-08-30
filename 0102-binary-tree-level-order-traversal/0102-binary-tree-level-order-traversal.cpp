class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> ans;
        if (root == nullptr) return ans; 

        queue<TreeNode*> q;
        q.push(root);

        while (!q.empty()) {
            int sz = q.size(); // Number of nodes in the current level
            vector<int> currentLevel;

            for (int i = 0; i < sz; i++) {
                TreeNode* curr = q.front();
                q.pop();

                currentLevel.push_back(curr->val);

                if (curr->left != nullptr) q.push(curr->left);
                if (curr->right != nullptr) q.push(curr->right);
            }

            ans.push_back(currentLevel); 
        }

        return ans;
    }
};