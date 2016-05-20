package org.xidian.wechat.menu.model;


/**
 * 菜单基类
 * @author HanChun
 * @since 2016-5-20
 */
public class BaseButton {
	
	private String type;
	private String name;
	private String key;
	private String url;
	private String media_id;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMedia_id() {
		return media_id;
	}
	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}
	
}