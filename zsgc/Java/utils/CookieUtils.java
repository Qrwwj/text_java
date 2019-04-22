package utils;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class CookieUtils {
    public static Map<String,Cookie> getCookie(Cookie[]cookies){
        Map<String,Cookie> map=new HashMap<>();
        if (cookies!=null){
            for (Cookie c:cookies){
                map.put(c.getName(),c);
            }
        }
        return map;
    }
}
