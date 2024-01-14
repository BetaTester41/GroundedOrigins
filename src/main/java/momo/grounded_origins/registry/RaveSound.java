package momo.grounded_origins.registry;

import momo.grounded_origins.GroundedOrigins;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class RaveSound {
    public static final SoundEvent RAVE = SoundEvent.of(new Identifier(GroundedOrigins.MOD_ID, "rave"));

    public static void init() {
        Registry.register(Registries.SOUND_EVENT, RAVE.getId(), RAVE);
    }
}
