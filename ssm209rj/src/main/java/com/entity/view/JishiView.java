package com.entity.view;

import com.entity.JishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 技师
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-09 12:13:15
 */
@TableName("jishi")
public class JishiView  extends JishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JishiView(){
	}
 
 	public JishiView(JishiEntity jishiEntity){
 	try {
			BeanUtils.copyProperties(this, jishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
