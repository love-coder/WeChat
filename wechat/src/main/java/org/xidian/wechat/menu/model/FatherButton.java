package org.xidian.wechat.menu.model;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 父菜单
 * @author HanChun
 * @since 2016-5-20
 */
public class FatherButton extends BaseButton {
	
	private String button;
	@JSONField(name="sub_button")
	private List<SonButton> sonButtons;
	
	public String getButton() {
		return button;
	}
	public void setButton(String button) {
		this.button = button;
	}
	public List<SonButton> getSonButtons() {
		return sonButtons;
	}
	public void setSonButtons(List<SonButton> sonButtons) {
		this.sonButtons = sonButtons;
	}
	
	
	
	
}
