package bean;

import java.util.Date;

public class Comment {

    private int id; //id

    private int guideId; //评论攻略id

    private int userId; //评论者id

    private String content; //评论内容

    private Date createTime; //评论时间

    private int isDelete; //是否删除  0 未删除  1 已删除

}
