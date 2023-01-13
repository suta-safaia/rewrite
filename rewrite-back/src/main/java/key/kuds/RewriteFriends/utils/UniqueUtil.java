package key.kuds.RewriteFriends.utils;

import java.util.Date;

/**
 * TODO
 *
 * @author KUD
 **/
public class UniqueUtil {

    /**
     * 返回时间戳作为ID 无并发不加锁 （总不能有人没事调系统时间吧 开摆）
     * @return 唯一ID
     */
    public static String getUniqueByDate() {
        return String.valueOf(System.currentTimeMillis());
    }
}
