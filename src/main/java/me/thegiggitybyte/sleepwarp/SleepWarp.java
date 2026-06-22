package me.thegiggitybyte.sleepwarp;

import me.thegiggitybyte.sleepwarp.config.SleepWarpConfig;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;

@Mod(SleepWarp.MOD_ID)
public class SleepWarp {
    public static final String MOD_ID = "sleepwarp";

    public SleepWarp() {
        SleepWarpConfig.init("sleepwarp", SleepWarpConfig.class);
        NeoForge.EVENT_BUS.register(Commands.class);
        WarpEngine.initialize();
    }
}
