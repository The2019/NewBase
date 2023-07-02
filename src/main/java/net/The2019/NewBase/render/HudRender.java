package net.The2019.NewBase.render;

import net.The2019.NewBase.NewBase;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;

import java.awt.*;

public class HudRender {

    private static final MinecraftClient mc = MinecraftClient.getInstance();

    public static void render(MatrixStack matrixStack, float tickDelta){
        chunkRender(matrixStack);
    }

    public static void chunkRender(MatrixStack matrixStack){
        mc.textRenderer.drawWithShadow(matrixStack, "Chunk is loaded " + NewBase.NewChunk, 10, 10, Color.BLACK.getRGB());
    }

}
