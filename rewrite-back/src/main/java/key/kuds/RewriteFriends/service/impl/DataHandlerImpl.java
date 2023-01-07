package key.kuds.RewriteFriends.service.impl;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import key.kuds.RewriteFriends.entity.FriendInfo;
import key.kuds.RewriteFriends.entity.FriendPerInfo;
import key.kuds.RewriteFriends.service.DataHandler;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;

/**
 * 朋友信息数据处理服务实现
 *
 * @author KUD
 **/
@Service
public class DataHandlerImpl implements DataHandler {

    final static String perFriendPath = "data/perFriend.txt";
    final String friendInfoPath = "data/friend/";
    //todo 暂时使用文件读取的方式

    @Override
    public List<FriendPerInfo> getPagePerInfo() {
        StringBuilder perFriendStr = new StringBuilder();
        String content;
        //文件读取
        try {
            File file = new File(perFriendPath);
            InputStreamReader streamReader = new InputStreamReader(new FileInputStream(file));
            BufferedReader bufferedReader = new BufferedReader(streamReader);
            while ((content = bufferedReader.readLine()) != null) {
                perFriendStr.append(content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        content = perFriendStr.toString();
        if (content.isEmpty()) {
            return null;
        } else {
            // 进行JSON转化
            JSONArray data = JSON.parseArray(content);
            return data.toJavaList(FriendPerInfo.class);
        }
    }

    @Override
    public FriendInfo getFriendInfoById(String id) {
        StringBuilder perFriendStr = new StringBuilder();
        String content;
        //文件读取
        try {
            File file = new File(friendInfoPath+id+".txt");
            InputStreamReader streamReader = new InputStreamReader(new FileInputStream(file));
            BufferedReader bufferedReader = new BufferedReader(streamReader);
            while ((content = bufferedReader.readLine()) != null) {
                perFriendStr.append(content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        content = perFriendStr.toString();
        if (content.isEmpty()) {
            return null;
        } else {
            // 进行JSON转化
            return JSON.parseObject(content, FriendInfo.class);
        }
    }

    @Override
    public FriendInfo saveFriendInfoById(FriendInfo friendInfo) {
        if(friendInfo == null) {
            return null;
        } else {
            // 进行JSON转化
            String res = JSON.toJSONString(friendInfo);
            //文件写入
            try {
                File file = new File(friendInfoPath+friendInfo.getId()+".txt");
                OutputStreamWriter streamWriter = new OutputStreamWriter(new FileOutputStream(file));
                BufferedWriter bufferedWriter = new BufferedWriter(streamWriter);
                bufferedWriter.write(res);
                bufferedWriter.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
