package com.dianshang.queen;

import com.dianshang.pojo.Handle;
import com.dianshang.pojo.Product;
import com.dianshang.service.IHandleService;
import com.dianshang.service.IPtroductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.io.FileUtils;
import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
@Controller
public class ProductListWeb {
    @Resource
    private IPtroductService service;
    @Resource
    private IHandleService handleservice;

    @RequestMapping("/addproduct.do")
    public String addproduct(ModelMap map) {
        List<Handle> handles = handleservice.gethandles(1);
        map.addAttribute("handles", handles);
        return "queen/addproduct";
    }

    @RequestMapping("/doaddproduct.do")
    public String doaddproduct(Product product, MultipartFile file, HttpServletRequest request) {
        /*try {
            Part part=request.getPart("file");
            String filesuf=part.getSubmittedFileName().substring(part.getSubmittedFileName().lastIndexOf("."));
            if (!filesuf.equals(".jsp") || !filesuf.equals(".jpg") || !filesuf.equals(".png")) {
                request.setAttribute("message","格式错误");
                return "queen/addproduct";
            }else {

                product.setMain_image(file.getOriginalFilename());
                File file1 = new File("D:\\GTJava\\text_java\\dianshang\\target\\dirsir\\static\\images\\" + file.getOriginalFilename());
                try {
                    FileUtils.copyInputStreamToFile(file.getInputStream(), file1);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }*/
        product.setMain_image(file.getOriginalFilename());
        File file1 = new File("D:\\GTJava\\text_java\\dianshang\\target\\dirsir\\static\\images\\" + file.getOriginalFilename());
        try {
            FileUtils.copyInputStreamToFile(file.getInputStream(), file1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(product);
        service.insert(product);

        return "redirect:product.do";
    }

    @RequestMapping("/product.do")
    public String doproduct(ModelMap map, String pname, String status, String pageNum) {
        if (pageNum == null) {
            pageNum = "1";
        }
        PageHelper.startPage(Integer.parseInt(pageNum), 10);
        List<Product> products = service.getprotuct(pname, status);
        PageInfo<Product> pageInfo = new PageInfo<>(products);
        map.addAttribute("pageInfo", pageInfo);
        map.addAttribute("products", products);
        map.addAttribute("pname", pname);
        map.addAttribute("status", status);
        return "queen/productlist";

    }

    /*修改*/
    @RequestMapping("/updateproduct.do")
    public String updateproduct(Integer id, ModelMap map) {
        List<Handle> handle = service.gethandles();
        Product product = service.getOneList(id);
        map.addAttribute("handle", handle);
        map.addAttribute("product", product);
        return "queen/updateproduct";
    }

    @RequestMapping("/doupdateproduct")
    public String doupdateproduct(Product product,MultipartFile file) {
        product.setMain_image(file.getOriginalFilename());
        File file1 = new File("D:\\GTJava\\text_java\\dianshang\\target\\dirsir\\static\\images\\" + file.getOriginalFilename());
        try {
            FileUtils.copyInputStreamToFile(file.getInputStream(), file1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int update=service.updateproduct(product);
        return "redirect:product.do";
    }

    @RequestMapping("delectproduct.do")
    public String delectproduct(Integer id) {
        service.deleteOne(id);
        return "redirect:product.do";
    }
}
