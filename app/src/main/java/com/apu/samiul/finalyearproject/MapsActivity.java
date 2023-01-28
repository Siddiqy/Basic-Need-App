package com.apu.samiul.finalyearproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    //Food Location
    private static final LatLng Thai_Signatures_Restaurant = new LatLng(23.754869, 90.376041);
    private static final LatLng Soul_Times = new LatLng(23.754708, 90.376106);
    private static final LatLng Riz_Biz_Cafe = new LatLng(23.755101, 90.375824);
    private static final LatLng Chilis = new LatLng(23.752122, 90.377482);
    private static final LatLng Santoor_Restaurant = new LatLng(23.751913, 90.377567);
    private static final LatLng UniCafe_Restaurant_Fun = new LatLng(23.752790, 90.381074);
    private static final LatLng KPR_Restaurant_Cafe = new LatLng(23.752690, 90.381198);
    private static final LatLng Pinewood_Cafe_N_Restaurant = new LatLng(23.752293, 90.375512);
    private static final LatLng Fu_Wang_Shwarma= new LatLng(23.755746, 90.375429);
    private static final LatLng Hakka_Kitchen = new LatLng(23.755639, 90.375528);
    private static final LatLng Joyita_Food_Court = new LatLng(23.756003, 90.375093);
    private static final LatLng The_Dynamic_Food_Court_Ltd = new LatLng(23.750339, 90.377556);
    private static final LatLng Sausly_s_Foods = new LatLng(23.752894, 90.382189);
    private static final LatLng Cafe_D_Fast_Food = new LatLng(23.753076, 90.382256);
    private static final LatLng Nahar_Fast_Food = new LatLng(23.751365, 90.386070);
    private static final LatLng Araaz_Restaurant_Banquet = new LatLng(23.756201, 90.375073);

    //Clothing Location
    private static final LatLng Plaza_A_R = new LatLng(23.754757, 90.375783);
    private static final LatLng Rapa_Plaza = new LatLng(23.756062, 90.375255);
    private static final LatLng Orchid_Plaza = new LatLng(23.755658, 90.375410);
    private static final LatLng Metro_Shopping_Mall = new LatLng(23.752411, 90.377323);
    private static final LatLng Sunrise_Plaza = new LatLng(23.757181, 90.374520);
    private static final LatLng Nogordola= new LatLng(23.753246, 90.376816);
    private static final LatLng Al_Amin_Fashion = new LatLng(23.754319, 90.376372);

    //Hotel Location
    private static final LatLng Hotel_Indropuri_International = new LatLng(23.758241, 90.389264);
    private static final LatLng NAAS_Service_Apartment = new LatLng(23.749798, 90.386222);
    private static final LatLng SEL_NIBASH = new LatLng(23.745912, 90.385450);
    private static final LatLng Hotel_Shuktara_Pvt_Ltd = new LatLng(23.758073, 90.387859);
    private static final LatLng Marry_Guest_House = new LatLng(23.762214, 90.371538);
    private static final LatLng Hotel_Olio_Dream_Heaven = new LatLng(23.752425, 90.380187);

    //Education Location
    private static final LatLng Daffodil_International_University = new LatLng(23.754923, 90.376368);
    private static final LatLng Saifurs_Lalmatia_Branch = new LatLng(23.757497, 90.374181);
    private static final LatLng CSL_Training = new LatLng(23.757298, 90.374372);
    private static final LatLng Total_Student_Care_Bangladesh = new LatLng(23.756441, 90.374685);
    private static final LatLng Dhanmondi_Government_Boys_High_School = new LatLng(23.757728, 90.375226);
    private static final LatLng Bangladesh_Institute_of_Management = new LatLng(23.757024, 90.375528);
    private static final LatLng Asian_Institute_of_Business_and_Technology = new LatLng(23.754364, 90.374635);
    private static final LatLng Macadam_Driving_School = new LatLng(23.754264, 90.374883);
    private static final LatLng Daffodil_International_School = new LatLng(23.753960, 90.374970);
    private static final LatLng Mastermind_School = new LatLng(23.752276, 90.376511);
    private static final LatLng Daffodil_Polytechnic_Institute = new LatLng(23.753036, 90.376974);
    private static final LatLng Bangladesh_Skill_Development_Institute = new LatLng(23.753097, 90.376930);
    private static final LatLng Daffodil_International_University_Library = new LatLng(23.753005, 90.377484);
    private static final LatLng New_Model_Degree_College = new LatLng(23.751966, 90.378321);
    private static final LatLng New_Model_Bohumukhi_High_School = new LatLng(23.751881, 90.378499);


    //Medical Location
    private static final LatLng Bangladesh_ENT_Hospital = new LatLng(23.755485, 90.376147);
    private static final LatLng Esperto_Health_Care_Limited = new LatLng(23.755790, 90.374629);
    private static final LatLng Reflect_Medical_Centre = new LatLng(23.756000, 90.375097);
    private static final LatLng Farabi_General_Hospital = new LatLng(23.754340, 90.374995);
    private static final LatLng Square_Hospitals_Limited = new LatLng(23.752928, 90.381673);
    private static final LatLng Essence_Homoeopathy_Medical_Center = new LatLng(23.754872, 90.377196);


    //Bus Stop
    private static final LatLng Shukrabad_Bus_Stop = new LatLng(23.752477, 90.377715);
    private static final LatLng Asad_Gate_Bus_Stand = new LatLng(23.759782, 90.373389);
    private static final LatLng Manik_Mian_Avenue_West_Bus_Stop = new LatLng(23.758508, 90.375641);
    private static final LatLng Dhanmondi_27_No_Bus_Stop = new LatLng(23.756205, 90.375574);
    private static final LatLng Dhanmondi_32_Bus_Stop= new LatLng(23.748994, 90.379398);
    private static final LatLng Kalabagan_West_Bus_Stop= new LatLng(23.756205, 90.375574);

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

        Intent intent = this.getIntent();

        if(intent !=null)
        {
            String data = intent.getExtras().getString("id");

            //Condition for Food Location
            if(data.equals("From_Activity_Food")) {

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_food))
                        .anchor(0.0f,  0.0f)
                        .title("Chilis")
                        .position(Chilis));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Chilis));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Chilis, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_food))
                        .anchor(0.0f,  0.0f)
                        .title("Santoor Restaurant")
                        .position(Santoor_Restaurant));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Santoor_Restaurant));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Santoor_Restaurant, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_food))
                        .anchor(0.0f,  0.0f)
                        .title("Thai Signatures Restaurant @Dhanmondi")
                        .position(Thai_Signatures_Restaurant));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Thai_Signatures_Restaurant));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Thai_Signatures_Restaurant, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_food))
                        .anchor(0.0f,  0.0f)
                        .title("UniCafe Restaurant & Fun")
                        .position(UniCafe_Restaurant_Fun));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(UniCafe_Restaurant_Fun));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(UniCafe_Restaurant_Fun, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_food))
                        .anchor(0.0f,  0.0f)
                        .title("KPR Restaurant & Cafe")
                        .position(KPR_Restaurant_Cafe));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(KPR_Restaurant_Cafe));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(KPR_Restaurant_Cafe, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_food))
                        .anchor(0.0f,  0.0f)
                        .title("Pinewood Cafe N' Restaurant")
                        .position(Pinewood_Cafe_N_Restaurant));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Pinewood_Cafe_N_Restaurant));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Pinewood_Cafe_N_Restaurant, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_food))
                        .anchor(0.0f,  0.0f)
                        .title("Fu-Wang Shwarma")
                        .position(Fu_Wang_Shwarma));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Fu_Wang_Shwarma));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Fu_Wang_Shwarma, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_food))
                        .anchor(0.0f,  0.0f)
                        .title("Hakka Kitchen")
                        .position(Hakka_Kitchen));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Hakka_Kitchen));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Hakka_Kitchen, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_food))
                        .anchor(0.0f,  0.0f)
                        .title("Joyita Food Court")
                        .position(Joyita_Food_Court));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Joyita_Food_Court));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Joyita_Food_Court, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_food))
                        .anchor(0.0f,  0.0f)
                        .title("The Dynamic Food Court Ltd")
                        .position(The_Dynamic_Food_Court_Ltd));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(The_Dynamic_Food_Court_Ltd));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(The_Dynamic_Food_Court_Ltd, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_food))
                        .anchor(0.0f,  0.0f)
                        .title("Sausly's Foods")
                        .position(Sausly_s_Foods));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Sausly_s_Foods));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Sausly_s_Foods, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_food))
                        .anchor(0.0f,  0.0f)
                        .title("Cafe D & Fast Food")
                        .position(Cafe_D_Fast_Food));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Cafe_D_Fast_Food));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Cafe_D_Fast_Food, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_food))
                        .anchor(0.0f,  0.0f)
                        .title("Nahar Fast Food")
                        .position(Nahar_Fast_Food));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Nahar_Fast_Food));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Nahar_Fast_Food, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_food))
                        .anchor(0.0f,  0.0f)
                        .title("Soul Times")
                        .position(Soul_Times));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Soul_Times));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Soul_Times, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_food))
                        .anchor(0.0f,  0.0f)
                        .title("Riz Biz Cafe")
                        .position(Riz_Biz_Cafe));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Riz_Biz_Cafe));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Riz_Biz_Cafe, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_food))
                        .anchor(0.0f,  0.0f)
                        .title("Araaz Restaurant & Banquet")
                        .position(Araaz_Restaurant_Banquet));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Araaz_Restaurant_Banquet));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Araaz_Restaurant_Banquet, 18.0f));

            }

            //Condition for Clothing Location
            if(data.equals("From_Activity_Clothing")) {

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Orchid_Plaza));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Orchid_Plaza, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_clothing))
                        .anchor(0.0f,  0.0f)
                        .title("Plaza A.R.")
                        .position(Plaza_A_R));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Plaza_A_R));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Plaza_A_R, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_clothing))
                        .anchor(0.0f,  0.0f)
                        .title("Rapa Plaza")
                        .position(Rapa_Plaza));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Rapa_Plaza));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Rapa_Plaza, 18.0f));


                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_clothing))
                        .anchor(0.0f,  0.0f)
                        .title("Orchid Plaza")
                        .position(Orchid_Plaza));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Orchid_Plaza));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Orchid_Plaza, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_clothing))
                        .anchor(0.0f,  0.0f)
                        .title("Metro Shopping Mall")
                        .position(Metro_Shopping_Mall));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Metro_Shopping_Mall));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Metro_Shopping_Mall, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_clothing))
                        .anchor(0.0f,  0.0f)
                        .title("Sunrise Plaza")
                        .position(Sunrise_Plaza));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Sunrise_Plaza));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Sunrise_Plaza, 18.0f));


                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_clothing))
                        .anchor(0.0f,  0.0f)
                        .title("Nogordola")
                        .position(Nogordola));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Nogordola));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Nogordola, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_clothing))
                        .anchor(0.0f,  0.0f)
                        .title("Al-Amin Fashion")
                        .position(Al_Amin_Fashion));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Al_Amin_Fashion));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Al_Amin_Fashion, 18.0f));


            }

            //Condition for Hotel Location
            if(data.equals("From_Activity_Hotel")) {

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_hotel))
                        .anchor(0.0f,  0.0f)
                        .title("NAAS Service Apartment")
                        .position(NAAS_Service_Apartment));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(NAAS_Service_Apartment));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(NAAS_Service_Apartment, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_hotel))
                        .anchor(0.0f,  0.0f)
                        .title("SEL NIBASH")
                        .position(SEL_NIBASH));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(SEL_NIBASH));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(SEL_NIBASH, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_hotel))
                        .anchor(0.0f,  0.0f)
                        .title("Hotel Indropuri International")
                        .position(Hotel_Indropuri_International));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Hotel_Indropuri_International));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Hotel_Indropuri_International, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_hotel))
                        .anchor(0.0f,  0.0f)
                        .title("Hotel Shuktara Pvt. Ltd.")
                        .position(Hotel_Shuktara_Pvt_Ltd));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Hotel_Shuktara_Pvt_Ltd));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Hotel_Shuktara_Pvt_Ltd, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_hotel))
                        .anchor(0.0f,  0.0f)
                        .title("Marry Guest House")
                        .position(Marry_Guest_House));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Marry_Guest_House));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Marry_Guest_House, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_hotel))
                        .anchor(0.0f,  0.0f)
                        .title("Hotel Olio Dream Heaven")
                        .position(Hotel_Olio_Dream_Heaven));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Hotel_Olio_Dream_Heaven));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Hotel_Olio_Dream_Heaven, 18.0f));

            }

            //Conditon for Education Location
            if(data.equals("From_Activity_Education")) {

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_education))
                        .anchor(0.0f,  0.0f)
                        .title("Daffodil International University")
                        .position(Daffodil_International_University));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Daffodil_International_University));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Daffodil_International_University, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_education))
                        .anchor(0.0f,  0.0f)
                        .title("Saifur's Lalmatia Branch")
                        .position(Saifurs_Lalmatia_Branch));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Saifurs_Lalmatia_Branch));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Saifurs_Lalmatia_Branch, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_education))
                        .anchor(0.0f,  0.0f)
                        .title("CSL Training (Lalmatia Branch)")
                        .position(CSL_Training));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(CSL_Training));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(CSL_Training, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_education))
                        .anchor(0.0f,  0.0f)
                        .title("Total Student Care (TSC) Bangladesh")
                        .position(Total_Student_Care_Bangladesh));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Total_Student_Care_Bangladesh));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Total_Student_Care_Bangladesh, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_education))
                        .anchor(0.0f,  0.0f)
                        .title("Dhanmondi Government Boys' High School")
                        .position(Dhanmondi_Government_Boys_High_School));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Dhanmondi_Government_Boys_High_School));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Dhanmondi_Government_Boys_High_School, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_education))
                        .anchor(0.0f,  0.0f)
                        .title("Bangladesh Institute of Management (BIM)")
                        .position(Bangladesh_Institute_of_Management));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Bangladesh_Institute_of_Management));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Bangladesh_Institute_of_Management, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_education))
                        .anchor(0.0f,  0.0f)
                        .title("Asian Institute of Business and Technology (AIBT)")
                        .position(Asian_Institute_of_Business_and_Technology));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Asian_Institute_of_Business_and_Technology));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Asian_Institute_of_Business_and_Technology, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_education))
                        .anchor(0.0f,  0.0f)
                        .title("Macadam Driving School")
                        .position(Macadam_Driving_School));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Macadam_Driving_School));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Macadam_Driving_School, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_education))
                        .anchor(0.0f,  0.0f)
                        .title("Daffodil International School")
                        .position(Daffodil_International_School));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Daffodil_International_School));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Daffodil_International_School, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_education))
                        .anchor(0.0f,  0.0f)
                        .title("Mastermind School")
                        .position(Mastermind_School));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Mastermind_School));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Mastermind_School, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_education))
                        .anchor(0.0f,  0.0f)
                        .title("Daffodil Polytechnic Institute Main Campus")
                        .position(Daffodil_Polytechnic_Institute));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Daffodil_Polytechnic_Institute));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Daffodil_Polytechnic_Institute, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_education))
                        .anchor(0.0f,  0.0f)
                        .title("Bangladesh Skill Development Institute")
                        .position(Bangladesh_Skill_Development_Institute));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Bangladesh_Skill_Development_Institute));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Bangladesh_Skill_Development_Institute, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_education))
                        .anchor(0.0f,  0.0f)
                        .title("Daffodil International University Library")
                        .position(Daffodil_International_University_Library));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Daffodil_International_University_Library));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Daffodil_International_University_Library, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_education))
                        .anchor(0.0f,  0.0f)
                        .title("New Model Degree College")
                        .position(New_Model_Degree_College));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(New_Model_Degree_College));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(New_Model_Degree_College, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_education))
                        .anchor(0.0f,  0.0f)
                        .title("New Model Bohumukhi High School")
                        .position(New_Model_Bohumukhi_High_School));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(New_Model_Bohumukhi_High_School));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(New_Model_Bohumukhi_High_School, 18.0f));

            }

            //Condition for Medical Location
            if(data.equals("From_Activity_Medical")) {

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_medical))
                        .anchor(0.0f,  0.0f)
                        .title("Reflect Medical Centre")
                        .position(Reflect_Medical_Centre));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Reflect_Medical_Centre));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Reflect_Medical_Centre, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_medical))
                        .anchor(0.0f,  0.0f)
                        .title("Bangladesh ENT Hospital")
                        .position(Bangladesh_ENT_Hospital));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Bangladesh_ENT_Hospital));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Bangladesh_ENT_Hospital, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_medical))
                        .anchor(0.0f,  0.0f)
                        .title("Esperto Health Care Limited")
                        .position(Esperto_Health_Care_Limited));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Esperto_Health_Care_Limited));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Esperto_Health_Care_Limited, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_medical))
                        .anchor(0.0f,  0.0f)
                        .title("Essence Homoeopathy Medical Center")
                        .position(Essence_Homoeopathy_Medical_Center));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Essence_Homoeopathy_Medical_Center));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Essence_Homoeopathy_Medical_Center, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_medical))
                        .anchor(0.0f,  0.0f)
                        .title("Square Hospitals Limited")
                        .position(Square_Hospitals_Limited));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Square_Hospitals_Limited));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Square_Hospitals_Limited, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_medical))
                        .anchor(0.0f,  0.0f)
                        .title("Farabi General Hospital")
                        .position(Farabi_General_Hospital));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Farabi_General_Hospital));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Farabi_General_Hospital, 18.0f));

            }

            //Condition for Bus Stop Location
            if(data.equals("From_Activity_Bustop")) {

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_bustop))
                        .anchor(0.0f,  0.0f)
                        .title("Shukrabad Bus Stop")
                        .position(Shukrabad_Bus_Stop));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Shukrabad_Bus_Stop));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Shukrabad_Bus_Stop, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_bustop))
                        .anchor(0.0f,  0.0f)
                        .title("Asad Gate Bus Stand")
                        .position(Asad_Gate_Bus_Stand));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Asad_Gate_Bus_Stand));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Asad_Gate_Bus_Stand, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_bustop))
                        .anchor(0.0f,  0.0f)
                        .title("Manik Mian Avenue West Bus Stop")
                        .position(Manik_Mian_Avenue_West_Bus_Stop));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Manik_Mian_Avenue_West_Bus_Stop));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Manik_Mian_Avenue_West_Bus_Stop, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_bustop))
                        .anchor(0.0f,  0.0f)
                        .title("Dhanmondi 27 No Bus Stop")
                        .position(Dhanmondi_27_No_Bus_Stop));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Dhanmondi_27_No_Bus_Stop));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Dhanmondi_27_No_Bus_Stop, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_bustop))
                        .anchor(0.0f,  0.0f)
                        .title("Dhanmondi 32 Bus Stop")
                        .position(Dhanmondi_32_Bus_Stop));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Dhanmondi_32_Bus_Stop));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Dhanmondi_32_Bus_Stop, 18.0f));

                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_bustop))
                        .anchor(0.0f,  0.0f)
                        .title("Kalabagan West Bus Stop")
                        .position(Kalabagan_West_Bus_Stop));

                mMap.moveCamera(CameraUpdateFactory.newLatLng(Kalabagan_West_Bus_Stop));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Kalabagan_West_Bus_Stop, 18.0f));

            }
        }
        else {

        }

    }
}
