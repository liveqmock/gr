package com.cyou.gr.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cyou.gr.entity.Project;
import com.cyou.gr.service.ProjectService;
import com.cyou.gr.web.comm._BaseController;

@RequestMapping("/project")
@Controller
public class ProjectController extends _BaseController {

	@Autowired
	private ProjectService projectService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home(HttpServletRequest request,
			HttpServletResponse response, Model model) throws Exception {
		List<Project> proList = projectService.selectProjectList();
		model.addAttribute("proList", proList);
		return "admin_project";
	}
	
//	@RequestMapping(value = "/add", method = RequestMethod.POST)
//	public String quotadd(HttpServletRequest request,
//			HttpServletResponse response, Model model,Quota qu) throws Exception {
//		quotaService.saveOrUpdateQuota(qu);
//		return "redirect:/quota/index";
//	}
//	
//	@RequestMapping(value = "/delete")
//	public String delete(HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		Integer id=this.findIntegerParameterValue(request, "id");
//		Quota q=new Quota();
//		q.setId(id);
//		q.setFlag(false);
//		quotaService.saveOrUpdateQuota(q);
//		return "redirect:/quota/index";
//	}
//	
//	@RequestMapping(value = "/regain")
//	public String regain(HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		Integer id=this.findIntegerParameterValue(request, "id");
//		Quota q=new Quota();
//		q.setId(id);
//		q.setFlag(true);
//		quotaService.saveOrUpdateQuota(q);
//		return "redirect:/quota/index";
//	}
//	
//	@RequestMapping(value = "/sort", method = RequestMethod.POST)
//	@ResponseBody
//	public ModelMap sort(HttpServletRequest request,
//			HttpServletResponse response) throws  Exception {
//		ModelMap mm=new ModelMap();
//		Integer upSort=this.findIntegerParameterValue(request, "upSort");
//		Integer upId=this.findIntegerParameterValue(request, "upId");
//		Integer downSort=this.findIntegerParameterValue(request, "downSort");
//		Integer downId=this.findIntegerParameterValue(request, "downId");
//		quotaService.updownSort(upSort,upId,downSort,downId);
//        mm.addAttribute("success", true);
//		return mm;
//	}
}
