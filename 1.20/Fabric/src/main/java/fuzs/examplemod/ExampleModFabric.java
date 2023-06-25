package fuzs.examplemod;

import fuzs.bettermodsbutton.BetterModsButton;
import fuzs.puzzleslib.api.core.v1.ModConstructor;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ModConstructor.construct(BetterModsButton.MOD_ID, BetterModsButton::new);
    }
}
