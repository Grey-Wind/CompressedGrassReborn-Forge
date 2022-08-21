
package net.mcreator.compressedgrass.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.compressedgrass.CompressedGrassMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GrassGuideBookGUI1GuiWindow extends ContainerScreen<GrassGuideBookGUI1Gui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = GrassGuideBookGUI1Gui.guistate;

	public GrassGuideBookGUI1GuiWindow(GrassGuideBookGUI1Gui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("compressed_grass:textures/screens/grass_guide_book_gui_1.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "About", 69, 7, -16777216);
		this.font.drawString(ms, "The remade Compressed Grass", 24, 16, -12829636);
		this.font.drawString(ms, "made by Adenx updates original", 6, 25, -12829636);
		this.font.drawString(ms, "1.7.10 version of the mod to", 6, 34, -12829636);
		this.font.drawString(ms, "1.16.5.", 6, 43, -12829636);
		this.font.drawString(ms, "I have sent a request to", 24, 70, -12829636);
		this.font.drawString(ms, "Cooperation", 60, 61, -16777216);
		this.font.drawString(ms, "NeversXD(author of 1.7.10) on", 6, 79, -12829636);
		this.font.drawString(ms, "CurseForge to co-produce version", 6, 88, -12829636);
		this.font.drawString(ms, "1.16.5. I found the user with", 6, 97, -12829636);
		this.font.drawString(ms, "the same name on Github,but I", 6, 106, -12829636);
		this.font.drawString(ms, "couldn't check the warehouse,so", 6, 115, -12829636);
		this.font.drawString(ms, "I didn't send a message to him", 6, 124, -12829636);
		this.font.drawString(ms, "on Github.", 6, 133, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 96, this.guiTop + 142, 72, 20, new StringTextComponent("Next Page"), e -> {
			if (true) {
				CompressedGrassMod.PACKET_HANDLER.sendToServer(new GrassGuideBookGUI1Gui.ButtonPressedMessage(0, x, y, z));
				GrassGuideBookGUI1Gui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
