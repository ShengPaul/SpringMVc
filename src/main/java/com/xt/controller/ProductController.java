package com.xt.controller;

import com.xt.service.IProductService;
import com.xt.vo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.ModelAndViewResolver;

import java.util.List;

@Controller
@RequestMapping(value = "prot")
public class ProductController {

    @Autowired
    private IProductService productService;

    //查询所有
    @RequestMapping(value = "/query")
    public String query(Model model){
        List<Product> pros =  productService.queryPros();
        model.addAttribute("pros",pros);
        return "showProduct";

    }

    @RequestMapping(value = "/del/{pid}")
    public String delProduct(@PathVariable("pid") Integer proId){
        productService.delProductById(proId);
        return "redirect:/prot/query";
    }

    @RequestMapping(value = "/update/{pid}")
    public String  updateProduct(@PathVariable("pid") Integer proId,Model model){
        //先查询出该产品的全部信息

        Product product  = productService.updateProMsg(proId);
        model.addAttribute("product",product);
        return "showUpdateMsg";
    }


    @RequestMapping(value = "/saveUpdateProduct")
    public String  saveUpdateProduct(@ModelAttribute Product product){

        System.out.println(product);

        productService.saveUpdateProMsg(product);
        return "redirect:/prot/query";
    }

    @RequestMapping(value = "/add")
    public String  addProduct(){
        return "addProduct";
    }

    @RequestMapping(value = "/saveAddProduct")
    public String  saveProduct(@ModelAttribute Product product){
        System.out.println(product);
        int cnt = productService.saveProduct(product);
        return "redirect:/prot/query";
    }
}
