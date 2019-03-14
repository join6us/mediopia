package myweb.test;

import java.io.Serializable;

public class TestVO implements Serializable {
    
    private static final long serialVersionUID = -2381608499542572647L;

    private String userId;
    private String userNameKo;
    private String userType;
    private String userStatus;
    private String userNo;

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @return the userNo
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * @param userNo the userNo to set
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    /**
     * @return the userStatus
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * @param userStatus the userStatus to set
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * @return the userType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * @return the userNameKo
     */
    public String getUserNameKo() {
        return userNameKo;
    }

    /**
     * @param userNameKo the userNameKo to set
     */
    public void setUserNameKo(String userNameKo) {
        this.userNameKo = userNameKo;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    
}