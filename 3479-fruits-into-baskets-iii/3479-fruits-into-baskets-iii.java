class Solution {
    int[] tree;

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = baskets.length;
        tree = new int[4 * n];

        build(0, 0, n - 1, baskets);

        int count = 0;

        for (int fruit : fruits) {
            if (tree[0] < fruit) {
                count++;
            } else {
                place(0, 0, n - 1, fruit);
            }
        }

        return count;
    }

    private void build(int node, int left, int right, int[] baskets) {
        if (left == right) {
            tree[node] = baskets[left];
            return;
        }

        int mid = left + (right - left) / 2;

        build(2 * node + 1, left, mid, baskets);
        build(2 * node + 2, mid + 1, right, baskets);

        tree[node] = Math.max(tree[2 * node + 1], tree[2 * node + 2]);
    }

    private void place(int node, int left, int right, int fruit) {
        if (left == right) {
            tree[node] = -1;
            return;
        }

        int mid = left + (right - left) / 2;

        if (tree[2 * node + 1] >= fruit) {
            place(2 * node + 1, left, mid, fruit);
        } else {
            place(2 * node + 2, mid + 1, right, fruit);
        }

        tree[node] = Math.max(tree[2 * node + 1], tree[2 * node + 2]);
    }
}