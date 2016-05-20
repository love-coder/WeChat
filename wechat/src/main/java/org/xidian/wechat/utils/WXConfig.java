package org.xidian.wechat.utils;

/*
 * 
 */
public class WXConfig {
	
	public final static String APPID = "wx0f2f91ca441ad5be";
	public final static String APP_SECRECT = "ab941bb93a9cacc7974183c2fa079110 ";
	
	public final static String TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
	public final static String USER_URL = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID";
	
	//下面为分组相关
	/** 创建分组 POST*/
	public final static String CREATE_PACKET_URL = "https://api.weixin.qq.com/cgi-bin/groups/create?access_token=ACCESS_TOKEN";
	/** 查询所有分组 GET */
	public final static String QUERYALL_PACKET_URL = "https://api.weixin.qq.com/cgi-bin/groups/get?access_token=ACCESS_TOKEN";
	/** 查询用户所在分组 POST*/
	public final static String QUERY_USER_PACKET_URL = "https://api.weixin.qq.com/cgi-bin/groups/getid?access_token=ACCESS_TOKEN";
	/** 移动分组名 POST*/
	public final static String UPDATE_PACKET_URL = "https://api.weixin.qq.com/cgi-bin/groups/update?access_token=ACCESS_TOKEN";
	/** 移动用户分组POST*/
	public final static String MOVE_USER_PACKET_URL = "https://api.weixin.qq.com/cgi-bin/groups/members/update?access_token=ACCESS_TOKEN";
	/** 批量移动用户分组 POST*/
	public final static String BACHMOVE_USER_PACKET_URL = "https://api.weixin.qq.com/cgi-bin/groups/members/batchupdate?access_token=ACCESS_TOKEN";
	/** 删除分组 POST*/
	public final static String DEL_PACKET_URL = "https://api.weixin.qq.com/cgi-bin/groups/delete?access_token=ACCESS_TOKEN";
	
	//下面为个性化菜单
	/** 创建个性化菜单POST*/
	public final static String CREATE_PERSONAL_MENU = "https://api.weixin.qq.com/cgi-bin/menu/addconditional?access_token=ACCESS_TOKEN";
	/** 删除个性化菜单 POST*/
	public final static String DEL_PERSONAL_MENU = "https://api.weixin.qq.com/cgi-bin/menu/delconditional?access_token=ACCESS_TOKEN";
	/** 测试个性化菜单匹配结果 POST*/
	public final static String TEST_PERSONAL_MENU = "https://api.weixin.qq.com/cgi-bin/menu/trymatch?access_token=ACCESS_TOKEN";
	
}
