package com.syanicxd.e4mcoffline;

import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.syanicxd.e4mcoffline.E4MCOOfflineMod.MOD_ID;

@SuppressWarnings("unused")
@Mod(MOD_ID)
public class E4MCOOfflineMod {
    public static final String MOD_ID = "e4mcoffline";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public E4MCOOfflineMod() {
        LOGGER.info("E4MC Offline Mod initialized");
    }
}