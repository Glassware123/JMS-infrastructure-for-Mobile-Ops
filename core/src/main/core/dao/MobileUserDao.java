package core.dao;
import core.MobileUser;

public interface MobileUserDao extends BaseDao<MobileUser> {
    int elapsedTime();
    void ifCallSomeBody(Integer currentCredit,Integer currentMinutes);
}
