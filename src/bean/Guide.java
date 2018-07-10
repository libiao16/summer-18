package bean;

import java.util.Date;

public class Guide {

    private int id; //id

    private String title; //标题

    private String content; //内容

    private String place; //目的地

    private int theme;  //主题  0 游记 1 攻略

    private String authorId; //作者id

    private int thumbs;  //获赞数

    private int beCollected;  //收藏数

    private int beCommented;  //评论数

    private int isDelete; //是否删除  0 未删除 1 已删除

    private Date createTime; //发布时间

    private Date updateTime; //最后更新时间


}
