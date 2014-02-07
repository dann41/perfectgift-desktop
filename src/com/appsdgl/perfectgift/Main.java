package com.appsdgl.perfectgift;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.imagepacker.TexturePacker2;
import com.badlogic.gdx.tools.imagepacker.TexturePacker2.Settings;

public class Main {
	private static boolean rebuildAtlas = false;
	private static boolean drawDebugOutline = false;
	
	public static void main(String[] args) {
		if (rebuildAtlas) {
			Settings settings = new Settings();
			settings.maxWidth = 1024;
			settings.maxHeight = 1024;
			settings.debug = drawDebugOutline;
			TexturePacker2.process(settings, "assets-raw/images/backgrounds", "../PerfectGift-android/assets/images", "backgrounds.pack");
			TexturePacker2.process(settings, "assets-raw/images/thumbnails", "../PerfectGift-android/assets/images", "thumbnails.pack");
			TexturePacker2.process(settings, "assets-raw/images/dits", "../PerfectGift-android/assets/images", "dits.pack");
			TexturePacker2.process(settings, "assets-raw/images/game", "../PerfectGift-android/assets/images", "game.pack");
			TexturePacker2.process(settings, "assets-raw/images/gameui", "../PerfectGift-android/assets/images", "gameui.pack");
			TexturePacker2.process(settings, "assets-raw/images/menu", "../PerfectGift-android/assets/images", "menu.pack");
		}
		
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "PerfectGift";
		cfg.useGL20 = true;
		cfg.width = 800;
		cfg.height = 480;
		
		new LwjglApplication(new PerfectGiftGame(), cfg);
	}
}
