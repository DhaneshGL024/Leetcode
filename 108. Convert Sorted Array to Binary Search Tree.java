public TreeNode sortedArrayToBST(int[] nums) {
    return convertToBST(nums, 0, nums.length - 1);

}

private TreeNode convertToBST(int[] nums, int left, int right) {
    if (left > right) {
        return null;
    }

    int mid = left + (right - left) / 2;
    TreeNode node = new TreeNode(nums[mid]);

    node.left = convertToBST(nums, left, mid - 1);
    node.right = convertToBST(nums, mid + 1, right);

    return node;
}