/*
 * Copyright (C) 2015 The CyanogenMod Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package org.cyanogenmod.internal.util;

import java.util.ArrayList;

public class QSConstants {
    private QSConstants() {}

    public static final String TILE_WIFI = "wifi";
    public static final String TILE_BLUETOOTH = "bt";
    public static final String TILE_INVERSION = "inversion";
    public static final String TILE_CELLULAR = "cell";
    public static final String TILE_AIRPLANE = "airplane";
    public static final String TILE_ROTATION = "rotation";
    public static final String TILE_FLASHLIGHT = "flashlight";
    public static final String TILE_LOCATION = "location";
    public static final String TILE_CAST = "cast";
    public static final String TILE_HOTSPOT = "hotspot";
    public static final String TILE_NOTIFICATIONS = "notifications";
    public static final String TILE_DATA = "data";
    public static final String TILE_ROAMING = "roaming";
    public static final String TILE_DDS = "dds";
    public static final String TILE_APN = "apn";
    public static final String TILE_PROFILES = "profiles";
    public static final String TILE_PERFORMANCE = "performance";
    public static final String TILE_ADB_NETWORK = "adb_network";
    public static final String TILE_NFC = "nfc";
    public static final String TILE_COMPASS = "compass";
    public static final String TILE_LOCKSCREEN = "lockscreen";
    public static final String TILE_LTE = "lte";
    public static final String TILE_VISUALIZER = "visualizer";
    public static final String TILE_VOLUME = "volume_panel";
    public static final String TILE_SCREEN_TIMEOUT = "screen_timeout";
    public static final String TILE_LIVE_DISPLAY = "live_display";
    public static final String TILE_USB_TETHER = "usb_tether";
    public static final String TILE_HEADS_UP = "heads_up";
    public static final String TILE_AMBIENT_DISPLAY = "ambient_display";
    public static final String TILE_SYNC = "sync";
    public static final String TILE_BATTERY_SAVER = "battery_saver";
    public static final String TILE_CAFFEINE = "caffeine";
    public static final String TILE_EDIT = "edit";
    public static final String TILE_DND = "dnd";
    public static final String TILE_BRIGHTNESS = "brightness";
    public static final String TILE_SCREEN_OFF = "screen_off";
    public static final String TILE_SCREENSHOT = "screenshot";
    public static final String TILE_EXPANDED_DESKTOP = "expanded_desktop";
    public static final String TILE_MUSIC = "music";
    public static final String TILE_REBOOT = "reboot";
    public static final String TILE_CONFIGURATIONS = "configurations";	 
    public static final String TILE_THEMES = "themes";			
    public static final String TILE_NAVBAR = "navbar";	
    public static final String TILE_HWKEYS = "hw_keys";	
    public static final String TILE_APP_PICKER = "app_picker";
    public static final String TILE_PIE = "pie";	
    public static final String TILE_RESTARTUI = "restartui";
    public static final String TILE_GESTUREANYWHERE = "gesture_anywhere";
    public static final String TILE_POWER = "power_menu";		
    public static final String TILE_APP_KILL = "kill_app";					
    public static final String TILE_APPCIRCLEBAR = "appcirclebar";				
    public static final String TILE_KERNEL= "kernel_adiutor";	
    public static final String TILE_SELINUX= "selinux";	
    public static final String TILE_SCREENRECORD= "screenrecord";	
    public static final String TILE_SOUND = "sound";
    public static final String DYNAMIC_TILE_NEXT_ALARM = "next_alarm";
    public static final String DYNAMIC_TILE_IME_SELECTOR = "ime_selector";
    public static final String DYNAMIC_TILE_SU = "su";
    public static final String DYNAMIC_TILE_ADB = "adb";

    protected static final ArrayList<String> STATIC_TILES_AVAILABLE = new ArrayList<String>();
    protected static final ArrayList<String> DYNAMIC_TILES_AVAILBLE = new ArrayList<String>();
    protected static final ArrayList<String> TILES_AVAILABLE = new ArrayList<String>();

    static {
        STATIC_TILES_AVAILABLE.add(TILE_WIFI);
        STATIC_TILES_AVAILABLE.add(TILE_BLUETOOTH);
        STATIC_TILES_AVAILABLE.add(TILE_CELLULAR);
        STATIC_TILES_AVAILABLE.add(TILE_AIRPLANE);
        STATIC_TILES_AVAILABLE.add(TILE_ROTATION);
        STATIC_TILES_AVAILABLE.add(TILE_FLASHLIGHT);
        STATIC_TILES_AVAILABLE.add(TILE_LOCATION);
        STATIC_TILES_AVAILABLE.add(TILE_EDIT);
        STATIC_TILES_AVAILABLE.add(TILE_CAST);
        STATIC_TILES_AVAILABLE.add(TILE_HOTSPOT);
        STATIC_TILES_AVAILABLE.add(TILE_INVERSION);
        STATIC_TILES_AVAILABLE.add(TILE_DND);
//        STATIC_TILES_AVAILABLE.add(TILE_NOTIFICATIONS);
//        STATIC_TILES_AVAILABLE.add(TILE_DATA);
//        STATIC_TILES_AVAILABLE.add(TILE_ROAMING);
//        STATIC_TILES_AVAILABLE.add(TILE_DDS);
//        STATIC_TILES_AVAILABLE.add(TILE_APN);
        STATIC_TILES_AVAILABLE.add(TILE_PROFILES);
        STATIC_TILES_AVAILABLE.add(TILE_PERFORMANCE);
        STATIC_TILES_AVAILABLE.add(TILE_ADB_NETWORK);
        STATIC_TILES_AVAILABLE.add(TILE_NFC);
        STATIC_TILES_AVAILABLE.add(TILE_COMPASS);
        STATIC_TILES_AVAILABLE.add(TILE_LOCKSCREEN);
        STATIC_TILES_AVAILABLE.add(TILE_LTE);
//        STATIC_TILES_AVAILABLE.add(TILE_VISUALIZER);
        STATIC_TILES_AVAILABLE.add(TILE_VOLUME);
        STATIC_TILES_AVAILABLE.add(TILE_SCREEN_TIMEOUT);
        STATIC_TILES_AVAILABLE.add(TILE_LIVE_DISPLAY);
        STATIC_TILES_AVAILABLE.add(TILE_USB_TETHER);
        STATIC_TILES_AVAILABLE.add(TILE_HEADS_UP);
        STATIC_TILES_AVAILABLE.add(TILE_AMBIENT_DISPLAY);
        STATIC_TILES_AVAILABLE.add(TILE_SYNC);
//        STATIC_TILES_AVAILABLE.add(TILE_BATTERY_SAVER);
        STATIC_TILES_AVAILABLE.add(TILE_BRIGHTNESS);
        STATIC_TILES_AVAILABLE.add(TILE_SCREEN_OFF);
        STATIC_TILES_AVAILABLE.add(TILE_SCREENSHOT);
        STATIC_TILES_AVAILABLE.add(TILE_EXPANDED_DESKTOP);
        STATIC_TILES_AVAILABLE.add(TILE_MUSIC);
        STATIC_TILES_AVAILABLE.add(TILE_REBOOT);
        STATIC_TILES_AVAILABLE.add(TILE_CONFIGURATIONS);
        STATIC_TILES_AVAILABLE.add(TILE_THEMES);
        STATIC_TILES_AVAILABLE.add(TILE_NAVBAR);
	STATIC_TILES_AVAILABLE.add(TILE_HWKEYS);
        STATIC_TILES_AVAILABLE.add(TILE_APP_PICKER);
        STATIC_TILES_AVAILABLE.add(TILE_APP_KILL);
        STATIC_TILES_AVAILABLE.add(TILE_PIE);
        STATIC_TILES_AVAILABLE.add(TILE_APPCIRCLEBAR);
        STATIC_TILES_AVAILABLE.add(TILE_RESTARTUI);
        STATIC_TILES_AVAILABLE.add(TILE_POWER);
        STATIC_TILES_AVAILABLE.add(TILE_KERNEL);
        STATIC_TILES_AVAILABLE.add(TILE_SELINUX);
        STATIC_TILES_AVAILABLE.add(TILE_SCREENRECORD);
        STATIC_TILES_AVAILABLE.add(TILE_GESTUREANYWHERE);
        STATIC_TILES_AVAILABLE.add(TILE_BATTERY_SAVER);
        STATIC_TILES_AVAILABLE.add(TILE_CAFFEINE);
        STATIC_TILES_AVAILABLE.add(TILE_SOUND);

        TILES_AVAILABLE.addAll(STATIC_TILES_AVAILABLE);

        DYNAMIC_TILES_AVAILBLE.add(DYNAMIC_TILE_ADB);
        DYNAMIC_TILES_AVAILBLE.add(DYNAMIC_TILE_IME_SELECTOR);
        DYNAMIC_TILES_AVAILBLE.add(DYNAMIC_TILE_NEXT_ALARM);
        DYNAMIC_TILES_AVAILBLE.add(DYNAMIC_TILE_SU);
    }
}
