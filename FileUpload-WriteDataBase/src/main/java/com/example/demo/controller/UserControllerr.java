package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.model.User;
import com.example.demo.model.Userr;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceee;
import com.example.demo.utils.UserUtils;

@Controller
public class UserControllerr {

	@Autowired
	private UserService service;

	@Autowired
	private UserServiceee userServiceee;

	@GetMapping("/test")
	public ModelAndView test() {

		ModelAndView model = new ModelAndView("test/index");

		Userr user = new Userr();

		model.addObject("user", user);
		model.addObject("users", service.findAll());

		return model;
	}

	@GetMapping("/yum")
	public ModelAndView yum() {

		ModelAndView model = new ModelAndView("user/user-opts");

		model.addObject("users", userServiceee.findAll());

		User user = userServiceee.findByUsername(new UserUtils().getUserName());
		System.out.println("HIIIII: " + user);

		model.addObject("user", user.getEmpId());

		return model;
	}

	@PostMapping("/fileupload")
	public String fileUpload(@ModelAttribute("user") Userr user, @RequestParam("file") MultipartFile file) {

		try {

			byte[] image = file.getBytes();

			user.setFileName(StringUtils.cleanPath(file.getOriginalFilename()));
			user.setImage(image);
			user.setFileType2(file.getContentType());
			user.setFileId2("222");

			int saveImage = service.saveImage(user);

			Userr userr = service.findByNameAndSurname(user.getName(), user.getSurname());

			User user2 = new User();
			user2.setFullname(userr.getName() + " " + userr.getSurname());
			user2.setEmpId(userr.getId());

			userServiceee.save(user2);

			if (saveImage == 1) {
				return "test/success";

			} else {
				return "test/error";
			}

		} catch (Exception e) {
			return "test/error";
		}
	}

	@GetMapping("getDetail/{id}")
	public ModelAndView getDbDetils(@PathVariable String id) {

		ModelAndView model = new ModelAndView();

		try {

			Userr imagesObj = service.getImages(Long.parseLong(id));

			byte[] encode = java.util.Base64.getEncoder().encode(imagesObj.getImage());

			model.addObject("image", new String(encode, "UTF-8"));

			model.setViewName("test/image");

		} catch (Exception e) {

			model.setViewName("test/error");
		}

		return model;
	}

	/*
	 * @RequestMapping("/retrieve/{fileName}") public String
	 * download(@PathVariable("fileName") String fileName, HttpServletResponse
	 * response) {
	 * 
	 * DownloadFile downloadDocument = downloadFileDao.get(fileName); try {
	 * response.setHeader("Content-Disposition", "inline; filename=\"" + fileName +
	 * "\"");
	 * 
	 * OutputStream out = response.getOutputStream();
	 * response.setContentType(downloadDocument.getContentType());
	 * IOUtils.copy(downloadDocument.getContent().getBinaryStream(), out);
	 * 
	 * out.flush(); out.close();
	 * 
	 * } catch (SQLException e) { System.out.println(e.toString()); // Handle
	 * exception here } catch (IOException e) { System.out.println(e.toString()); //
	 * Handle exception here }
	 * 
	 * return "Success"; }
	 */

}
