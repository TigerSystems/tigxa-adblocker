package com.gamepowerx.tigxa_adblocker;

import de.MarkusTieger.Tigxa.api.IAPI;
import de.MarkusTieger.Tigxa.api.event.IEvent;
import de.MarkusTieger.Tigxa.api.permission.IPermissionManager;
import de.MarkusTieger.Tigxa.api.window.IWindow;
import de.MarkusTieger.Tigxa.extension.impl.BasicExtension;

import java.net.URL;

public class TigxaAdblocker extends BasicExtension {

    public TigxaAdblocker(IAPI api) {
        super(api.getPermissionManager(), "Tigxa Adblocker", "1.0.0", new String[] {"CraftingDragon007"}, TigxaAdblocker.class.getResource("/res/gui/extensions/adblocker.png"));
    }

    @Override
    public void onLoad() {
        System.out.println("LOADED");
    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    @Override
    public void onAction(IWindow iWindow, int i, int i1, int i2, int i3) {

    }

    @Override
    public void onAction(IWindow iWindow, String s) {

    }

    @Override
    public void onEvent(IEvent iEvent) {

    }
}
