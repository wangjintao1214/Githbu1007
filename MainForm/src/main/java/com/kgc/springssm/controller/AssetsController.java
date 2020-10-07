package com.kgc.springssm.controller;

import com.kgc.springssm.pojo.Assets;
import com.kgc.springssm.service.AssetsService;
import com.sun.xml.internal.ws.resources.HttpserverMessages;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.AsyncTaskMethodReturnValueHandler;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.print.DocFlavor;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-07 12:56
 */
@Controller
public class AssetsController {
    @Resource
    AssetsService assetsService;
    @RequestMapping("/")
    public String toindex(){
        return "index";
    }
    @RequestMapping("/tomain")
    public String tomain(){
        return "main";
    }
    @RequestMapping("/domain")
    public String domain(String assetid,String assettype, Model model){
        List<Assets> assets = assetsService.selectAllByAssettype(assetid,assettype);
        System.out.println(assets.toString());
        model.addAttribute("assets",assets);
        return "main";
    }
    @RequestMapping("/toadd")
    public  String toadd(){
        return "add";
    }
    @RequestMapping("/doadd")
    public String doadd(Assets assets, HttpSession session){
        int i = assetsService.add(assets);
        if(i>0){
            session.setAttribute("msg","添加成功！！！");
            return "redirect:/tomain";
        }else {
            session.setAttribute("msg","添加失败！！！");
            return "redirect:/toadd";
        }
    }
}
