package springboot_mybatis_thymeleaf.utils;

import javax.servlet.ServletRequest;
import java.util.HashMap;
import java.util.Map;

public class RequestParamUtil {
    public static Map<String, String> getParams(ServletRequest request) {
        Map<String, String> map = new HashMap<String, String>();
        Map<String, String[]> paramMap = request.getParameterMap();
        try {
            if (paramMap != null) {
                for (Map.Entry<String, String[]> e : paramMap.entrySet()) {
                    if (e.getValue() == null || e.getValue().length == 0) {
                        map.put(e.getKey(), null);
                    } else if (e.getValue().length == 1) {
                        map.put(e.getKey(), e.getValue()[0]);
                    } else {
                        String[] values = e.getValue();
                        String value = "";
                        for (int i = 0; i < values.length; i++) {
                            value = values[i] + ",";
                        }
                        value = value.substring(0, value.length() - 1);
                        map.put(e.getKey(), value);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
