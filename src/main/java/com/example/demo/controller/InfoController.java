package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.RealCostRequest;
import com.example.demo.service.InfoService;

/**
 * お金の計算 Controller
 */
@Controller
public class InfoController {

	/**
	 * お金の計算 Service
	 */
	@Autowired
	private InfoService infoService;

	/**
	 * 一覧画面を表示
	 * @param model Model
	 * @return 一覧画面
	 */
	@GetMapping(value = "/index")
	public String display(Model model) {
		return "index";
	}

	/**
	 * 本当の費用画面を初期表示
	 * @param userSearchRequest リクエストデータ
	 * @param model Model
	 * @return 本当の費用画面
	 */
	@GetMapping(value = "/realCost")
	public String showResult(Model model) {
		RealCostRequest realCostRequest = new RealCostRequest();
		model.addAttribute("realCostRequest", realCostRequest);
		return "realCost";
	}

	/**
	 * 本当の費用画面を表示
	 * @param userSearchRequest リクエストデータ
	 * @param model Model
	 * @return 本当の費用画面
	 */
	@PostMapping(value = "/realCost")
	public String showResult(@ModelAttribute RealCostRequest realCostRequest, Model model) {
		int result = infoService.calc(realCostRequest);
		model.addAttribute("result", result);
		return "realCost";
	}

}