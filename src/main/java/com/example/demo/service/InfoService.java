package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.RealCostRequest;

/**
 * お金の計算 Service
 */
@Service
public class InfoService {

	/**
	 * 費用計算
	 * @param realCostRequest リクエストデータ
	 * @return 検索結果
	 */
	public int calc(RealCostRequest realCostRequest) {
		String costString = realCostRequest.getCost().replace(",", "");
		int cost = Integer.parseInt(costString);
		int result = cost * realCostRequest.getPeriod() * 12;
		return result;
	}
}