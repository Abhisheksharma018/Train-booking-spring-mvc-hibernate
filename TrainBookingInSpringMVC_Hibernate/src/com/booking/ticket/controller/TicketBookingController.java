package com.booking.ticket.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.booking.ticket.model.AddressModel;
import com.booking.ticket.model.User;
import com.booking.ticket.model.UserModel;
import com.booking.ticket.service.UserService;
import com.booking.ticket.service.impl.UserServiceImpl;


@Controller
public class TicketBookingController {
	@Autowired(required=true)
	@Qualifier(value="userService")
	private	UserService userService;
	
	/*static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dispatcher-servlet.xml");
	static UserService userService = applicationContext.getBean("userService",UserService.class);*/
	/*To display first page of application.*/
	@RequestMapping("/view")
	public ModelAndView welcomePage()
	{
		ModelAndView model = new ModelAndView("view");
		return model;
	}
	/*To display register page of application,*/
	@RequestMapping("/register")
	public ModelAndView signUpPage()
	{
		ModelAndView model = new ModelAndView("register");
		return model;
	}
	/*To display login page of application.*/
	@RequestMapping("/login")
	public ModelAndView loginPage()
	{
		ModelAndView model = new ModelAndView("login");
		return model;
	}
	/*For requesting user details from UI.*/
	@RequestMapping(value="/submitRegistration.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute(value="user") User user,BindingResult result)
	{
		System.out.println("Submit Admission Form!!");
		if(result.hasErrors())
		{
			ModelAndView model1 = new ModelAndView("/register");
			return model1;
			
		}
		else
		{
		ModelAndView model = new ModelAndView("registrationSuccess");
		System.out.println("UserId"+user.getUserId());
		System.out.println("Password"+user.getPassword());
		System.out.println("FName"+user.getfName());
		System.out.println("MName"+user.getmName());
		System.out.println("LName"+user.getlName());
		System.out.println("Gender"+user.getGender());
		System.out.println("MaritalStatus"+user.getMaritalStatus());
		System.out.println("DOB"+user.getDOB());
		System.out.println("Occupation"+user.getOccupation());
		System.out.println("AadharCard"+user.getAadharCard());
		System.out.println("PanCard"+user.getPanCard());
		System.out.println("Email"+user.getEmail());
		System.out.println("Mobile"+user.getMobile());
		System.out.println("Nationality"+user.getNationality());
		System.out.println("FlatNo."+user.getFlatNo());
		System.out.println("Street"+user.getStreet());
		System.out.println("Area"+user.getArea());
		System.out.println("Country"+user.getCountry());
		System.out.println("Pincode"+user.getPincode());
		System.out.println("State"+user.getState());
		System.out.println("City"+user.getCity());
		System.out.println("PostOffice"+user.getPostOffice());
		System.out.println("Phone"+user.getPhone());
		
		if(user!=null)
		{
			userService.save(user);
		}
		return model;
		}
	}
	public UserService getUserService() {
		return userService;
	}
	
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
