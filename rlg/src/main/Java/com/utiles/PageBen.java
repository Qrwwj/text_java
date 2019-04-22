package com.utiles;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//分页类
public class PageBen {
    //
    private int pageNum;
    //    每一页中的数据
    private int pageSize;
    //    总页数
    private int totaPages;
    //    总条数
    private int totaCount;
    //    地址带过来的参数
    private String url;

    public PageBen(int pageNum, int pageSize, int totaCount) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totaCount = totaCount;
        this.totaPages = totaCount % pageSize == 0 ? totaCount / pageSize : totaCount / pageSize + 1;
    }

    //    通过get方法获取值
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.setUrl(url);
//        拼接
        StringBuilder sbd = new StringBuilder();
//        将前台页面信息通过拼接在后台实现
        sbd.append("<ul>");

//        这里需要做一个判断  如果是第一页   上一页和首页就不用再点了
        if (pageNum == 1) {
            sbd.append("<li><a herf='javascript:void(0)'>上一页</a></li>");
            sbd.append("<li><a herf='javascript:void(0)'>首页</a></li>");
        } else {
            sbd.append("<li><a herf='" + url + "?pageNum=" + (pageNum - 1) + "'>上一页</a></li>");
            sbd.append("<li><a herf='" + url + "?pageNum=1'>首页</a></li>");
        }



        int min=1,max=totaPages;





        if (pageNum == totaCount) {
            sbd.append("<li><a herf='javascript:void(0)'>尾页</a></li>");
            sbd.append("<li><a herf='javascript:void(0)'>下一页</a></li>");
        } else {
            sbd.append("<li><a herf='" + url + "?pageNum=" + (totaPages) + "'>尾页</a></li>");
            sbd.append("<li><a herf='" + url + "?pageNum=" + (totaPages + 1) + "'>下一页</a></li>");
        }

        sbd.append("</ul>");
    }
}
