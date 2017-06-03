package com.firstApp.login;

import java.io.Serializable;
import java.util.List;

/**
 * Created by CaiRR on 2017-5-17.
 */

public class QueryCityRespondEntity implements Serializable {


    /**
     * msg : 成功
     * code : 0
     * data : [{"code":"4301","creatorID":0,"memo":"","updateTime":"","provinceID":23052,"countryID":1,"parentID":23051,"treeLen":0,"sortNo":0,"treeID":"430101","areaCode":"","createTime":"","IDCode":"","postCode":"","provinceName":"市辖区","keyword":"","shortName":"湖南省长沙市市辖区","firstLetter":"S"},{"code":"4301","creatorID":0,"memo":"","updateTime":"","provinceID":23053,"countryID":1,"parentID":23051,"treeLen":0,"sortNo":0,"treeID":"430102","areaCode":"","createTime":"","IDCode":"","postCode":"","provinceName":"芙蓉区","keyword":"","shortName":"湖南省长沙市芙蓉区","firstLetter":""},{"code":"4301","creatorID":0,"memo":"","updateTime":"","provinceID":23067,"countryID":1,"parentID":23051,"treeLen":0,"sortNo":0,"treeID":"430103","areaCode":"","createTime":"","IDCode":"","postCode":"","provinceName":"天心区","keyword":"","shortName":"湖南省长沙市天心区","firstLetter":""},{"code":"4301","creatorID":0,"memo":"","updateTime":"","provinceID":23082,"countryID":1,"parentID":23051,"treeLen":0,"sortNo":0,"treeID":"430104","areaCode":"","createTime":"","IDCode":"","postCode":"","provinceName":"岳麓区","keyword":"","shortName":"湖南省长沙市岳麓区","firstLetter":""},{"code":"4301","creatorID":0,"memo":"","updateTime":"","provinceID":23102,"countryID":1,"parentID":23051,"treeLen":0,"sortNo":0,"treeID":"430105","areaCode":"","createTime":"","IDCode":"","postCode":"","provinceName":"开福区","keyword":"","shortName":"湖南省长沙市开福区","firstLetter":""},{"code":"4301","creatorID":0,"memo":"","updateTime":"","provinceID":23120,"countryID":1,"parentID":23051,"treeLen":0,"sortNo":0,"treeID":"430111","areaCode":"","createTime":"","IDCode":"","postCode":"","provinceName":"雨花区","keyword":"","shortName":"湖南省长沙市雨花区","firstLetter":""},{"code":"4301","creatorID":0,"memo":"","updateTime":"","provinceID":23134,"countryID":1,"parentID":23051,"treeLen":0,"sortNo":0,"treeID":"430112","areaCode":"","createTime":"","IDCode":"","postCode":"","provinceName":"望城区","keyword":"","shortName":"湖南省长沙市望城区","firstLetter":""},{"code":"4301","creatorID":0,"memo":"","updateTime":"","provinceID":23156,"countryID":1,"parentID":23051,"treeLen":0,"sortNo":0,"treeID":"430121","areaCode":"","createTime":"","IDCode":"","postCode":"","provinceName":"长沙县","keyword":"","shortName":"湖南省长沙市长沙县","firstLetter":""},{"code":"4301","creatorID":0,"memo":"","updateTime":"","provinceID":23178,"countryID":1,"parentID":23051,"treeLen":0,"sortNo":0,"treeID":"430124","areaCode":"","createTime":"","IDCode":"","postCode":"","provinceName":"宁乡县","keyword":"","shortName":"湖南省长沙市宁乡县","firstLetter":""},{"code":"4301","creatorID":0,"memo":"","updateTime":"","provinceID":23212,"countryID":1,"parentID":23051,"treeLen":0,"sortNo":0,"treeID":"430181","areaCode":"","createTime":"","IDCode":"","postCode":"","provinceName":"浏阳市","keyword":"","shortName":"湖南省长沙市浏阳市","firstLetter":""}]
     * status : 0
     */

    public String msg;
    public int code;
    public String status;
    public List<DataBean> data;

    public static class DataBean  implements Serializable{
        /**
         * code : 4301
         * creatorID : 0
         * memo :
         * updateTime :
         * provinceID : 23052
         * countryID : 1
         * parentID : 23051
         * treeLen : 0
         * sortNo : 0
         * treeID : 430101
         * areaCode :
         * createTime :
         * IDCode :
         * postCode :
         * provinceName : 市辖区
         * keyword :
         * shortName : 湖南省长沙市市辖区
         * firstLetter : S
         */

        public String code;
        public int creatorID;
        public String memo;
        public String updateTime;
        public int provinceID;
        public int countryID;
        public int parentID;
        public int treeLen;
        public int sortNo;
        public String treeID;
        public String areaCode;
        public String createTime;
        public String IDCode;
        public String postCode;
        public String provinceName;
        public String keyword;
        public String shortName;
        public String firstLetter;
    }
}
