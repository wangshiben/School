package com.controlor;

import com.pojo.stu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class Index {
    @RequestMapping("/")
    public String getIndex(HttpSession session){
        SimpleDateFormat formatter= new SimpleDateFormat("MMdd");
        Date date = new Date(System.currentTimeMillis());
        String format = formatter.format(date);
        session.setAttribute("dates",format);
        if (session.getAttribute("User")==null){
        session.setAttribute("User",new stu("张三","1223123432"));}
        return "index";
    }
    @RequestMapping("/submit")
    public String Sub(stu user,HttpSession session){
        session.setAttribute("User",user);
        return "redirect:/";
    }
}
