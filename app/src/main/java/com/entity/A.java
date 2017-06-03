package com.entity;

import java.util.List;

/**
 * Created by shawn on 2017/5/31.
 */

public class A {

    /**
     * msg : 成功
     * code : 0
     * data : {"HotCity":[{"areaCode":"0755","shortName":"深圳市","provinceID":25875,"firstLetter":"G"}]}
     * status : 0
     */

    private String msg;
    private int code;
    private DataBean data;
    private String status;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class DataBean {
        private List<HotCityBean> HotCity;

        public List<HotCityBean> getHotCity() {
            return HotCity;
        }

        public void setHotCity(List<HotCityBean> HotCity) {
            this.HotCity = HotCity;
        }

        public static class HotCityBean {
            /**
             * areaCode : 0755
             * shortName : 深圳市
             * provinceID : 25875
             * firstLetter : G
             */

            private String areaCode;
            private String shortName;
            private int provinceID;
            private String firstLetter;

            public String getAreaCode() {
                return areaCode;
            }

            public void setAreaCode(String areaCode) {
                this.areaCode = areaCode;
            }

            public String getShortName() {
                return shortName;
            }

            public void setShortName(String shortName) {
                this.shortName = shortName;
            }

            public int getProvinceID() {
                return provinceID;
            }

            public void setProvinceID(int provinceID) {
                this.provinceID = provinceID;
            }

            public String getFirstLetter() {
                return firstLetter;
            }

            public void setFirstLetter(String firstLetter) {
                this.firstLetter = firstLetter;
            }
        }
    }


}
