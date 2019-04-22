package com.swc.back.BackHandleweb;

import com.swc.pojo.Handle;
import com.swc.service.Handleservice.IHandleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BackHandleWeb {
    @Autowired
    private IHandleService service;
    @RequestMapping("/handlelist.do")
    public String a(HttpSession session, ModelMap map){
        List<Handle> handles = service.gethandles(null);
        map.addAttribute("handles",handles);
        return "back/handlelist";
    }
    @RequestMapping("/updatehandle.do")
    public String a1(ModelMap map,int id){
        Handle handle = service.selectone(id);
        map.addAttribute("handle",handle);
        return "back/updatehandle";
    }
    @RequestMapping("/doupdatehandle.do")
    public String a2(Handle handle){
        service.updatehandle(handle);

        return "redirect:handlelist.do";
    }
    @RequestMapping("/deletehandle.do")
    public String a3(int id){
        service.deletehandle(id);
        return "redirect:handlelist.do";
    }
    @RequestMapping("/addhandle.do")
    public String a5(ModelMap map){
        List<Handle> handles = service.gethandles(null);
        map.addAttribute("handles",handles);
        return "back/addhandle";
    }
    @RequestMapping("/inserthandle.do")
    public String a4(Handle handle){
        if(handle!=null) {
            service.inserthandle(handle);
        }
        return "redirect:handlelist.do";
    }


}
