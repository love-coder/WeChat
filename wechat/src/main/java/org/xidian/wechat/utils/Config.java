package org.xidian.wechat.utils;

/*
 * 
 */
public class Config {
	
	
	
	/** �������� POST*/
	public static String CREATE_PACKET_URL = "https://api.weixin.qq.com/cgi-bin/groups/create?access_token=ACCESS_TOKEN";
	/** ��ѯ���з��� GET */
	public static String QUERYALL_PACKET_URL = "https://api.weixin.qq.com/cgi-bin/groups/get?access_token=ACCESS_TOKEN";
	/** ��ѯ�û����ڷ��� POST*/
	public static String QUERY_USER_PACKET_URL = "https://api.weixin.qq.com/cgi-bin/groups/getid?access_token=ACCESS_TOKEN";
	/** �޸ķ����� POST*/
	public static String UPDATE_PACKET_URL = "https://api.weixin.qq.com/cgi-bin/groups/update?access_token=ACCESS_TOKEN";
	/** �ƶ��û�����POST*/
	public static String MOVE_USER_PACKET_URL = "https://api.weixin.qq.com/cgi-bin/groups/members/update?access_token=ACCESS_TOKEN";
	
}
