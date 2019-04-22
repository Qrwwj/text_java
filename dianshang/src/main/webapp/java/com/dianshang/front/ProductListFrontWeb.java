package com.dianshang.front;

import com.alibaba.fastjson.JSONObject;
import com.dianshang.pojo.list.One;
import com.dianshang.service.front.IOneServiceFront;
import com.dianshang.service.front.IProductServiceFront;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
@Controller
public class ProductListFrontWeb {
    @Resource
    private IProductServiceFront serviceFront;

    @ResponseBody
    @CrossOrigin("*")
    @RequestMapping(value = "/getshangpin.do",produces = "application/json;charset=UTF-8")
    public String getshangpin(){
        /*以流的形式输出到前端页面*/
        return JSONObject.toJSONString(serviceFront.getpct());
    }

    /*二级菜单*/
    @Resource
    private IOneServiceFront oneServiceFront;
    @ResponseBody
    @CrossOrigin("*")
    @RequestMapping(value="/one.do",produces="application/json;charset=UTF-8")
    public String one(){
        List<One> handles=oneServiceFront.getones();
        return JSONObject.toJSONString(handles);
    }
}
