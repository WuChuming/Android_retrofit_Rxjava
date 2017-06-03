package com.example.shawn.myfirstapplication;

import android.content.Entity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.entity.A;
import com.firstApp.login.ApiClient;
import com.firstApp.login.QueryCityRespondEntity;
import com.firstApp.login.TestJson;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {


    private Button button;

    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("1","create---->Method");

        button = (Button)this.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"wo fuck",1).show();
//                getHotCitys();   //正常请求
                reaffectGetHotCity();  //响应式请求
            }
        });

        text = (TextView)this.findViewById(R.id.textView);
        text.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v) {
            }
        });
    }

    private void requestFromServer(){
        ApiClient.getInstance().getApiService().getHtmlPath(23, new Callback<TestJson>() {
            @Override
            public void onResponse(Call<TestJson> call, Response<TestJson> response) {

//            Log.d("wode","entity"+)
            }

            @Override
            public void onFailure(Call<TestJson> call, Throwable throwable) {

            }
        });
    }

    //请求热门城市
    private  void  getHotCitys(){
        Call<A> call = ApiClient.getInstance().getApiService().getHotCitys(1);
        call.enqueue(new Callback<A>() {
            @Override
            public void onResponse(Call<A> call, Response<A> response) {
                A entity = response.body();
                Log.d("wode","entity:"+entity.getData().getHotCity().get(0).getShortName());
            }

            @Override
            public void onFailure(Call<A> call, Throwable throwable) {

            }
        });

    }


    private void  getHotCity(){
        Call<QueryCityRespondEntity>  call =  ApiClient.getInstance().getApiService().getHostCigy(1);
        call.enqueue(new Callback<QueryCityRespondEntity>() {
            @Override
            public void onResponse(Call<QueryCityRespondEntity> call, Response<QueryCityRespondEntity> response) {
                QueryCityRespondEntity entity = response.body();

                Log.d("xiaocai","entity:"+entity.data.get(0).provinceName);
            }

            @Override
            public void onFailure(Call<QueryCityRespondEntity> call, Throwable throwable) {

                throwable.printStackTrace();
            }
        });
//              Log.d("1","back");

//        ApiClient.getInstance().getApiService().getHostCigy(new Callback<QueryCityRespondEntity>() {
//            @Override
//            public void onResponse(Call<QueryCityRespondEntity> call, Response<QueryCityRespondEntity> response) {
//              Log.d("1","back");
//            }
//
//            @Override
//            public void onFailure(Call<QueryCityRespondEntity> call, Throwable throwable) {
//
//            }
//        });
    }


    private void reaffectGetHotCity(){


        ApiClient.getInstance().getApiService().reaffectgetHotCitys(0)
                .subscribeOn(Schedulers.io())             //订阅在io线程
                .observeOn(AndroidSchedulers.mainThread())  //响应监控在主线程
                .subscribe(new Subscriber<A>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();               //答应错误轨迹
                Log.d("xiaocai","error:"+throwable.getMessage());
            }

            @Override
            public void onNext(A a) {
                Log.d("xiaocai",a.getData().getHotCity().get(0).getShortName());
            }
        });


    }
    
    public void sendButtonMessage(View btn){
        Toast.makeText(MainActivity.this,"sendMessage",11).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i("3","onResume---->Method");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("2","onStart---->Method");
    }
}
