/**
 * Created by zengjinjie on 2017/4/14 0014.
 * 来源于http://blog.csdn.net/xiaanming/article/details/8703708/
 */
public class Test {
    public static void main(String[]args){
        /**
         * new 一个小李
         */Li li = new Li();


        /**
         * new 一个小王
         */
        Wang wang = new Wang(li);

        /**
         * 小王问小李问题
         */
        wang.askQuestion("1 + 1 = ?");
    }
}
