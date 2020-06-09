package test;

import com.google.gson.JsonObject;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONObject;
import util.Md5;

import java.util.Collections;
import java.util.List;

/**
 * @author H2410780
 * @title: test1
 * @projectName Algorithm
 * @description: TODO
 * @date 2019/6/12下午 05:36
 */
public class test1 {

    public static void main(String[] args) {
        String account="F123456";
        String password1="080232409468840857103866020792102449900561785251900402614270";
        String response="{\"code\":0,\"msg\":\"请求成功\",\"data\":" +
                "{\"id\":2242,\"loginId\":\"H4543995\",\"namec\":\"李秋月\"," +
                "\"property01\":\"F7B67595A57265A304F0C092A60C9108\",\"delFlag\":0," +
                "\"password\":\"080232409468840857103866020792102449900561785251900402614270\"}}";
        int begin=response.indexOf("{",2);
        int end=response.indexOf("}");

//        System.out.println(response.substring(begin,end+1));

        String result=response.substring(begin,end+1);

        String PassWordWithEncode="";

        JSONObject userInfo=new JSONObject(result);
//        System.out.println(userInfo);
        String name=userInfo.getString("namec");
//        System.out.println(name);
        Md5.EncoderBymd516(account);
        System.out.println(account);
        //String property01 = com.foxconn.sfc.util.Md5.EncoderBymd532(passward.toUpperCase());
        String passwordEncodein=Md5.EncoderBymd532(account.toUpperCase());
//        System.out.println(passwordEncodein);
        System.out.println(Md5.EncoderBymd532(account.toUpperCase()));
//        System.out.println(userInfo.getString("property01"));

    }
}

//7878CB5D8114AE56DA36F5FCD11AA50E