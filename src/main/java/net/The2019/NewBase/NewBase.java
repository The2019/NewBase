package net.The2019.NewBase;

import net.The2019.NewBase.features.NewChunks;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.TrappedChestBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.Box;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class NewBase implements ModInitializer {

	private final MinecraftClient mc = MinecraftClient.getInstance();

	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public static boolean NewChunkSwitch = true;
	public static boolean NewChunk = false;




	@Override
	public void onInitialize() {
	}
}
