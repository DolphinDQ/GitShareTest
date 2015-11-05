package com.example.zdqa1.layoutsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmptyActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        try {
            ArrayList<HashMap<String, String>> maps = new ArrayList<>();
            HashMap<String, String> hash = new HashMap<>();
            maps.add(0, hash);
            mListView = (ListView) findViewById(R.id.login_listview);
            String[] strings = {"title","info","time"};//Map的key集合数组
            int[] ids = {R.id.title,R.id.info,R.id.time};//对应布局文件的id
            SimpleAdapter simpleAdapter = new SimpleAdapter(this,
                    getData(), R.layout.content_listview, strings, ids);
            mListView.setAdapter(simpleAdapter);//绑定适配器
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("err",e.getMessage(),e);
        }

    }

    // 初始化一个List
    private List<HashMap<String, Object>> getData() {
        // 新建一个集合类，用于存放多条数据
        ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        HashMap<String, Object> map = null;
        for (int i = 1; i <= 40; i++) {
            map = new HashMap<String, Object>();
            map.put("title", "人物" + i);
            map.put("time", "9月20日");
            map.put("info", "我通过了你的好友验证请求，现在我们可以开始对话啦");
            list.add(map);
        }
        return list;
    }
}
