package com.example.demo.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.utilities.HashUtil;

@Controller
public class LoginController {
	@Autowired
	private UserRepository userRepo;
	
//	@Autowired
//	private HttpServletRequest request;

	@GetMapping("/login")
	public String getLoginForm() {
		return "/auth/login";
	}
	
	@PostMapping("/login")
	public String login(
		@RequestParam("email") String email,
		@RequestParam("password") String password,
		HttpServletRequest request
	) {
		User entity = this.userRepo.findByEmail(email);
		HttpSession session = request.getSession();
		if (entity == null) {
			session.setAttribute("error", "Error email or password");
			return "redirect:/login";
		}

		boolean checkPwd = HashUtil.verify(password, entity.getPassword());
		if (!checkPwd) {
			session.setAttribute("error", "Error email or password");
			return "redirect:/login";
		}
		
		session.setAttribute("user", entity);
		return "redirect:/admin/users";
	}
}