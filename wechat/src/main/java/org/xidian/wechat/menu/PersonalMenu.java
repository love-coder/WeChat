package org.xidian.wechat.menu;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.xidian.wechat.menu.model.FatherButton;
import org.xidian.wechat.menu.model.MatchRule;
import org.xidian.wechat.menu.model.Menu;
import org.xidian.wechat.menu.model.SonButton;
import org.xidian.wechat.utils.CommonUtil;
import org.xidian.wechat.utils.WXConfig;
import org.xidian.wechat.basemodel.Token;

import com.alibaba.fastjson.JSONObject;

/**
 * 个性化菜单
 * @author HanChun
 * @since 2016-5-20
 * 规则说明：https://mp.weixin.qq.com/wiki/0/c48ccd12b69ae023159b4bfaa7c39c20.html
 */
public class PersonalMenu {

	/**
     * 创建自定义菜单。
     */
    @Test
    public void createCommMenu() {
    	Token token = CommonUtil.getToken(WXConfig.APPID, WXConfig.APP_SECRECT);
    	System.out.println(token.getAccessToken());
		String urlString = WXConfig.CREATE_PERSONAL_MENU.replace("ACCESS_TOKEN", token.getAccessToken());
		String result = CommonUtil.sendPost(urlString, getMenuJson());
		System.out.println(result);
    }

    /**
     * 生成请求参数
     * 注意：这块应该根据实际的使用场景生成对象，
     * @return
     */
    public String getMenuJson() {
        JSONObject jsonObject = new JSONObject();
        //下面的数据应该用户自己生成，一般从数据库读出来，生成menu对象
        Menu menu = new Menu();// 菜单类
        List<FatherButton> fatherButtons = new ArrayList<FatherButton>();
        
        // 父按钮1
        FatherButton fb1 = new FatherButton();
        fb1.setName("父按钮1");
        fb1.setType("click");
        fb1.setKey("10");
        
        // 父按钮2
        FatherButton fb2 = new FatherButton();
        fb2.setName("父按钮2");
        List<SonButton> sonButtons2 = new ArrayList<SonButton>();// 子按钮的集合
        // 子按钮2-1
        SonButton sb21 = new SonButton();
        sb21.setName("view");
        sb21.setUrl("http://www.baidu.com");
        sb21.setType("view");
        // 子按钮2-2
        SonButton sb22 = new SonButton();
        sb22.setName("scancode_push");
        sb22.setType("scancode_push");
        sb22.setKey("22");
        // 子按钮2-3
        SonButton sb23 = new SonButton();
        sb23.setName("scancode_waitmsg");
        sb23.setType("scancode_waitmsg");
        sb23.setKey("23");
        // 子按钮2-4
        SonButton sb24 = new SonButton();
        sb24.setName("pic_sysphoto");
        sb24.setType("pic_sysphoto");
        sb24.setKey("24");
        // 子按钮2-5
        SonButton sb25 = new SonButton();
        sb25.setName("pic_photo_or_album");
        sb25.setType("pic_photo_or_album");
        sb25.setKey("25");
        // 添加子按钮到子按钮集合
        sonButtons2.add(sb21);
        sonButtons2.add(sb22);
        sonButtons2.add(sb23);
        sonButtons2.add(sb24);
        sonButtons2.add(sb25);

        // 将子按钮放到2-0父按钮集合
        fb2.setSonButtons(sonButtons2);

        // 父按钮3
        FatherButton fb3 = new FatherButton();
        fb3.setName("父按钮3");
        List<SonButton> sonButtons3 = new ArrayList<SonButton>();
        // 子按钮3-1
        SonButton sb31 = new SonButton();
        sb31.setName("pic_weixin");
        sb31.setType("pic_weixin");
        sb31.setKey("31");
        // 子按钮3-2
        SonButton sb32 = new SonButton();
        sb32.setName("locatselect");
        sb32.setType("location_select");
        sb32.setKey("32");
        // // 子按钮3-3-->测试不了，因为要media_id。这需要调用素材id.
        // SonButton sb33 = new SonButton();
        // sb33.setName("media_id");
        // sb33.setType("media_id");
        // sb33.setMedia_id("???");
        // // 子按钮3-4-->测试不了，因为要media_id。这需要调用素材id.
        // SonButton sb34 = new SonButton();
        // sb34.setName("view_limited");
        // sb34.setType("view_limited");
        // sb34.setMedia_id("???");

        // 添加子按钮到子按钮队列
        sonButtons3.add(sb31);
        sonButtons3.add(sb32);
        // sonButtons3.add(sb33);
        // sonButtons3.add(sb34);

        // 将子按钮放到3-0父按钮队列
        fb3.setSonButtons(sonButtons3);
        // 将父按钮加入到父按钮集合
        fatherButtons.add(fb1);
        fatherButtons.add(fb2);
        fatherButtons.add(fb3);
        
        //设置匹配规则
        MatchRule matchrule = new MatchRule();
        matchrule.setGroup_id("123");

        // 将父按钮队列加入到菜单栏
        menu.setFatherButtons(fatherButtons);
        //规则加入
        menu.setMatchrule(matchrule);
        String strJson = jsonObject.toJSONString(menu);
        System.out.println("请求参数：\n"+strJson);// 测试输出
        return strJson;
    }
	
}
