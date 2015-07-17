package fr.teiki.ibs;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.Toast;



/**
 * Visualizes distance from beacon to the device.
 *
 * @author wiktor@estimote.com (Wiktor Gworek)
 */
public class DistanceBeaconActivity extends ActionBarActivity {

//    private static final String TAG = DistanceBeaconActivity.class.getSimpleName();
//
//    // Y positions are relative to height of bg_distance image.
//    private static final double RELATIVE_START_POS = 320.0 / 1110.0;
//    private static final double RELATIVE_STOP_POS = 885.0 / 1110.0;
//
//    private BeaconManager beaconManager;
//    private Beacon beacon;
//    private Region region;
//    private String action;
//    private String sound_mode;
//
//    private View dotView;
//    private int startY = -1;
//    private int segmentLength = -1;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        setContentView(R.layout.distance_view);
//        dotView = findViewById(R.id.dot);
//
//        beacon = getIntent().getParcelableExtra(BeaconSettingsActivity.KEY_IBEACON);
//        action = getIntent().getStringExtra(BeaconSettingsActivity.ACTION_NAME);
//        sound_mode = getIntent().getStringExtra(BeaconSettingsActivity.KEY_SOUND_MODE);
//
//        region = new Region("regionid", beacon.getProximityUUID(), beacon.getMajor(), beacon.getMinor());
//        if (beacon == null) {
//            Toast.makeText(this, "Beacon not found in intent extras", Toast.LENGTH_LONG).show();
//            finish();
//        }
//
//        beaconManager = new BeaconManager(this);
//        beaconManager.setRangingListener(new BeaconManager.RangingListener() {
//            @Override
//            public void onBeaconsDiscovered(Region region, final List<Beacon> rangedBeacons) {
//                // Note that results are not delivered on UI thread.
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        // Just in case if there are multiple beacons with the same uuid, major, minor.
//                        Beacon foundBeacon = null;
//                        for (Beacon rangedBeacon : rangedBeacons) {
//                            if (rangedBeacon.getMacAddress().equals(beacon.getMacAddress())) {
//                                foundBeacon = rangedBeacon;
//                            }
//                        }
//                        if (foundBeacon != null) {
//                            updateDistanceView(foundBeacon);
//                        }
//                    }
//                });
//            }
//        });
//
//        final View view = findViewById(R.id.sonar);
//        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
//            @Override
//            public void onGlobalLayout() {
//                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
//
//                startY = (int) (RELATIVE_START_POS * view.getMeasuredHeight());
//                int stopY = (int) (RELATIVE_STOP_POS * view.getMeasuredHeight());
//                segmentLength = stopY - startY;
//
//                dotView.setVisibility(View.VISIBLE);
//                dotView.setTranslationY(computeDotPosY(beacon));
//            }
//        });
//
//        final ImageView target = (ImageView) findViewById(R.id.target);
//
//
////        view.setOnTouchListener(new View.OnTouchListener() {
////            public boolean onTouch(View v, MotionEvent event) {
////                if (event.getAction() == MotionEvent.ACTION_DOWN){
////                    //int x = (int) event.getX();
////                    int y = (int) event.getY();
////                    target.setVisibility(View.VISIBLE);
////                    target.animate().translationY(y).start();
////
////                    float heightdiv3 = v.getHeight()/3;
////                    if (y < heightdiv3) {
////                        Toast.makeText(getApplicationContext(),BeaconSettingsActivity.REGIONS[0],Toast.LENGTH_SHORT).show();
////                        MyPreferenceManager.updateRegionAction(getApplicationContext(), beacon, action, BeaconSettingsActivity.REGIONS[0]);
////                    }
////                    else if (y < heightdiv3*2) {
////                        Toast.makeText(getApplicationContext(),BeaconSettingsActivity.REGIONS[1],Toast.LENGTH_SHORT).show();
////                        MyPreferenceManager.updateRegionAction(getApplicationContext(), beacon, action, BeaconSettingsActivity.REGIONS[1]);
////                    }
////                    else {
////                        Toast.makeText(getApplicationContext(),BeaconSettingsActivity.REGIONS[2],Toast.LENGTH_SHORT).show();
////                        MyPreferenceManager.updateRegionAction(getApplicationContext(), beacon, action, BeaconSettingsActivity.REGIONS[2]);
////                    }
////                }
////                return true;
////            }
////        });
//    }
//
//    private void updateDistanceView(Beacon foundBeacon) {
//        if (segmentLength == -1) {
//            return; //test
//        }
//
//        dotView.animate().translationY(computeDotPosY(foundBeacon)).start();
//    }
//
//    private int computeDotPosY(Beacon beacon) {
//        // Let's put dot at the end of the scale when it's further than 6m.
//        double distance = Math.min(Utils.computeAccuracy(beacon), 6.0);
//        return startY + (int) (segmentLength * (distance / 6.0));
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (item.getItemId() == android.R.id.home) {
//            finish();
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//
//        beaconManager.connect(new BeaconManager.ServiceReadyCallback() {
//            @Override
//            public void onServiceReady() {
//                try {
//                    beaconManager.startRanging(region);
//                } catch (RemoteException e) {
//                    Toast.makeText(DistanceBeaconActivity.this, "Cannot start ranging, something terrible happened",
//                            Toast.LENGTH_LONG).show();
//                    Log.e(TAG, "Cannot start ranging", e);
//                }
//            }
//        });
//    }
//
//    @Override
//    protected void onStop() {
//        beaconManager.disconnect();
//
//        super.onStop();
//    }
}