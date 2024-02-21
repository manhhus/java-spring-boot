//package com.example.demo.Controller;
//
//import jakarta.servlet.ServletContext;
//
//import jakarta.servlet.http.HttpServletRequest;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.example.demo.entity.User;
//import com.example.demo.utilities.UploadFileUtils;
//
//import org.springframework.ui.Model;
//
//@Controller
//public class HelloController {
//	@Autowired
//	private HttpServletRequest request;
//	@Autowired
//	private ServletContext app;
//	
//	@Autowired
//	private UploadFileUtils uploadUtil;
//	@RequestMapping("/hello")
////	public String hello(Model model){
//////		User user = new User();
//////		user.setName("Nguyen Van A");
////		
//////		model.addAttribute("myUser", user);
////		return "hello";
////	}
//	public String hello() {
//		return "hello";
//	}
//	
//
//	@PostMapping("/upload-hello")
//	public String uploadFileHello(
//		@RequestParam("upload_file") List<MultipartFile> uploadedFiles
//	) {
//		for (MultipartFile uploadedFile : uploadedFiles) {
//			this.uploadUtil.handleUploadFile(uploadedFile);
//			System.out.println(this.app.getRealPath(""));
//		}
//		return "redirect:/hello";
//	}
//}