
/*
*
*                           每日一题 6.3
*
*
* */


/*
*
* 题目：对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
* 给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。
* 测试样例：
"()a()()",7  返回：false
*
*"()(()()",7  返回：false
*
* "(())"   返回true
* */
public class Test{
    public boolean chkParenthesis(String A, int n) {
        //1.先通过toCharArray转换成一个字符数组
        char[] arrC = A.toCharArray();
        int num = 0;
        int i = 0;
        //2.遍历这个数组 num在遍历完之后等于0
        while(i < arrC.length && num >= 0){
            if(arrC[i] == '('){
                num++;
            }else if(arrC[i] == ')'){
                num--;
            }
            i++;
        }
        if(i < arrC.length || num != 0){
            return false;
        }
        return true;
    }
}