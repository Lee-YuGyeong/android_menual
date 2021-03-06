package com.example.manual;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class DetailActivity extends AppCompatActivity {

    ListView listView;
    DetailListAdapter adapter;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        int btn = intent.getExtras().getInt("btn");
        int btn2 = intent.getExtras().getInt("btn2");

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://pf.kakao.com/_RxfRlK/chat"));
                startActivity(i);
            }

        });


        adapter = new DetailListAdapter();

        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        if(btn == 1) {

            if(btn2 == 0){

                adapter.addData("1. 연락처 앱 아이콘을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.c_add_1));
                adapter.addData("2. 오른쪽 아래 + 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.c_add_2));
                adapter.addData("3. 이름과 전화번호를 입력하고 아래 저장 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.c_add_3));


            }else if(btn2 == 1){

                adapter.addData("1. 다이얼 앱 아이콘을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.c_call_1));
                adapter.addData("2. 전화번호를 누른 뒤 아래 전화 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.c_call_2));


            }else{

                adapter.addData("1. 녹음 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.c_recode));

            }

           }
        if(btn == 2) {
            if (btn2 == 0) {

                adapter.addData("1. 바탕화면에서 메세지 아이콘을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail1_1));
                adapter.addData("2. 상대방의 전화번호나 이름을 적어줍니다.", ContextCompat.getDrawable(this, R.drawable.mail1_2));
                adapter.addData("3. 보낼메세지를 입력합니다.", ContextCompat.getDrawable(this, R.drawable.mail1_3));
                adapter.addData("4. 보내기 버튼을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail1_5));
                adapter.addData("5. 보낸 메세지를 확인합니다.", ContextCompat.getDrawable(this, R.drawable.mail1_4));

            } else if (btn2 == 1) {


                adapter.addData("1. 바탕화면에서 메세지 아이콘을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail1_1));
                adapter.addData("2. 상대방의 전화번호나 이름을 적어줍니다.", ContextCompat.getDrawable(this, R.drawable.mail1_2));
                adapter.addData("3. 하단의 앨범 아이콘을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail2_5));
                adapter.addData("4. 원하는 사진을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail2_2));
                adapter.addData("5. 보내기 버튼을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail2_3));
                adapter.addData("6. 보낸 사진메세지를 확인합니다.", ContextCompat.getDrawable(this, R.drawable.mail2_4));

            } else {

                adapter.addData("1. 바탕화면에서 메세지 아이콘을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail1_1));
                adapter.addData("2. 상대방의 전화번호나 이름을 적어줍니다.", ContextCompat.getDrawable(this, R.drawable.mail1_2));
                adapter.addData("3. 키보드에서 이모티콘 아이콘을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail3_1));
                adapter.addData("4. 원하는 이모티콘을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail3_2));
                adapter.addData("5. 보내기 버튼을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail3_3));
                adapter.addData("6. 보낸 이모티콘을 확인합니다.", ContextCompat.getDrawable(this, R.drawable.mail3_4));

            }
        }
        if(btn == 3) {

            if (btn2 == 0) {

                adapter.addData("1. 카메라를 누릅니다.", ContextCompat.getDrawable(this, R.drawable.menu_camera));
                adapter.addData("2. 흰색 동그라미 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.camera3_1));


            } else if (btn2 == 1) {
                adapter.addData("전면 카메라: 셀카 찍을 때 사용합니다.", ContextCompat.getDrawable(this, R.drawable.camera1_0));
                adapter.addData("1. 카메라를 누릅니다.", ContextCompat.getDrawable(this, R.drawable.menu_camera));
                adapter.addData("2. 카메라 모양 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.camera2_2));
                adapter.addData("3. 셀카 카메라로 전환 완료", ContextCompat.getDrawable(this, R.drawable.camera2_4));

            } else if (btn2 == 2) {
                adapter.addData("1. 동영상 촬영 시작하기: 빨간색 동그라미 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.camera4_1));
                adapter.addData("2. 동영상 촬영 일시 중지하기: 두 개의 회색 네모 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.camera4_2));
                adapter.addData("3. 동영상 촬영 끝내기: 검정색 네모 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.camera4_3));


            } else if (btn2 == 3) {

                adapter.addData("1. 갤러리(사진첩)를 누릅니다.", ContextCompat.getDrawable(this, R.drawable.menu_gallery));
                adapter.addData("2. 카메라 앨범 누릅니다.", ContextCompat.getDrawable(this, R.drawable.camera5_1));
                adapter.addData("3. 편집하고 싶은 사진 누릅니다.", ContextCompat.getDrawable(this, R.drawable.camera5_2));
                adapter.addData("4. 붙어있는 동그라미 세 개 누릅니다.", ContextCompat.getDrawable(this, R.drawable.camera5_3));
                adapter.addData("5. 원하는 느낌의 사진 누릅니다.", ContextCompat.getDrawable(this, R.drawable.camera5_4));


            } else if (btn2 == 4) {

                adapter.addData("1. 갤러리(사진첩)을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.menu_gallery));
                adapter.addData("2. 네모 모양 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.camera6_1));
                adapter.addData("3. 원하는 크기로 사진을 조절합니다.", ContextCompat.getDrawable(this, R.drawable.camera6_2));
                adapter.addData("4. (사진 조절 완료 후) 저장버튼을 누릅니다. ", ContextCompat.getDrawable(this, R.drawable.camera6_3));


            }
        }

        if(btn == 4) {

            if(btn2 == 0){

                adapter.addData("1. 카카오 앱 아이콘을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.k_chating_1));
                adapter.addData("2. 친구 목록에서 대화하고 싶은 친구를 찾고 누릅니다.",ContextCompat.getDrawable(this, R.drawable.k_chating_2));
                adapter.addData("3. 1:1 채팅하기 버튼을 누릅니다.",ContextCompat.getDrawable(this, R.drawable.k_chating_3));
                adapter.addData("4. 아래 글쓰기 박스를 누릅니다.",ContextCompat.getDrawable(this, R.drawable.k_chating_4));
                adapter.addData("5. 친구에게 보내고 싶은 메시지를 작성한 뒤 노란색 버튼을 누릅니다.",ContextCompat.getDrawable(this, R.drawable.k_chating_5));

            }else if(btn2 == 1){

                adapter.addData("1. 채팅화면에서 아래 + 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.k_send_1));
                adapter.addData("2. 앨범 버튼을 누릅니다.",ContextCompat.getDrawable(this, R.drawable.k_send_2));
                adapter.addData("3. 아래 전체 버튼을 누릅니다.",ContextCompat.getDrawable(this, R.drawable.k_send_3));
                adapter.addData("4. 보내고 싶은 사진을 고른 후 오른쪽 위 전송 버튼을 누릅니다.",ContextCompat.getDrawable(this, R.drawable.k_send_5));


            }else if(btn2 == 2){

                adapter.addData("1. 채팅화면에서 아래 이모티콘 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.k_emoticon_1));
                adapter.addData("2. 이모티콘 종류를 고릅니다.",ContextCompat.getDrawable(this, R.drawable.k_emoticon_2));
                adapter.addData("3. 보내고 싶은 이모티콘을 누릅니다.",ContextCompat.getDrawable(this, R.drawable.k_emoticon_3));
                adapter.addData("4. 노란색 버튼을 눌러 전송해줍니다.",ContextCompat.getDrawable(this, R.drawable.k_emoticon_4));


            }else if(btn2 == 3){

                adapter.addData("1. 친구 목록 맨 위 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.k_add_1));
                adapter.addData("2. 연락처로 추가 버튼을 누릅니다.",ContextCompat.getDrawable(this, R.drawable.k_add_2));
                adapter.addData("3. 친구의 이름과 전화번호를 작성한 뒤 오른쪽 맨 위 확인 버튼을 누릅니다.",ContextCompat.getDrawable(this, R.drawable.k_add_3));


            }else if(btn2 == 4){

                adapter.addData("1. 친구 목록에서 차단하고 싶은 친구를 길게 누릅니다.", ContextCompat.getDrawable(this, R.drawable.k_block_1));
                adapter.addData("2. 차단 버튼을 누릅니다.",ContextCompat.getDrawable(this, R.drawable.k_block_2));
                adapter.addData("3. 확인 버튼을 누릅니다.",ContextCompat.getDrawable(this, R.drawable.k_block_3));


            }else if(btn2 == 5){

                adapter.addData("1. 나가고 싶은 채팅방에 들어가서 오른쪽 맨 위 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.k_out_1));
                adapter.addData("2. 아래 화살표 버튼을 누릅니다.",ContextCompat.getDrawable(this, R.drawable.k_out_2));
                adapter.addData("3. 확인 버튼을 누릅니다.",ContextCompat.getDrawable(this, R.drawable.k_out_3));


            }

        }

        if(btn == 5) {

            if(btn2 == 0){

                adapter.addData("1. 카카오버스를 다운받고 어플에 들어가줍니다.", ContextCompat.getDrawable(this, R.drawable.road1_1));
                adapter.addData("2. 버스 또는 정류장을 검색합니다.",ContextCompat.getDrawable(this, R.drawable.road1_2));
                adapter.addData("3. 원하는 정류장을 선택해 줍니다.",ContextCompat.getDrawable(this, R.drawable.road1_3));
                adapter.addData("4. 버스 정보를 확인해 줍니다.",ContextCompat.getDrawable(this, R.drawable.road1_4));

            }else if(btn2 == 1){

                adapter.addData("1. 카카오버스를 다운받고 어플에 들어가줍니다.", ContextCompat.getDrawable(this, R.drawable.road2_1));
                adapter.addData("2. 왼쪽 상단 메뉴바를 선택한 후 지역설정을 합니다.",ContextCompat.getDrawable(this, R.drawable.road2_2));
                adapter.addData("3. 출발 역명을 입력합니다.",ContextCompat.getDrawable(this, R.drawable.road2_3));
                adapter.addData("4. 원하는 역을 클릭해줍니다.",ContextCompat.getDrawable(this, R.drawable.road2_4));
                adapter.addData("5. 도착지도 입력해줍니다.",ContextCompat.getDrawable(this, R.drawable.road2_5));
                adapter.addData("6. 지하철 정보를 확인해 줍니다.",ContextCompat.getDrawable(this, R.drawable.road2_6));

            }else if(btn2 == 2){

                adapter.addData("1. 코레일톡 어플을 다운받고 들어가줍니다.", ContextCompat.getDrawable(this, R.drawable.road3_1));
                adapter.addData("2. 정보를 입력해줍니다.",ContextCompat.getDrawable(this, R.drawable.road3_2));
                adapter.addData("3. 원하는 기차를 선택해줍니다.",ContextCompat.getDrawable(this, R.drawable.road3_3));
                adapter.addData("4. 결제하기를 눌러 결제를 진행합니다.",ContextCompat.getDrawable(this, R.drawable.road3_4));

            }
            else if(btn2 == 3){

                adapter.addData("1. 코레일톡 어플을 다운받고 들어가줍니다.", ContextCompat.getDrawable(this, R.drawable.road4_1));
                adapter.addData("2. 예매버튼을 클릭해줍니다.",ContextCompat.getDrawable(this, R.drawable.road4_2));
                adapter.addData("3. 정보를 입력해줍니다.",ContextCompat.getDrawable(this, R.drawable.road4_3));
                adapter.addData("4. 원하는 버스를 선택해줍니다.",ContextCompat.getDrawable(this, R.drawable.road4_4));
                adapter.addData("5. 원하는 좌석을 선택해줍니다.",ContextCompat.getDrawable(this, R.drawable.road4_5));
                adapter.addData("6. 결제를 진행합니다.",ContextCompat.getDrawable(this, R.drawable.road4_6));

            }

        }

        if(btn == 6) {

            if(btn2 == 0){

                adapter.addData("1. 와이파이 설정하기: 통신사에서 제공하는 와이파이의 경우, 공유기 뒷면에 비밀번호가 스티커로 부착되어 있습니다.\n " +
                                "와이파이 연결을 하지 않고 영상을 감상하면 데이터 요금이 나올 수도 있어요!", ContextCompat.getDrawable(this, R.drawable.youtube1_1));
                adapter.addData("2. 와이파이 연결이 되어 있는지 확인합니다.",ContextCompat.getDrawable(this, R.drawable.youtube1_2));
                adapter.addData("3. 만약 핸드폰에 유튜브가 없다면? 구글 플레이스토어를 누릅니다.",ContextCompat.getDrawable(this, R.drawable.youtube1_3));
                adapter.addData("4. 유튜브를 내려받고 유튜브 열기를 누릅니다.",ContextCompat.getDrawable(this, R.drawable.youtube1_4));

            }else if(btn2 == 1){

                adapter.addData("1. 구독: 내가 원하는 채널을 쉽게 찾을 수 있습니다.", ContextCompat.getDrawable(this, R.drawable.youtube2_1));
                adapter.addData("2. 마음에 드는 채널을 발견했다면 구독 버튼을 누릅니다.",ContextCompat.getDrawable(this, R.drawable.youtube2_2));
                adapter.addData("3. 유튜브 화면 하단의 구독 버튼을 누르면 구독 중인 채널의 영상을 한 눈에 확인할 수 있습니다.",ContextCompat.getDrawable(this, R.drawable.youtube2_3));


            }else if(btn2 == 2){

                adapter.addData("1. 알람: 관심있는 채널의 영상 소식을 받을 수 있습니다.", ContextCompat.getDrawable(this, R.drawable.youtube3_1));
                adapter.addData("2. 마음에 드는 채널의 영상 소식을 계속 받고 싶다면 알람 버튼을 누릅니다.",ContextCompat.getDrawable(this, R.drawable.youtube3_2));

            }else if(btn2 == 3){

                adapter.addData("1. 좋아요: 영상이 마음에 든다면 좋아요 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.youtube4_1));
                adapter.addData("2. 싫어요: 영상이 마음에 들지 않는다면 싫어요 버튼을 누릅니다.",ContextCompat.getDrawable(this, R.drawable.youtube4_2));
                adapter.addData("3. 댓글에도 좋아요와 싫어요 버튼을 누를 수 있습니다.",ContextCompat.getDrawable(this, R.drawable.youtube4_3));


            }
            else if(btn2 == 4){

                adapter.addData("1. 댓글을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.youtube5_1));
                adapter.addData("2. 남기고 싶은 댓글을 쓰고 파란색 종이비행기 버튼을 누릅니다.",ContextCompat.getDrawable(this, R.drawable.youtube5_2));
                adapter.addData("3. 내 댓글이 댓글 창에 보이게 됩니다.",ContextCompat.getDrawable(this, R.drawable.youtube5_3));


            }else if(btn2 == 5){

                adapter.addData("1. 오른쪽 상단을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.youtube6_1));
                adapter.addData("2. 품질: 숫자가 클 수록 고화질 영상으로 볼 수 있습니다.\n"+"품질 버튼을 누릅니다.",ContextCompat.getDrawable(this, R.drawable.youtube6_2));
                adapter.addData("3. 마음에 드는 품질을 누릅니다. (품질이 높을 수록 데이터 소비량이 늘어나요!)",ContextCompat.getDrawable(this, R.drawable.youtube6_3));


            }else if(btn == 6){

                adapter.addData("1. 오른쪽 하단의 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.youtube7_1));
                adapter.addData("2. 핸드폰을 가로로 돌려 큰 화면으로 감상 할 수 있습니다.",ContextCompat.getDrawable(this, R.drawable.youtube7_2));

            }else{

                adapter.addData("1. 영상 하단의 공유 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.youtube8_1));
                adapter.addData("2. 카카오톡이나 문자 메세지, 밴드 등 다양한 방법으로 영상을 공유할 수 있습니다.",ContextCompat.getDrawable(this, R.drawable.youtube8_2));
                //추가 해야하려나?
            }

        }

    }
}
