public class promble_0011 {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            // TODO:
            // 这个地方实际上还是可以优化的。并不需要每次都计算面积，而是应该在向左移动\向右移动之后，如果高度增加了，才应该计算面积。对于向内移动了，深度降低的情况，没必要计算面积。
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
            } else {
                --r;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        promble_0011 promble_0011 = new promble_0011();
        int[] temp = new int[] { 1, 2, 4, 3 };
        System.out.println(promble_0011.maxArea(temp));
    }

}