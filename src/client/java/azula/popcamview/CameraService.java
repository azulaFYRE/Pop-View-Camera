package azula.popcamview;

public interface CameraService {
    void addNewCamera();
    void deleteCamera(int camID);
    void loadCamerasFromDisk();
    void saveCamerasToDisk();
    void toggleFullscreen();
    void setSelectedCam(int camID);
    PopCam getSelectedCam();
}
