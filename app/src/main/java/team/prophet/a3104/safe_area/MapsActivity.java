package team.prophet.a3104.safe_area;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);



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

        // Add a marker in Sydney and move the camera
        LatLng keelong = new LatLng(25.120, 121.741);
        mMap.addMarker(new MarkerOptions().position(keelong).title("基隆市").snippet("<h1>基隆市</h1>仁愛區成功一路\n仁愛區龍安街324巷(尚智國小)<br>仁愛區劉銘傳路至銘傳國中一帶<br>中正區調和街<br>中正區義二路<br>中正區祥豐街106巷<br>中正區中正路<br>中正區平一路<br>信義區信二路中興國小旁<br>信義區花源三街<br>信義區深溪路36巷<br>七堵區東新街人行道(基隆商工對面)<br>七堵區北基公路、明德三路(百福火車站)<br>暖暖區八堵路228公園<br>暖暖區碇內街210號前<br>七堵區華新一路2號與汐止交接處<br>七堵區大成街1號(瑪陵國小)<br>安樂區安和一街29號（建德國中前週邊）<br>安樂區安一路360號（安樂中學活動中心門口）<br>安樂區武訓街205號前武崙國中前週邊<br>中山區復興路336號經國管理學院前週邊<br>中山區西華里西定路166號聖心小學前週<br>"));

        LatLng new_taipei = new LatLng(24.794, 121.567);
        mMap.addMarker(new MarkerOptions().position(new_taipei).title("新北市").snippet("<h1>新北市</h1>三重區中華路<br>三重區五華街<br>三重區忠孝路一段<br>三重區後竹圍街<br>三重區重陽路一段<br>三重區過圳街市土城區中央路一段<br>土城區中央路二段<br>土城區中央路三段<br>土城區金城路二段<br>土城區海山路<br>土城區裕民路<br>中和區中山路三段<br>中和區景平路<br>五股區成泰路一段<br>永和區竹林路<br>永和區得和路<br>汐止區大同路一段<br>板橋區三民路二段<br>板橋區文化路二段<br>板橋區莊敬路<br>板橋區裕民街<br>新店區中正路<br>新店區安康路三段<br>新店區建國路<br>新店區溪州路<br>新莊區中正路<br>樹林區中山/a>"));

        LatLng taipei = new LatLng(25.046, 121.565);
        mMap.addMarker(new MarkerOptions().position(taipei).title("台北市").snippet("<h1>臺北市</h1>中正區中華路1段衡陽路口至中華路1段秀山街<br>中正區臺北車站周邊<br>中山區花博公園<br>信義區象山捷運站周邊地區(含捷運站體地下公共區域)"));

        LatLng yilan = new LatLng(24.678, 121.775);
        mMap.addMarker(new MarkerOptions().position(yilan).title("宜蘭縣").snippet("<h1>宜蘭縣</h1>宜蘭市運動公園<br>宜蘭市宜蘭河濱公園<br>宜蘭市宜蘭轉運站<br>宜蘭市中山公園<br>員山鄉員山公園<br>羅東運動公園<br>五結鄉永安宮周邊<br>頭城火車站旁地下道<br>頭城鎮烏石港周邊<br>礁溪鄉五峰旗風景區周邊<br>蘇澳鎮北濱公園周邊<br>蘇澳鎮豆腐岬風景區周邊<br>蘇澳鎮龍德工業區周邊<br>大同鄉清水地熱風景區周邊<br>冬山鄉分洪堰風景區周邊<br>柑仔坑土地公廟周邊"));

        LatLng taoyuan = new LatLng(24.984, 121.209);
        mMap.addMarker(new MarkerOptions().position(taoyuan).title("桃園市").snippet("<h1>桃園市</h1>桃園區民權路一帶<br>桃園區中正路附近<br>桃園區大有路一帶<br>桃園區民光東路一帶<br>桃園區永安北路一帶<br>桃園區中山路一帶<br>桃園區保羅街一帶<br>桃園區龍壽街一帶<br>中壢區長樂街84巷口<br>中壢區自強六路一帶<br>中壢區環中東路與榮安一街周邊<br>中壢區大同路與新生路周邊<br>中壢區復興路與中美路周邊<br>中壢區新生路與九和一街周邊<br>中壢區興仁路一段附近<br>中壢區永豐街附近<br>中壢區高鐵南路與過嶺路一段路口附近<br>八德區桃德路128巷周邊<br>八德區高城六街周邊<br>八德區浮筧街125巷周邊<br>八德區興豐路周邊<br>八德區羊稠仔附近產業道路周邊<br>楊梅區電台路附近<br>新屋區永安漁港附近<br>楊梅區富岡火車站附近<br>觀音區新華路二段產業道路一帶<br>大溪區河濱公園周邊<br>大溪區中正公園週邊<br>復興區角板山公園週邊<br>大溪區信義路(燈桿1010339號)附近<br>蘆竹區南昌路一帶<br>龜山區文化三路與復興三路口附近<br>龜山區大坑路二段一帶<br>龜山區萬壽路二段與華美街口附近<br>龜山區復興一路與文三二街口附近<br>龜山區文化二路文昌三街口附近<br>蘆竹區聯福街一帶<br>平鎮區中豐路山頂段、東豐路與山福路區段(平鎮區山福路-產業道路)"));

        LatLng hsinchu_s = new LatLng(24.790, 120.957);
        mMap.addMarker(new MarkerOptions().position(hsinchu_s).title("新竹市").snippet("<h1>新竹市</h1>北區南寮漁港及海天一線(看海區)<br>北區經國路二段路段<br>北區北大路、北門街口<br>北區湳雅街底路段<br>東區北大路、光華街口<br>東區公園路、八德路口<br>東區中央路、民生路口<br>東區千甲路路段<br>香山區牛埔北路路段<br>香山區建國公園周邊<br>香山區長興街路段"));

        LatLng hsinchu = new LatLng(24.708, 121.151);
        mMap.addMarker(new MarkerOptions().position(hsinchu).title("新竹縣").snippet("<h1>新竹縣</h1>竹北市仁義路周邊<br>新豐鄉坡頭漁港觀海步道<br>新埔鎮民生街新星國小周邊<br>竹東鎮河濱公園<br>竹東鎮東峰路446巷附近空屋<br>竹東鎮上坪里萊爾富商附近空屋<br>竹東鎮上坪里禾家園小吃店附近空屋<br>竹東鎮二重里學府路段<br>寶山鄉雙林路一段沿線(郊區)<br>寶山鄉峰城路沿線(郊區)<br>新埔鎮文德路1、2段<br>關西鎮關西圖書館周邊<br>關西鎮東光國小周邊<br>關西鎮東安國小周邊<br>關西鎮上林里竹21縣路段<br>"));

        LatLng miaoli = new LatLng(24.562, 120.812);
        mMap.addMarker(new MarkerOptions().position(miaoli).title("苗栗縣").snippet("<h1>苗栗縣</h1>苗栗市高苗里中正路與光復路口週邊<br>苗栗市苗栗火車站週邊<br>公館鄉館南村仁愛路週邊<br>公館鄉公館交流道<br>銅鑼鄉中平村中興一街週邊<br>三義鄉勝興村勝興車站週邊<br>三義鄉鯉魚潭村台13線週邊<br>大湖鄉義和村志成橋河堤道<br>卓蘭鎮台三線145K處觀景台<br>獅潭鄉台三線114.5公里處<br>泰安鄉大安道路3公里處（象鼻吊橋）<br>竹南鎮龍鳳里龍鳳漁港<br>竹南鎮新南里竹南運動公園<br>竹南鎮海口里長青之森<br>後龍鎮中龍里後龍火車站<br>後龍鎮溪洲里仁德醫校<br>後龍鎮中和里好望角<br>後龍鎮龍坑里遊桐花汽車旅館<br>後龍鎮海埔里外埔漁港<br>通霄鎮五南里中山路三段周邊<br>通霄鎮通西里火車站週邊<br>苑裡鎮苑北里中山路週邊<br>苑裡鎮苑北里火車站週邊<br>頭份市中正路地區檳榔攤<br>頭份市銀河路地區酒店、KTV<br>頭份市中正路上公園<br>頭份市中正路下公園<br>頭份市後庄地區酒店、KTV、汽車旅館<br>頭份市中華路地區檳榔攤<br>頭份市中華路交流道附近檳榔攤<br>頭份市自強路、和平路口<br>頭份市尚順廣場"));

        LatLng changhua = new LatLng(23.988, 120.464);
        mMap.addMarker(new MarkerOptions().position(changhua).title("彰化縣").snippet("<h1>彰化縣</h1>彰化市崙平南路(近中央路)<br>彰化市彰馬路(近彰鹿路)<br>彰化市泰安二街金馬公園<br>彰化市139線道<br>芬園鄉彰南路四段<br>花壇鄉花壇火車站周邊<br>花壇鄉平和街<br>員林市民權街、光復路一帶(火車站周邊)<br>員林市中山路、惠來街一帶(遊藝場及KTV周邊)<br>員林市山腳路、員南路沿山區一帶(員林運動公園)<br>永靖鄉光雲巷、長壽巷(鄉立第一公墓周邊)<br>永靖鄉中山路、福德巷一帶(苗種園區一帶)<br>大村鄉福進路、過溝三巷(釣蝦場及遊藝場一帶)<br>鹿港鎮鹿東路(麗景汽車旅館)<br>福興鄉橋和街(紅樓汽車旅館)<br>秀水鄉彰鹿路(彩虹森林汽車旅館)<br>北斗鎮斗中路與北斗工業區周邊<br>和美鎮和頭路德美公園周邊<br>溪湖鎮彰水路彰水路二段762號（溪湖糖廠）<br>社頭鄉廣興村14鄰中山路1段<br>二水鄉鄉南通路2段<br>二林鎮二林國小周邊<br>二林鎮中正國小周邊<br>二林鎮新生路旁產業道路周邊"));

        LatLng nantou = new LatLng(23.878, 120.931);
        mMap.addMarker(new MarkerOptions().position(nantou).title("南投縣").snippet("<h1>南投縣</h1>南投市南投市彰南路段<br>南投市南投市南崗路段<br>草屯鎮日新街佳?汽車旅館周邊<br>草屯鎮富功國小周邊<br>草屯鎮敦和國小周邊<br>草屯鎮草屯國小周邊<br>南投市中華路營盤路地下涵洞<br>南投市省府路國光客運公司周邊<br>南投市環山路中興會堂周邊<br>南投市新興路德興國小周邊<br>埔里鎮仁愛公園周邊<br>埔里鎮宏仁國中周邊(中華路)<br>竹山鎮大禮路路段<br>竹山鎮育英路路段<br>魚池鄉共和村共和國小周邊<br>魚池鄉魚池國中周邊<br>水里鄉永興國小旁空地<br>集集鎮集集國中周邊<br>仁愛鄉廬山國小周邊地帶<br>仁愛鄉中正國小周邊地帶<br>仁愛鄉平靜國小周邊地帶<br>仁愛鄉仁愛高農周邊地帶<br>仁愛鄉仁愛國中周邊地帶<br>仁愛鄉親愛部落周邊地帶<br>信義鄉明德村新開巷"));

        LatLng yunlin = new LatLng(23.712, 120.438);
        mMap.addMarker(new MarkerOptions().position(yunlin).title("雲林縣").snippet("<h1>雲林縣</h1>斗六市明德路橋下附近<br>斗六市後斗六火車站旁停車場<br>林內鄉重興村進興路產業道路附近<br>斗六市雲林科技大學操場旁廁所<br>斗六市龍潭路附近<br>斗六市八德里北祥街<br>斗六市成大醫院停車場附近<br>林內鄉林內火車站廁所附近<br>斗六市福興路附近<br>斗六市江厝路產業道路附近<br>斗六市人文公園廁所附近<br>斗南田徑場(大同路)<br>古坑鄉西平村西平路夜市區域<br>斗南鎮將軍里他里霧埤<br>古坑鄉東和村文化路東和夜市<br>特殊教育學校後門產業道路<br>虎尾鎮林森路段<br>虎尾鎮忠孝路段<br>虎尾鎮同心公園堤防邊<br>虎尾鎮復興路段<br>二崙鄉田尾村犛份路段<br>西螺鎮國光客運西螺轉運站<br>西螺鎮詔安里詔安路段<br>北港鎮女兒橋附近防汛道路<br>水林鄉灣東村碧清寺附近<br>口湖鄉崙東村中山路統一超商附近<br>臺西鄉光華村產業道路旁<br>四湖鄉湖寮村公廟旁"));

        LatLng chiayi = new LatLng(23.433, 120.250);
        mMap.addMarker(new MarkerOptions().position(chiayi).title("嘉義縣").snippet("<h1>嘉義縣</h1>中埔鄉和興村赤蘭溪西側堤防<br>中埔鄉和美村八掌溪堤防<br>中埔鄉裕民村「大有國小」產業道路<br>中埔鄉裕民村「成輝砂石場」產業道路<br>中埔鄉社口村「吳鳳廟」前<br>仁義潭水庫環潭道路<br>番路鄉民和村半天岩「紫雲寺」公園區<br>番路鄉觸口村天長地久<br>太保市春珠里4鄰附近<br>太保市太保里2鄰附近<br>太保市高鐵十路與高鐵東路附近<br>太保市安仁里9鄰頂港子墘附近<br>太保市太保一路周遭<br>太保市後潭里15鄰附近<br>太保市後潭里8鄰附近<br>太保市東勢里8鄰附近<br>鹿草鄉統一超商前<br>鹿草鄉西井村往施家村產業道路<br>太保市南新里中山路1段228巷(財經花園)周邊<br>太保市麻寮里麻太路與三合路口周邊建築物<br>水上鄉南鄉村土地公廟旁產業道路<br>水上鄉忠和村中庄營區對面巷子內<br>太保市新埤國小周邊<br>義竹鄉、布袋鎮八掌溪堤防道路附近<br>民雄鄉豐收村中正大學周邊<br>民雄鄉民雄工業區周遭<br>民雄鄉建國路一段麥當勞附近<br>溪口鄉溪口大橋附近<br>大林鎮信義街附近<br>朴子市168線東石高中段<br>朴子市長庚醫院<br>朴子市新庄里堤防道路<br>六腳鄉豐美段<br>六腳鄉崩山段<br>東石鄉永屯段<br>東石鄉三家段<br>東石鄉蔦松段<br>竹崎鄉白杞村3鄰<br>竹崎鄉紫雲村12鄰"));

        LatLng chiayi_s = new LatLng(23.479, 120.449);
        mMap.addMarker(new MarkerOptions().position(chiayi_s).title("嘉義市").snippet("<h1>嘉義市</h1>西區僑平國小周邊<br>西區志航國小周邊<br>文化公園及週遭路段<br>吳鳳南路與軍輝路口附近路段"));

        LatLng tainan = new LatLng(22.990, 120.161);
        mMap.addMarker(new MarkerOptions().position(tainan).title("台南市").snippet("<h1>臺南市</h1>新營區天鵝湖公園<br>白河區詔安里20號至30號<br>麻豆區興南路13號至35號<br>西港區南海里慶安路229號至竹林里183號〈南173線〉<br>將軍區將富里將富48號至92號<br>新市區富強路2號至20號<br>新化區中山路60號至80號<br>仁德區行大一街沿線<br>仁德區文華路3段沿線<br>歸仁區復興路沿線<br>玉井區忠孝街418巷<br>楠西區鹿田里油車70號至80號<br>永康區東橋一路(東橋里地下道)<br>永康區中正南路300號至600號<br>永康區興國街(永康公園週邊)<br>永康區柴頭港溪河堤便道(近聖功女中)<br>東區崇明路391號至1052號<br>東區中華東路1段2號至366號<br>中西區中山路68號至188號<br>臺南式中西區青年路與北門路口<br>安南區安中路一段700巷(鳳凰里公園)<br>安平區林默娘公園<br>安平區中華西路二段549號至569號<br>安平區永華路二段236號至256號<br>北區西門路4段430巷至507巷<br>北區公園北路108號至156號<br>北區西門路4段40號至70號<br>南區西門路一段689巷2號至100號<br>南區體育路25巷16弄1號至50號<br>南區金華路一段400號至500號<br>南區灣裡路50號至100號"));

        LatLng kaohsiung = new LatLng(22.624, 120.317);
        mMap.addMarker(new MarkerOptions().position(kaohsiung).title("高雄市").snippet("<h1>高雄市</h1>大樹區竹寮路<br>新興區民享街<br>鳳山區自治街35巷<br>鼓山區明倫文信路口<br>鳥松區水管路6巷口弄<br>前金區瑞源路<br>三民區河北二路<br>小港區松信路與松富路<br>前鎮區草衙路南二巷<br>楠梓區捷運油廠國小一號出口<br>橋頭區新八路、經武路<br>楠梓區瑞屏路30巷<br>楠梓區加昌路<br>苓雅雅區中正一路、輔仁路公車站前<br>新興區六合二路<br>鼓山區美術館週邊"));

        LatLng pingtung = new LatLng(22.503, 120.688);
        mMap.addMarker(new MarkerOptions().position(pingtung).title("屏東縣").snippet("<h1>屏東縣</h1>屏東市永安里棒球路<br>屏東市崇勇街<br>屏東市大同北路<br>屏東市建國路<br>屏東市大豐路與大武路口工地<br>萬丹鄉崙頂村萬大橋往河堤南路引道處附近<br>長治鄉中興路<br>屏東市仁愛路<br>屏東市大連路<br>屏東市開封街<br>九如鄉九明村九龍路九龍路與九明街口<br>九如鄉九如路2段<br>潮州鎮三星里三林路<br>潮州鎮三共里文化路衛生所旁<br>潮州鎮光華里華興路段<br>新埤鄉餉潭村龍潭路<br>潮州鎮同榮里育英路"));

        LatLng taitung = new LatLng(22.756, 121.112);
        mMap.addMarker(new MarkerOptions().position(taitung).title("台東縣").snippet("<h1>臺東縣</h1>關山鎮水源路臨近自行步道路段<br>池上鄉福文村臨近池上公墓路段<br>延平鄉明野路臨近武陵活動中心路段<br>臺東市中華路一段572號(好樂迪)周邊<br>臺東市中華路一段284號(98.9PUB)周邊<br>臺東市中華路一段50號(正一汽車旅館)周邊<br>長濱鄉長光社區<br>長濱鄉長濱社區<br>大武鄉大鳥村海濱公園<br>太麻里鄉溪頭媽祖廟前"));

        LatLng hualien = new LatLng(23.958, 121.563);
        mMap.addMarker(new MarkerOptions().position(hualien).title("花蓮縣").snippet("<h1>花蓮縣</h1>花蓮火車站周邊旅宿業<br>花蓮火車站周邊KTV<br>花蓮市國聯五路<br>吉安鄉舊村二街<br>吉安鄉自強路與國富二街口往南<br>吉安鄉南華村花蓮監獄附近<br>新城鄉新城村仁愛路<br>新城鄉嘉新村嘉南路<br>光復鄉林森路光復高職週邊<br>萬榮鄉明利村1鄰週邊<br>光復鄉富田三街周邊<br>鳳林鎮林榮路周邊<br>瑞穗鄉瑞美村中興路周邊<br>萬榮鄉紅葉村紅葉周邊<br>光復鄉北富村光豐路周邊<br>玉里鎮忠智路周邊"));

        LatLng penghu = new LatLng(23.521, 119.591);
        mMap.addMarker(new MarkerOptions().position(penghu).title("澎湖縣").snippet("<h1>澎湖縣</h1>湖西鄉龍門東廟海堤公廁<br>澎湖水產職校實習工廠周邊<br>馬公市第三漁港漁具倉庫周邊<br>馬公市文化園區周邊"));

        LatLng kinmen = new LatLng(24.447, 118.378);
        mMap.addMarker(new MarkerOptions().position(kinmen).title("金門縣").snippet("<h1>金門縣</h1>"));

        LatLng lienchiang = new LatLng(26.224, 119.993);
        mMap.addMarker(new MarkerOptions().position(lienchiang).title("連江縣").snippet("<h1>連江縣</h1>"));

        LatLng taichung = new LatLng(24.179, 120.631);
        mMap.addMarker(new MarkerOptions().position(taichung).title("台中市").snippet("<h1>臺中市<h1>中區建國路周邊<br>北區雙十路二段周邊<br>東、南區復興路段<br>南屯區文心森林公園周邊<br>北屯區北屯市場周邊<br>西屯區西屯路二段<br>豐原區葫蘆墩公園周邊<br>烏日區高鐵停車場周邊<br>大里區大明、永隆路段週邊<br>大甲區經國路、北堤東路口周遭<br>太平區育才路與育英街口<br>清水區高美路段<br>石岡區石岡國中周邊"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(taichung,8));
    }
}