package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * 本当の費用 リクエストデータ
 */
@Data
public class RealCostRequest implements Serializable {

	/**
	 * 月額費用
	 */
	private String cost;

	/**
	 * 支払年数
	 */
	private int period;
}