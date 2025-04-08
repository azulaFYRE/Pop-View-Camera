package azula.popcamview;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;

public class PopCamViewClient implements ClientModInitializer {

	public static KeyBinding saveKey;
	public static KeyBinding fullscreenKey;
	public static KeyBinding toggleDisplayKey;
	public static KeyBinding menuKey;

	public static CameraService camService = new CameraServiceImpl();

	@Override
	public void onInitializeClient() {
		camService.loadCamerasFromDisk();

		this.initKeyBinds();
		this.initListeners();
	}

	private void initListeners() {



	}


	private void initKeyBinds() {
		saveKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
				"popview.keybind.label.save",
				GLFW.GLFW_KEY_SEMICOLON,
				"popview.keybind.category.popview"
		));

		fullscreenKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
				"popview.keybind.label.fullscreen",
				GLFW.GLFW_KEY_RIGHT_BRACKET,
				"popview.keybind.category.popview"
		));

		toggleDisplayKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
				"popview.keybind.label.toggleDisplay",
				GLFW.GLFW_KEY_LEFT_BRACKET,
				"popview.keybind.category.popview"
		));

		menuKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
				"popview.keybind.label.menu",
				GLFW.GLFW_KEY_APOSTROPHE,
				"popview.keybind.category.popview"
		));
	}
}