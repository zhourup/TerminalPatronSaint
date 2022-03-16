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
 * @date 2021-04-11 13:02:05
 */
@Data
@TableName("temperature")
public class TemperatureEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private String time;
	/**
	 * 
	 */
	private String value;

}
