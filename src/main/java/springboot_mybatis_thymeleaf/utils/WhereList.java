package springboot_mybatis_thymeleaf.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author rfx
 * @Date 2019/2/27 15:06
 */
public class WhereList {
    private List<Map<String,Object>> whereListMap;
    private WhereList(){}
    public static WhereList builder(){
        WhereList whereList = new WhereList();
        whereList.whereListMap = new ArrayList<>();
        return whereList;
    }

    /**
     * 添加条件
     * @param key 数据库字段
     * @param separator 分隔符 > = < 等
     * @param value 值
     * @return
     */
    public WhereList addCondition(String key,String separator,String value){
        Map<String,Object> map = new HashMap<>();
        map.put("key",key);
        map.put("separator",separator);
        map.put("value",value);
        this.whereListMap.add(map);
        return this;
    }

    public List<Map<String, Object>> getWhereListMap() {
        return whereListMap;
    }
}
