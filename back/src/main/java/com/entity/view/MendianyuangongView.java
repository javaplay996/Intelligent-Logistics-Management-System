package com.entity.view;

import com.entity.MendianyuangongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 门店员工
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-27 11:11:19
 */
@TableName("mendianyuangong")
public class MendianyuangongView  extends MendianyuangongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MendianyuangongView(){
	}
 
 	public MendianyuangongView(MendianyuangongEntity mendianyuangongEntity){
 	try {
			BeanUtils.copyProperties(this, mendianyuangongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
