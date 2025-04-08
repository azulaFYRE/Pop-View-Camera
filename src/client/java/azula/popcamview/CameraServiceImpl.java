package azula.popcamview;

import java.util.HashMap;
import java.util.Map;

public class CameraServiceImpl implements CameraService {

    private boolean fullscreen = false;
    private int selectedCamID = -1;
    private Map<Integer, PopCam> savedCameras = new HashMap<>();

    @Override
    public void addNewCamera() {

    }

    @Override
    public void deleteCamera(int camID) {
        this.savedCameras.remove(camID);
    }

    @Override
    public void loadCamerasFromDisk() {

    }

    @Override
    public void saveCamerasToDisk() {

    }

    @Override
    public void toggleFullscreen() {
        this.fullscreen = !this.fullscreen;
    }

    @Override
    public void setSelectedCam(int camID) {
        this.selectedCamID = camID;
    }

    @Override
    public PopCam getSelectedCam() {
        return this.savedCameras.get(this.selectedCamID);
    }
}
