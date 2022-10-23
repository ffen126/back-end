package com.example.myspringboot.modulers.discuss.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *
 *
 * @author ""
 * @email ""
 * @date 2022-10-03 20:46:44
 */
@Data
@TableName("tb_discuss")
public class DiscussEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId
	private Integer id;
	/**
	 *
	 */
	private Long problemid;
	/**
	 *
	 */
	private String discussdetaile;
	/**
	 * time
	 */
	private Date time;
	/**
	 * commentator
	 */
	private String discussdeuser;

}
