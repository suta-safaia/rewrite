package key.kuds.RewriteFriends.service;

import key.kuds.RewriteFriends.entity.FriendInfo;
import key.kuds.RewriteFriends.entity.FriendPerInfo;

import java.util.List;

/**
 * 朋友信息数据处理服务
 *
 * @author KUD
 **/
public interface DataHandler {

    /**
     * 读取所有朋友概览信息
     */
    List<FriendPerInfo> getPagePerInfo();

    /**
     * 通过ID获取朋友信息
     * @param id 唯一标识信息
     */
    FriendInfo getFriendInfoById(String id);

    /**
     * 通过ID保存朋友信息
     * @param friendInfo 朋友信息
     * @return
     */
    FriendInfo saveFriendInfoById(FriendInfo friendInfo);
}
