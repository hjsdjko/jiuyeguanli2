package com.entity.view;

import com.entity.XueshengjiuyeEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 学生就业信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xueshengjiuye")
public class XueshengjiuyeView extends XueshengjiuyeEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 yonghu
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 学生手机号
			*/
			private String yonghuPhone;
			/**
			* 学生身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 学生头像
			*/
			private String yonghuPhoto;
			/**
			* 是否就业
			*/
			private Integer jiuyeTypes;
				/**
				* 是否就业的值
				*/
				private String jiuyeValue;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public XueshengjiuyeView() {

	}

	public XueshengjiuyeView(XueshengjiuyeEntity xueshengjiuyeEntity) {
		try {
			BeanUtils.copyProperties(this, xueshengjiuyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set yonghu

					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 学生手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 学生手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 学生身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 学生头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 学生头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 是否就业
					*/
					public Integer getJiuyeTypes() {
						return jiuyeTypes;
					}
					/**
					* 设置： 是否就业
					*/
					public void setJiuyeTypes(Integer jiuyeTypes) {
						this.jiuyeTypes = jiuyeTypes;
					}


						/**
						* 获取： 是否就业的值
						*/
						public String getJiuyeValue() {
							return jiuyeValue;
						}
						/**
						* 设置： 是否就业的值
						*/
						public void setJiuyeValue(String jiuyeValue) {
							this.jiuyeValue = jiuyeValue;
						}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}




}
