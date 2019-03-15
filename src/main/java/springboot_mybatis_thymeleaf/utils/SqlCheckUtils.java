package springboot_mybatis_thymeleaf.utils;

import java.util.regex.Pattern;

/**
 * SQL注入检查
 * copy from https://blog.csdn.net/borbore/article/details/69396249
 */
public class SqlCheckUtils {
    /**正则表达式**/
    private static String reg = "(?:')|(?:--)|(/\\*(?:.|[\\n\\r])*?\\*/)|"
            + "(\\b(select|update|union|and|or|delete|insert|trancate|char|into|substr|ascii|declare|exec|count|master|into|drop|execute)\\b)";

    //b  表示 限定单词边界  比如  select 不通过   1select则是可以的
    private static Pattern sqlPattern = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);

    public static boolean isValid(String str)
    {
        if (sqlPattern.matcher(str).find())
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(SqlCheckUtils.isValid("[{\"key\":\"code\",\"separator\":\"=\",\"value\":\"600000;select\"}]"));
    }
}
