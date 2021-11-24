package com.lab02.lab9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

public class Comunication extends AppCompatActivity implements MainCallbacks{
    private static final String TAG="Main";
    private Fragment1 fragment1;
    private Fragment2 fragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunication);
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        fragment1=Fragment1.newInstance("","");
        ft.replace(R.id.fragmentContainerViewFrg1,fragment1,"FR1");
        ft.commit();

        ft=getSupportFragmentManager().beginTransaction();
        fragment2=Fragment2.newInstance("","");
        ft.replace(R.id.fragmentContainerViewFrg2,fragment2,"FR2");
        ft.commit();
    }

    @Override
    public void onMSGFromFragToMain(String sender, String strValue) {
        if(sender.equals("FR1")){
            try {
                Log.e("Fragment1","LLego aqui"+strValue);
                fragment1.onMsgFromMainToFragment("\nSender:" + sender + "\nMSG" + strValue);
            }catch (Exception e){
                Log.e("ERROR","on"+e.getMessage());
            }
        }
        if(sender.equals("FR2")){
            try {
                Log.e("Fragment2","LLego aqui"+strValue);
                fragment2.onMsgFromMainToFragment("\nSender:" + sender + "\nMSG" + strValue);
            }
            catch (Exception e)
            {
                Log.e("ERROR","on"+e.getMessage());
            }
        }


    }
}