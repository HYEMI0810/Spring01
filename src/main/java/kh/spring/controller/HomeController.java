package kh.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.spring.dao.MessageDAO;
import kh.spring.dto.MessageDTO;

@Controller
public class HomeController {
	
	@Autowired
	MessageDAO dao;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("inputForm")
	public String inputForm() {
		return "inputForm";
	}
	
	@RequestMapping("inputProc")
	public String inputProc(MessageDTO dto) throws Exception{
		
		int result = dao.insert(dto);
		return "redirect:/";
		
	}
	
	@RequestMapping("outputForm")
	public String outputForm(Model model) throws Exception{
		
		List<MessageDTO>list = dao.selectAll();
		model.addAttribute("list", list);
		return "outputForm";
	}
	
	@RequestMapping("DeleteForm")
	public String DeleteForm(Model model) throws Exception {
		
		List<MessageDTO> list = dao.selectAll();
		model.addAttribute("list", list);
		return "DeleteForm";
	}
	
	@RequestMapping("deleteProc")
	public String deletProc(int id) throws Exception{
		
		int result = dao.delete(id);
		return "redirect:DeleteForm";
	}
	
	@RequestMapping("ModifyForm")
	public String ModifyForm(Model model) throws Exception{
		
		List<MessageDTO>list = dao.selectAll();
		model.addAttribute("list", list);
		return "ModifyForm";
	}
	
	@RequestMapping("modifyProc")
	public String modifyProc(MessageDTO dto) throws Exception{
		
		int result = dao.modify(dto);
		return "redirect:ModifyForm";
	}
	
	@ExceptionHandler
	public String exceptionHandler(Exception e) {
		e.printStackTrace();
		return "error";
	}
		
	
}
