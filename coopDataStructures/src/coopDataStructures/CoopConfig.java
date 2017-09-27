package coopDataStructures;

public class CoopConfig {

	private String sunrisePreset;
	private String sunsetPreset;
	private String mp3Open;
	private String mp3Close;
	private boolean closeDoor;
	private boolean openDoor;
	private boolean doorIspOpen;
	private String picSaveLocation;
	private int picTimeInterval;
	
	public CoopConfig() {
		
	}
	
	public CoopConfig(String sunrisePreset, String sunsetPreset, String mp3Open,
			String mp3Close, boolean closeDoor, boolean openDoor, boolean doorIsOpen,
			String picSaveLocaiton, int picTimeInterval) {
		this.sunrisePreset = sunrisePreset;
		this.sunsetPreset = sunsetPreset;
		this.mp3Open = mp3Open;
		this.mp3Close = mp3Close;
		this.closeDoor = closeDoor;
		this.openDoor = openDoor;
		this.doorIspOpen = doorIsOpen;
		this.picSaveLocation = picSaveLocation;
		this.picTimeInterval = picTimeInterval;
	}

	public String getSunrisePreset() {
		return sunrisePreset;
	}
	
	public void setSunrisePreset(String sunrisePreset) {
		this.sunrisePreset = sunrisePreset;
	}
	public String getSunsetPreset() {
		return sunsetPreset;
	}
	public void setSunsetPreset(String sunsetPreset) {
		this.sunsetPreset = sunsetPreset;
	}
	public String getMp3Open() {
		return mp3Open;
	}
	public void setMp3Open(String mp3Open) {
		this.mp3Open = mp3Open;
	}
	public String getMp3Close() {
		return mp3Close;
	}
	public void setMp3Close(String mp3Close) {
		this.mp3Close = mp3Close;
	}

	public boolean isCloseDoor() {
		return closeDoor;
	}

	public void setCloseDoor(boolean closeDoor) {
		this.closeDoor = closeDoor;
	}

	public boolean isOpenDoor() {
		return openDoor;
	}

	public void setOpenDoor(boolean openDoor) {
		this.openDoor = openDoor;
	}

	public boolean isDoorIspOpen() {
		return doorIspOpen;
	}

	public void setDoorIspOpen(boolean doorIspOpen) {
		this.doorIspOpen = doorIspOpen;
	}

	public String getPicSaveLocation() {
		return picSaveLocation;
	}

	public void setPicSaveLocation(String picSaveLocation) {
		this.picSaveLocation = picSaveLocation;
	}

	public int getPicTimeInterval() {
		return picTimeInterval;
	}

	public void setPicTimeInterval(int picTimeInterval) {
		this.picTimeInterval = picTimeInterval;
	}
	
	
	
}
