//={"德井青空","钉宫理惠","浪川大辅","花泽香菜","福山润","神谷浩史","佐仓绫音"};
package com.example.asus.lv1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends Activity {
private List<Voiceplayer> voiceplayers=new ArrayList<Voiceplayer>();
private String[] chr0={"夏娜","露易丝","逢坂大河","神崎·H·亚里亚"};
    private String[] chr1={"春上衿衣","花户小鸠","结城美柑"," 立华奏"};
    private String[] chr2={"矢泽妮可","让崎妮洛","条河麻耶","艾列拉·露"};
    private String[] chr3={"绚濑亚里沙","御岛明日香","大连寺铃鹿","长门秘书舰"};
    private String[] chr4={"乌尔奇奥拉·西法","伊佐那社","有马贵将","太刀川庆"};
    private String[] chr5={"夏目贵志","折原临也","音无结弦","相马博臣"};
    private String[] chr6={"鲁路修·兰佩路基","小鸟游宗太","富樫勇太","八田美咲"};
   private  String[] value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initVoiceplayer();
        VpAdapter adapter=new VpAdapter(SecondActivity.this,R.layout.member_list,voiceplayers);
        ListView listView= (ListView) findViewById(R.id.list1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(SecondActivity.this,InformationActivity.class);
                switch (position)
                {
                    case 0:value=chr0;
                    case 1:value=chr1;
                    case 2:value=chr2;
                    case 3:value=chr3;
                    case 4:value=chr4;
                    case 5:value=chr5;
                    case 6:value=chr6;
                }
                intent.putExtra("case",value);
                startActivity(intent);
            }
        });
    }

        private void initVoiceplayer() {
        Voiceplayer one =new Voiceplayer("钉宫理惠",R.drawable.ding,"女",chr0);
        voiceplayers.add(one);
        Voiceplayer two= new Voiceplayer("花泽香菜",R.drawable.hua,"女",chr1);
        voiceplayers.add(two);
        Voiceplayer thr =new Voiceplayer("德井青空",R.drawable.de,"女",chr2);
        voiceplayers.add(thr);
        Voiceplayer fur =new Voiceplayer("佐仓绫音",R.drawable.zuo,"女",chr3);
        voiceplayers.add(fur);
        Voiceplayer fif =new Voiceplayer("浪川大辅",R.drawable.lang,"男",chr4);
        voiceplayers.add(fif);
        Voiceplayer six =new Voiceplayer("神谷浩史",R.drawable.shen,"男",chr5);
        voiceplayers.add(six);
        Voiceplayer sev =new Voiceplayer("福山润",R.drawable.fu,"男",chr6);
        voiceplayers.add(sev);
    }

}

