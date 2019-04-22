package com.swc.back.BackProductweb;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.swc.pojo.Handle;
import com.swc.pojo.Product;
import com.swc.service.Handleservice.IHandleService;
import com.swc.service.Productservice.IProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.*;
import java.util.List;

@Controller
public class BackProductWeb {
    @Resource
    private IHandleService handleservice;
    @Resource
    private IProductService service;
    @RequestMapping("/productlist.do")
    public String a(ModelMap map,String name,Integer status,String pageNum){
        if(pageNum==null){
            pageNum="1";
        }
        PageHelper.startPage(Integer.parseInt(pageNum),3);
        List<Product> products = service.getproducts(name,status);
        PageInfo<Product> pageInfo=new PageInfo<>(products,3);
        map.addAttribute("pageInfo",pageInfo);
        map.addAttribute("products",products);
        return "back/productlist";
    }
    @RequestMapping("/deleteproduct.do")
    public String a1(int id){
        service.deleteproduct(id);
        return "redirect:productlist.do";
    }
    @RequestMapping("/updateproduct.do")
    public String a2(int id,ModelMap map){
        Product product = service.selectone(id);
        map.addAttribute("product",product);
        return "back/updateproduct";
    }
    @RequestMapping("/doupdateproduct.do")
    public String a3(Product product){
        service.updateproduct(product);
        return "redirect:productlist.do";
    }
    @RequestMapping("/addproduct.do")
    public String a4(ModelMap map){
        List<Handle> handles = handleservice.gethandles(1);
        map.addAttribute("handles",handles);
        return "back/addproduct";
    }
    @RequestMapping("/doaddproduct.do")
    public String a5(Product product, MultipartFile file){
        product.setMainImage(file.getOriginalFilename());
        File file1=new File("G:\\shiwenchao\\java\\relegou\\src\\main\\webapp\\static"+file.getOriginalFilename());
        service.insertproduct(product);
        return "redirect:productlist.do";
    }
}
