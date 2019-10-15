package springboot_mybatis_thymeleaf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rfx
 * @Date 2019/3/15 10:11
 */
@RequestMapping("")
@Service
@Slf4j
public class AdminController {


    @RequestMapping("")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        int pageNo = 1;
        int pageSize = 10;
        //使用PageHelper分页
        PageHelper.startPage(pageNo,pageSize,false);
        //查询列表数据，会直接分页完成
        List<Object> list = new ArrayList<Object>(){{
            add(1);add(1);add(1);add(1);add(1);add(1);add(1);add(1);add(1);
            add(1);add(1);add(1);add(1);add(1);add(1);add(1);add(1);add(1);
        }};
        PageInfo<Object> pageInfo = new PageInfo<>(list);
        modelAndView.addObject("pageInfo",pageInfo);
        return modelAndView;
    }
}
