package com.yasincuren.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("on created called");

        testMethod();
        System.out.println(math(3,4));

        System.out.println(newMethod( "yasin"));

        makeMusicians();

    }

    public void makeMusicians(){
        Musicians yasin = new Musicians("Yasin","Guitar",21);
        System.out.println(yasin.instrument);
    }


    public void testMethod(){
        int x = 4+4;
        System.out.println("value of x: "+ x);
    }

    public int math(int a, int b){
        return a+b;
    }

    public String newMethod(String string){

        return string + " new Method";
    }



    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause called");
    }
}