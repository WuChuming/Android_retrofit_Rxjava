package com.firstApp.login;
//import com.toprank.byd_c.model.entity.BalanceDetailsEntity;
//import com.toprank.byd_c.model.entity.BalanceEntity;
//import com.toprank.byd_c.model.entity.BandCardListEntity;
//import com.toprank.byd_c.model.entity.BaseEntity;
//import com.toprank.byd_c.model.entity.BecomeBusinessBasicInfoRespondEntity;
//import com.toprank.byd_c.model.entity.BookInformationEntity;
//import com.toprank.byd_c.model.entity.BookingTimeEntity;
//import com.toprank.byd_c.model.entity.CityList;
//import com.toprank.byd_c.model.entity.DeskSolutionEntity;
//import com.toprank.byd_c.model.entity.DishDetailInfo;
//import com.toprank.byd_c.model.entity.DishInfo;
//import com.toprank.byd_c.model.entity.DishesTagCategoryInfo;
//import com.toprank.byd_c.model.entity.FloorAreaEntity;
//import com.toprank.byd_c.model.entity.FunChangeListDetailsEntity;
//import com.toprank.byd_c.model.entity.FundChangeListEntity;
//import com.toprank.byd_c.model.entity.GetHtmlPathEntity;
//import com.toprank.byd_c.model.entity.HaveDoneEntity;
//import com.toprank.byd_c.model.entity.HomeADEntity;
//import com.toprank.byd_c.model.entity.LoginBean;
//import com.toprank.byd_c.model.entity.OnLineBookingEntity;
//import com.toprank.byd_c.model.entity.OpenTableEntity;
//import com.toprank.byd_c.model.entity.OrderConfirmBean;
//import com.toprank.byd_c.model.entity.OrderDetailsEntity;
//import com.toprank.byd_c.model.entity.OrderInfoEntity;
//import com.toprank.byd_c.model.entity.OrderOnDineService;
//import com.toprank.byd_c.model.entity.PassWordEntity;
//import com.toprank.byd_c.model.entity.PaymentEntity;
//import com.toprank.byd_c.model.entity.PaymentMethodEntity;
//import com.toprank.byd_c.model.entity.PopularFoodEntity;
//import com.toprank.byd_c.model.entity.QueryCityRespondEntity;
//import com.toprank.byd_c.model.entity.QueryCustomerInfoEntity;
//import com.toprank.byd_c.model.entity.RechargeEntity;
//import com.toprank.byd_c.model.entity.ReservationFeeEntity;
//import com.toprank.byd_c.model.entity.ReservationNoticeEntity;
//import com.toprank.byd_c.model.entity.RestaurantConditionEntity;
//import com.toprank.byd_c.model.entity.RestaurantEntity;
//import com.toprank.byd_c.model.entity.SampleBean;
//import com.toprank.byd_c.model.entity.ShowMerchantInfoEntity;
//import com.toprank.byd_c.model.entity.SubmitOrderInfo;
//import com.toprank.byd_c.model.entity.ValidateCodeBean;

import com.entity.A;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by CaiRR on 2017/4/17.
 */
public interface ApiService {

//    /**
//     * 普通账号密码登录
//     *
//     * @param mobile
//     * @param loginPassword
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("user/login/login")
//    Observable<LoginBean> doLogin(@Field("mobile") String mobile,
//                                  @Field("loginPassword") String loginPassword);
//
//    /**
//     * 忘记密码
//     *
//     * @param mobile
//     * @param identCode
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("user/customerInfo/forgetPwd")
//    Observable<SampleBean> forgetPwd(@Field("mobileNo") String mobile,
//                                     @Field("identCode") String identCode, @Field("newPwd") String newPwd);
//
//    /**
//     * 验证码登录
//     *
//     * @param mobile    手机号
//     * @param identCode 验证码
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("user/login/loginByCode")
//    Observable<LoginBean> loginByCode(@Field("mobileNo") String mobile,
//                                      @Field("identCode") String identCode);
//
//    /**
//     * 注册
//     *
//     * @param mobile        手机号
//     * @param verifyCode    验证码
//     * @param loginPassword 登录密码
//     * @param invitePhone   邀请码
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("user/login/register")
//    Observable<LoginBean> doRegister(@Field("mobile") String mobile, @Field("verifyCode") String verifyCode,
//                                     @Field("loginPassword") String loginPassword, @Field("referralID") String invitePhone);
//
//    /**
//     * 退出登录
//     *
//     * @param token token
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("user/login/logout")
//    Observable<SampleBean> logout(@Field("token") String token);
//
//    /**
//     * 发送验证码
//     *
//     * @param phone
//     * @param type  BYD_REGISTER_CODE:注册,BYD_VALIDATE_CODE:验证,BYD_FORGET_CODE:忘记密码
//     *              BYD_VERIFY_CODE;统一模板 BYD_LOGIN_CODE:登录
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("sms/sendValidateCode")
//    Observable<ValidateCodeBean> sendValidateCode(@Field("phone") String phone, @Field("type") String type, @Field("time") int time);
//
//
//    /**
//     * 个人资料信息查询
//     *
//     * @param token token
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("user/customerInfo/queryCustomerInfo")
//    Observable<QueryCustomerInfoEntity> queryCustomerInfo(@Field("token") String token);
//
//    /**
//     * 个人资料信息查询
//     *
//     * @param token token
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("user/customerInfo/updateCustomerInfo")
//    Observable<SampleBean> updateCustomerInfo(
//            @Field("token") String token,
//            @Field("nickName") String nickName,
//            @Field("signature") String signature,
//            @Field("sex") int sex,
//            @Field("birthday") String birthday,
//            @Field("email") String email,
//            @Field("customerName") String customerName,
//            @Field("provinceID") long provinceID,
//            @Field("cityID") long cityID,
//            @Field("districtID") long districtID,
//            @Field("provinceName") String provinceName,
//            @Field("cityName") String cityName,
//            @Field("districtName") String districtName
//    );
//
//    /**
//     * 入驻申请基本资料填写
//     *
//     * @param merchantRegisterVO merchantRegisterVO  json字符串
//     * @return
//     */
//    @Headers({"Content-Type: application/json", "Accept: application/json"})
////    @POST("test/json")
//    @POST("basic/saveBasicMerchantInfo")
//    Observable<BecomeBusinessBasicInfoRespondEntity> saveBasicMerchantInfo(@Body RequestBody merchantRegisterVO, @Header("token") String token);
//
//    /**
//     * 首页广告
//     *
//     * @param positionType
//     * @param categoryID
//     * @param currentPage
//     * @param pageSize
//     * @return
//     */
//
//    @FormUrlEncoded
//    @POST("advert/queryADInfo")
//    Observable<BaseEntity<List<HomeADEntity>>> getHomeAD(@Field("positionType") int positionType, @Field("categoryID") int categoryID, @Field("currentPage") int currentPage, @Field("pageSize") int pageSize);
//
//    /**
//     * 首页推荐餐厅
//     *
//     * @param currentPage
//     * @param pageSize
//     * @param areaCode
//     * @param distance
//     * @param longitude
//     * @param latitude
//     * @return
//     */
//    @GET("basicMerchant/queryBoutiqueRestaurantList")
//    Observable<BaseEntity<List<RestaurantEntity>>> getRecommendRestaurant(@Query("currentPage") int currentPage, @Query("pageSize") int pageSize, @Query("areaCode") String areaCode, @Query("distance") String distance, @Query("longitude") long longitude, @Query("latitude") long latitude);
//
//
//    /**
//     * 餐厅列表的过滤条件
//     *
//     * @param areaCode
//     * @return
//     */
//    @GET("search/merchant/searchCondition")
//    Observable<BaseEntity<RestaurantConditionEntity>> getSearchCondition(@Query("areaCode") String areaCode);
//
//
//    /**
//     * 餐厅列表
//     *
//     * @param currentPage
//     * @param pageSize
//     * @param tareacode   地区编码（0755 深圳）
//     * @param latitude    经度
//     * @param longitude   纬度
//     * @param districtID  区ID(当在附近时把该值赋值为-1)
//     * @param streetID    街道ID
//     * @param categoryID  商品类型
//     * @param name        搜索
//     * @param sort        排序字段(helpfulYesTotal（好评）,effectiveTime(最新发布),perCapitaDesc(人均最高),perCapitaAsc(人均最低),hot)
//     * @param condition   筛选  json格式的字符串 [{"screenConditionName": "价格区间","screenConditionValue": 1},{"screenConditionName": "价格区间","screenConditionValue": 1}]
//     * @return
//     */
//    @POST("basicMerchant/getAllMerchantBySearchMerchantCondition")
//    @FormUrlEncoded
//    Observable<BaseEntity<List<RestaurantEntity>>> getRestaurantList(@Field("currentPage") int currentPage,
//                                                                     @Field("pageSize") int pageSize,
//                                                                     @Field("tareacode") String tareacode,
//                                                                     @Field("latitude") double latitude,
//                                                                     @Field("longitude") double longitude,
//                                                                     @Field("districtID") long districtID,
//                                                                     @Field("streetID") long streetID,
//                                                                     @Field("categoryID") long categoryID,
//                                                                     @Field("name") String name,
//                                                                     @Field("sort") String sort,
//                                                                     @Field("screenMapList") String condition);
//
//
//    /**
//     * * 根据餐厅号确认在线预订
//     *
//     * @param archiveID   餐厅ID
//     * @param areaID      区域ID
//     * @param peopleNum   就餐人数
//     * @param mealsID     餐次ID
//     * @param tableIDs    桌台ID列表(tableID以逗号隔开)
//     * @param bookingType 预定类型ID
//     * @param contact     联系人
//     * @param phone       联系电话
//     * @param bookingTime 预定时间
//     * @param duration    预订时长
//     * @param memo        备注
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/order/reserve/addBookingInfo")
//    Observable<BaseEntity<OnLineBookingEntity>> saveBookInfo(@Field("archiveID") long archiveID,
//                                                             @Field("areaID") long areaID,
//                                                             @Field("peopleNum") int peopleNum,
//                                                             @Field("mealsID") long mealsID,
//                                                             @Field("tableIDs") String tableIDs,
//                                                             @Field("bookingType") long bookingType,
//                                                             @Field("contact") String contact,
//                                                             @Field("phone") String phone,
//                                                             @Field("bookingTime") String bookingTime,
//                                                             @Field("duration") int duration,
//                                                             @Field("memo") String memo,
//                                                             @Field("gender") int gender,
//                                                             @Field("token") String token);
//
//    /**
//     * 查询退款规则
//     *
//     * @param archiveID   档案ID
//     * @param bookingType 预订方式
//     * @param areaID      区域ID
//     * @param mealsID     餐次ID
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/order/reserve/queryRefundRule")
//    Observable<BaseEntity<String>> queryRefundRule(@Field("archiveID") long archiveID,
//                                                   @Field("bookingType") long bookingType,
//                                                   @Field("areaID") long areaID,
//                                                   @Field("mealsID") long mealsID);
//
//    /**
//     * 查询订金
//     *
//     * @param archiveID 档案ID
//     * @param peopleNum 就餐人数
//     * @param tableNum  预订桌数
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/order/reserve/queryReservationFee")
//    Observable<BaseEntity<ReservationFeeEntity>> queryReservationFee(@Field("archiveID") long archiveID,
//                                                                     @Field("peopleNum") int peopleNum,
//                                                                     @Field("tableNum") int tableNum);
//
//    /**
//     * 获取在线预订信息
//     *
//     * @param archiveID 餐厅ID
//     * @param token     令牌
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/order/reserve/queryReserveBasic")
//    Observable<BaseEntity<BookInformationEntity>> getBookInformation(@Field("archiveID") long archiveID,
//                                                                     @Field("token") String token);
//
//    /**
//     * 获取在线预订餐段与时间
//     *
//     * @param reserveTime 预订时间
//     * @param archiveID   餐厅ID
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/order/reserve/queryReserveMeals")
//    Observable<BaseEntity<BookingTimeEntity>> getBookDateTimeList(@Field("archiveID") long archiveID,
//                                                                  @Field("reserveTime") String reserveTime);
//
//
//    /**
//     * 根据餐厅ID获取其所有区域
//     * 获取楼层区域
//     *
//     * @param archiveID 餐厅ID
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/order/reserve/queryReserveAreaID")
//    Observable<BaseEntity<FloorAreaEntity>> getAreaListByRestaurantId(@Field("archiveID") long archiveID);
//
//    /**
//     * 预定通知
//     *
//     * @param token
//     * @param pageNum  页码
//     * @param pageSize 每页数量
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/order/queryCustomerBookOrderInfoList")
//    Observable<BaseEntity<List<ReservationNoticeEntity>>> queryCustomerBookOrderInfoList(@Field("token") String token, @Field("pageNum") int pageNum, @Field("pageSize") int pageSize);
//
//
//    @FormUrlEncoded
//    @POST("/msg/updateMessageStatus")
//    Observable<BaseEntity<Object>> updateMessageStatus(@Field("businessID") long businessID, @Field("businessType") long businessType);
//
//
//    /**
//     * 搜索历史桌子
//     *
//     * @param archiveID   餐厅ID
//     * @param mealsID
//     * @param reserveTime 预订时间
//     * @param quantity    就餐人数
//     * @param duration    就餐时长
//     * @param areaID      区域id
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/order/reserve/queryOrderHistoryDinningTableList")
//    Observable<BaseEntity<List<HaveDoneEntity>>> getHistoryDinningTable(@Field("archiveID") long archiveID,
//                                                                        @Field("mealsID") long mealsID,
//                                                                        @Field("reserveTime") String reserveTime,
//                                                                        @Field("quantity") int quantity,
//                                                                        @Field("duration") int duration,
//                                                                        @Field("areaID") long areaID,
//                                                                        @Field("token") String token);
//
//    /**
//     * 获取系统匹配的桌台方案
//     *
//     * @param mealsID     mealsID
//     * @param archiveID   餐厅ID
//     * @param reserveTime 预订时间
//     * @param quantity    就餐人数
//     * @param duration    就餐时长
//     * @param areaID      区域id
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/order/reserve/queryReserveTables")
//    Observable<BaseEntity<List<DeskSolutionEntity>>> getDeskSolution(@Field("mealsID") long mealsID,
//                                                               @Field("archiveID") long archiveID,
//                                                               @Field("reserveTime") String reserveTime,
//                                                               @Field("quantity") int quantity,
//                                                               @Field("duration") int duration,
//                                                               @Field("areaID") long areaID);
//
//    /**
//     * 获得钱包余额
//     *
//     * @param customerID 客户编号
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/user/wallet/getBalance")
//    Observable<BaseEntity<BalanceEntity>> getBalance(@Field("customerID") long customerID);
//
//    /**
//     * 获得余额明细信息
//     *
//     * @param customerID 客户ID
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/user/wallet/getBalanceDetail")
//    Observable<BaseEntity<BalanceDetailsEntity>> getBalanceDetail(@Field("customerID") long customerID);
//
//    /**
//     * 获取银行卡列表信息
//     *
//     * @param customerID 客户编号
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/user/wallet/getBankCardList")
//    Observable<BaseEntity<List<BandCardListEntity>>> getBankCardList(@Field("customerID") long customerID);
//
//
//    /**
//     * 获得资金变动明细列表详情
//     *
//     * @param changeID 资金变动id
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/user/wallet/getFundChangeDetailList")
//    Observable<BaseEntity<List<FunChangeListDetailsEntity>>> getFundChangeListDetail(@Field("changeID") long changeID);
//
//
//    /**
//     * 获得资金变动明细列表
//     *
//     * @param customerID    客户编号
//     * @param beginDateTime 开始时间
//     * @param endDateTime   结束时间
//     * @param changeType    变动类型
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/user/wallet/getFundChangeList")
//    Observable<BaseEntity<List<FundChangeListEntity>>> getFundChangeList(@Field("customerID") long customerID,
//                                                                         @Field("beginDateTime") String beginDateTime,
//                                                                         @Field("endDateTime") String endDateTime,
//                                                                         @Field("changeType") long changeType);
//
//    /**
//     * 充值
//     *
//     * @param customerID 客户编号
//     * @param payOrgID   机构ID
//     * @param money      支付金额
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/user/wallet/recharge")
//    Observable<BaseEntity<RechargeEntity>> recharge(@Field("customerID") long customerID,
//                                                    @Field("payOrgID") String payOrgID,
//                                                    @Field("money") double money);
//
//    /**
//     * 充值回调处理业务
//     *
//     * @param orderID   订单编号
//     * @param payStatus 支付状态
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/user/wallet/rechargeCallBack")
//    Observable<BaseEntity<List<Object>>> rechargeCallBack(@Field("orderID") long orderID,
//                                                          @Field("payStatus") String payStatus);
//
//    /**
//     * 获取支付方式
//     * @param customerID
//     * @param orgID
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/user/wallet/getPaymentMethod")
//    Observable<BaseEntity<List<PaymentMethodEntity>>> getPaymentMethod(@Field("customerID") long customerID,
//                                                                       @Field("orgID") long orgID);
//
//    /**
//     * 提现
//     *
//     * @param customerID   客户编号
//     * @param payOrgID     机构ID
//     * @param settingID    取款卡编号
//     * @param expectAmount 提现金额
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/user/wallet/withdrawals")
//    Observable<BaseEntity<List<Object>>> withdrawals(@Field("customerID") long customerID,
//                                                     @Field("payOrgID") String payOrgID,
//                                                     @Field("settingID") long settingID,
//                                                     @Field("expectAmount") double expectAmount);
//
//    /**
//     * 提现回调业务处理
//     *
//     * @param drawalID   提现ID
//     * @param customerID 客户编号
//     * @param dealStatus 处理状态
//     * @param settingID  取款卡编号
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/user/wallet/withdrawalsCallback")
//    Observable<BaseEntity<List<Object>>> withdrawalsCallback(@Field("drawalID") long drawalID,
//                                                             @Field("customerID") long customerID,
//                                                             @Field("dealStatus") long dealStatus,
//                                                             @Field("settingID") long settingID);
//
//
//    /**
//     * 商家资质审核资料
//     *
//     * @param merchantRegisterVO merchantRegisterVO  json字符串
//     * @return
//     */
//    @Headers({"Content-Type: application/json", "Accept: application/json"})
//    @POST("basic/saveQualifyMerchantInfo")
//    Observable<SampleBean> saveQualifyMerchantInfo(@Body RequestBody merchantRegisterVO, @Header("token") String token);
//
//
//    /**
//     * 上传图片
//     *
//     * @param modName    模块(如商家:merchant)
//     * @param uploadType 类型(如1:身份证正面 2:身份证反面 3:营业执照正面 4:营业执照正面 5:餐饮服务许可证 6:卫生服务许可证)
//     * @param targetId   模块对应ID
//     * @param file       图片文件
//     * @return
//     */
//    @Multipart
//    @POST("common/uploadImage")
//    Observable<ResponseBody> uploadImage(@Query("modName") String modName, @Query("uploadType") int uploadType,
//                                         @Query("targetId") long targetId, @Query("isCompress") boolean isCompress,
//                                         @Part MultipartBody.Part file);
//
//    @GET("basic/getCategoryListAndTagList")
//    Observable<BaseEntity<DishesTagCategoryInfo>> getCategoryTagList(@Query("archiveID") long archiveID);
//
//    @GET("basic/getProductList")
//    Observable<BaseEntity<List<DishInfo>>> getDishes(@Query("categoryID") long categoryID, @Query("tagID") long tagID, @Query("searchContent") String searchContent, @Query("tableID") long tableID, @Query("archiveID") long archiveID, @Query("pageNum") long pageNum, @Query("pageSize") long pageSize);
//
//    /**
//     * 商家查看资料
//     * <p>
//     * //    商户状态	MerchantStatus	9	530	143	未知
//     * //    商户状态	MerchantStatus	9	531	143	待提交资料
//     * //    商户状态	MerchantStatus	9	532	143	待审核
//     * //    商户状态	MerchantStatus	9	533	143	待补充资料
//     * //    商户状态	MerchantStatus	9	534	143	待审批
//     * //    商户状态	MerchantStatus	9	535	143	待发布
//     * //    商户状态	MerchantStatus	9	536	143	已拒绝
//     * //    商户状态	MerchantStatus	9	537	143	已暂停
//     * //    商户状态	MerchantStatus	9	538	143	正常
//     *
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("basic/showMerchantInfo")
//    Observable<ShowMerchantInfoEntity> showMerchantInfo(@Field("token") String token);
//
//
//    /**
//     * 查询用户订单
//     */
//    @FormUrlEncoded
//    @POST("/order/queryCustomerOrderInfoList")
//    Observable<OrderInfoEntity> queryCustomerOrderInfoList(@Field("token") String token,
//                                                           @Field("keyword") String keyword,
//                                                           @Field("orderStatus") long orderStatus,
//                                                           @Field("pageNum") int pageNum,
//                                                           @Field("pageSize") int pageSize);
//
//    /**
//     * 获取订单明细
//     */
//    @FormUrlEncoded
//    @POST("/order/queryCustomerOrderDetailInfo")
//    Observable<OrderDetailsEntity> queryCustomerOrderDetailInfo(@Field("bookingID") long bookingID,
//                                                                @Field("archiveID") long archiveID);
//
//
//    /**
//     * 查询用户订单
//     */
//    @FormUrlEncoded
//    @POST("basic/cancelAudit")
//    Observable<SampleBean> cancelAudit(@Field("archiveID") long archiveID);
//
//    /**
//     * 省市区查询，
//     *
//     * @param provinceID 起始provinceID=0是查询左右的省份
//     */
//    @FormUrlEncoded
//    @POST("common/queryCity")
//    Observable<QueryCityRespondEntity> queryCity(@Field("provinceID") long provinceID);
//
//    /**
//     * 登录后修改登陆密码
//     *
//     * @param token
//     * @param newPassword 新密码
//     */
//    @FormUrlEncoded
//    @POST("user/customerInfo/updateLoginPass")
//    Observable<SampleBean> updateLoginPass(@Field("token") String token, @Field("newPassword") String newPassword);
//
//
//    /**
//     * 修改手机号绑定
//     *
//     * @param token
//     * @param mobile        手机号
//     * @param identCode     验证码
//     * @param loginPassword 登录密码
//     */
//    @FormUrlEncoded
//    @POST("user/customerInfo/updateMobile")
//    Observable<SampleBean> updateMobile(@Field("token") String token, @Field("mobile") String mobile,
//                                        @Field("identCode") String identCode, @Field("loginPassword") String loginPassword);
//
//    /**
//     * 提交订单
//     *
//     * @param info
//     * @return
//     */
//    @POST("order/addOrderInfo")
//    Observable<BaseEntity<OrderConfirmBean>> submitOrderInfo(@Body SubmitOrderInfo info);
//
//    /**
//     * 菜品详情
//     *
//     * @param menuID
//     * @return
//     */
//    @GET("basic/queryProductInfoByMenuID")
//    Observable<BaseEntity<DishDetailInfo>> getDishDetailData(@Query("menuID") long menuID);
//
//    /**
//     * 忘记密码支付短信验证码验证
//     *
//     * @param token
//     * @param phone     手机号
//     * @param codeType  验证类型
//     * @param identCode 验证码
//     */
//    @FormUrlEncoded
//    @POST("user/customerInfo/validateCode")
//    Observable<SampleBean> validateCode(@Field("token") String token, @Field("phone") String phone,
//                                        @Field("codeType") String codeType, @Field("identCode") String identCode);
//
//
//    /**
//     * 忘记密码支付短信验证码验证
//     *
//     * @param token
//     * @param phone       手机号
//     * @param payPassword 支付密码
//     */
//    @FormUrlEncoded
//    @POST("user/customerInfo/setPayPassword")
//    Observable<SampleBean> setPayPassword(@Field("token") String token, @Field("phone") String phone,
//                                          @Field("payPassword") String payPassword);
//
//
//    /**
//     * 加菜
//     * <p>
//     * 传参数 ex:{
//     * "foodList": [
//     * {
//     * "combo": true,
//     * "comboID": 0,
//     * "comboName": "string",
//     * "detailDesc": "string",
//     * "floatQuantity": 0,
//     * "imgPath": "string",
//     * "loginID": 0,
//     * "price": 0,
//     * "productID": 0,
//     * "productName": "string",
//     * "productUnit": 0,
//     * "quantity": 0,
//     * "subOrderID": 0,
//     * "variantID": 0
//     * }
//     * ],
//     * "orderID": 0
//     * }
//     */
//    @FormUrlEncoded
//    @POST("/order/addFood")
//    Observable<Object> addFood(@Field("orderDetailVo") String orderDetailVo);
//
//
//    /**
//     * 叫起 取消暂缓
//     *
//     * @param detailID 订单明细
//     */
//    @FormUrlEncoded
//    @POST("/order/callProduction")
//    Observable<OrderOnDineService> callProduction(@Field("detailID") long detailID);
//
//    /**
//     * 等叫 暂缓制作
//     *
//     * @param detailID 订单明细
//     */
//    @FormUrlEncoded
//    @POST("/order/waitCalled")
//    Observable<OrderOnDineService> waitCalled(@Field("detailID") long detailID);
//
//    /**
//     * 催单 催菜
//     *
//     * @param detailID 订单明细
//     */
//    @FormUrlEncoded
//    @POST("/order/urgeOrder")
//    Observable<OrderOnDineService> urgeOrder(@Field("detailID") long detailID);
//
//    /**
//     * 称重确认
//     *
//     * @param detailID 订单明细
//     */
//    @FormUrlEncoded
//    @POST("/order/confirmWeigh")
//    Observable<OrderOnDineService> confirmWeigh(@Field("detailID") long detailID);
//
//    /**
//     * 继续催菜
//     *
//     * @param detailID 订单明细
//     */
//    @FormUrlEncoded
//    @POST("/order/addFoodHasExist")
//    Observable<OrderOnDineService> addFoodHasExist(@Field("detailID") long detailID, @Field("quantity") String quantity);
//
//    /**
//     * 开台
//     *
//     * @param orderID 订单ID
//     */
//    @FormUrlEncoded
//    @POST("/order/openTable")
//    Observable<OpenTableEntity> openTable(@Field("orderID") String orderID);
//
//    /**
//     * 取消预定
//     */
//    @FormUrlEncoded
//    @POST("/order/reserve/cancelBooking")
//    Observable<BaseEntity<Object>> cancelBooking(@Field("token") String token,
//                                                 @Field("bookingID") long bookingID,
//                                                 @Field("memo") String memo);
//
//
//    /**
//     * 商家资质审核资料
//     *
//     * @param merchantRegisterVO merchantRegisterVO  json字符串
//     * @return
//     */
//    @Headers({"Content-Type: application/json", "Accept: application/json"})
//    @POST("basic/updateBasicMerchantInfo")
//    Observable<BecomeBusinessBasicInfoRespondEntity> updateBasicMerchantInfo(@Body RequestBody merchantRegisterVO, @Header("token") String token);
//
//
//    /**
//     * 查詢支付密码是否存在
//     *
//     * @param token
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/user/customerInfo/queryPayPassword")
//    Observable<BaseEntity<PassWordEntity>> queryPayPassword(@Field("token") String token);
//
//    /**
//     * 查詢城市列表
//     *
//     * @return
//     */
//    @POST("common/queryCitys")
//    Observable<BaseEntity<CityList>> getCityList();
//
//    /**
//     * 获取支付信息
//     *
//     * @param orderID
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("/order/payPageOrderInfos")
//    Observable<BaseEntity<PaymentEntity>> payment(@Field("orderID") String orderID);
//
//
//    /**
//     * 热门搜索列表
//     *
//     * @return
//     */
//    @GET("basicMerchant/hostSearchList")
//    Observable<BaseEntity<List<String>>> getHostSearchList();
//
//    /**
//     *首页流行美食
//     * @return
//     */
//    @POST("basic/queryDeliciousPicture")
//    Observable<BaseEntity<List<PopularFoodEntity>>> getHomePopularFood();
//
//
//    /**
//     * 获取静态页面协议
//     *
//     * @param id
//     * @return
//     */
//    @GET("common/getHtmlPath")
//    Observable<GetHtmlPathEntity> getHtmlPath(@Query("id") int id);
//

    /**
     * 获取静态页面协议
     *
     * @param id
     * @return
     */
    @GET("test/json")
    void getHtmlPath(@Query("id") int id, Callback<TestJson> callback);

    @FormUrlEncoded
    @POST("/common/queryCitys")
    Call<QueryCityRespondEntity> getHostCigy(@Field("provinceID") int id);

//普通的请求
    @FormUrlEncoded
    @POST("/common/queryHotCitys")
    Call<A>getHotCitys(@Field("provinceID") int id);

    //响应式请求
    @FormUrlEncoded
    @POST("/common/queryHotCitys")
    Observable<A> reaffectgetHotCitys(@Field("provinceID") int id);
}
