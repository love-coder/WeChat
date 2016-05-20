package org.xidian.wechat.wpackage;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.xidian.wechat.basemodel.Token;
import org.xidian.wechat.utils.CommonUtil;
import org.xidian.wechat.utils.WXConfig;
import org.xidian.wechat.wxpackage.model.BachMoveUsersModel;
import org.xidian.wechat.wxpackage.model.Group;
import org.xidian.wechat.wxpackage.model.GroupDetail;

import com.alibaba.fastjson.JSONObject;

/**
 * 微信分组相关
 * @author HanChun
 * @since 2016-5-19
 */
public class WPackage {
	
	@Test
	public void testPackage() {
//		createPacket();
		queryAllPacket();
//		bachMoveUsers();
	}
	
	/**
	 * 创建分组
	 */
	public void createPacket() {
		
		Group g = new Group();
		GroupDetail gd = new GroupDetail ();
		gd.setName("添加分组");
		g.setGroup(gd);
		String paras = JSONObject.toJSONString(g);
		System.out.println("请求参数" + paras);//请求参数{"group":{"name":"添加分组"}}
		
		Token token = CommonUtil.getToken(WXConfig.APPID, WXConfig.APP_SECRECT);
    	System.out.println(token.getAccessToken());
		String urlString = WXConfig.CREATE_PACKET_URL.replace("ACCESS_TOKEN", token.getAccessToken());
		String result = CommonUtil.sendPost(urlString, paras);
		System.out.println(result);
		//{"group":{"id":104,"name":"添加分组"}} 成功！
	}
	
	/**
	 * 查询所有分组
	 */
	public void queryAllPacket() {
		
		Token token = CommonUtil.getToken(WXConfig.APPID, WXConfig.APP_SECRECT);
    	System.out.println(token.getAccessToken());
		String urlString = WXConfig.QUERYALL_PACKET_URL.replace("ACCESS_TOKEN", token.getAccessToken());
		//String result = CommonUtil.sendGet(urlString, "");
		String result = CommonUtil.httpsRequest(urlString, "GET", "");
		System.out.println(result);
		//{"groups":[{"id":0,"name":"未分组","count":68},{"id":1,"name":"黑名单","count":0},{"id":2,"name":"星标组","count":0},{"id":100,"name":"多优优草莓","count":20},{"id":101,"name":"和生国际","count":16},{"id":102,"name":"蔚蓝悦城","count":6},{"id":103,"name":"陕北杂粮","count":0},{"id":104,"name":"添加分组","count":0},{"id":105,"name":"添加分组","count":0},{"id":106,"name":"添加分组","count":0}]}
	}
	
	/**
	 * 批量移动分组
	 */
	public void bachMoveUsers() {
		
		BachMoveUsersModel bv = new BachMoveUsersModel();
		bv.setTo_groupid("104");
		List<String> list = new ArrayList<String>();
		list.add("***************");
		list.add("***************");
		bv.setOpenid_list(list);
		String paras = JSONObject.toJSONString(bv);
		System.out.println("请求参数" + paras);//请求参数
		
		Token token = CommonUtil.getToken(WXConfig.APPID, WXConfig.APP_SECRECT);
    	System.out.println(token.getAccessToken());
		String urlString = WXConfig.BACHMOVE_USER_PACKET_URL.replace("ACCESS_TOKEN", token.getAccessToken());
		String result = CommonUtil.sendPost(urlString, paras);
		System.out.println(result);
		//{"errcode":40003,"errmsg":"invalid openid hint: [8YO4Ba0720vr18]"} 成功掉用
		
	}
	
	
	
	
	
	

}
