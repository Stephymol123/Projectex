package Ctrlpkg;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Beanp.Beanc;
import Daop.Daoc;

@Controller

public class Ctrlcls {
	
	@Autowired
	Daoc dao;

	@RequestMapping("/reg.html")
	public String show()
	{
		return "Registration";
	}
	
	@RequestMapping("/register.html")
	public String insert(Beanc b)
	{
		dao.insert(b);
		return "Login";
		
	}
	
	@RequestMapping("/login.html")
	public String login()
	{
		return "Login";
	}
	
	@RequestMapping("/loginaction.html")
	public String loginaction(Beanc bean,HttpSession hs,Model m)
	{
//		List<Beanc>l=dao.loginaction(bean);
//	    
//		if(l.size()>0)
//		{
//			System.out.println(l.size());
//			for(Beanc b:l)
//			{
//				hs.setAttribute("userid", b.getId());
//				hs.setAttribute("useremail",b.getEmail());
//				hs.setAttribute("userfirstname",b.getFirstname());
//				hs.setAttribute("userlastname",b.getLastname());
//			}
//			return "Userhome";
//		}
//		else if(bean.getEmail().equals("admin@gmail.com")&&bean.getPassword().equals("admin111"))
//		{
//			return "Adminhome";
//		}
//		else
//		{
//			m.addAttribute("err","User name or password error");
//			return "Login";
//		}
//		
//		
//	}
		return "Userhome";
}
}
