package net.The2019.NewBase.mixin;

import net.The2019.NewBase.NewBase;
import net.The2019.NewBase.features.NewChunks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.world.chunk.WorldChunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class TickMixin {
	@Inject(at = @At("HEAD"), method = "tick")
	private void onTick(CallbackInfo info) {
		MinecraftClient mc = MinecraftClient.getInstance();
		if (mc.world != null && mc.player != null) {
			WorldChunk chunk = mc.world.getChunk(mc.player.getBlockX(), mc.player.getBlockZ() );
			NewChunks.checkLoadedChunk(chunk);
		}
	}
}
