package Leetcode;

public class Leetcode_11_maxArea {
    public int maxArea(int[] height) {
        int area = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = 1; j < height.length; j++) {
                if (i < j) {
                    int tmp = caculateArea(i, j, height, area);
                    area = tmp > area ? tmp : area;
                }
            }
        }
        return area;
    }

    public int maxAreaWithDoublePoint(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }


    public int caculateArea(int i, int j, int[] height, int area) {
        int tmp = (j - i) * Math.min(height[i], height[j]);
        return tmp > area ? tmp : area;
    }

    public int maxAreaWithTwoScsn(int[] height) {
        int maxArea=0;
        for (int i = 0,j=height.length-1; i < j; ) {
            int minheight=height[i]<height[j]?height[++i]:height[j--];
            int area=(j-i+1)*minheight;
            maxArea=Math.max(area,maxArea);
        }
        return maxArea;
    }


}
