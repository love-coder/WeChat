package org.xidian.wechat.menu.model;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 菜单model
 * @author HanChun
 * @since 2016-5-20
 */
public class Menu {
	@JSONField(name="button")
	private List<FatherButton> fatherButtons;
	private MatchRule matchrule;
	
	public List<FatherButton> getFatherButtons() {
		return fatherButtons;
	}
	public void setFatherButtons(List<FatherButton> fatherButtons) {
		this.fatherButtons = fatherButtons;
	}
	public MatchRule getMatchrule() {
		return matchrule;
	}
	public void setMatchrule(MatchRule matchrule) {
		this.matchrule = matchrule;
	}
	
}