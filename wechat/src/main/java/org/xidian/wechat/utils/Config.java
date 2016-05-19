package org.xidian.wechat.utils;

/*
 * 
 */
public class Config {
	
	
	
	/** 创建分组 POST*/
	public static String CREATE_PACKET_URL = "https://api.weixin.qq.com/cgi-bin/groups/create?access_token=ACCESS_TOKEN";
	/** 查询所有分组 GET */
	public static String QUERYALL_PACKET_URL = "https://api.weixin.qq.com/cgi-bin/groups/get?access_token=ACCESS_TOKEN";
	/** 查询用户所在分组 POST*/
	public static String QUERY_USER_PACKET_URL = "https://api.weixin.qq.com/cgi-bin/groups/getid?access_token=ACCESS_TOKEN";
	/** 修改分组名 POST*/
	public static String UPDATE_PACKET_URL = "https://api.weixin.qq.com/cgi-bin/groups/update?access_token=ACCESS_TOKEN";
	/** 移动用户分组POST*/
	public static String MOVE_USER_PACKET_URL = "https://api.weixin.qq.com/cgi-bin/groups/members/update?access_token=ACCESS_TOKEN";
	
}
