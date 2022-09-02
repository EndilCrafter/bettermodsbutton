package fuzs.bettermodsbutton.mixin.client.accessor;

import net.minecraft.client.gui.screens.PauseScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(PauseScreen.class)
public interface PauseScreenAccessor {

    @Accessor
    boolean getShowPauseMenu();
}
