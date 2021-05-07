package com.company;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

//class  X {
//    Y y = new Y();
//    public X() {
//        System.out.println("X");
//    }
//}
//class Y {
//    public Y() {
//        System.out.println("Y");
//    }
//}
public class Text{
//    Y y  = new Y();
//    public Z() {
//        System.out.println("Z");
//    }
//    public String name = "abc";
//    static boolean flag;
//    private int count;
//    Text(int a) {
//        count = a;
//    }

    //牛客网超长正整数相加
//public static String getAddTwoString(String str1,String str2) {
//    char[] c1 = new StringBuilder(str1).reverse().toString().toCharArray();
//    char[] c2 = new StringBuilder(str2).reverse().toString().toCharArray();
//    int len = c1.length > c2.length ? c1.length : c2.length;
//    int[] ret = new int[len + 1];
//    for(int i = 0; i < ret.length; i++) {
//        int tmp = ret[i];
//        if(i < c1.length) tmp += c1[i] - '0';
//        if(i < c2.length) tmp += c2[i] - '0';
//        if(tmp >= 10) {
//            tmp -= 10;
//            ret[i + 1] = 1;
//        }
//        ret[i] = tmp;
//    }
//    StringBuilder sb = new StringBuilder();
//    String result = "";
//    int head = len;
//    if(ret[len] == 0) head = len - 1;
//    for(int i = head; i >= 0; i--) {
//        sb.append(ret[i]);
//    }
//    result = sb.toString();
//    return result;
//}

    //杨辉三角的变形
//    public static int getInt(int n) {
//        int[][] arr = new int[n][n];
//        arr[0][0] = 1;
//        for(int i = 1; i < n; i++) {
//            for(int j = 0; j < arr[i].length; j++) {
//                int tmp = arr[i][j];
//                if(j - 1 >= 0) tmp += arr[i - 1][j - 1];
//                if(j - 2 >= 0) tmp += arr[i - 1][j - 2];
//                tmp += arr[i - 1][j];
//                arr[i][j] = tmp;
//            }
//        }
//        for(int i = 0; i < arr[n - 1].length; i++) {
//            if(arr[n - 1][i] % 2 == 0) {
//                return i + 1;
//            }
//        }
//        return -1;
//    }


    //超出时间限制
//    public String longestPalindrome(String s) {
//        if(s.length() < 2) {
//            return s;
//        }
//        int maxLen = 1;
//        int start = 0;
//        for(int i = 0; i < s.length() - 1; i++) {
//            for(int j = i + 1; j < s.length(); j++) {
//                if(isPalindrome(s,i,j) && (j - i + 1) > maxLen) {
//                    maxLen = j - i + 1;
//                    start = i;
//                }
//            }
//        }
//        return s.substring(start,start + maxLen);
//    }
//    public boolean isPalindrome(String str,int l,int r) {
//        while(l < r) {
//            if(str.charAt(l) != str.charAt(r)) return false;
//            l++;
//            r--;
//        }
//        return true;
//    }

    //重复 N 次的元素
//    public int repeatedNTimes(int[] A) {
//        int n = A.length;
//        Arrays.sort(A);
//        for(int i = 0; i <= n / 2; i++) {
//            int j = i + n / 2 - 1;
//            if(A[i] == A[j]) return A[i];
//        }
//        return -1;
//    }

    //最大升序子数组和
//    public int maxAscendingSum(int[] nums) {
//        int len = nums.length;
//        int[] dp = new int[len + 1];
//        dp[0] = nums[0];
//        int result = nums[0];
//        for(int i = 1; i < len; i++) {
//            if(nums[i] > nums[i - 1]) {
//                dp[i] = nums[i] + dp[i - 1];
//                result = Math.max(dp[i],result);
//            } else {
//                dp[i] = nums[i];
//            }
//        }
//        return result;
//    }

    //剑指 Offer 32 - II. 从上到下打印二叉树 II
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//        if(root == null) return result;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty()) {
//            List<Integer> list = new ArrayList<>();
//            int size = queue.size();
//            while(size != 0) {
//                TreeNode tmp = queue.poll();
//                list.add(tmp.val);
//                if(tmp.left != null) {
//                    queue.offer(tmp.left);
//                }
//                if(tmp.right != null) {
//                    queue.offer(tmp.right);
//                }
//                size--;
//            }
//            result.add(list);
//        }
//        return result;
//    }
    public static void main(String[] args) {
//        Queue<Integer> q = new LinkedList<>();
//        q.poll()
//        int n = 4;
//        System.out.println(getInt(4));
//        Text t = new Text(11);
//
//        System.out.println(t.count);
//        System.out.println(flag);

//        Text text = new Text();
//        Text text1 = new Text();
//        System.out.println(text.equals(text1) + "," + text.name.equals(text1.name));
//        System.out.println(Long.MAX_VALUE);
//        int addend;
//        char[] ch1 = new StringBuilder(addend).reverse().toString().toCharArray();
    }
}
