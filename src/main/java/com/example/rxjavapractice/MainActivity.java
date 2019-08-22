package com.example.rxjavapractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    String value = "data";
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btn);
        textView = findViewById(R.id.texView);


        ApiInterface apiInterface = ApiUtils.getClient(getApplicationContext()).create(ApiInterface.class);

        apiInterface.getUserDetails("8801537010754","1234567")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GymSearchResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(GymSearchResponse gymSearchResponse) {
                        Toast.makeText(MainActivity.this, String.valueOf(gymSearchResponse.getDesc()+" "+gymSearchResponse.getStatus()), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              /*  for (int i = 0; i < 50; i++) {

                    try {
                        Thread.sleep(500);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                   textView.setText(String.valueOf(i));
                }*/
        /*  Observable
                  .just(value)
                  .subscribeOn(Schedulers.io())

                  .observeOn(AndroidSchedulers.mainThread())
                  .subscribe(new Observer<String>() {
                      @Override
                      public void onSubscribe(Disposable d) {
                          value ="value change";
                      }

                      @Override
                      public void onNext(String s) {



                          textView.setText(value);
                      }

                      @Override
                      public void onError(Throwable e) {
                          Log.d("main therea","Onerror");
                      }

                      @Override
                      public void onComplete() {

                          textView.setText(value);
                      }
                  });*/

           /* getObserale()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<String>() {
                        @Override
                        public void onSubscribe(Disposable d) {
                            Log.d("main therea","OnSubcribe");
                        }

                        @Override
                        public void onNext(String s) {
                         textView.setText(String.valueOf(s));
                            Log.d("main therea","Onnext");
                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.d("main therea","Onerror");
                        }

                        @Override
                        public void onComplete() {
                            Log.d("main therea","Oncoplete");
                        }
                    });
*/
            }
        });



    }




    Observable<String>getObserale(){
        return Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> subscriber) throws Exception {
                for (int i = 0; i < 50; i++) {

                    try {
                        Thread.sleep(500);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                   subscriber.onNext(" "+i);
                }
                subscriber.onComplete();
            }
        });
    }




}
