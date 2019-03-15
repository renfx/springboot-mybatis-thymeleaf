package springboot_mybatis_thymeleaf.model;

import lombok.Builder;
import lombok.Data;
import springboot_mybatis_thymeleaf.enumeration.ResultCode;

import java.util.Collections;
import java.util.Map;

@Data@Builder
public class Result {
    private int code;
    private String msg;
    private String exception;
    private Boolean success;
    private Map<String,Object> map;

    public static Result successResult(){
        return Result.builder().success(true).code(ResultCode.SUCCESS.getCode()).msg(ResultCode.SUCCESS.getDescription()).map(Collections.EMPTY_MAP).build();
    }
    public static Result failResult(){
        return Result.builder().success(false).code(ResultCode.FAIL.getCode()).msg(ResultCode.FAIL.getDescription()).map(Collections.EMPTY_MAP).build();
    }
    public static Result exceptionResult(){
        return Result.builder().success(false).code(ResultCode.EXCETION.getCode()).msg(ResultCode.EXCETION.getDescription()).map(Collections.EMPTY_MAP).build();
    }

    public Map<String,Object> putAll(Map<? extends String, ?> m){
        map.putAll(m);
        return map;
    }
    public Map<String,Object> put(String key,Object value){
        map.put(key,value);
        return map;
    }
}
