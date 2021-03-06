package coopIntegration;

public class CameraFunctionsImpl implements CameraFunctions {

	// Define the path to the raspistill executable.
	private final String raspistillPath = "/opt/vc/bin/raspistill";
	// Define the amount of time that the camera will use to take a photo.
	private final int picTimeout = 5000;
	// Define the image quality.
	private final int picQuality = 100;

	// Specify a default image width.
	private int picWidth = 1024;
	// Specify a default image height.
	private int picHeight = 768;
	// Specify a default image name.
	private String picName = "example.jpg";
	// Specify a default image encoding.
	private String picType = "jpg";	

	// Default method to take a photo using the private values for
	// name/width/height.
	// Note: See the overloaded methods to override the private values.
	public void takePicture(String fileName) {
		try {
			// Determine the image type based on the file extension (or use the
			// default).
			if (picName.indexOf('.') != -1)
				picType = picName.substring(picName.lastIndexOf('.') + 1);

			// Create a new string builder with the path to raspistill.
			StringBuilder sb = new StringBuilder(raspistillPath);

			picName = fileName;
			
			// Add parameters for no preview and burst mode.
			sb.append(" -n -bm");
			// Configure the camera timeout.
			sb.append(" -t " + picTimeout);
			// Configure the picture width.
			sb.append(" -w " + picWidth);
			// Configure the picture height.
			sb.append(" -h " + picHeight);
			// Configure the picture quality.
			sb.append(" -q " + picQuality);
			// Specify the image type.
			sb.append(" -e " + picType);
			// Specify the name of the image.
			sb.append(" -o " + picName);

			// Invoke raspistill to take the photo.
			Runtime.getRuntime().exec(sb.toString());
			// Pause to allow the camera time to take the photo.
			Thread.sleep(picTimeout);
		} catch (Exception e) {
			// Exit the application with the exception's hash code.
			System.exit(e.hashCode());
		}
	}

	// Overloaded method to take a photo using specific values for the
	// name/width/height.
	public void TakePicture(String name, int width, int height) {
		picName = name;
		picWidth = width;
		picHeight = height;
		TakePicture(picName);
	}

	// Overloaded method to take a photo using a specific value for the image
	// name.
	public void TakePicture(String name) {
		TakePicture(name, picWidth, picHeight);
	}

	// Overloaded method to take a photo using specific values for width/height.
	public void TakePicture(int width, int height) {
		TakePicture(picName, width, height);
	}

}
