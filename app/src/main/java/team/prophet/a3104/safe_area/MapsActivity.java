package team.prophet.a3104.safe_area;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Button b;
    private TextView t;
    private LocationManager locationManager;
    private LocationListener listener;
    public double x,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        t = (TextView) findViewById(R.id.textView);
        b = (Button) findViewById(R.id.button);

        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);

        listener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                x = location.getLongitude();
                y = location.getLatitude();
                t.append("\n " + location.getLongitude() + " " + location.getLatitude());
            }

            @Override
            public void onStatusChanged(String s, int i, Bundle bundle) {

            }

            @Override
            public void onProviderEnabled(String s) {

            }

            @Override
            public void onProviderDisabled(String s) {

                Intent i = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivity(i);
            }
        };
        configure_button();
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {

            // Use default InfoWindow frame
            @Override
            public View getInfoWindow(Marker arg0) {
                return null;
            }

            // Defines the contents of the InfoWindow
            @Override
            public View getInfoContents(Marker arg0) {

                // Getting view from the layout file info_window_layout
                View v = getLayoutInflater().inflate(R.layout.windowlayout, null);

                // Getting the position from the marker

                String title = arg0.getTitle();
                String snippet = arg0.getSnippet();
                // Getting reference to the TextView to set latitude
                TextView tvLat = (TextView) v.findViewById(R.id.tv_title);

                // Getting reference to the TextView to set longitude
                TextView tvLng = (TextView) v.findViewById(R.id.tv_snippet);

                // Setting the latitude
                tvLat.setText(title);

                // Setting the longitude
                tvLng.setText(snippet);

                // Returning the view containing InfoWindow contents
                return v;

            }
        });

        // Add a marker in Sydney and move the camera
        LatLng keelong = new LatLng(25.120, 121.741);
        mMap.addMarker(new MarkerOptions().position(keelong).title("基隆市").snippet("仁愛區成功一路\n仁愛區龍安街324巷(尚智國小)\n仁愛區劉銘傳路至銘傳國中一帶\n中正區調和街\n中正區義二路\n中正區祥豐街106巷\n中正區中正路\n中正區平一路\n信義區信二路中興國小旁\n信義區花源三街\n信義區深溪路36巷\n七堵區東新街人行道(基隆商工對面)\n七堵區北基公路、明德三路(百福火車站)\n暖暖區八堵路228公園\n暖暖區碇內街210號前\n七堵區華新一路2號與汐止交接處\n七堵區大成街1號(瑪陵國小)\n安樂區安和一街29號（建德國中前週邊）\n安樂區安一路360號（安樂中學活動中心門口）\n安樂區武訓街205號前武崙國中前週邊\n中山區復興路336號經國管理學院前週邊\n中山區西華里西定路166號聖心小學前週\n"));

        LatLng new_taipei = new LatLng(24.794, 121.567);
        mMap.addMarker(new MarkerOptions().position(new_taipei).title("新北市").snippet("三重區中華路\n三重區五華街\n三重區忠孝路一段\n三重區後竹圍街\n三重區重陽路一段\n三重區過圳街市土城區中央路一段\n土城區中央路二段\n土城區中央路三段\n土城區金城路二段\n土城區海山路\n土城區裕民路\n中和區中山路三段\n中和區景平路\n五股區成泰路一段\n永和區竹林路\n永和區得和路\n汐止區大同路一段\n板橋區三民路二段\n板橋區文化路二段\n板橋區莊敬路\n板橋區裕民街\n新店區中正路\n新店區安康路三段\n新店區建國路\n新店區溪州路\n新莊區中正路\n樹林區中山/a>"));

        LatLng taipei = new LatLng(25.046, 121.565);
        mMap.addMarker(new MarkerOptions().position(taipei).title("台北市").snippet("中正區中華路1段衡陽路口至中華路1段秀山街\n中正區臺北車站周邊\n中山區花博公園\n信義區象山捷運站周邊地區(含捷運站體地下公共區域)"));

        LatLng yilan = new LatLng(24.678, 121.775);
        mMap.addMarker(new MarkerOptions().position(yilan).title("宜蘭縣").snippet("宜蘭市運動公園\n宜蘭市宜蘭河濱公園\n宜蘭市宜蘭轉運站\n宜蘭市中山公園\n員山鄉員山公園\n羅東運動公園\n五結鄉永安宮周邊\n頭城火車站旁地下道\n頭城鎮烏石港周邊\n礁溪鄉五峰旗風景區周邊\n蘇澳鎮北濱公園周邊\n蘇澳鎮豆腐岬風景區周邊\n蘇澳鎮龍德工業區周邊\n大同鄉清水地熱風景區周邊\n冬山鄉分洪堰風景區周邊\n柑仔坑土地公廟周邊"));

        LatLng taoyuan = new LatLng(24.984, 121.209);
        mMap.addMarker(new MarkerOptions().position(taoyuan).title("桃園市").snippet("桃園區民權路一帶\n桃園區中正路附近\n桃園區大有路一帶\n桃園區民光東路一帶\n桃園區永安北路一帶\n桃園區中山路一帶\n桃園區保羅街一帶\n桃園區龍壽街一帶\n中壢區長樂街84巷口\n中壢區自強六路一帶\n中壢區環中東路與榮安一街周邊\n中壢區大同路與新生路周邊\n中壢區復興路與中美路周邊\n中壢區新生路與九和一街周邊\n中壢區興仁路一段附近\n中壢區永豐街附近\n中壢區高鐵南路與過嶺路一段路口附近\n八德區桃德路128巷周邊\n八德區高城六街周邊\n八德區浮筧街125巷周邊\n八德區興豐路周邊\n八德區羊稠仔附近產業道路周邊\n楊梅區電台路附近\n新屋區永安漁港附近\n楊梅區富岡火車站附近\n觀音區新華路二段產業道路一帶\n大溪區河濱公園周邊\n大溪區中正公園週邊\n復興區角板山公園週邊\n大溪區信義路(燈桿1010339號)附近\n蘆竹區南昌路一帶\n龜山區文化三路與復興三路口附近\n龜山區大坑路二段一帶\n龜山區萬壽路二段與華美街口附近\n龜山區復興一路與文三二街口附近\n龜山區文化二路文昌三街口附近\n蘆竹區聯福街一帶\n平鎮區中豐路山頂段、東豐路與山福路區段(平鎮區山福路-產業道路)"));

        LatLng hsinchu_s = new LatLng(24.790, 120.957);
        mMap.addMarker(new MarkerOptions().position(hsinchu_s).title("新竹市").snippet("北區南寮漁港及海天一線(看海區)\n北區經國路二段路段\n北區北大路、北門街口\n北區湳雅街底路段\n東區北大路、光華街口\n東區公園路、八德路口\n東區中央路、民生路口\n東區千甲路路段\n香山區牛埔北路路段\n香山區建國公園周邊\n香山區長興街路段"));

        LatLng hsinchu = new LatLng(24.708, 121.151);
        mMap.addMarker(new MarkerOptions().position(hsinchu).title("新竹縣").snippet("竹北市仁義路周邊\n新豐鄉坡頭漁港觀海步道\n新埔鎮民生街新星國小周邊\n竹東鎮河濱公園\n竹東鎮東峰路446巷附近空屋\n竹東鎮上坪里萊爾富商附近空屋\n竹東鎮上坪里禾家園小吃店附近空屋\n竹東鎮二重里學府路段\n寶山鄉雙林路一段沿線(郊區)\n寶山鄉峰城路沿線(郊區)\n新埔鎮文德路1、2段\n關西鎮關西圖書館周邊\n關西鎮東光國小周邊\n關西鎮東安國小周邊\n關西鎮上林里竹21縣路段\n"));

        LatLng miaoli = new LatLng(24.562, 120.812);
        mMap.addMarker(new MarkerOptions().position(miaoli).title("苗栗縣").snippet("苗栗市高苗里中正路與光復路口週邊\n苗栗市苗栗火車站週邊\n公館鄉館南村仁愛路週邊\n公館鄉公館交流道\n銅鑼鄉中平村中興一街週邊\n三義鄉勝興村勝興車站週邊\n三義鄉鯉魚潭村台13線週邊\n大湖鄉義和村志成橋河堤道\n卓蘭鎮台三線145K處觀景台\n獅潭鄉台三線114.5公里處\n泰安鄉大安道路3公里處（象鼻吊橋）\n竹南鎮龍鳳里龍鳳漁港\n竹南鎮新南里竹南運動公園\n竹南鎮海口里長青之森\n後龍鎮中龍里後龍火車站\n後龍鎮溪洲里仁德醫校\n後龍鎮中和里好望角\n後龍鎮龍坑里遊桐花汽車旅館\n後龍鎮海埔里外埔漁港\n通霄鎮五南里中山路三段周邊\n通霄鎮通西里火車站週邊\n苑裡鎮苑北里中山路週邊\n苑裡鎮苑北里火車站週邊\n頭份市中正路地區檳榔攤\n頭份市銀河路地區酒店、KTV\n頭份市中正路上公園\n頭份市中正路下公園\n頭份市後庄地區酒店、KTV、汽車旅館\n頭份市中華路地區檳榔攤\n頭份市中華路交流道附近檳榔攤\n頭份市自強路、和平路口\n頭份市尚順廣場"));

        LatLng changhua = new LatLng(23.988, 120.464);
        mMap.addMarker(new MarkerOptions().position(changhua).title("彰化縣").snippet("彰化市崙平南路(近中央路)\n彰化市彰馬路(近彰鹿路)\n彰化市泰安二街金馬公園\n彰化市139線道\n芬園鄉彰南路四段\n花壇鄉花壇火車站周邊\n花壇鄉平和街\n員林市民權街、光復路一帶(火車站周邊)\n員林市中山路、惠來街一帶(遊藝場及KTV周邊)\n員林市山腳路、員南路沿山區一帶(員林運動公園)\n永靖鄉光雲巷、長壽巷(鄉立第一公墓周邊)\n永靖鄉中山路、福德巷一帶(苗種園區一帶)\n大村鄉福進路、過溝三巷(釣蝦場及遊藝場一帶)\n鹿港鎮鹿東路(麗景汽車旅館)\n福興鄉橋和街(紅樓汽車旅館)\n秀水鄉彰鹿路(彩虹森林汽車旅館)\n北斗鎮斗中路與北斗工業區周邊\n和美鎮和頭路德美公園周邊\n溪湖鎮彰水路彰水路二段762號（溪湖糖廠）\n社頭鄉廣興村14鄰中山路1段\n二水鄉鄉南通路2段\n二林鎮二林國小周邊\n二林鎮中正國小周邊\n二林鎮新生路旁產業道路周邊"));

        LatLng nantou = new LatLng(23.878, 120.931);
        mMap.addMarker(new MarkerOptions().position(nantou).title("南投縣").snippet("南投市南投市彰南路段\n南投市南投市南崗路段\n草屯鎮日新街佳?汽車旅館周邊\n草屯鎮富功國小周邊\n草屯鎮敦和國小周邊\n草屯鎮草屯國小周邊\n南投市中華路營盤路地下涵洞\n南投市省府路國光客運公司周邊\n南投市環山路中興會堂周邊\n南投市新興路德興國小周邊\n埔里鎮仁愛公園周邊\n埔里鎮宏仁國中周邊(中華路)\n竹山鎮大禮路路段\n竹山鎮育英路路段\n魚池鄉共和村共和國小周邊\n魚池鄉魚池國中周邊\n水里鄉永興國小旁空地\n集集鎮集集國中周邊\n仁愛鄉廬山國小周邊地帶\n仁愛鄉中正國小周邊地帶\n仁愛鄉平靜國小周邊地帶\n仁愛鄉仁愛高農周邊地帶\n仁愛鄉仁愛國中周邊地帶\n仁愛鄉親愛部落周邊地帶\n信義鄉明德村新開巷"));

        LatLng yunlin = new LatLng(23.712, 120.438);
        mMap.addMarker(new MarkerOptions().position(yunlin).title("雲林縣").snippet("斗六市明德路橋下附近\n斗六市後斗六火車站旁停車場\n林內鄉重興村進興路產業道路附近\n斗六市雲林科技大學操場旁廁所\n斗六市龍潭路附近\n斗六市八德里北祥街\n斗六市成大醫院停車場附近\n林內鄉林內火車站廁所附近\n斗六市福興路附近\n斗六市江厝路產業道路附近\n斗六市人文公園廁所附近\n斗南田徑場(大同路)\n古坑鄉西平村西平路夜市區域\n斗南鎮將軍里他里霧埤\n古坑鄉東和村文化路東和夜市\n特殊教育學校後門產業道路\n虎尾鎮林森路段\n虎尾鎮忠孝路段\n虎尾鎮同心公園堤防邊\n虎尾鎮復興路段\n二崙鄉田尾村犛份路段\n西螺鎮國光客運西螺轉運站\n西螺鎮詔安里詔安路段\n北港鎮女兒橋附近防汛道路\n水林鄉灣東村碧清寺附近\n口湖鄉崙東村中山路統一超商附近\n臺西鄉光華村產業道路旁\n四湖鄉湖寮村公廟旁"));

        LatLng chiayi = new LatLng(23.433, 120.250);
        mMap.addMarker(new MarkerOptions().position(chiayi).title("嘉義縣").snippet("中埔鄉和興村赤蘭溪西側堤防\n中埔鄉和美村八掌溪堤防\n中埔鄉裕民村「大有國小」產業道路\n中埔鄉裕民村「成輝砂石場」產業道路\n中埔鄉社口村「吳鳳廟」前\n仁義潭水庫環潭道路\n番路鄉民和村半天岩「紫雲寺」公園區\n番路鄉觸口村天長地久\n太保市春珠里4鄰附近\n太保市太保里2鄰附近\n太保市高鐵十路與高鐵東路附近\n太保市安仁里9鄰頂港子墘附近\n太保市太保一路周遭\n太保市後潭里15鄰附近\n太保市後潭里8鄰附近\n太保市東勢里8鄰附近\n鹿草鄉統一超商前\n鹿草鄉西井村往施家村產業道路\n太保市南新里中山路1段228巷(財經花園)周邊\n太保市麻寮里麻太路與三合路口周邊建築物\n水上鄉南鄉村土地公廟旁產業道路\n水上鄉忠和村中庄營區對面巷子內\n太保市新埤國小周邊\n義竹鄉、布袋鎮八掌溪堤防道路附近\n民雄鄉豐收村中正大學周邊\n民雄鄉民雄工業區周遭\n民雄鄉建國路一段麥當勞附近\n溪口鄉溪口大橋附近\n大林鎮信義街附近\n朴子市168線東石高中段\n朴子市長庚醫院\n朴子市新庄里堤防道路\n六腳鄉豐美段\n六腳鄉崩山段\n東石鄉永屯段\n東石鄉三家段\n東石鄉蔦松段\n竹崎鄉白杞村3鄰\n竹崎鄉紫雲村12鄰"));

        LatLng chiayi_s = new LatLng(23.479, 120.449);
        mMap.addMarker(new MarkerOptions().position(chiayi_s).title("嘉義市").snippet("西區僑平國小周邊\n西區志航國小周邊\n文化公園及週遭路段\n吳鳳南路與軍輝路口附近路段"));

        LatLng tainan = new LatLng(22.990, 120.161);
        mMap.addMarker(new MarkerOptions().position(tainan).title("台南市").snippet("新營區天鵝湖公園\n白河區詔安里20號至30號\n麻豆區興南路13號至35號\n西港區南海里慶安路229號至竹林里183號〈南173線〉\n將軍區將富里將富48號至92號\n新市區富強路2號至20號\n新化區中山路60號至80號\n仁德區行大一街沿線\n仁德區文華路3段沿線\n歸仁區復興路沿線\n玉井區忠孝街418巷\n楠西區鹿田里油車70號至80號\n永康區東橋一路(東橋里地下道)\n永康區中正南路300號至600號\n永康區興國街(永康公園週邊)\n永康區柴頭港溪河堤便道(近聖功女中)\n東區崇明路391號至1052號\n東區中華東路1段2號至366號\n中西區中山路68號至188號\n臺南式中西區青年路與北門路口\n安南區安中路一段700巷(鳳凰里公園)\n安平區林默娘公園\n安平區中華西路二段549號至569號\n安平區永華路二段236號至256號\n北區西門路4段430巷至507巷\n北區公園北路108號至156號\n北區西門路4段40號至70號\n南區西門路一段689巷2號至100號\n南區體育路25巷16弄1號至50號\n南區金華路一段400號至500號\n南區灣裡路50號至100號"));

        LatLng kaohsiung = new LatLng(22.624, 120.317);
        mMap.addMarker(new MarkerOptions().position(kaohsiung).title("高雄市").snippet("大樹區竹寮路\n新興區民享街\n鳳山區自治街35巷\n鼓山區明倫文信路口\n鳥松區水管路6巷口弄\n前金區瑞源路\n三民區河北二路\n小港區松信路與松富路\n前鎮區草衙路南二巷\n楠梓區捷運油廠國小一號出口\n橋頭區新八路、經武路\n楠梓區瑞屏路30巷\n楠梓區加昌路\n苓雅雅區中正一路、輔仁路公車站前\n新興區六合二路\n鼓山區美術館週邊"));

        LatLng pingtung = new LatLng(22.503, 120.688);
        mMap.addMarker(new MarkerOptions().position(pingtung).title("屏東縣").snippet("屏東市永安里棒球路\n屏東市崇勇街\n屏東市大同北路\n屏東市建國路\n屏東市大豐路與大武路口工地\n萬丹鄉崙頂村萬大橋往河堤南路引道處附近\n長治鄉中興路\n屏東市仁愛路\n屏東市大連路\n屏東市開封街\n九如鄉九明村九龍路九龍路與九明街口\n九如鄉九如路2段\n潮州鎮三星里三林路\n潮州鎮三共里文化路衛生所旁\n潮州鎮光華里華興路段\n新埤鄉餉潭村龍潭路\n潮州鎮同榮里育英路"));

        LatLng taitung = new LatLng(22.756, 121.112);
        mMap.addMarker(new MarkerOptions().position(taitung).title("台東縣").snippet("關山鎮水源路臨近自行步道路段\n池上鄉福文村臨近池上公墓路段\n延平鄉明野路臨近武陵活動中心路段\n臺東市中華路一段572號(好樂迪)周邊\n臺東市中華路一段284號(98.9PUB)周邊\n臺東市中華路一段50號(正一汽車旅館)周邊\n長濱鄉長光社區\n長濱鄉長濱社區\n大武鄉大鳥村海濱公園\n太麻里鄉溪頭媽祖廟前"));

        LatLng hualien = new LatLng(23.958, 121.563);
        mMap.addMarker(new MarkerOptions().position(hualien).title("花蓮縣").snippet("花蓮火車站周邊旅宿業\n花蓮火車站周邊KTV\n花蓮市國聯五路\n吉安鄉舊村二街\n吉安鄉自強路與國富二街口往南\n吉安鄉南華村花蓮監獄附近\n新城鄉新城村仁愛路\n新城鄉嘉新村嘉南路\n光復鄉林森路光復高職週邊\n萬榮鄉明利村1鄰週邊\n光復鄉富田三街周邊\n鳳林鎮林榮路周邊\n瑞穗鄉瑞美村中興路周邊\n萬榮鄉紅葉村紅葉周邊\n光復鄉北富村光豐路周邊\n玉里鎮忠智路周邊"));

        LatLng penghu = new LatLng(23.521, 119.591);
        mMap.addMarker(new MarkerOptions().position(penghu).title("澎湖縣").snippet(">湖西鄉龍門東廟海堤公廁\n澎湖水產職校實習工廠周邊\n馬公市第三漁港漁具倉庫周邊\n馬公市文化園區周邊"));

        LatLng kinmen = new LatLng(24.447, 118.378);
        mMap.addMarker(new MarkerOptions().position(kinmen).title("金門縣").snippet(""));

        LatLng lienchiang = new LatLng(26.224, 119.993);
        mMap.addMarker(new MarkerOptions().position(lienchiang).title("連江縣").snippet(""));

        LatLng taichung = new LatLng(24.179, 120.631);
        mMap.addMarker(new MarkerOptions().position(taichung).title("台中市").snippet("中區建國路周邊\n北區雙十路二段周邊\n東、南區復興路段\n南屯區文心森林公園周邊\n北屯區北屯市場周邊\n西屯區西屯路二段\n豐原區葫蘆墩公園周邊\n烏日區高鐵停車場周邊\n大里區大明、永隆路段週邊\n大甲區經國路、北堤東路口周遭\n太平區育才路與育英街口\n清水區高美路段\n石岡區石岡國中周邊"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(taichung,8));
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case 10:
                configure_button();
                break;
            default:
                break;
        }
    }

    void configure_button(){
        // first check for permissions
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(new String[]{Manifest.permission.ACCESS_COARSE_LOCATION,Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.INTERNET}
                        ,10);
            }
            return;
        }
        // this code won't execute IF permissions are not allowed, because in the line above there is return statement.
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //noinspection MissingPermission
                locationManager.requestLocationUpdates("gps", 5000, 0, listener);
                LatLng now = new LatLng(y,x);
                mMap.addMarker(new MarkerOptions().position(now));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(now,8));
            }
        });
    }

}