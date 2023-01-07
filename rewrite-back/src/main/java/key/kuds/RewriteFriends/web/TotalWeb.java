package key.kuds.RewriteFriends.web;

import key.kuds.RewriteFriends.dto.query.PagePerInfoQuery;
import key.kuds.RewriteFriends.entity.FriendInfo;
import key.kuds.RewriteFriends.entity.PageInfo;
import key.kuds.RewriteFriends.service.DataHandler;
import key.kuds.RewriteFriends.service.PageHandler;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author KUD
 **/
@RestController()
@CrossOrigin
public class TotalWeb {

    @Resource
    private PageHandler pageHandler;
    @Resource
    private DataHandler dataHandler;

    @GetMapping("/getPageInfo")
    public PageInfo getPageInfo() {
        return pageHandler.getPageInfo(new PagePerInfoQuery());
    }

    @GetMapping("/getFriendById")
    public FriendInfo getFriendById(String id) {
        return dataHandler.getFriendInfoById(id);
    }

    @PostMapping("/saveFriendById")
    public FriendInfo saveFriendById(@RequestBody FriendInfo friendInfo) {
        return dataHandler.saveFriendInfoById(friendInfo);
    }
}
