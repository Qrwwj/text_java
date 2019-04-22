package com.dianshang.queen;

import com.dianshang.pojo.Handle;
import com.dianshang.service.IHandleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
@Controller
public class HandleListWeb {
    @Autowired
    private IHandleService service;

    @RequestMapping("/addhandle.do")
    public String addhandle(ModelMap map) {
        List<Handle> handles=service.gethandles(null);
        System.out.println(handles);
        map.addAttribute("handles",handles);
        return "queen/addhandle";
    }

    @RequestMapping("/handlelist.do")
    public String handlelist(ModelMap map,String pageNum) {
        if (pageNum==null){
            pageNum="1";
        }
        PageHelper.startPage(Integer.parseInt(pageNum),10);
        List<Handle> handles = service.gethandles(null);
        PageInfo <Handle> pageInfo=new PageInfo<>(handles);
        map.addAttribute("pageInfo",pageInfo);
        map.addAttribute("handles", handles);
        return "queen/handlelist";
    }

    @RequestMapping("/dohandle.do")
    public String dohandle(Handle handle) {
        if (handle != null) {
            service.insert(handle);
        }
        return "redirect:handlelist.do";
    }

    /*修改商品品类信息*/
    @RequestMapping("/updatehandle.do")
    public String updatehandle(Integer id, ModelMap map) {
        Handle handles = service.gethandleOne(id);
        System.out.println(handles);
        map.addAttribute("handles", handles);
        return "queen/updatehandle";
    }

    /*修改完成后跳转的页面*/
    @RequestMapping("/update.do")
    public String update(Handle handle) {
        int update = service.update(handle);

        return "redirect:handlelist.do";
    }
}
