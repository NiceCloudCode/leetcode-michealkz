package com.micheal.binaryTree;

/**
 * 224. 基本计算器 https://leetcode-cn.com/problems/basic-calculator/
 * 双栈解法
 * 我们可以使用两个栈 nums 和 ops 。
 * <p>
 * nums ： 存放所有的数字
 * ops ：存放所有的数字以外的操作，+/- 也看做是一种操作
 * 然后从前往后做，对遍历到的字符做分情况讨论：
 * <p>
 * 空格 : 跳过
 * ( : 直接加入 ops 中，等待与之匹配的 )
 * ) : 使用现有的 nums 和 ops 进行计算，直到遇到左边最近的一个左括号为止，计算结果放到 nums
 * 数字 : 从当前位置开始继续往后取，将整一个连续数字整体取出，加入 nums
 * +/- : 需要将操作放入 ops 中。在放入之前先把栈内可以算的都算掉，使用现有的 nums 和 ops 进行计算，直到没有操作或者遇到左括号，计算结果放到 nums
 * 一些细节：
 * <p>
 * 由于第一个数可能是负数，为了减少边界判断。一个小技巧是先往 nums 添加一个 0
 * <p>
 * 作者：AC_OIer
 * 链接：https://leetcode-cn.com/problems/basic-calculator/solution/shuang-zhan-jie-jue-tong-yong-biao-da-sh-olym/
 * 来源：力扣（LeetCode）
 */
public class _224基本计算器 {
    public static void main(String[] args) {

    }


}
