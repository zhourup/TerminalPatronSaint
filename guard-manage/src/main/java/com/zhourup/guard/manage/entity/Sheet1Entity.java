package com.zhourup.guard.manage.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author zhourup
 * @email zhourup@163.com
 * @date 2021-04-11 13:02:06
 */
@Data
@TableName("sheet1")
public class Sheet1Entity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private String laserRanging;
	/**
	 * 
	 */
	private String inclinationMeasure;
	/**
	 * 
	 */
	private String impactIntensity;
	/**
	 * 
	 */
	private String staticLevel;
	/**
	 * 
	 */
	private String dangerousGas;
	/**
	 * 
	 */
	private String temperature;
	/**
	 * 
	 */
	private String preload;
	/**
	 * 
	 */
	private String windSpeed;
	/**
	 * 
	 */
	private String waterSpeed;
	/**
	 * 
	 */
	private String rainfall;
	/**
	 * 
	 */
	private String windDirection;
	/**
	 * 
	 */
	private String waterDirection;
	/**
	 * 
	 */
	private String waterDeep;
	/**
	 * 
	 */
	private String time;

}
