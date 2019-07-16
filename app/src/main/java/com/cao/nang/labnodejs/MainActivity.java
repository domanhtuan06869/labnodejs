package com.cao.nang.labnodejs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cao.nang.labnodejs.retrofitapi.ApiUtils;
import com.cao.nang.labnodejs.retrofitapi.JsonPlaceHolderApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private JsonPlaceHolderApi jsonPlaceHolderApi;
    private EditText edtsoa;
    private EditText edtsob;
    private TextView tvketqua;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtsoa = (EditText) findViewById(R.id.edtsoa);
        edtsob = (EditText) findViewById(R.id.edtsob);
        tvketqua = (TextView) findViewById(R.id.tvketqua);


    }
    public void tinh(int a ,int b){
        jsonPlaceHolderApi= ApiUtils.getAPIService();

        jsonPlaceHolderApi.tinhPost(a,b).enqueue(new Callback<Integer>() {
            @Override
            public void onResponse(Call<Integer> call, Response<Integer> response) {
                if(response.isSuccessful()){
                    Toast.makeText(MainActivity.this,"thanh cong",Toast.LENGTH_LONG).show();
                }
                Log.e("erq",response.body().toString());
                String s= response.body().toString();
                tvketqua.setText("ketqua :"+s);
            }

            @Override
            public void onFailure(Call<Integer> call, Throwable t) {
                Toast.makeText(MainActivity.this,"tatbai",Toast.LENGTH_LONG).show();
                Log.e("loi",t.toString());
            }
        });
    }

    public void Tinh(View view) {
        int a=Integer.parseInt(edtsoa.getText().toString());
        int b=Integer.parseInt(edtsob.getText().toString());
        tinh(a,b);
    }
}
