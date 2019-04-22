package com.swc.back.BackAddressweb;

import com.swc.pojo.Address;
import com.swc.service.AddressService.IAddressService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class BackAddressWeb {
    @Resource
    private IAddressService service;
    @RequestMapping("/addresslist.do")
    public String a(ModelMap map){
        List<Address> address = service.getAddress();
        map.addAttribute("address",address);
        return "back/addresslist";
    }
    @RequestMapping("/deleteaddress.do")
    public String a1(int id){
        service.deleteAddress(id);
        return "redirect:addresslist.do";
    }
    @RequestMapping("/updateaddress.do")
    public String a2(int id,ModelMap map){
        Address address = service.selectone(id);
        map.addAttribute("address",address);
        return "back/updateaddress";
    }
    @RequestMapping("/doupdateaddress.do")
    public String a3(Address address){
        service.updateAddress(address);
        return "redirect:addresslist.do";
    }

}
