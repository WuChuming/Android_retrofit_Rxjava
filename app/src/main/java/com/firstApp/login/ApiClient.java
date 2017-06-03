package com.firstApp.login;

//import com.toprank.byd_c.AppConfig;
//import com.toprank.byd_c.common.ListTConverterFactory;


import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
//import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by CaiRR on 2017/4/17.
 */

public class ApiClient {

    private static OkHttpClient mOkHttpClient = null;
    private static Retrofit mRetrofit;
    private static ApiService mApiService;
    private String base_url = "http://192.168.1.110:8080/";

    public static ApiClient getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final ApiClient INSTANCE = new ApiClient();
    }

    private ApiClient() {
        initOkHttpClient();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                //设置 Json 转换器
                .addConverterFactory(GsonConverterFactory.create())
                //RxJava 适配器
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                .addConverterFactory(ListTConverterFactory.create())
                .client(mOkHttpClient)
                .build();
        mApiService = mRetrofit.create(ApiService.class);
    }

    public ApiService getApiService() {
        return mApiService;
    }

    public OkHttpClient getOkhttpClient() {
        if (mOkHttpClient == null) {
            initOkHttpClient();
        }
        return mOkHttpClient;
    }

    private void initOkHttpClient() {

        OkHttpClient.Builder builder = new OkHttpClient.Builder();

//        builder.addInterceptor(new AppendHeaderParamInterceptor());
//        builder.addInterceptor(new NoNetworkInterceptor());

//        if (AppConfig.DEBUG) {
//            // Log信息拦截器
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//            //设置 Debug Log 模式
            builder.addInterceptor(loggingInterceptor);
//        }
        //设置超时
        builder.connectTimeout(15, TimeUnit.SECONDS);
        builder.readTimeout(60, TimeUnit.SECONDS);
        builder.writeTimeout(60, TimeUnit.SECONDS);
        //错误重连
        builder.retryOnConnectionFailure(true);


        mOkHttpClient = builder.build();
    }

}
